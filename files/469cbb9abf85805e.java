    private AdRequest createAdRequestWithParameters(boolean z4, MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters, Context context) {
        boolean zEqualsIgnoreCase;
        AdRequest.Builder builder = new AdRequest.Builder();
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        Bundle bundle = new Bundle(6);
        if (z4) {
            zEqualsIgnoreCase = "dv360".equalsIgnoreCase(BundleUtils.getString("bidder", "", serverParameters));
            bundle.putString("query_info_type", zEqualsIgnoreCase ? "requester_type_3" : "requester_type_2");
            if (maxAdFormat.isAdViewAd()) {
                Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner");
                if ((obj instanceof String) && "true".equalsIgnoreCase((String) obj)) {
                    AdSize adSize = toAdSize(maxAdFormat, true, maxAdapterParameters, context);
                    if (isInlineAdaptiveBanner(maxAdapterParameters)) {
                        int inlineAdaptiveBannerMaxHeight = getInlineAdaptiveBannerMaxHeight(maxAdapterParameters);
                        if (inlineAdaptiveBannerMaxHeight <= 0) {
                            inlineAdaptiveBannerMaxHeight = adSize.getHeight();
                        }
                        bundle.putInt("inlined_adaptive_banner_w", adSize.getWidth());
                        bundle.putInt("inlined_adaptive_banner_h", inlineAdaptiveBannerMaxHeight);
                    } else {
                        bundle.putInt("adaptive_banner_w", adSize.getWidth());
                        bundle.putInt("adaptive_banner_h", adSize.getHeight());
                    }
                }
            }
            if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
                String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
                if (AppLovinSdkUtils.isValidString(bidResponse)) {
                    builder.setAdString(bidResponse);
                }
            }
        } else {
            zEqualsIgnoreCase = false;
        }
        builder.setRequestAgent(zEqualsIgnoreCase ? "applovin_dv360" : "applovin");
        String string = BundleUtils.getString("event_id", serverParameters);
        if (AppLovinSdkUtils.isValidString(string)) {
            bundle.putString("placement_req_id", string);
        }
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null && !boolHasUserConsent.booleanValue()) {
            bundle.putString("npa", "1");
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell == null || !boolIsDoNotSell.booleanValue()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove("gad_rdp").apply();
        } else {
            bundle.putInt("rdp", 1);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("gad_rdp", 1).apply();
        }
        Map<String, Object> localExtraParameters = maxAdapterParameters.getLocalExtraParameters();
        Object obj2 = localExtraParameters.get("google_max_ad_content_rating");
        if (obj2 instanceof String) {
            bundle.putString("max_ad_content_rating", (String) obj2);
        }
        Object obj3 = localExtraParameters.get("google_content_url");
        if (obj3 instanceof String) {
            builder.setContentUrl((String) obj3);
        }
        Object obj4 = localExtraParameters.get("google_neighbouring_content_url_strings");
        if (obj4 instanceof List) {
            try {
                builder.setNeighboringContentUrls((List) obj4);
            } catch (Throwable th) {
                e("Neighbouring content URL strings extra param needs to be of type List<String>.", th);
            }
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }
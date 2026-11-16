    protected AdRequest.Builder d0(Context context, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat, boolean z) {
        AdRequest.Builder builder = new AdRequest.Builder();
        d0(map, map2, builder);
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, "thinkup_g_ra_label", "");
            if (!TextUtils.isEmpty(stringFromMap)) {
                builder.setRequestAgent(stringFromMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, dd(context, map, map2, adFormat, z));
        return builder;
    }
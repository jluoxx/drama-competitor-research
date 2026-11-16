    protected AdManagerAdRequest.Builder d0(Context context, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, dd(context, map, map2, adFormat, false));
        return builder;
    }
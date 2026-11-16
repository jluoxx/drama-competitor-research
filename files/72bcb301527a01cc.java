    public AdRequest buildAdRequest(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                builder.addKeyword(it.next());
            }
        }
        if (mediationAdRequest.isTesting()) {
            zzay.zza();
            builder.zzb(zzf.zzF(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.zzc(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.zzd(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.build();
    }
    private void o(String str, String str2) {
        Map<String, Object> nativeLocalExtra;
        if (this.mm == null) {
            return;
        }
        str2.getClass();
        switch (str2) {
            case "0":
                nativeLocalExtra = this.mm.getNativeLocalExtra();
                break;
            case "1":
                nativeLocalExtra = this.mm.getRewardVideoLocalExtra();
                break;
            case "2":
                nativeLocalExtra = this.mm.getBannerLocalExtra();
                break;
            case "3":
                nativeLocalExtra = this.mm.getInterstitialLocalExtra();
                break;
            case "4":
                nativeLocalExtra = this.mm.getSplashLocalExtra();
                break;
            default:
                nativeLocalExtra = null;
                break;
        }
        d(str, str2).m(nativeLocalExtra);
    }
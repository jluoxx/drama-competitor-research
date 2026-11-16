        @Override // com.bytedance.sdk.shortplay.api.PSSDK.ShortPlayDetailPageListener
        public boolean isNeedBlock(ShortPlay shortPlay, int index) {
            AdInterstitial adInterstitial;
            Intrinsics.checkNotNullParameter(shortPlay, "shortPlay");
            String tag = OVSDramaPlayActivity.this.getTAG();
            Intrinsics.checkNotNullExpressionValue(tag, "access$getTAG(...)");
            we3.b(tag, "isNeedBlock() called with: shortPlay = [" + shortPlay + "], index = [" + index + ']');
            GlobalConfigEntity globalConfigEntityF = bm2.f717a.f();
            int dramaNum = (globalConfigEntityF == null || (adInterstitial = globalConfigEntityF.getAdInterstitial()) == null) ? 0 : adInterstitial.getDramaNum();
            if (dramaNum > 0) {
                OVSDramaPlayActivity.this.swipeCounter++;
                if ((dramaNum == 1 || OVSDramaPlayActivity.this.swipeCounter % dramaNum != 0) && (dramaNum != 1 || OVSDramaPlayActivity.this.swipeCounter <= 1)) {
                    String tag2 = OVSDramaPlayActivity.this.getTAG();
                    Intrinsics.checkNotNullExpressionValue(tag2, "access$getTAG(...)");
                    we3.b(tag2, "Swipe count: " + OVSDramaPlayActivity.this.swipeCounter + " / " + dramaNum);
                } else {
                    String tag3 = OVSDramaPlayActivity.this.getTAG();
                    Intrinsics.checkNotNullExpressionValue(tag3, "access$getTAG(...)");
                    we3.g(tag3, "Swipe threshold reached (" + OVSDramaPlayActivity.this.swipeCounter + " / " + dramaNum + "). Showing ad.");
                    OVSDramaPlayActivity oVSDramaPlayActivity = OVSDramaPlayActivity.this;
                    HttpCoroutineHelpExKt.launch$default((LifecycleOwner) oVSDramaPlayActivity, (Function2) new OVSDramaPlayActivity$showDetailFragment$2$isNeedBlock$1(oVSDramaPlayActivity, null), (Function1) null, false, false, 14, (Object) null);
                }
            }
            return false;
        }
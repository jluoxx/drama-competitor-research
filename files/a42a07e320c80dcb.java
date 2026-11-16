    private final void showDetailFragment(ShortPlay shortPlay) {
        PSSDK.DetailPageConfig.Builder builder = new PSSDK.DetailPageConfig.Builder();
        builder.setVideoDisplayMode(2);
        builder.displayTextVisibility(3, false);
        builder.displayTextVisibility(2, false);
        builder.displayProgressBar(true);
        builder.startPlayIndex(this.startFromIndex);
        builder.enableAutoPlayNext(true);
        builder.displayBottomExtraView(false);
        builder.enableImmersiveMode(CircularProgressBar.E);
        builder.startPlayAtTimeSeconds(this.startFromSeconds);
        builder.hideLeftTopCloseAndTitle(true, new PSSDK.ShortPlayDetailPageCloseListener() { // from class: cd4
            @Override // com.bytedance.sdk.shortplay.api.PSSDK.ShortPlayDetailPageCloseListener
            public final boolean onCloseClicked() {
                return OVSDramaPlayActivity.showDetailFragment$lambda$12(this.o);
            }
        });
        ShortPlayFragment shortPlayFragmentCreateDetailFragment = PSSDK.createDetailFragment(shortPlay, builder.build(), new AnonymousClass2());
        this.detailFragment = shortPlayFragmentCreateDetailFragment;
        if (shortPlayFragmentCreateDetailFragment == null) {
            Toast.makeText(this, "创建播放页失败", 0).show();
            return;
        }
        if (shortPlayFragmentCreateDetailFragment != null) {
            getSupportFragmentManager().beginTransaction().add(R$id.fragment_container, shortPlayFragmentCreateDetailFragment).show(shortPlayFragmentCreateDetailFragment).commit();
        }
        initContent();
    }
    @Override // com.freetools.freereels.base.BaseActivity
    public final void o() {
        ShortPlay.ShortPlayCategory shortPlayCategory;
        ShortPlay shortPlay = (ShortPlay) F1.b.d(getIntent(), "extra_short_play", ShortPlay.class);
        this.f19592m = shortPlay;
        if (shortPlay == null) {
            finish();
            return;
        }
        if (com.freetools.freereels.data.a.DetailPopLauncher.d()) {
            com.freetools.freereels.thirdsdk.e eVar = com.freetools.freereels.thirdsdk.e.f19564a;
            com.freetools.freereels.thirdsdk.e.c(this, true);
        }
        ((b) x()).d.f19473c.setOnClickListener(new com.mbridge.msdk.config.dynamic.baseview.a(this, 19));
        ((b) x()).d.f19473c.setVisibility(0);
        this.f19595p = com.freetools.freereels.utils.d.c(B().e.f);
        this.f19590k = getIntent().getIntExtra("extra_index", 1);
        this.f19591l = getIntent().getIntExtra("extra_from_seconds", 0);
        ShortPlay shortPlay2 = this.f19592m;
        l.e(shortPlay2);
        int i5 = this.f19590k;
        int i10 = this.f19591l;
        j jVar = new j(this);
        f fVar = new f(this);
        PSSDK.DetailPageConfig.Builder builder = new PSSDK.DetailPageConfig.Builder();
        ArrayList<ShortPlay.ShortPlayCategory> categories = shortPlay2.categories;
        l.g(categories, "categories");
        int size = categories.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                shortPlayCategory = null;
                break;
            } else {
                shortPlayCategory = categories.get(i11);
                i11++;
            }
        } while (shortPlayCategory.f18718id != 1000701);
        if (shortPlayCategory != null) {
            builder.setVideoDisplayMode(3);
        } else {
            builder.setVideoDisplayMode(2);
        }
        builder.displayBottomExtraView(false);
        builder.displayProgressBar(true);
        builder.displayTextVisibility(2, false);
        builder.displayTextVisibility(3, false);
        builder.startPlayIndex(i5);
        builder.startPlayAtTimeSeconds(i10);
        builder.enableAutoPlayNext(true);
        builder.progressBarMarginToBottom(30);
        builder.adCustomProvider(fVar);
        ShortPlayFragment shortPlayFragmentCreateDetailFragment = PSSDK.createDetailFragment(shortPlay2, builder.build(), jVar);
        this.f19593n = shortPlayFragmentCreateDetailFragment;
        if (shortPlayFragmentCreateDetailFragment != null) {
            b0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.c(R.id.fragment_container, shortPlayFragmentCreateDetailFragment, null, 1);
            aVar.e(true);
        }
        s(false);
        getWindow().setStatusBarColor(getResources().getColor(R.color.black, null));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.black, null));
        if (f19587s) {
            f19587s = false;
            com.freetools.freereels.ad.c.b(this, new gd.a(18));
        }
    }
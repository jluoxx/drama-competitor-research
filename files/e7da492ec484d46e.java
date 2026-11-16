    private final void tryToShowSplashAd(LifecycleOwner owner) {
        AdSplash adSplash;
        Activity activityF;
        Package r3;
        String name;
        GlobalConfigEntity globalConfigEntityD = tk2.o.d();
        if (globalConfigEntityD == null || (adSplash = globalConfigEntityD.getAdSplash()) == null) {
            return;
        }
        pe3.e("AppLifecycleObserver", "Attempting to show splash ad with config: rate=" + adSplash.getSwitchRate() + ", num=" + adSplash.getSwitchNum() + ", sec=" + adSplash.getSwitchSec());
        int iRandom = RangesKt___RangesKt.random(new IntRange(1, 100), Random.INSTANCE);
        if (iRandom > adSplash.getSwitchRate()) {
            pe3.e("AppLifecycleObserver", "Check failed: Probability miss (random:" + iRandom + " > rate:" + adSplash.getSwitchRate() + ')');
            return;
        }
        d93 d93Var = d93.o;
        int iO = d93Var.o();
        if (iO >= adSplash.getSwitchNum()) {
            pe3.e("AppLifecycleObserver", "Check failed: Daily limit reached (count:" + iO + " >= limit:" + adSplash.getSwitchNum() + ')');
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = d93Var.b();
        long switchSec = ((long) adSplash.getSwitchSec()) * 1000;
        if (jB == 0) {
            pe3.e("AppLifecycleObserver", "Skipping ad, lastEventTime is 0 (first run).");
            return;
        }
        String str = "";
        if (o.f() != null && (activityF = o.f()) != null && (r3 = activityF.getClass().getPackage()) != null && (name = r3.getName()) != null) {
            str = name;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "com.kingtar.work.mvvm", false, 2, (Object) null)) {
            pe3.e("AppLifecycleObserver", "栈顶是广告页面，不要插入splash");
            return;
        }
        long j = jCurrentTimeMillis - jB;
        if (j < switchSec) {
            pe3.e("AppLifecycleObserver", "Check SKIPPED: Time interval too short (elapsed:" + j + "ms < required:" + switchSec + "ms)");
            return;
        }
        pe3.e("AppLifecycleObserver", "Check PASSED: Time interval OK (elapsed:" + j + "ms >= required:" + switchSec + "ms). Showing ad.");
        showSplashAd(owner);
    }
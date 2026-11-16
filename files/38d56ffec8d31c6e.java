    private final void tryToShowSplashAd(LifecycleOwner owner) {
        AdSplash adSplash;
        Activity activityH;
        Package r3;
        String name;
        GlobalConfigEntity globalConfigEntityF = bm2.f717a.f();
        if (globalConfigEntityF == null || (adSplash = globalConfigEntityF.getAdSplash()) == null) {
            return;
        }
        we3.g("AppLifecycleObserver", "Attempting to show splash ad with config: rate=" + adSplash.getSwitchRate() + ", num=" + adSplash.getSwitchNum() + ", sec=" + adSplash.getSwitchSec());
        int iRandom = RangesKt___RangesKt.random(new IntRange(1, 100), Random.INSTANCE);
        if (iRandom > adSplash.getSwitchRate()) {
            we3.g("AppLifecycleObserver", "Check failed: Probability miss (random:" + iRandom + " > rate:" + adSplash.getSwitchRate() + ')');
            return;
        }
        r93 r93Var = r93.f15216a;
        int iA = r93Var.a();
        if (iA >= adSplash.getSwitchNum()) {
            we3.g("AppLifecycleObserver", "Check failed: Daily limit reached (count:" + iA + " >= limit:" + adSplash.getSwitchNum() + ')');
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = r93Var.d();
        long switchSec = ((long) adSplash.getSwitchSec()) * 1000;
        if (jD == 0) {
            we3.g("AppLifecycleObserver", "Skipping ad, lastEventTime is 0 (first run).");
            return;
        }
        String str = "";
        if (a.h() != null && (activityH = a.h()) != null && (r3 = activityH.getClass().getPackage()) != null && (name = r3.getName()) != null) {
            str = name;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "com.kingtar.work.mvvm", false, 2, (Object) null)) {
            we3.g("AppLifecycleObserver", "栈顶是广告页面，不要插入splash");
            return;
        }
        long j = jCurrentTimeMillis - jD;
        if (j < switchSec) {
            we3.g("AppLifecycleObserver", "Check SKIPPED: Time interval too short (elapsed:" + j + "ms < required:" + switchSec + "ms)");
            return;
        }
        we3.g("AppLifecycleObserver", "Check PASSED: Time interval OK (elapsed:" + j + "ms >= required:" + switchSec + "ms). Showing ad.");
        showSplashAd(owner);
    }
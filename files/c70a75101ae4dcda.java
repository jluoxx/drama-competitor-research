    public final void i(ComponentActivity componentActivity, KTarAdInParams params, p83 callBack) {
        AdIncentive adIncentive;
        AdIncentive adIncentive2;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (componentActivity == null) {
            return;
        }
        this.c = params;
        KTarAdRespInfo kTarAdRespInfo = new KTarAdRespInfo(null, null, null, null, false, 0, null, 127, null);
        kTarAdRespInfo.scene = params.getScene();
        kTarAdRespInfo.b(params.getF());
        kTarAdRespInfo.isSuper = false;
        callBack.j();
        bm2 bm2Var = bm2.f717a;
        GlobalConfigEntity globalConfigEntityF = bm2Var.f();
        if (globalConfigEntityF != null && (adIncentive2 = globalConfigEntityF.getAdIncentive()) != null) {
            adIncentive2.getInterstitialEnable();
        }
        GlobalConfigEntity globalConfigEntityF2 = bm2Var.f();
        Boolean boolValueOf = (globalConfigEntityF2 == null || (adIncentive = globalConfigEntityF2.getAdIncentive()) == null) ? null : Boolean.valueOf(adIncentive.getInterstitialDouble());
        GlobalConfigEntity globalConfigEntityF3 = bm2Var.f();
        int dramaPriorityInterstitialAdCount = globalConfigEntityF3 != null ? globalConfigEntityF3.getDramaPriorityInterstitialAdCount() : 10;
        int iB = jf6.f14121a.b();
        if (iB < dramaPriorityInterstitialAdCount) {
            we3.g("wlaaa", "配置前" + dramaPriorityInterstitialAdCount + "个广告走插屏 当前已消费" + iB + " 本次走插屏");
            l(componentActivity, params, kTarAdRespInfo, Intrinsics.areEqual(boolValueOf, Boolean.TRUE), callBack);
            return;
        }
        we3.g("wlaaa", "配置前" + dramaPriorityInterstitialAdCount + "个广告走插屏 当前已消费" + iB + " 本次走比价逻辑");
        KTarGlobalScope.launch$default(KTarGlobalScope.INSTANCE, new KTarIncentiveDecorator$normalLoadAndShow$2(this, componentActivity, params, kTarAdRespInfo, callBack, boolValueOf, null), null, false, false, 14, null);
    }
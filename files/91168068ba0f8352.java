    public final void g(ComponentActivity componentActivity, KTarAdInParams params, b83 callBack) {
        AdIncentive adIncentive;
        AdIncentive adIncentive2;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (componentActivity == null) {
            return;
        }
        this.f3536a = params;
        KTarAdRespInfo kTarAdRespInfo = new KTarAdRespInfo(null, null, null, null, false, 0, null, 127, null);
        kTarAdRespInfo.scene = params.getScene();
        kTarAdRespInfo.O(params.getD());
        kTarAdRespInfo.isSuper = false;
        callBack.h();
        tk2 tk2Var = tk2.o;
        GlobalConfigEntity globalConfigEntityD = tk2Var.d();
        if (globalConfigEntityD != null && (adIncentive2 = globalConfigEntityD.getAdIncentive()) != null) {
            adIncentive2.getInterstitialEnable();
        }
        GlobalConfigEntity globalConfigEntityD2 = tk2Var.d();
        Boolean boolValueOf = (globalConfigEntityD2 == null || (adIncentive = globalConfigEntityD2.getAdIncentive()) == null) ? null : Boolean.valueOf(adIncentive.getInterstitialDouble());
        GlobalConfigEntity globalConfigEntityD3 = tk2Var.d();
        int dramaPriorityInterstitialAdCount = globalConfigEntityD3 != null ? globalConfigEntityD3.getDramaPriorityInterstitialAdCount() : 10;
        int iO = uc6.o.O();
        if (iO < dramaPriorityInterstitialAdCount) {
            pe3.e("wlaaa", "配置前" + dramaPriorityInterstitialAdCount + "个广告走插屏 当前已消费" + iO + " 本次走插屏");
            j(componentActivity, params, kTarAdRespInfo, Intrinsics.areEqual(boolValueOf, Boolean.TRUE), callBack);
            return;
        }
        pe3.e("wlaaa", "配置前" + dramaPriorityInterstitialAdCount + "个广告走插屏 当前已消费" + iO + " 本次走比价逻辑");
        KTarGlobalScope.launch$default(KTarGlobalScope.INSTANCE, new KTarIncentiveDecorator$normalLoadAndShow$2(this, componentActivity, params, kTarAdRespInfo, callBack, boolValueOf, null), null, false, false, 14, null);
    }
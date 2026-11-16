        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.p83
        public Object e(KTarAdRespInfo kTarAdRespInfo, Continuation<? super Unit> continuation) {
            KTarAdFacade$1$onRewardVerify$1 kTarAdFacade$1$onRewardVerify$1;
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof KTarAdFacade$1$onRewardVerify$1) {
                kTarAdFacade$1$onRewardVerify$1 = (KTarAdFacade$1$onRewardVerify$1) continuation;
                int i = kTarAdFacade$1$onRewardVerify$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    kTarAdFacade$1$onRewardVerify$1.label = i - Integer.MIN_VALUE;
                } else {
                    kTarAdFacade$1$onRewardVerify$1 = new KTarAdFacade$1$onRewardVerify$1(this, continuation);
                }
            } else {
                kTarAdFacade$1$onRewardVerify$1 = new KTarAdFacade$1$onRewardVerify$1(this, continuation);
            }
            Object objG = kTarAdFacade$1$onRewardVerify$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = kTarAdFacade$1$onRewardVerify$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    kTarAdRespInfo = (KTarAdRespInfo) kTarAdFacade$1$onRewardVerify$1.L$1;
                    anonymousClass1 = (AnonymousClass1) kTarAdFacade$1$onRewardVerify$1.L$0;
                    ResultKt.throwOnFailure(objG);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objG);
                }
            }
            ResultKt.throwOnFailure(objG);
            kTarAdFacade$1$onRewardVerify$1.L$0 = this;
            kTarAdFacade$1$onRewardVerify$1.L$1 = kTarAdRespInfo;
            kTarAdFacade$1$onRewardVerify$1.label = 1;
            if (super.e(kTarAdRespInfo, kTarAdFacade$1$onRewardVerify$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            anonymousClass1 = this;
            we3.g(anonymousClass1.getC(), "KTarAdSampleListener onRewardVerify");
            we3.g(anonymousClass1.getC(), "callback=" + KTarAdFacade.this.getC() + " resp=" + kTarAdRespInfo);
            KTarAdFacade.this.h(AdFacadeEnum.AD_AWARD_RESP);
            dj3 dj3VarC = uf1.c();
            KTarAdFacade$1$onRewardVerify$2 kTarAdFacade$1$onRewardVerify$2 = new KTarAdFacade$1$onRewardVerify$2(KTarAdFacade.this, kTarAdRespInfo, null);
            kTarAdFacade$1$onRewardVerify$1.L$0 = null;
            kTarAdFacade$1$onRewardVerify$1.L$1 = null;
            kTarAdFacade$1$onRewardVerify$1.label = 2;
            objG = d30.g(dj3VarC, kTarAdFacade$1$onRewardVerify$2, kTarAdFacade$1$onRewardVerify$1);
            return objG == coroutine_suspended ? coroutine_suspended : objG;
        }
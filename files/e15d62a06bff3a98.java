    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        new OVSReqWithdrawParams(Boxing.boxFloat((float) this.$withdrawInfo.getAmountValue()));
        if (HttpCoroutineHelpExKt.checkNullable(k04.f14189a.n()) != null) {
            OVSDrama2WithdrawViewModel oVSDrama2WithdrawViewModel = this.this$0;
            oVSDrama2WithdrawViewModel.i().postValue(this.$withdrawInfo);
        }
        return Unit.INSTANCE;
    }
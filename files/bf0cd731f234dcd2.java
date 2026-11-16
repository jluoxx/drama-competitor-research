    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int position;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.$type;
        if (i == 132) {
            wa2.o.h(d0.dmn);
            position = 6;
        } else if (i == 134) {
            wa2.o.h("new_user_reward");
            position = 7;
        } else if (i == 135) {
            wa2.o.h("drama_detail_page");
            position = 9;
        } else if (i == 136) {
            wa2.o.h("drama_detail_page_double");
            position = 10;
        } else if (i == 301) {
            wa2.o.h("withdraw_item_cannot_apply_click");
            position = 30;
        } else if (i == 302) {
            wa2.o.h("task_unlimited_ad");
            position = 31;
        } else {
            OVSRespTaskInfo oVSRespTaskInfo = this.$entity;
            position = oVSRespTaskInfo != null ? oVSRespTaskInfo.getPosition() : 0;
        }
        KTarAdFacade n = this.this$0.getN();
        if (n != null) {
            int i2 = this.$type;
            Integer numBoxInt = Boxing.boxInt(position);
            OVSRespTaskInfo oVSRespTaskInfo2 = this.$entity;
            TAG.b(n, i2, numBoxInt, oVSRespTaskInfo2 != null ? Boxing.boxInt(oVSRespTaskInfo2.getProgressTotal()) : null, this.$isSuper);
        }
        return Unit.INSTANCE;
    }
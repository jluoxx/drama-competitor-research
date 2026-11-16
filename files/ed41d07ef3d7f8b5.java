    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int position;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            int i2 = this.$type;
            if (i2 == 132) {
                ic2.f10984a.j(d0.dmn);
                position = 6;
            } else if (i2 == 134) {
                ic2.f10984a.j("new_user_reward");
                position = 7;
            } else if (i2 == 135) {
                ic2.f10984a.j("drama_detail_page");
                position = 9;
            } else if (i2 == 136) {
                ic2.f10984a.j("drama_detail_page_double");
                position = 10;
            } else if (i2 == 301) {
                ic2.f10984a.j("withdraw_item_cannot_apply_click");
                position = 30;
            } else if (i2 == 302) {
                ic2.f10984a.j("task_unlimited_ad");
                position = 31;
            } else if (i2 == 310) {
                ic2.f10984a.j("plana_ad");
                position = 35;
            } else {
                OVSRespTaskInfo oVSRespTaskInfo = this.$entity;
                position = oVSRespTaskInfo != null ? oVSRespTaskInfo.getPosition() : 0;
            }
            intRef.element = position;
            dj3 dj3VarC = uf1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$type, intRef, this.$entity, this.$isSuper, null);
            this.label = 1;
            if (d30.g(dj3VarC, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
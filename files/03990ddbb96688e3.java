    @Override // ef.a
    public final Object invokeSuspend(Object obj) {
        df.a aVar = df.a.b;
        int i5 = this.f54607l;
        if (i5 == 0) {
            V3.j.r(obj);
            this.f54607l = 1;
            if (xf.C.n(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V3.j.r(obj);
        }
        if (System.currentTimeMillis() - com.freetools.freereels.ad.c.f19443a >= 2000) {
            com.freetools.freereels.ad.c.f19443a = System.currentTimeMillis();
            com.freetools.freereels.ad.a aVar2 = com.freetools.freereels.ad.a.b;
            aVar2.getClass();
            aVar2.f19438a.a("detail-inner");
        }
        return C.f8295a;
    }
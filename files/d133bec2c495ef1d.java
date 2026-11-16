    @Override // ef.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        df.a aVar = df.a.b;
        int i5 = this.f72037l;
        if (i5 == 0) {
            V3.j.r(obj);
            this.f72037l = 1;
            if (xf.C.n(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V3.j.r(obj);
        }
        ArrayList arrayList = Dc.b.f2052a;
        return Xe.C.f8295a;
    }
    public static void f0(String str, Kc.a aVar) {
        c.b bVar = c.b.f11643c;
        B2.e eVar = new B2.e(aVar, 15);
        bVar.getClass();
        Activity activity = g.a.f42963a;
        if (activity != null) {
            Ic.h hVarA = bVar.a();
            if (hVarA.b(activity, str, eVar)) {
                return;
            }
            j.c cVar = yg.b.b.f71944a;
            if (cVar == null || cVar.f53204j > 0) {
                Ic.h hVar = bVar.b;
                Ic.f fVar = bVar.f11644a;
                if (hVarA != fVar) {
                    hVar = hVarA == hVar ? fVar : null;
                }
                if (hVar != null) {
                    hVar.b(activity, str, eVar);
                }
            }
        }
    }
    public static zc.j c(Activity activity, boolean z4) {
        com.freetools.freereels.ad.c cVar = com.freetools.freereels.ad.a.b.f19438a;
        if (!v4.d.X()) {
            return null;
        }
        e = true;
        if (z4) {
            long jCurrentTimeMillis = System.currentTimeMillis() - b;
            b = System.currentTimeMillis();
            if (jCurrentTimeMillis < 300000) {
                return null;
            }
        }
        return Q.p(activity);
    }
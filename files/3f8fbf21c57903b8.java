    @Override // com.bytedance.sdk.shortplay.api.PSSDK.AdCustomProvider
    public final List getDetailDrawAdPositions() {
        ShortPlay shortPlay = this.f54606a.f19592m;
        int i5 = 0;
        int i10 = shortPlay != null ? shortPlay.total : 0;
        if (i10 < 100) {
            i10 = 100;
        }
        ArrayList arrayList = new ArrayList();
        int iA = ((int) com.freetools.freereels.data.b.a(com.freetools.freereels.data.b.DetailNativeAdInterval)) + 1;
        if (iA <= 0) {
            throw new IllegalArgumentException(Y6.a.d(iA, "Step must be positive, was: ", dn.f40117qd));
        }
        int iM = Fb.a.m(0, i10, iA);
        if (iM >= 0) {
            while (true) {
                arrayList.add(Integer.valueOf(i5));
                if (i5 == iM) {
                    break;
                }
                i5 += iA;
            }
        }
        return arrayList;
    }
    @Override // com.freetools.freereels.thirdsdk.v, com.bytedance.sdk.shortplay.api.PSSDK.ShortPlayDetailPageListener
    public final void onItemSelected(int i5, PSSDK.ShortPlayDetailPageListener.ItemType itemType, int i10) {
        DetailActivity detailActivity = this.b;
        int intExtra = detailActivity.getIntent().getIntExtra("extra_index", 1);
        if (i10 > 0) {
            q qVar = detailActivity.f19588i;
            if (((Number) qVar.getValue()).intValue() > 0 && i10 % ((Number) qVar.getValue()).intValue() == 0 && i10 != intExtra) {
                h8.e.C(detailActivity, new g(2, null));
            }
        }
        L.s(new i(detailActivity, null));
        detailActivity.D();
    }
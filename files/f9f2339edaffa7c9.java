    private static final List zzc(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(jSONArray.getString(i5));
            }
            return arrayList;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }
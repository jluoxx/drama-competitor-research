    private static final List zzc(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }
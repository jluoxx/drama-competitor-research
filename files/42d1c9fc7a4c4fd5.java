    private String dq() {
        JSONObject jSONObjectDm = dm();
        JSONObject jSONObjectDn = dn();
        if (jSONObjectDm != null) {
            try {
                jSONObjectDm.put("app_id", nd.m().mo());
                jSONObjectDm.put("nw_ver", m0.dd());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.d;
                if (list != null && list.size() > 0) {
                    for (String str : this.d) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                jSONObjectDm.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (jSONObjectDn != null) {
            try {
                jSONObjectDn.put(com.thinkup.core.common.md.d0.ddn, this.f38745m0);
                jSONObjectDn.put(com.thinkup.core.common.md.d0.ddq, this.f38746md);
            } catch (Exception unused2) {
            }
        }
        HashMap map = new HashMap();
        String strD = Cdo.d(jSONObjectDm.toString());
        String strD2 = Cdo.d(jSONObjectDn.toString());
        map.put(com.thinkup.core.common.md.d0.dd0, "1.0");
        map.put("p", strD);
        map.put(com.thinkup.core.common.md.d0.dmm, strD2);
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            String str2 = (String) obj;
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str2);
            sb.append("=");
            sb.append(map.get(str2));
        }
        map.put(com.thinkup.core.common.md.d0.dmn, mm.n(nd.m().mq() + sb.toString()));
        return new JSONObject(map).toString();
    }
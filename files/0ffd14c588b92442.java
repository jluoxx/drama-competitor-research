    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public Map<String, Object> m372do() {
        Map<String, Object> map = this.mn.f40067d0;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.f40076n.mm() == 2) {
            Object obj = map.get(AdmobTUConst.CONTENT_URLS);
            String string = "";
            try {
                Object obj2 = map.get(AdmobTUConst.CONTENT_KEYWORDS);
                if (obj2 instanceof List) {
                    string = obj2.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if ((obj instanceof List) || !TextUtils.isEmpty(string)) {
                com.thinkup.core.common.nn.d0.d(this.f40073m, this.f40079o, AdmobTUConst.CONTENT_URLS, obj, string);
            }
        }
        return map;
    }
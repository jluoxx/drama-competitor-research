    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public Map<String, Object> m4781do() {
        Map<String, Object> map = this.mn.d0;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.n.mm() != 2) {
            return map;
        }
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
        if (!(obj instanceof List) && TextUtils.isEmpty(string)) {
            return map;
        }
        com.thinkup.core.common.nn.d0.d(this.m, this.o, AdmobTUConst.CONTENT_URLS, obj, string);
        return map;
    }
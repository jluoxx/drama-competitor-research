    private void d0(Map<String, Object> map, Map<String, Object> map2, AdRequest.Builder builder) {
        try {
            List<String> listDd = dd(map2);
            if (listDd == null || listDd.size() == 0) {
                listDd = d0(map);
            }
            if (listDd != null && listDd.size() > 0) {
                if (TUSDK.isNetworkLogDebug()) {
                    listDd.size();
                    for (int i = 0; i < listDd.size(); i++) {
                        listDd.get(i);
                    }
                }
                if (listDd.size() == 1) {
                    builder.setContentUrl(listDd.get(0));
                } else {
                    builder.setNeighboringContentUrls(listDd);
                }
            }
            Object obj = map2.get(AdmobTUConst.CONTENT_KEYWORDS);
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                for (Object obj2 : list) {
                    if (TUSDK.isNetworkLogDebug()) {
                        Objects.toString(obj2);
                    }
                    if (obj2 instanceof String) {
                        builder.addKeyword((String) obj2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
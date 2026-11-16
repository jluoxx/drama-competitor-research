    public static Map<String, Object> d(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null) {
                        if (TextUtils.equals(key, TUAdConst.KEY.AD_WIDTH) || TextUtils.equals(key, TUAdConst.KEY.AD_HEIGHT)) {
                            try {
                                value = Integer.valueOf((int) Double.parseDouble(value.toString()));
                            } catch (Throwable unused) {
                            }
                        }
                        concurrentHashMap.put(key, value);
                    }
                }
            } catch (Throwable unused2) {
            }
            return concurrentHashMap;
        } catch (Throwable unused3) {
            return null;
        }
    }
    private synchronized Map<String, Object> d0(String str) {
        HashMap map;
        map = new HashMap(2);
        Map<String, Object> mapM = o(str).m();
        if (mapM != null) {
            map.putAll(mapM);
        }
        return map;
    }
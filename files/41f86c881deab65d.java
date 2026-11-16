    public final Map<String, Object> n0() {
        HashMap map = new HashMap(2);
        synchronized (this.od) {
            Map<String, Object> mapM = qd().m();
            if (mapM != null) {
                map.putAll(mapM);
            }
        }
        return map;
    }
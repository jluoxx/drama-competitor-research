    public final Map<String, Object> n0() {
        HashMap map = new HashMap(2);
        synchronized (this.f37455od) {
            try {
                Map<String, Object> mapM = qd().m();
                if (mapM != null) {
                    map.putAll(mapM);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
    private void d(String str, Object obj) {
        if (this.m == null) {
            this.m = new ConcurrentHashMap(2);
        }
        this.m.put(str, obj);
    }
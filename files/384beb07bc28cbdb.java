    public T setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            zzo.zzi("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.zza.zzh(list);
        return (T) self();
    }
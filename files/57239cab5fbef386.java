    public final void c(StatusBarNotification statusBarNotification) {
        String key = statusBarNotification.getKey();
        HashMap map = this.f;
        String str = (String) map.get(key);
        String groupKey = statusBarNotification.getGroupKey();
        HashMap map2 = this.e;
        if (str == null || !str.equals(groupKey)) {
            map.put(key, groupKey);
            if (str != null && map2.containsKey(str)) {
                m4.a aVar = (m4.a) map2.get(str);
                aVar.b.remove(key);
                if (aVar.b.isEmpty()) {
                    map2.remove(str);
                }
            }
        }
        if (!statusBarNotification.isGroup() || groupKey == null) {
            return;
        }
        m4.a aVar2 = (m4.a) map2.get(groupKey);
        if (aVar2 == null) {
            aVar2 = new m4.a();
            aVar2.b = new HashSet();
            map2.put(groupKey, aVar2);
        }
        if ((statusBarNotification.getNotification().flags & 512) != 0) {
            aVar2.f54928a = key;
        } else {
            aVar2.b.add(key);
        }
    }
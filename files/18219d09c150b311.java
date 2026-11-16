    public static void d(nd ndVar) {
        if (ndVar == null || com.thinkup.core.common.o.nd.m().dd() == null) {
            return;
        }
        if (TextUtils.isEmpty(ndVar.f37971d0)) {
            ndVar.f37971d0 = com.thinkup.core.common.o.nd.m().n0();
        }
        if (!TextUtils.isEmpty(ndVar.f37980q)) {
            ndVar.dd = com.thinkup.core.common.o.nd.m().dd(ndVar.f37980q);
            n(ndVar);
            if (TUAdxSetting.getInstance().isAdxNetworkMode(ndVar.f37980q)) {
                ndVar.dmq = 1;
            }
        }
        ndVar.f103do = String.valueOf(System.currentTimeMillis());
        com.thinkup.core.common.nn.d.d.d().d(ndVar);
    }
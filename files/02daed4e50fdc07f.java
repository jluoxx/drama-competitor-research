    protected static void d(nd ndVar) {
        if (ndVar == null || com.thinkup.core.common.o.nd.m().dd() == null) {
            return;
        }
        if (TextUtils.isEmpty(ndVar.d0)) {
            ndVar.d0 = com.thinkup.core.common.o.nd.m().n0();
        }
        if (!TextUtils.isEmpty(ndVar.q)) {
            ndVar.dd = com.thinkup.core.common.o.nd.m().dd(ndVar.q);
            n(ndVar);
            if (TUAdxSetting.getInstance().isAdxNetworkMode(ndVar.q)) {
                ndVar.dmq = 1;
            }
        }
        ndVar.f185do = String.valueOf(System.currentTimeMillis());
        com.thinkup.core.common.nn.d.d.d().d(ndVar);
    }
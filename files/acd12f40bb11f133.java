    private final boolean c() {
        GlobalConfigEntity globalConfigEntityD = tk2.o.d();
        int userDailyMaxAdCount = globalConfigEntityD != null ? globalConfigEntityD.getUserDailyMaxAdCount() : 100;
        long jQueryTodayAdShowListCount = OVSAdInfoDaoManager.INSTANCE.queryTodayAdShowListCount();
        StringBuilder sb = new StringBuilder();
        sb.append("配置最大ad个数 : ");
        sb.append(userDailyMaxAdCount);
        sb.append(" 用户今日已看 : ");
        sb.append(jQueryTodayAdShowListCount);
        sb.append(" ,拦截本次ad请求");
        long j = userDailyMaxAdCount;
        sb.append(jQueryTodayAdShowListCount >= j);
        pe3.e("wlaaa", sb.toString());
        return jQueryTodayAdShowListCount >= j;
    }
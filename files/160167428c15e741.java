    private final boolean e() {
        GlobalConfigEntity globalConfigEntityF = bm2.f717a.f();
        int userDailyMaxAdCount = globalConfigEntityF != null ? globalConfigEntityF.getUserDailyMaxAdCount() : 100;
        long jQueryTodayAdShowListCount = OVSAdInfoDaoManager.INSTANCE.queryTodayAdShowListCount();
        StringBuilder sb = new StringBuilder();
        sb.append("配置最大ad个数 : ");
        sb.append(userDailyMaxAdCount);
        sb.append(" 用户今日已看 : ");
        sb.append(jQueryTodayAdShowListCount);
        sb.append(" ,拦截本次ad请求");
        long j = userDailyMaxAdCount;
        sb.append(jQueryTodayAdShowListCount >= j);
        we3.g("wlaaa", sb.toString());
        return jQueryTodayAdShowListCount >= j;
    }
    public final BaseResponse<Object> l() {
        BaseResponse<Object> baseResponse = new BaseResponse<>();
        baseResponse.setCode(200);
        baseResponse.setMsg(FirebaseAnalytics.Param.SUCCESS);
        baseResponse.setData(Boolean.TRUE);
        return baseResponse;
    }
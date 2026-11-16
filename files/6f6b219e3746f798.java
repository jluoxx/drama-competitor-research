    public final BaseResponse<Object> n() {
        BaseResponse<Object> baseResponse = new BaseResponse<>();
        baseResponse.setCode(200);
        baseResponse.setMsg(FirebaseAnalytics.Param.SUCCESS);
        baseResponse.setData(Boolean.TRUE);
        return baseResponse;
    }
    /* JADX INFO: Access modifiers changed from: private */
    public static final void fillData$lambda$11(OVSDrama2WithdrawActivity oVSDrama2WithdrawActivity, BaseQuickAdapter adapter, View view, int i) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        OVSRespWithdrawInfo oVSRespWithdrawInfo = (OVSRespWithdrawInfo) adapter.getData().get(i);
        if (oVSRespWithdrawInfo == null) {
            return;
        }
        if (!oVSRespWithdrawInfo.getCanApply()) {
            oVSDrama2WithdrawActivity.getVm().i(oVSRespWithdrawInfo);
        } else if (oVSDrama2WithdrawActivity.isInputInfo) {
            oVSDrama2WithdrawActivity.getVm().i(oVSRespWithdrawInfo);
        } else {
            ToastUtil.show(oVSDrama2WithdrawActivity.getString(R$string.banding_account_hint));
            OVSDrama2WithdrawViewModel.n(oVSDrama2WithdrawActivity.getVm(), false, 1, null);
        }
    }
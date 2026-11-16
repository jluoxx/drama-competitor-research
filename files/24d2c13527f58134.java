    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmRewardPop(final int type, final OVSRespIncentiveRewardInfo entity) {
        if (zg.f19798a.c()) {
            return;
        }
        OVSDrama2TaskViewModel taskViewModel = getTaskViewModel();
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(entity.getAmount());
        Pair<Double, String> pairM = taskViewModel.M(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, this);
        this.popDramaWatchAdRewardConfirm = xa4.f17458a.f(requireActivity(), entity.getAmount(), new ba3() { // from class: com.kingtar.work.mvvm.ui.ovs.play.OVSDramaPlayActivity.showConfirmRewardPop.1
            @Override // defpackage.ba3
            public void onClose(BasePopupView pop) {
                Double doubleOrNull2;
                Double doubleOrNull3;
                Intrinsics.checkNotNullParameter(pop, "pop");
                ba3.a.a(this, pop);
                double dDoubleValue = 0.0d;
                if (type != 1) {
                    String lastRewardAmount = entity.getLastRewardAmount();
                    double dDoubleValue2 = (lastRewardAmount == null || (doubleOrNull3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(lastRewardAmount)) == null) ? 0.0d : doubleOrNull3.doubleValue();
                    String lastRewardAmount2 = entity.getLastRewardAmount();
                    if (lastRewardAmount2 != null && (doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(lastRewardAmount2)) != null) {
                        dDoubleValue = doubleOrNull2.doubleValue();
                    }
                    OVSReqPositionRewardParams oVSReqPositionRewardParams = new OVSReqPositionRewardParams(9, 1, 1, null, null, new PddRewardParams(dDoubleValue2, dDoubleValue), 24, null);
                    we3.g("wlaaa", "用户选择双倍奖励，real 加金币,先加第一次的，数值是fake reward的数值 " + entity.getAmount());
                    this.getTaskViewModel().v(oVSReqPositionRewardParams);
                    return;
                }
                Integer numValueOf = Integer.valueOf(entity.getPosition());
                int i = 1;
                Integer num = null;
                Integer num2 = null;
                Integer num3 = null;
                Double doubleOrNull4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(entity.getAmount());
                double dDoubleValue3 = doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d;
                Double doubleOrNull5 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(entity.getAmount());
                OVSReqPositionRewardParams oVSReqPositionRewardParams2 = new OVSReqPositionRewardParams(numValueOf, i, num, num2, num3, new PddRewardParams(dDoubleValue3, doubleOrNull5 != null ? doubleOrNull5.doubleValue() : 0.0d), 28, null);
                we3.g("wlaaa", "用户选择单倍奖励，real 加金币,数值是fake reward的数值 " + entity.getAmount());
                this.getTaskViewModel().v(oVSReqPositionRewardParams2);
            }

            @Override // defpackage.ba3
            public void onDismiss() {
                ba3.a.b(this);
            }

            @Override // defpackage.ba3
            public void onFirstPagPlayEnd() {
                ba3.a.c(this);
            }

            @Override // defpackage.ba3
            public void onOk(BasePopupView pop) {
                Intrinsics.checkNotNullParameter(pop, "pop");
            }
        }, pairM.getSecond(), pairM.getFirst().doubleValue());
    }
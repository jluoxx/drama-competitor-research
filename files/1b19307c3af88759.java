    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmRewardPop(final int type, final OVSRespIncentiveRewardInfo entity) {
        if (tf.o.O()) {
            return;
        }
        OVSDrama2TaskViewModel taskViewModel = getTaskViewModel();
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(entity.getAmount());
        Pair<Double, String> pairJ = taskViewModel.J(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, this);
        this.popDramaWatchAdRewardConfirm = ha4.o.d(requireActivity(), entity.getAmount(), new n93() { // from class: com.kingtar.work.mvvm.ui.ovs.play.OVSDramaPlayActivity.showConfirmRewardPop.1
            @Override // defpackage.n93
            public void onClose(BasePopupView pop) {
                Double doubleOrNull2;
                Double doubleOrNull3;
                Intrinsics.checkNotNullParameter(pop, "pop");
                n93.o.o(this, pop);
                double dDoubleValue = 0.0d;
                if (type != 1) {
                    String lastRewardAmount = entity.getLastRewardAmount();
                    double dDoubleValue2 = (lastRewardAmount == null || (doubleOrNull3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(lastRewardAmount)) == null) ? 0.0d : doubleOrNull3.doubleValue();
                    String lastRewardAmount2 = entity.getLastRewardAmount();
                    if (lastRewardAmount2 != null && (doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(lastRewardAmount2)) != null) {
                        dDoubleValue = doubleOrNull2.doubleValue();
                    }
                    OVSReqPositionRewardParams oVSReqPositionRewardParams = new OVSReqPositionRewardParams(9, 1, 1, null, null, new PddRewardParams(dDoubleValue2, dDoubleValue), 24, null);
                    pe3.e("wlaaa", "用户选择双倍奖励，real 加金币,先加第一次的，数值是fake reward的数值 " + entity.getAmount());
                    this.getTaskViewModel().t(oVSReqPositionRewardParams);
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
                pe3.e("wlaaa", "用户选择单倍奖励，real 加金币,数值是fake reward的数值 " + entity.getAmount());
                this.getTaskViewModel().t(oVSReqPositionRewardParams2);
            }

            @Override // defpackage.n93
            public void onDismiss() {
                n93.o.O(this);
            }

            @Override // defpackage.n93
            public void onFirstPagPlayEnd() {
                n93.o.a(this);
            }

            @Override // defpackage.n93
            public void onOk(BasePopupView pop) {
                Intrinsics.checkNotNullParameter(pop, "pop");
            }
        }, pairJ.getSecond(), pairJ.getFirst().doubleValue());
    }
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        pe3.e("wlaaa", "收到firebase远程通知 " + message.getData());
        uc6 uc6Var = uc6.o;
        long jE = uc6Var.e("daily_remind");
        pe3.e("wlaaa", "上次展示时间 " + k36.e(jE));
        if (!k36.d(jE)) {
            pe3.e("wlaaa", "今日没有展示过通知");
            if (!a()) {
                pe3.e("wlaaa", "不在合适时间 不展示");
                return;
            } else {
                b(this);
                uc6Var.C("daily_remind");
                return;
            }
        }
        pe3.e("wlaaa", "今日展示过通知");
        pe3.e("wlaaa", "今日展示通知次数 " + uc6Var.f("daily_remind"));
        if (System.currentTimeMillis() - jE <= 3600000) {
            pe3.e("wlaaa", "距离上次出来 没超过1H呢 间隔了 " + (System.currentTimeMillis() - jE) + " 毫秒，目标 3600000毫秒");
            return;
        }
        if (!a()) {
            pe3.e("wlaaa", "不在合适时间 不展示");
        } else {
            b(this);
            uc6Var.C("daily_remind");
        }
    }
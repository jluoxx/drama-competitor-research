    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        we3.g("wlaaa", "收到firebase远程通知 " + message.getData());
        try {
            Result.Companion companion = Result.INSTANCE;
            Reliability.f4240a.f(this, "fcm");
            Result.m5292constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5292constructorimpl(ResultKt.createFailure(th));
        }
        jf6 jf6Var = jf6.f14121a;
        long jH = jf6Var.h("daily_remind");
        we3.g("wlaaa", "上次展示时间 " + u56.i(jH));
        if (!u56.h(jH)) {
            we3.g("wlaaa", "今日没有展示过通知");
            if (!c()) {
                we3.g("wlaaa", "不在合适时间 不展示");
                return;
            } else {
                d(this);
                jf6Var.J("daily_remind");
                return;
            }
        }
        we3.g("wlaaa", "今日展示过通知");
        we3.g("wlaaa", "今日展示通知次数 " + jf6Var.i("daily_remind"));
        if (System.currentTimeMillis() - jH <= 3600000) {
            we3.g("wlaaa", "距离上次出来 没超过1H呢 间隔了 " + (System.currentTimeMillis() - jH) + " 毫秒，目标 3600000毫秒");
            return;
        }
        if (!c()) {
            we3.g("wlaaa", "不在合适时间 不展示");
        } else {
            d(this);
            jf6Var.J("daily_remind");
        }
    }
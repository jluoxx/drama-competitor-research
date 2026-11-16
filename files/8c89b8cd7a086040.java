    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || context == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    we3.g(b, "屏幕熄灭");
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    we3.g(b, "屏幕亮起");
                    break;
                }
                break;
            case 823795052:
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    we3.g(b, "手机解锁");
                    bv6 bv6Var = bv6.f749a;
                    Notification notificationK = bv6Var.k(context, Drama2MainActivity.class, "local");
                    if (notificationK != null) {
                        NotificationManagerCompat.from(context).notify(bv6Var.e().get(1).intValue(), notificationK);
                    }
                    break;
                }
                break;
            case 833559602:
                if (action.equals("android.intent.action.USER_UNLOCKED")) {
                    we3.g(b, "首次解锁（重启后）");
                    break;
                }
                break;
        }
    }
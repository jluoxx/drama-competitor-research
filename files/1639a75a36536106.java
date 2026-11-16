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
                    pe3.e(O, "屏幕熄灭");
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    pe3.e(O, "屏幕亮起");
                    break;
                }
                break;
            case 823795052:
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    pe3.e(O, "手机解锁");
                    yr6 yr6Var = yr6.o;
                    Notification notificationI = yr6Var.i(context, Drama2MainActivity.class, "local");
                    if (notificationI != null) {
                        NotificationManagerCompat.from(context).notify(yr6Var.c().get(1).intValue(), notificationI);
                    }
                    break;
                }
                break;
            case 833559602:
                if (action.equals("android.intent.action.USER_UNLOCKED")) {
                    pe3.e(O, "首次解锁（重启后）");
                    break;
                }
                break;
        }
    }
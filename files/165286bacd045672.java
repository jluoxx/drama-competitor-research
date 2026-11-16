    public static void g(Activity context) {
        boolean zC;
        ActivityInfo activityInfo;
        kotlin.jvm.internal.l.h(context, "context");
        if (p.b) {
            zC = true;
        } else {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            zC = kotlin.jvm.internal.l.c((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName, context.getPackageName());
        }
        if (zC) {
            Toast.makeText(context, "App has been set to default launcher", 0).show();
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Bc.a.f1651a.getClass();
            if (((Number) Bc.a.f1656j.k(Bc.a.b[7])).longValue() == 0) {
                RoleManager roleManagerD = com.freetools.freereels.utils.a.d(context.getSystemService(com.freetools.freereels.utils.a.m()));
                if (roleManagerD == null || !roleManagerD.isRoleAvailable("android.app.role.HOME") || roleManagerD.isRoleHeld("android.app.role.HOME")) {
                    return;
                }
                Intent intentCreateRequestRoleIntent = roleManagerD.createRequestRoleIntent("android.app.role.HOME");
                kotlin.jvm.internal.l.g(intentCreateRequestRoleIntent, "createRequestRoleIntent(...)");
                context.startActivityForResult(intentCreateRequestRoleIntent, 1);
                return;
            }
        }
        context.startActivity(new Intent("android.settings.HOME_SETTINGS"));
    }
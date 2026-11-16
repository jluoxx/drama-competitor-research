    /* JADX WARN: Multi-variable type inference failed */
    public static final zc.j p(Activity activity) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo;
        int i5 = 0;
        kotlin.jvm.internal.l.h(activity, "activity");
        if (!activity.isDestroyed() && !activity.isFinishing()) {
            if (!zc.p.b) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                ResolveInfo resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 65536);
                kotlin.jvm.internal.l.c((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName, activity.getPackageName());
            }
            if (!zc.p.b) {
                if (activity instanceof androidx.lifecycle.x) {
                    androidx.lifecycle.x xVar = (androidx.lifecycle.x) activity;
                    androidx.lifecycle.q lifecycle = xVar.getLifecycle();
                    zc.d dVar = zc.g.b;
                    lifecycle.removeObserver(dVar);
                    xVar.getLifecycle().addObserver(dVar);
                }
                zc.p.b("guideDialogShow", null);
                zc.j jVar = new zc.j(activity, 80);
                View viewInflate = View.inflate(activity, R.layout.bottom_sheet_dialog, null);
                ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 0);
                kotlin.jvm.internal.l.g(applicationInfo, "getApplicationInfo(...)");
                String string = activity.getPackageManager().getApplicationLabel(applicationInfo).toString();
                TextView textView = (TextView) viewInflate.findViewById(R.id.tvTitle);
                if (textView != null) {
                    textView.getPaint().setFakeBoldText(true);
                    textView.setText(activity.getString(R.string.welcome_to, string));
                }
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvSet);
                if (textView2 != null) {
                    textView2.getPaint().setFakeBoldText(true);
                    textView2.setText(activity.getString(R.string.set_as_default_launcher, string));
                }
                jVar.setContentView(viewInflate);
                View viewFindViewById = viewInflate.findViewById(R.id.btnTryNow);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewFindViewById, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.95f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.95f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(700L);
                objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                objectAnimatorOfPropertyValuesHolder.start();
                viewFindViewById.setOnClickListener(new zc.e(activity, jVar, i5));
                jVar.setOnDismissListener(new Ag.s(objectAnimatorOfPropertyValuesHolder, 4));
                jVar.show();
                return jVar;
            }
            zc.g.f72026a = false;
        }
        return null;
    }
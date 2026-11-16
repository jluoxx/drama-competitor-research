    @Override // com.android.launcher3.BaseActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f12291T;
        a4.s sVar = this.f12292U;
        handler.removeCallbacks(sVar);
        Pattern pattern = U0.f12358a;
        Message messageObtain = Message.obtain(handler, sVar);
        messageObtain.setAsynchronous(true);
        handler.sendMessage(messageObtain);
        i0 i0Var = this.f12277F;
        if (i0Var != null) {
            i0Var.b();
        }
        this.f12277F = null;
        int i5 = InstallShortcutReceiver.f12236a & (-2);
        InstallShortcutReceiver.f12236a = i5;
        if (i5 == 0) {
            Message.obtain(InstallShortcutReceiver.b, 2, getApplicationContext()).sendToTarget();
        }
        LauncherModel launcherModel = this.f12279H;
        launcherModel.getClass();
        if (U0.f12361h) {
            Handler handler2 = LauncherModel.f12306k;
            C3.f fVar = launcherModel.f12312i;
            handler2.removeCallbacks(fVar);
            handler2.post(fVar);
        }
        a4.t.H(this, true);
        boolean z4 = zc.p.f72040a;
        zc.g.h(new zc.n(2, null));
        A();
    }
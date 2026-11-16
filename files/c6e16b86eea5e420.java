    public boolean w(View view, Intent intent, d0 d0Var) {
        int i5;
        ActivityOptions activityOptionsP;
        if (this.f12145k && !U0.m(this, intent)) {
            Toast.makeText(this, R.string.safemode_shortcut_error, 0).show();
            return false;
        }
        Bundle bundle = (view == null || intent.hasExtra("com.android.launcher3.intent.extra.shortcut.INGORE_LAUNCH_ANIMATION") || (activityOptionsP = p(view)) == null) ? null : activityOptionsP.toBundle();
        UserHandle userHandle = d0Var != null ? d0Var.user : null;
        intent.addFlags(268435456);
        if (view != null) {
            intent.setSourceBounds(s(view));
        }
        try {
            if (U0.f12363j && (d0Var instanceof S0) && (((i5 = d0Var.itemType) == 1 || i5 == 6) && !((S0) d0Var).d(3))) {
                x(intent, bundle, d0Var);
            } else if (userHandle == null || userHandle.equals(Process.myUserHandle())) {
                startActivity(intent, bundle);
            } else {
                ((LauncherApps) e4.c.g(this).b).startMainActivity(intent.getComponent(), userHandle, intent.getSourceBounds(), bundle);
            }
            n().logAppLaunch(view, intent);
            return true;
        } catch (ActivityNotFoundException e) {
            e = e;
            Toast.makeText(this, R.string.activity_not_found, 0).show();
            Log.e("BaseDraggingActivity", "Unable to launch. tag=" + d0Var + " intent=" + intent, e);
            return false;
        } catch (SecurityException e10) {
            e = e10;
            Toast.makeText(this, R.string.activity_not_found, 0).show();
            Log.e("BaseDraggingActivity", "Unable to launch. tag=" + d0Var + " intent=" + intent, e);
            return false;
        }
    }
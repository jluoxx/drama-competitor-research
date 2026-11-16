    public final void A() {
        android.support.v4.media.session.h f10;
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(0);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            window.setNavigationBarDividerColor(0);
        }
        if (i5 >= 29) {
            window.setNavigationBarContrastEnforced(false);
            window.setStatusBarContrastEnforced(false);
        }
        if (i5 >= 30) {
            L3.c cVar = new L3.c(window.getDecorView());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                f10 = new Q1.G0(window, cVar);
            } else {
                f10 = i10 >= 30 ? new Q1.F0(window, cVar) : new Q1.E0(window, cVar);
            }
            f10.D(w4.m.b(this, R.attr.isWorkspaceDarkText));
        }
    }
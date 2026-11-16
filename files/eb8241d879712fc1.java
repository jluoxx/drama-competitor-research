    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FirebaseRemoteConfig firebaseRemoteConfig, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gc2.o.i("remote_config_fetch_activate", it.isSuccessful() ? FirebaseAnalytics.Param.SUCCESS : "failed");
        pe3.o("FirebaseConfigModel complete");
        pe3.e("FirebaseConfigModel", "fetchAndActivate complete ");
        if (!it.isSuccessful()) {
            t.setValue(Boolean.FALSE);
            pe3.e("FirebaseConfigModel", "fetchAndActivate complete but failed");
            return;
        }
        pe3.e("FirebaseConfigModel", "配置是否更新 " + ((Boolean) it.getResult()));
        try {
            o.z(firebaseRemoteConfig);
            t.setValue(Boolean.TRUE);
        } catch (Exception e2) {
            t.setValue(Boolean.FALSE);
            pe3.b("FirebaseConfigModel", "Firebase 远程配置处理失败: " + e2.getMessage());
        }
    }
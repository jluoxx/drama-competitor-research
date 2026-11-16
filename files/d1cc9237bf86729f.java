    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FirebaseRemoteConfig firebaseRemoteConfig, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sd2.f15369a.k("remote_config_fetch_activate", it.isSuccessful() ? FirebaseAnalytics.Param.SUCCESS : "failed");
        we3.a("FirebaseConfigModel complete");
        we3.g("FirebaseConfigModel", "fetchAndActivate complete ");
        if (!it.isSuccessful()) {
            t.setValue(Boolean.FALSE);
            we3.g("FirebaseConfigModel", "fetchAndActivate complete but failed");
            return;
        }
        we3.g("FirebaseConfigModel", "配置是否更新 " + ((Boolean) it.getResult()));
        try {
            f16917a.z(firebaseRemoteConfig);
            t.setValue(Boolean.TRUE);
        } catch (Exception e2) {
            t.setValue(Boolean.FALSE);
            we3.d("FirebaseConfigModel", "Firebase 远程配置处理失败: " + e2.getMessage());
        }
    }
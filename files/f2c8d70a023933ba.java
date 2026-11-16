    public final void t() {
        t.setValue(null);
        we3.a("FirebaseConfigModelstart init");
        sd2 sd2Var = sd2.f15369a;
        sd2Var.m("remote_config_instance");
        final FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
        sd2Var.k("remote_config_instance", "ready");
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(TimeUnit.HOURS.toSeconds(24L)).build();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfigSettingsBuild, "build(...)");
        firebaseRemoteConfig.setConfigSettingsAsync(firebaseRemoteConfigSettingsBuild);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("defaultConfigJson", b);
        linkedHashMap.put("taskConfigJson", e);
        linkedHashMap.put("withdrawConfigJson", f);
        linkedHashMap.put("rewardLevelConfigJson", g);
        firebaseRemoteConfig.setDefaultsAsync(linkedHashMap);
        sd2Var.m("remote_config_fetch_activate");
        Task<Boolean> taskAddOnFailureListener = firebaseRemoteConfig.fetchAndActivate().addOnFailureListener(new OnFailureListener() { // from class: pc2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                tc2.u(exc);
            }
        });
        final Function1 function1 = new Function1() { // from class: qc2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tc2.v((Boolean) obj);
            }
        };
        taskAddOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: rc2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                tc2.w(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: sc2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                tc2.x(firebaseRemoteConfig, task);
            }
        });
        firebaseRemoteConfig.addOnConfigUpdateListener(new b(firebaseRemoteConfig));
    }
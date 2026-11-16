    public final void t() {
        t.setValue(null);
        pe3.o("FirebaseConfigModelstart init");
        gc2 gc2Var = gc2.o;
        gc2Var.k("remote_config_instance");
        final FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
        gc2Var.i("remote_config_instance", "ready");
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(TimeUnit.HOURS.toSeconds(24L)).build();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfigSettingsBuild, "build(...)");
        firebaseRemoteConfig.setConfigSettingsAsync(firebaseRemoteConfigSettingsBuild);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("defaultConfigJson", O);
        linkedHashMap.put("taskConfigJson", c);
        linkedHashMap.put("withdrawConfigJson", d);
        linkedHashMap.put("rewardLevelConfigJson", e);
        firebaseRemoteConfig.setDefaultsAsync(linkedHashMap);
        gc2Var.k("remote_config_fetch_activate");
        Task<Boolean> taskAddOnFailureListener = firebaseRemoteConfig.fetchAndActivate().addOnFailureListener(new OnFailureListener() { // from class: db2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                hb2.u(exc);
            }
        });
        final Function1 function1 = new Function1() { // from class: eb2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hb2.v((Boolean) obj);
            }
        };
        taskAddOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: fb2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                hb2.w(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: gb2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                hb2.x(firebaseRemoteConfig, task);
            }
        });
        firebaseRemoteConfig.addOnConfigUpdateListener(new a(firebaseRemoteConfig));
    }
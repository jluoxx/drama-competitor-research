    /* JADX INFO: Access modifiers changed from: private */
    public final void z(FirebaseRemoteConfig firebaseRemoteConfig) {
        String str;
        if (u != 0 && System.currentTimeMillis() - u < 60000) {
            pe3.e("FirebaseConfigModel", "距离上次读取不超过1min，拒绝二次读取");
            return;
        }
        u = System.currentTimeMillis();
        gc2.o.k("remote_config_read_parse");
        String string = firebaseRemoteConfig.getString("abTestGroup");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pe3.e("FirebaseConfigModel", "人群分组 当前设备获取分组 >>> " + string);
        tk2 tk2Var = tk2.o;
        tk2Var.s(string);
        ABTestGroup aBTestGroupO = tk2Var.O();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("defaultConfigJson_v4");
        arrayList.add("taskConfigJson");
        arrayList.add("withdrawConfigJson_v4");
        arrayList.add("rewardLevelConfigJson_v4");
        String str2 = "withdrawChannelConfigJson_v4";
        arrayList.add("withdrawChannelConfigJson_v4");
        arrayList.add("signListConfigJson_v2");
        arrayList.add("newUserRewardPopAdForce");
        arrayList.add("cashSignListConfigJson_v4");
        arrayList.add("marieasgame_config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        switch (o.$EnumSwitchMapping$0[aBTestGroupO.ordinal()]) {
            case 1:
                str = "withdrawChannelConfigJson_v4";
                for (String str3 : arrayList) {
                    linkedHashMap.put(str3, str3);
                }
                break;
            case 2:
                str = "withdrawChannelConfigJson_v4";
                Map<String, FirebaseRemoteConfigValue> all = firebaseRemoteConfig.getAll();
                Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    Iterator it2 = it;
                    sb.append("_B");
                    String string2 = sb.toString();
                    if (all.containsKey(string2)) {
                        linkedHashMap.put(str4, string2);
                    } else {
                        linkedHashMap.put(str4, str4);
                    }
                    it = it2;
                }
                break;
            case 3:
                str = "withdrawChannelConfigJson_v4";
                Map<String, FirebaseRemoteConfigValue> all2 = firebaseRemoteConfig.getAll();
                Intrinsics.checkNotNullExpressionValue(all2, "getAll(...)");
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str5 = (String) it3.next();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str5);
                    Iterator it4 = it3;
                    sb2.append("_C");
                    String string3 = sb2.toString();
                    if (all2.containsKey(string3)) {
                        linkedHashMap.put(str5, string3);
                    } else {
                        linkedHashMap.put(str5, str5);
                    }
                    it3 = it4;
                }
                break;
            case 4:
                str = "withdrawChannelConfigJson_v4";
                Map<String, FirebaseRemoteConfigValue> all3 = firebaseRemoteConfig.getAll();
                Intrinsics.checkNotNullExpressionValue(all3, "getAll(...)");
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    String str6 = (String) it5.next();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str6);
                    Iterator it6 = it5;
                    sb3.append("_D");
                    String string4 = sb3.toString();
                    if (all3.containsKey(string4)) {
                        linkedHashMap.put(str6, string4);
                    } else {
                        linkedHashMap.put(str6, str6);
                    }
                    it5 = it6;
                }
                break;
            case 5:
                str = "withdrawChannelConfigJson_v4";
                Map<String, FirebaseRemoteConfigValue> all4 = firebaseRemoteConfig.getAll();
                Intrinsics.checkNotNullExpressionValue(all4, "getAll(...)");
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    String str7 = (String) it7.next();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str7);
                    Iterator it8 = it7;
                    sb4.append("_E");
                    String string5 = sb4.toString();
                    if (all4.containsKey(string5)) {
                        linkedHashMap.put(str7, string5);
                    } else {
                        linkedHashMap.put(str7, str7);
                    }
                    it7 = it8;
                }
                break;
            case 6:
                Map<String, FirebaseRemoteConfigValue> all5 = firebaseRemoteConfig.getAll();
                Intrinsics.checkNotNullExpressionValue(all5, "getAll(...)");
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    String str8 = (String) it9.next();
                    Iterator it10 = it9;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str8);
                    String str9 = str2;
                    sb5.append("_F");
                    String string6 = sb5.toString();
                    if (all5.containsKey(string6)) {
                        linkedHashMap.put(str8, string6);
                    } else {
                        linkedHashMap.put(str8, str8);
                    }
                    it9 = it10;
                    str2 = str9;
                }
                str = str2;
                break;
            default:
                str = "withdrawChannelConfigJson_v4";
                for (String str10 : arrayList) {
                    linkedHashMap.put(str10, str10);
                }
                break;
        }
        String string7 = firebaseRemoteConfig.getString(A(linkedHashMap, "defaultConfigJson_v4"));
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        try {
            GlobalConfigEntity globalConfigEntity = (GlobalConfigEntity) g.a(string7, GlobalConfigEntity.class);
            pe3.e("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "defaultConfigJson_v4"));
            pe3.o("FirebaseConfigModel over");
            g.postValue(globalConfigEntity);
            tk2.o.E(globalConfigEntity);
        } catch (Exception e2) {
            pe3.e("FirebaseConfigModel", "setting config parse json err " + e2.getMessage());
        }
        String string8 = firebaseRemoteConfig.getString(A(linkedHashMap, "taskConfigJson"));
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        try {
            Object objA = g.a(string8, GlobalTaskConfig.class);
            o.d((GlobalTaskConfig) objA);
            GlobalTaskConfig globalTaskConfig = (GlobalTaskConfig) objA;
            pe3.e("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "taskConfigJson"));
            pe3.o("FirebaseConfigModel over");
            h.postValue(globalTaskConfig);
            tk2.o.A(globalTaskConfig);
        } catch (Exception e3) {
            pe3.e("FirebaseConfigModel", "task config parse json err " + e3.getMessage());
        }
        String string9 = firebaseRemoteConfig.getString(A(linkedHashMap, "withdrawConfigJson_v4"));
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        try {
            tk2 tk2Var2 = tk2.o;
            GlobalWithdrawConfig globalWithdrawConfigM = tk2Var2.m();
            if (globalWithdrawConfigM != null) {
                pe3.e("FirebaseConfigModel", "本地已经有" + A(linkedHashMap, "withdrawConfigJson_v4") + "配置了，不再从远程读取");
                i.postValue(globalWithdrawConfigM);
            } else {
                GlobalWithdrawConfig globalWithdrawConfig = (GlobalWithdrawConfig) g.a(string9, GlobalWithdrawConfig.class);
                pe3.e("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "withdrawConfigJson_v4"));
                pe3.o("FirebaseConfigModel over");
                i.postValue(globalWithdrawConfig);
                tk2Var2.C(globalWithdrawConfig);
            }
        } catch (Exception e4) {
            pe3.e("FirebaseConfigModel", "withdraw config parse json err " + e4.getMessage());
        }
        String string10 = firebaseRemoteConfig.getString(A(linkedHashMap, "rewardLevelConfigJson_v4"));
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        try {
            tk2 tk2Var3 = tk2.o;
            GlobalRewardLevelEntity globalRewardLevelEntityI = tk2Var3.i();
            if (globalRewardLevelEntityI != null) {
                pe3.e("FirebaseConfigModel", "本地已经有" + A(linkedHashMap, "rewardLevelConfigJson_v4") + "配置了，不再从远程读取");
                j.postValue(globalRewardLevelEntityI);
            } else {
                GlobalRewardLevelEntity globalRewardLevelEntity = (GlobalRewardLevelEntity) g.a(string10, GlobalRewardLevelEntity.class);
                pe3.e("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "rewardLevelConfigJson_v4"));
                pe3.o("FirebaseConfigModel over");
                j.postValue(globalRewardLevelEntity);
                tk2Var3.y(globalRewardLevelEntity);
            }
        } catch (Exception e5) {
            pe3.e("FirebaseConfigModel", "reward_level config parse json err " + e5.getMessage());
        }
        String string11 = firebaseRemoteConfig.getString(A(linkedHashMap, str));
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        k.postValue(string11);
        tk2 tk2Var4 = tk2.o;
        tk2Var4.B(string11);
        String string12 = firebaseRemoteConfig.getString(A(linkedHashMap, "signListConfigJson_v2"));
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        try {
            GlobalSignListEntity globalSignListEntity = (GlobalSignListEntity) g.a(string12, GlobalSignListEntity.class);
            pe3.e("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "signListConfigJson_v2"));
            pe3.o("FirebaseConfigModel over");
            l.postValue(globalSignListEntity);
            tk2Var4.z(globalSignListEntity);
        } catch (Exception e6) {
            pe3.e("FirebaseConfigModel", "sign_list config parse json err " + e6.getMessage());
        }
        String string13 = firebaseRemoteConfig.getString(A(linkedHashMap, "cashSignListConfigJson_v4"));
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        try {
            tk2 tk2Var5 = tk2.o;
            GlobalCashSignListEntity globalCashSignListEntityC = tk2Var5.c();
            if (globalCashSignListEntityC != null) {
                pe3.e("FirebaseConfigModel", "本地已经有" + A(linkedHashMap, "cashSignListConfigJson_v4") + "配置了，不再从远程读取");
                m.postValue(globalCashSignListEntityC);
            } else {
                GlobalCashSignListEntity globalCashSignListEntity = (GlobalCashSignListEntity) g.a(string13, GlobalCashSignListEntity.class);
                pe3.e("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "cashSignListConfigJson_v4"));
                pe3.o("FirebaseConfigModel over");
                m.postValue(globalCashSignListEntity);
                tk2Var5.t(globalCashSignListEntity);
            }
        } catch (Exception e7) {
            pe3.e("FirebaseConfigModel", "cash_sign_list config parse json err " + e7.getMessage());
        }
        boolean z = firebaseRemoteConfig.getBoolean(A(linkedHashMap, "newUserRewardPopAdForce"));
        n.postValue(Boolean.valueOf(z));
        tk2 tk2Var6 = tk2.o;
        tk2Var6.v(z);
        String string14 = firebaseRemoteConfig.getString(A(linkedHashMap, "okspin_config"));
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        try {
            GlobalOkSpinEntity globalOkSpinEntity = (GlobalOkSpinEntity) g.a(string14, GlobalOkSpinEntity.class);
            p.postValue(globalOkSpinEntity);
            tk2Var6.w(globalOkSpinEntity);
        } catch (Exception e8) {
            pe3.e("FirebaseConfigModel", "okSpin config parse json err " + e8.getMessage());
        }
        String string15 = firebaseRemoteConfig.getString(A(linkedHashMap, "marieasgame_config"));
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        pe3.e("FirebaseConfigModel", "体验小游戏配置  " + string15);
        GlobalMarieasgameConfig globalMarieasgameConfig = null;
        try {
            if (!StringsKt__StringsKt.isBlank(string15)) {
                globalMarieasgameConfig = (GlobalMarieasgameConfig) g.a(string15, GlobalMarieasgameConfig.class);
            }
        } catch (Exception e9) {
            pe3.e("FirebaseConfigModel", "marieasgame config parse json err " + e9.getMessage());
        }
        q.postValue(globalMarieasgameConfig);
        tk2 tk2Var7 = tk2.o;
        tk2Var7.u(globalMarieasgameConfig);
        String string16 = firebaseRemoteConfig.getString(A(linkedHashMap, "pangle_pre_id_list"));
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        pe3.e("FirebaseConfigModel", "获取pangle优先展示的id列表 " + string16);
        gc2 gc2Var = gc2.o;
        gc2Var.k("remote_config_pre_id_parse");
        try {
            gc2Var.k("remote_config_pre_id_json_parse");
            PanglePreIdListEntity panglePreIdListEntity = (PanglePreIdListEntity) g.a(string16, PanglePreIdListEntity.class);
            gc2Var.i("remote_config_pre_id_json_parse", FirebaseAnalytics.Param.SUCCESS);
            r.postValue(panglePreIdListEntity);
            s.setValue(Boolean.valueOf(panglePreIdListEntity != null));
            tk2Var7.x(panglePreIdListEntity);
            gc2Var.i("remote_config_pre_id_parse", FirebaseAnalytics.Param.SUCCESS);
        } catch (Exception e10) {
            s.setValue(Boolean.FALSE);
            gc2 gc2Var2 = gc2.o;
            gc2Var2.i("remote_config_pre_id_json_parse", "failed");
            gc2Var2.i("remote_config_pre_id_parse", "failed");
            pe3.e("FirebaseConfigModel", "pangle pre id list config parse json err " + e10.getMessage());
        }
        gc2.o.i("remote_config_read_parse", "complete");
    }
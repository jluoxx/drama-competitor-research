    /* JADX INFO: Access modifiers changed from: private */
    public final void z(FirebaseRemoteConfig firebaseRemoteConfig) {
        String str;
        if (u != 0 && System.currentTimeMillis() - u < 60000) {
            we3.g("FirebaseConfigModel", "距离上次读取不超过1min，拒绝二次读取");
            return;
        }
        u = System.currentTimeMillis();
        sd2.f15369a.m("remote_config_read_parse");
        String string = firebaseRemoteConfig.getString("abTestGroup");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        we3.g("FirebaseConfigModel", "人群分组 当前设备获取分组 >>> " + string);
        bm2 bm2Var = bm2.f717a;
        bm2Var.t(string);
        ABTestGroup aBTestGroupB = bm2Var.b();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("defaultConfigJson_v3");
        arrayList.add("taskConfigJson");
        arrayList.add("withdrawConfigJson_v3");
        arrayList.add("rewardLevelConfigJson_v3");
        String str2 = "withdrawChannelConfigJson_v4";
        arrayList.add("withdrawChannelConfigJson_v4");
        arrayList.add("signListConfigJson_v2");
        arrayList.add("newUserRewardPopAdForce");
        arrayList.add("cashSignListConfigJson_v3");
        arrayList.add("retention_strategy");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        switch (a.$EnumSwitchMapping$0[aBTestGroupB.ordinal()]) {
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
        String string7 = firebaseRemoteConfig.getString(A(linkedHashMap, "defaultConfigJson_v3"));
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        we3.g("FirebaseConfigModel", "读取config " + string7);
        try {
            GlobalConfigEntity globalConfigEntity = (GlobalConfigEntity) h.c(string7, GlobalConfigEntity.class);
            we3.g("FirebaseConfigModel", String.valueOf(globalConfigEntity));
            we3.a("FirebaseConfigModel over");
            i.postValue(globalConfigEntity);
        } catch (Exception e2) {
            we3.g("FirebaseConfigModel", "setting config parse json err " + e2.getMessage());
        }
        String string8 = firebaseRemoteConfig.getString(A(linkedHashMap, "taskConfigJson"));
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        we3.g("FirebaseConfigModel", "读取任务列表config " + string8);
        try {
            Object objC = h.c(string8, GlobalTaskConfig.class);
            f16917a.f((GlobalTaskConfig) objC);
            GlobalTaskConfig globalTaskConfig = (GlobalTaskConfig) objC;
            we3.g("FirebaseConfigModel", String.valueOf(globalTaskConfig));
            we3.a("FirebaseConfigModel over");
            j.postValue(globalTaskConfig);
            bm2.f717a.B(globalTaskConfig);
        } catch (Exception e3) {
            we3.g("FirebaseConfigModel", "task config parse json err " + e3.getMessage());
        }
        String string9 = firebaseRemoteConfig.getString(A(linkedHashMap, "withdrawConfigJson_v3"));
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        we3.g("FirebaseConfigModel", "读取提现列表config " + string9);
        try {
            bm2 bm2Var2 = bm2.f717a;
            GlobalWithdrawConfig globalWithdrawConfigO = bm2Var2.o();
            if (globalWithdrawConfigO != null) {
                we3.g("FirebaseConfigModel", "本地已经有" + A(linkedHashMap, "withdrawConfigJson_v3") + "配置了，不再从远程读取");
                k.postValue(globalWithdrawConfigO);
            } else {
                GlobalWithdrawConfig globalWithdrawConfig = (GlobalWithdrawConfig) h.c(string9, GlobalWithdrawConfig.class);
                we3.g("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "withdrawConfigJson_v3"));
                we3.a("FirebaseConfigModel over");
                k.postValue(globalWithdrawConfig);
                bm2Var2.D(globalWithdrawConfig);
            }
        } catch (Exception e4) {
            we3.g("FirebaseConfigModel", "withdraw config parse json err " + e4.getMessage());
        }
        String string10 = firebaseRemoteConfig.getString(A(linkedHashMap, "rewardLevelConfigJson_v3"));
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        we3.g("FirebaseConfigModel", "读取奖励机制config " + string10);
        try {
            bm2 bm2Var3 = bm2.f717a;
            GlobalRewardLevelEntity globalRewardLevelEntityK = bm2Var3.k();
            if (globalRewardLevelEntityK != null) {
                we3.g("FirebaseConfigModel", "本地已经有" + A(linkedHashMap, "rewardLevelConfigJson_v3") + "配置了，不再从远程读取");
                l.postValue(globalRewardLevelEntityK);
            } else {
                GlobalRewardLevelEntity globalRewardLevelEntity = (GlobalRewardLevelEntity) h.c(string10, GlobalRewardLevelEntity.class);
                we3.g("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "rewardLevelConfigJson_v3"));
                we3.a("FirebaseConfigModel over");
                l.postValue(globalRewardLevelEntity);
                bm2Var3.z(globalRewardLevelEntity);
            }
        } catch (Exception e5) {
            we3.g("FirebaseConfigModel", "reward_level config parse json err " + e5.getMessage());
        }
        String string11 = firebaseRemoteConfig.getString(A(linkedHashMap, str));
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        we3.g("FirebaseConfigModel", "提现渠道列表配置 " + string11);
        m.postValue(string11);
        bm2 bm2Var4 = bm2.f717a;
        bm2Var4.C(string11);
        String string12 = firebaseRemoteConfig.getString(A(linkedHashMap, "signListConfigJson_v2"));
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        we3.g("FirebaseConfigModel", "签到列表配置 " + string12);
        try {
            GlobalSignListEntity globalSignListEntity = (GlobalSignListEntity) h.c(string12, GlobalSignListEntity.class);
            we3.g("FirebaseConfigModel", String.valueOf(globalSignListEntity));
            we3.a("FirebaseConfigModel over");
            n.postValue(globalSignListEntity);
            bm2Var4.A(globalSignListEntity);
        } catch (Exception e6) {
            we3.g("FirebaseConfigModel", "sign_list config parse json err " + e6.getMessage());
        }
        String string13 = firebaseRemoteConfig.getString(A(linkedHashMap, "cashSignListConfigJson_v3"));
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        we3.g("FirebaseConfigModel", "现金签到列表配置 " + string13);
        try {
            bm2 bm2Var5 = bm2.f717a;
            GlobalCashSignListEntity globalCashSignListEntityE = bm2Var5.e();
            if (globalCashSignListEntityE != null) {
                we3.g("FirebaseConfigModel", "本地已经有" + A(linkedHashMap, "cashSignListConfigJson_v3") + "配置了，不再从远程读取");
                o.postValue(globalCashSignListEntityE);
            } else {
                GlobalCashSignListEntity globalCashSignListEntity = (GlobalCashSignListEntity) h.c(string13, GlobalCashSignListEntity.class);
                we3.g("FirebaseConfigModel", "从远程读取" + A(linkedHashMap, "cashSignListConfigJson_v3"));
                we3.a("FirebaseConfigModel over");
                o.postValue(globalCashSignListEntity);
                bm2Var5.u(globalCashSignListEntity);
            }
        } catch (Exception e7) {
            we3.g("FirebaseConfigModel", "cash_sign_list config parse json err " + e7.getMessage());
        }
        boolean z = firebaseRemoteConfig.getBoolean(A(linkedHashMap, "newUserRewardPopAdForce"));
        we3.g("FirebaseConfigModel", "新用户新人奖励弹窗是否要求看广告配置 " + z);
        p.postValue(Boolean.valueOf(z));
        bm2 bm2Var6 = bm2.f717a;
        bm2Var6.v(z);
        String string14 = firebaseRemoteConfig.getString(A(linkedHashMap, "okspin_config"));
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        we3.g("FirebaseConfigModel", "okSpin配置 " + string14);
        try {
            GlobalOkSpinEntity globalOkSpinEntity = (GlobalOkSpinEntity) h.c(string14, GlobalOkSpinEntity.class);
            q.postValue(globalOkSpinEntity);
            bm2Var6.w(globalOkSpinEntity);
        } catch (Exception e8) {
            we3.g("FirebaseConfigModel", "okSpin config parse json err " + e8.getMessage());
        }
        String string15 = firebaseRemoteConfig.getString(A(linkedHashMap, "pangle_pre_id_list"));
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        we3.g("FirebaseConfigModel", "获取pangle优先展示的id列表 " + string15);
        sd2 sd2Var = sd2.f15369a;
        sd2Var.m("remote_config_pre_id_parse");
        try {
            sd2Var.m("remote_config_pre_id_json_parse");
            PanglePreIdListEntity panglePreIdListEntity = (PanglePreIdListEntity) h.c(string15, PanglePreIdListEntity.class);
            sd2Var.k("remote_config_pre_id_json_parse", FirebaseAnalytics.Param.SUCCESS);
            r.postValue(panglePreIdListEntity);
            s.setValue(Boolean.valueOf(panglePreIdListEntity != null));
            bm2.f717a.x(panglePreIdListEntity);
            sd2Var.k("remote_config_pre_id_parse", FirebaseAnalytics.Param.SUCCESS);
        } catch (Exception e9) {
            s.setValue(Boolean.FALSE);
            sd2 sd2Var2 = sd2.f15369a;
            sd2Var2.k("remote_config_pre_id_json_parse", "failed");
            sd2Var2.k("remote_config_pre_id_parse", "failed");
            we3.g("FirebaseConfigModel", "pangle pre id list config parse json err " + e9.getMessage());
        }
        sd2.f15369a.k("remote_config_read_parse", "complete");
        String string16 = firebaseRemoteConfig.getString(A(linkedHashMap, "retention_strategy"));
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        we3.g("FirebaseConfigModel", "获取留存策略 " + string16);
        try {
            bm2.f717a.y(string16);
        } catch (Exception e10) {
            we3.g("FirebaseConfigModel", "putRetentionStrategyJson " + e10.getMessage());
        }
        sd2.f15369a.k("remote_config_read_parse", "complete");
    }
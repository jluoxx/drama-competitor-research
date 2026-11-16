    @Override // java.lang.Runnable
    public final void run() {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        String strF;
        String strF2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        long jLongValue4;
        int i5 = 0;
        switch (this.b) {
            case 0:
                try {
                    Boolean bool = (Boolean) d.U(Boolean.class, "show_other_launcher_app", Boolean.TRUE);
                    bool.booleanValue();
                    Bc.a.f1651a.getClass();
                    Bc.a.d.p(bool, Bc.a.b[1]);
                } catch (Exception unused) {
                    Bc.a.f1651a.getClass();
                    KProperty kProperty = Bc.a.b[1];
                    Bc.a.d.p(Boolean.TRUE, kProperty);
                }
                try {
                    String str = (String) d.U(String.class, "lucky_gift_config", "\n        {\n  \"first_display_sec\": 7200,\n  \"close_break_sec\": 3600,\n  \"close_misclick_rate\": 50,\n  \"display_refresh_sec\": 7200,\n  \"click_refresh_sec\": 900,\n  \"icon_list\": \"https://www.fancylab.top/entry_icon/icon_list.json\",\n  \"landing_url\": \"https://www.fancylab.top/taskcenter/entry.html?gaid={gaid}\"\n}\n    ");
                    if (str.length() > 0) {
                        Bc.a.f1651a.getClass();
                        Bc.a.f.p(str, Bc.a.b[3]);
                    }
                } catch (Exception unused2) {
                    Bc.a.f1651a.getClass();
                    Bc.a.f.p("\n        {\n  \"first_display_sec\": 7200,\n  \"close_break_sec\": 3600,\n  \"close_misclick_rate\": 50,\n  \"display_refresh_sec\": 7200,\n  \"click_refresh_sec\": 900,\n  \"icon_list\": \"https://www.fancylab.top/entry_icon/icon_list.json\",\n  \"landing_url\": \"https://www.fancylab.top/taskcenter/entry.html?gaid={gaid}\"\n}\n    ", Bc.a.b[3]);
                }
                Object obj = "--";
                try {
                    Object objU = d.U(String.class, "lucky_gift_config", "--");
                    obj = objU;
                } catch (Exception unused3) {
                }
                Log.e("AdReportPlugin", (String) obj);
                try {
                    Boolean bool2 = (Boolean) d.U(Boolean.class, "lucky_gift_enabled", Boolean.FALSE);
                    bool2.booleanValue();
                    Bc.a.f1651a.getClass();
                    Bc.a.f1653g.p(bool2, Bc.a.b[4]);
                } catch (Exception unused4) {
                    Bc.a.f1651a.getClass();
                    KProperty kProperty2 = Bc.a.b[4];
                    Bc.a.f1653g.p(Boolean.FALSE, kProperty2);
                }
                try {
                    long jLongValue5 = ((Number) d.U(Long.class, "launcher_set_type", 0L)).longValue();
                    Bc.a.f1651a.getClass();
                    KProperty kProperty3 = Bc.a.b[7];
                    Bc.a.f1656j.p(Long.valueOf(jLongValue5), kProperty3);
                } catch (Exception unused5) {
                    Bc.a.f1651a.getClass();
                    Bc.a.f1656j.p(0L, Bc.a.b[7]);
                }
                try {
                    int iIntValue = ((Number) d.U(Integer.class, "host_app_pos", 0)).intValue();
                    if (iIntValue == 1) {
                        Bc.a.f1651a.getClass();
                        KProperty kProperty4 = Bc.a.b[9];
                        Bc.a.f1658l.p(Boolean.TRUE, kProperty4);
                    }
                    if (iIntValue == 2) {
                        Bc.a.f1651a.getClass();
                        KProperty kProperty5 = Bc.a.b[8];
                        Bc.a.f1657k.p(Boolean.TRUE, kProperty5);
                        return;
                    }
                    return;
                } catch (Exception unused6) {
                    return;
                }
            case 1:
                G g10 = v.f5835M0;
                synchronized (g10) {
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = g10.f1890a;
                            int i10 = g10.b;
                            while (i5 < i10) {
                                v vVar = (v) objArr[i5];
                                boolean showLayoutBounds = vVar.getShowLayoutBounds();
                                Class cls = v.f5833J0;
                                vVar.setShowLayoutBounds(J.q());
                                if (showLayoutBounds != vVar.getShowLayoutBounds()) {
                                    v.l(vVar.getRoot());
                                }
                                i5++;
                            }
                        } else {
                            Object[] objArr2 = g10.f1890a;
                            int i11 = g10.b;
                            while (i5 < i11) {
                                v.l(((v) objArr2[i5]).getRoot());
                                i5++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                Adjust.onResume();
                return;
            case 3:
                h.a();
                return;
            case 4:
                t7.c();
                return;
            case 5:
                e eVarD = e.d();
                l.g(eVarD, "getInstance(...)");
                try {
                    boolean zContainsKey = eVarD.a().containsKey("detail_ad_interval");
                    Class cls2 = Long.TYPE;
                    Class cls3 = Boolean.TYPE;
                    if (zContainsKey) {
                        kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.G.a(Long.class);
                        if (eVarA.equals(kotlin.jvm.internal.G.a(cls3))) {
                            jLongValue4 = ((Long) Boolean.valueOf(eVarD.b("detail_ad_interval"))).longValue();
                        } else if (eVarA.equals(kotlin.jvm.internal.G.a(cls2))) {
                            jLongValue4 = eVarD.e("detail_ad_interval");
                        } else if (eVarA.equals(kotlin.jvm.internal.G.a(String.class))) {
                            jLongValue4 = ((Long) eVarD.f("detail_ad_interval")).longValue();
                        }
                        b.DetailAdInterval.b(jLongValue4);
                    }
                    if (eVarD.a().containsKey("discover_ad_interval")) {
                        kotlin.jvm.internal.e eVarA2 = kotlin.jvm.internal.G.a(Long.class);
                        if (eVarA2.equals(kotlin.jvm.internal.G.a(cls3))) {
                            jLongValue = ((Long) Boolean.valueOf(eVarD.b("discover_ad_interval"))).longValue();
                        } else if (eVarA2.equals(kotlin.jvm.internal.G.a(cls2))) {
                            jLongValue = eVarD.e("discover_ad_interval");
                        } else if (eVarA2.equals(kotlin.jvm.internal.G.a(String.class))) {
                            jLongValue = ((Long) eVarD.f("discover_ad_interval")).longValue();
                        }
                        b.DiscoverAdInterval.b(jLongValue);
                    }
                    if (eVarD.a().containsKey("detail_nativead_interval")) {
                        kotlin.jvm.internal.e eVarA3 = kotlin.jvm.internal.G.a(Long.class);
                        if (eVarA3.equals(kotlin.jvm.internal.G.a(cls3))) {
                            jLongValue2 = ((Long) Boolean.valueOf(eVarD.b("detail_nativead_interval"))).longValue();
                        } else if (eVarA3.equals(kotlin.jvm.internal.G.a(cls2))) {
                            jLongValue2 = eVarD.e("detail_nativead_interval");
                        } else if (eVarA3.equals(kotlin.jvm.internal.G.a(String.class))) {
                            jLongValue2 = ((Long) eVarD.f("detail_nativead_interval")).longValue();
                        }
                        b.DetailNativeAdInterval.b(jLongValue2);
                    }
                    if (eVarD.a().containsKey("discover_nativead_interval")) {
                        kotlin.jvm.internal.e eVarA4 = kotlin.jvm.internal.G.a(Long.class);
                        if (eVarA4.equals(kotlin.jvm.internal.G.a(cls3))) {
                            jLongValue3 = ((Long) Boolean.valueOf(eVarD.b("discover_nativead_interval"))).longValue();
                        } else if (eVarA4.equals(kotlin.jvm.internal.G.a(cls2))) {
                            jLongValue3 = eVarD.e("discover_nativead_interval");
                        } else if (eVarA4.equals(kotlin.jvm.internal.G.a(String.class))) {
                            jLongValue3 = ((Long) eVarD.f("discover_nativead_interval")).longValue();
                        }
                        b.DiscoverNativeAdInterval.b(jLongValue3);
                    }
                    if (eVarD.a().containsKey("show_back_ad")) {
                        kotlin.jvm.internal.e eVarA5 = kotlin.jvm.internal.G.a(Boolean.class);
                        if (eVarA5.equals(kotlin.jvm.internal.G.a(cls3))) {
                            zBooleanValue4 = eVarD.b("show_back_ad");
                        } else if (eVarA5.equals(kotlin.jvm.internal.G.a(cls2))) {
                            zBooleanValue4 = ((Boolean) Long.valueOf(eVarD.e("show_back_ad"))).booleanValue();
                        } else if (eVarA5.equals(kotlin.jvm.internal.G.a(String.class))) {
                            zBooleanValue4 = ((Boolean) eVarD.f("show_back_ad")).booleanValue();
                        }
                        com.freetools.freereels.data.a.ShowBackAd.e(zBooleanValue4);
                    }
                    if (eVarD.a().containsKey("special_firebase_topics")) {
                        kotlin.jvm.internal.e eVarA6 = kotlin.jvm.internal.G.a(String.class);
                        if (eVarA6.equals(kotlin.jvm.internal.G.a(cls3))) {
                            strF = (String) Boolean.valueOf(eVarD.b("special_firebase_topics"));
                        } else if (eVarA6.equals(kotlin.jvm.internal.G.a(cls2))) {
                            strF = (String) Long.valueOf(eVarD.e("special_firebase_topics"));
                        } else if (eVarA6.equals(kotlin.jvm.internal.G.a(String.class))) {
                            strF = eVarD.f("special_firebase_topics");
                        }
                        C.q(strF);
                    }
                    if (eVarD.a().containsKey("notification_config")) {
                        kotlin.jvm.internal.e eVarA7 = kotlin.jvm.internal.G.a(String.class);
                        if (eVarA7.equals(kotlin.jvm.internal.G.a(cls3))) {
                            strF2 = (String) Boolean.valueOf(eVarD.b("notification_config"));
                        } else if (eVarA7.equals(kotlin.jvm.internal.G.a(cls2))) {
                            strF2 = (String) Long.valueOf(eVarD.e("notification_config"));
                        } else if (eVarA7.equals(kotlin.jvm.internal.G.a(String.class))) {
                            strF2 = eVarD.f("notification_config");
                        }
                        g.d.b(strF2);
                    }
                    if (eVarD.a().containsKey("splash_pop_launcher")) {
                        kotlin.jvm.internal.e eVarA8 = kotlin.jvm.internal.G.a(Boolean.class);
                        if (eVarA8.equals(kotlin.jvm.internal.G.a(cls3))) {
                            zBooleanValue = eVarD.b("splash_pop_launcher");
                        } else if (eVarA8.equals(kotlin.jvm.internal.G.a(cls2))) {
                            zBooleanValue = ((Boolean) Long.valueOf(eVarD.e("splash_pop_launcher"))).booleanValue();
                        } else if (eVarA8.equals(kotlin.jvm.internal.G.a(String.class))) {
                            zBooleanValue = ((Boolean) eVarD.f("splash_pop_launcher")).booleanValue();
                        }
                        com.freetools.freereels.data.a.SplashPopLauncher.e(zBooleanValue);
                    }
                    if (eVarD.a().containsKey("main_pop_launcher")) {
                        kotlin.jvm.internal.e eVarA9 = kotlin.jvm.internal.G.a(Boolean.class);
                        if (eVarA9.equals(kotlin.jvm.internal.G.a(cls3))) {
                            zBooleanValue2 = eVarD.b("main_pop_launcher");
                        } else if (eVarA9.equals(kotlin.jvm.internal.G.a(cls2))) {
                            zBooleanValue2 = ((Boolean) Long.valueOf(eVarD.e("main_pop_launcher"))).booleanValue();
                        } else if (eVarA9.equals(kotlin.jvm.internal.G.a(String.class))) {
                            zBooleanValue2 = ((Boolean) eVarD.f("main_pop_launcher")).booleanValue();
                        }
                        com.freetools.freereels.data.a.MainPopLauncher.e(zBooleanValue2);
                    }
                    if (eVarD.a().containsKey("detail_pop_launcher")) {
                        kotlin.jvm.internal.e eVarA10 = kotlin.jvm.internal.G.a(Boolean.class);
                        if (eVarA10.equals(kotlin.jvm.internal.G.a(cls3))) {
                            zBooleanValue3 = eVarD.b("detail_pop_launcher");
                        } else if (eVarA10.equals(kotlin.jvm.internal.G.a(cls2))) {
                            zBooleanValue3 = ((Boolean) Long.valueOf(eVarD.e("detail_pop_launcher"))).booleanValue();
                        } else if (!eVarA10.equals(kotlin.jvm.internal.G.a(String.class))) {
                            return;
                        } else {
                            zBooleanValue3 = ((Boolean) eVarD.f("detail_pop_launcher")).booleanValue();
                        }
                        com.freetools.freereels.data.a.DetailPopLauncher.e(zBooleanValue3);
                        return;
                    }
                    return;
                } catch (Exception unused7) {
                    return;
                }
            case 6:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f22514a;
                return;
            case 7:
                t0.e();
                return;
            case 8:
                AdRequest.lambda$build$1();
                return;
            case 9:
                AdRequest.lambda$build$4();
                return;
            case 10:
                try {
                    SessionManager.get().resume();
                    return;
                } catch (Throwable unused8) {
                    return;
                }
            case 11:
                try {
                    SessionManager.get().pause();
                    return;
                } catch (Throwable unused9) {
                    return;
                }
            case 12:
                return;
            case 13:
                com.mbridge.msdk.config.component.common.util.d.b();
                return;
            case 14:
                AnalyticsClient.a();
                return;
            default:
                AtomicInteger atomicInteger = k.f61444c;
                return;
        }
    }
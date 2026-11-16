    /* JADX WARN: Code duplicated, block: B:85:0x0454  */
    @Override // android.app.Application
    public final void onCreate() {
        boolean zEquals;
        String processName;
        FirebaseMessaging firebaseMessaging;
        boolean z4;
        int simState;
        d dVar;
        ArrayList arrayList;
        String processName2;
        int i5 = 2;
        final int i10 = 1;
        final int i11 = 0;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            String processName3 = Application.getProcessName();
            if (!getPackageName().equals(Application.getProcessName())) {
                WebView.setDataDirectorySuffix(processName3);
            }
        }
        b = this;
        int iMyPid = Process.myPid();
        Object systemService = getSystemService("activity");
        l.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    processName2 = "";
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    processName2 = next.processName;
                    l.g(processName2, "processName");
                    break;
                }
            }
            zEquals = processName2.equals(getPackageName());
        } else {
            zEquals = false;
        }
        if (zEquals) {
            com.freetools.freereels.ad.a.b.getClass();
            try {
                e eVarC = Q3.a.c("\n{\n   \"sdkKey\": \"TtOiL8NTJU1bDqIX0tmIeZmZJWh4Q4lri6OW_K_XxQhTidDMZudMD7r9XICn8aukdnJtCFaDfdUubHDCcZlihG\",\n   \"interstitialId\": \"af2c9b04d84c08d2\",\n   \"nativeId\": \"aea2402737f6887f\"\n}\n");
                c.f3932a = eVarC.o(k.n(R6.a.a("Mjxbn9zM\n"), R6.a.a("QVgw1Lm1RhU=\n")));
                String strO = eVarC.o(k.n(R6.a.a("KH1cPSBoWrg1ekk0G38=\n"), R6.a.a("QRMoWFIbLtE=\n")));
                if (strO != null) {
                    c.b = strO;
                }
                String strO2 = eVarC.o(k.n(R6.a.a("uo4f1cZXhTA=\n"), R6.a.a("1O9rvLAyzFQ=\n")));
                if (strO2 != null) {
                    c.f3933c = strO2;
                }
                String strO3 = eVarC.o(k.n(R6.a.a("LIeaBTKMN3A=\n"), R6.a.a("X/f2ZEHkfhQ=\n")));
                if (strO3 != null) {
                    c.d = strO3;
                }
            } catch (Exception unused) {
            }
            try {
                e eVarC2 = Q3.a.c("\n{\n   \"appId\": \"h6a227ecdac4c5\",\n   \"appKey\": \"a3d2d39cea339d9835e1157fbb80a5d0a\",\n   \"interstitialId\": \"n6a227efcd569a\",\n   \"splashId\": \"n6a227f0e28340\"\n}\n");
                Jc.d.f3934a = eVarC2.o(k.n(R6.a.a("NJFyvjE=\n"), R6.a.a("VeEC91WhLnA=\n")));
                Jc.d.b = eVarC2.o(k.n(R6.a.a("T1r7prS3\n"), R6.a.a("LiqL7dHOUPk=\n")));
                String strO4 = eVarC2.o(k.n(R6.a.a("rmuoE90Yz7azbL0a5g8=\n"), R6.a.a("xwXcdq9ru98=\n")));
                if (strO4 != null) {
                    Jc.d.f3935c = strO4;
                }
                eVarC2.o(k.n(R6.a.a("9gTcP2P7FkQ=\n"), R6.a.a("mGWoVhWeXyA=\n")));
                String strO5 = eVarC2.o(k.n(R6.a.a("kwJWtJsrW7I=\n"), R6.a.a("4HI61ehDEtY=\n")));
                if (strO5 != null) {
                    Jc.d.d = strO5;
                }
            } catch (Exception unused2) {
            }
            HashMap map = b.f3930a;
            e eVarC3 = Q3.a.c("\n{\n    \"app_token\": \"zd4gh4tfdbsw\",\n    \"app_activated\": \"ll8fuo\",\n    \"app_ad_show_success\": \"wb45os\",\n    \"user_active_open\": \"7yx9zz\",\n    \"level_achieved\": \"z8rw0k\",\n    \"trigger_attribution\": \"7es9wa\",\n    \"level_achieved_a1\": \"2v572m\",\n    \"level_achieved_a2\": \"t338mc\",\n    \"level_achieved_a3\": \"9dueg4\",\n    \"level_achieved_a4\": \"qjbaj2\",\n    \"level_achieved_a5\": \"l44vhz\",\n    \"level_achieved_a6\": \"ttauk8\"\n}\n");
            of.a.f55705a = eVarC3.o(k.n(R6.a.a("2yZmq3EVBcvU\n"), R6.a.a("ulYW9AV6bq4=\n")));
            HashMap map2 = b.f3930a;
            map2.put(k.n(R6.a.a("AX/F2voAir4WbsHg/w==\n"), R6.a.a("YA+1hZtj/tc=\n")), eVarC3.o(k.n(R6.a.a("SJQMB0fhSspfhQg9Qg==\n"), R6.a.a("KeR8WCaCPqM=\n"))));
            map2.put(k.n(R6.a.a("nTRtg7c/eR6UK2qDpS5FDpk3bg==\n"), R6.a.a("/EQd3NZbJm0=\n")), eVarC3.o(k.n(R6.a.a("b6a6fXu5m05mub19aainXmuluQ==\n"), R6.a.a("DtbKIhrdxD0=\n"))));
            map2.put(k.n(R6.a.a("/6GIYp4xWN3jpIhPriBexw==\n"), R6.a.a("itLtEMFQO6k=\n")), eVarC3.o(k.n(R6.a.a("lJdBiBLVGhOIkkGlIsQcCQ==\n"), R6.a.a("4eQk+k20eWc=\n"))));
            map2.put(k.n(R6.a.a("z0CCUjsvqejLTJFBMhSX6pI=\n"), R6.a.a("oyX0N1dwyIs=\n")), eVarC3.o(k.n(R6.a.a("+fQu5vkdlQj9+D318CarCqQ=\n"), R6.a.a("lZFYg5VC9Gs=\n"))));
            map2.put(k.n(R6.a.a("3c+bJiP42/vZw4g1KsPl+YM=\n"), R6.a.a("sartQ0+nupg=\n")), eVarC3.o(k.n(R6.a.a("VJXIEo2GBvJQmdsBhL048Ao=\n"), R6.a.a("OPC+d+HZZ5E=\n"))));
            map2.put(k.n(R6.a.a("dcKfLayDfZtxzow+pbhDmSo=\n"), R6.a.a("GafpSMDcHPg=\n")), eVarC3.o(k.n(R6.a.a("QwiaeOkPFglHBIlr4DQoCxw=\n"), R6.a.a("L23sHYVQd2o=\n"))));
            map2.put(k.n(R6.a.a("ev3iQ2fRt6J+8fFQbuqJoCI=\n"), R6.a.a("FpiUJguO1sE=\n")), eVarC3.o(k.n(R6.a.a("OKuj8bqlZKg8p7Dis55aqmA=\n"), R6.a.a("VM7VlNb6Bcs=\n"))));
            map2.put(k.n(R6.a.a("Qk1q9kXnZVdGQXnlTNxbVRs=\n"), R6.a.a("Ligckym4BDQ=\n")), eVarC3.o(k.n(R6.a.a("H5oNdI6fF3cblh5nh6QpdUY=\n"), R6.a.a("c/97EeLAdhQ=\n"))));
            map2.put(k.n(R6.a.a("ih9PBGCzl/GOE1wXaYip89A=\n"), R6.a.a("5no5YQzs9pI=\n")), eVarC3.o(k.n(R6.a.a("QY+xNWAjfmtFg6ImaRhAaRs=\n"), R6.a.a("LerHUAx8Hwg=\n"))));
            b.b = eVarC3.o(k.n(R6.a.a("67+zLgXtKxvvs6A9DNY=\n"), R6.a.a("h9rFS2mySng=\n")));
            b.f3931c = eVarC3.o(k.n(R6.a.a("n8wYw/3/lsGKygXW8/iR6oLRHw==\n"), R6.a.a("675xpJqa5J4=\n")));
            p.d = this;
            if (Build.VERSION.SDK_INT < 28) {
                int iMyPid2 = Process.myPid();
                ActivityManager activityManager = (ActivityManager) getSystemService(k.n(R6.a.a("9RucZAJw3hs=\n"), R6.a.a("lHjoDXQZqmI=\n")));
                if (activityManager != null && activityManager.getRunningAppProcesses() != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it2 = activityManager.getRunningAppProcesses().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            processName = null;
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next2 = it2.next();
                        if (next2.pid == iMyPid2) {
                            processName = next2.processName;
                            break;
                        }
                    }
                } else {
                    processName = null;
                    break;
                }
            } else {
                processName = Application.getProcessName();
            }
            if (getPackageName().equals(processName)) {
                f fVar = f.b;
                fVar.f72123a = p.d.getSharedPreferences(k.n(R6.a.a("PMc1vr01Frw=\n"), R6.a.a("SaZF4c1Hc9o=\n")), 0);
                zg.d dVar2 = zg.d.b;
                if (fVar.f72123a.getInt(k.n(R6.a.a("Yg5Bw8zHuDpoCQ==\n"), R6.a.a("C30esLm0yF8=\n")), 0) <= 0) {
                    List list = Nc.a.f5024a;
                    dVar2.a(Build.FINGERPRINT, list);
                    String str = Build.DISPLAY;
                    dVar2.a(str != null ? str.toLowerCase(Locale.US) : k.n(R6.a.a("Ml3uRGyWbQ==\n"), R6.a.a("RzOFKgPhAxY=\n")), list);
                    List list2 = Nc.a.f5025c;
                    String str2 = Build.BRAND;
                    dVar2.a(str2, list2);
                    List list3 = Nc.a.b;
                    String str3 = Build.MODEL;
                    dVar2.a(str3, list3);
                    if (ActivityManager.isUserAMonkey()) {
                        if (!dVar2.f72120a) {
                            dVar2.f72120a = true;
                        }
                        fVar.a(1, k.n(R6.a.a("rLGv/ii22L+mtg==\n"), R6.a.a("xcLwjV3FqNo=\n")));
                    }
                    if (k.n(R6.a.a("+So=\n"), R6.a.a("umQvlBgV/jU=\n")).equals(l4.c.a(p.d))) {
                        if (!dVar2.f72120a) {
                            dVar2.f72120a = true;
                        }
                        fVar.a(1, k.n(R6.a.a("rLGv/ii22L+mtg==\n"), R6.a.a("xcLwjV3FqNo=\n")));
                    }
                    List list4 = Nc.b.f5026a;
                    h.a aVar = new h.a();
                    FreereelsApp freereelsApp = p.d;
                    aVar.f46056a = str2;
                    aVar.b = Build.MANUFACTURER;
                    aVar.f46057c = str3;
                    String str4 = Build.ID;
                    aVar.d = str4 != null ? str4.toLowerCase(Locale.US) : k.n(R6.a.a("atY7A8oqTw==\n"), R6.a.a("H7hQbaVdIb0=\n"));
                    if (freereelsApp != null) {
                        try {
                            if (Settings.Secure.getInt(freereelsApp.getContentResolver(), k.n(R6.a.a("g6Zj+931r3GOp2U=\n"), R6.a.a("4sIBpLibzhM=\n")), 0) == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        z4 = false;
                    }
                    aVar.e = Boolean.valueOf(z4);
                    aVar.f = Boolean.valueOf(Settings.Secure.getInt(freereelsApp.getContentResolver(), k.n(R6.a.a("PBctu15lkE49HC+BQW+UVzEcPK1tb45COh4+ug==\n"), R6.a.a("WHJb3jIK4CM=\n")), 0) != 0);
                    TelephonyManager telephonyManager = (TelephonyManager) freereelsApp.getSystemService(k.n(R6.a.a("ig10hgY=\n"), R6.a.a("+mUb6GMzofE=\n")));
                    aVar.f46058g = (telephonyManager == null || (simState = telephonyManager.getSimState()) == 0 || simState == 1) ? k.n(R6.a.a("r0jNkw==\n"), R6.a.a("wSej9hwgLI8=\n")) : k.n(R6.a.a("omIJqFFKC1w=\n"), R6.a.a("0Qtk9zIreTg=\n"));
                    aVar.f46059h = Build.TYPE;
                    aVar.f46060i = l4.c.a(freereelsApp);
                    if (list4.indexOf(aVar) >= 0) {
                        if (!dVar2.f72120a) {
                            dVar2.f72120a = true;
                        }
                        fVar.a(1, k.n(R6.a.a("rLGv/ii22L+mtg==\n"), R6.a.a("xcLwjV3FqNo=\n")));
                    }
                } else if (!dVar2.f72120a) {
                    dVar2.f72120a = true;
                }
                m mVar = m.d;
                if (!mVar.b) {
                    mVar.f72133a = fVar.f72123a.getInt(k.n(R6.a.a("mTGtVZyTTaieIa0=\n"), R6.a.a("7ELIJ8PgIt0=\n")), 0);
                    mVar.b = true;
                }
                g.f72124c.a();
                yg.b bVar = yg.b.b;
                String string = fVar.f72123a.getString(k.n(R6.a.a("QjM/eNihuzFGMBk=\n"), R6.a.a("I1dgC6zT2kU=\n")), null);
                if (string != null) {
                    bVar.f71944a = j.c.a(string);
                }
                final M3.l lVar = a.a.b.f9429a;
                String strN = k.n(R6.a.a("Fs9dtiV4wKQJ0w==\n"), R6.a.a("Zr0y0lAbtM0=\n"));
                FreereelsApp freereelsApp2 = p.d;
                AdjustConfig adjustConfig = new AdjustConfig(freereelsApp2, of.a.f55705a, strN, true);
                String strB = M3.l.b();
                f fVar2 = f.b;
                if (strB == null) {
                    boolean z5 = mVar.b;
                    if (!z5 && !z5) {
                        mVar.f72133a = fVar2.f72123a.getInt(k.n(R6.a.a("mTGtVZyTTaieIa0=\n"), R6.a.a("7ELIJ8PgIt0=\n")), 0);
                        mVar.b = true;
                    }
                    if (mVar.f72133a <= 0) {
                        adjustConfig.enableSendingInBackground();
                    }
                }
                adjustConfig.setOnAttributionChangedListener(new Vc.f(lVar));
                String strN2 = k.n(R6.a.a("rtNLn4WlNQ==\n"), R6.a.a("26Au7drMUfU=\n"));
                String string2 = fVar2.f72123a.getString(k.n(R6.a.a("luHtcX7nyg==\n"), R6.a.a("45KIAyGOru0=\n")), null);
                if (string2 == null) {
                    string2 = UUID.randomUUID().toString();
                    fVar2.b(k.n(R6.a.a("iUg3DzYHQA==\n"), R6.a.a("/DtSfWluJIE=\n")), string2);
                }
                Adjust.addGlobalCallbackParameter(strN2, string2);
                Adjust.addGlobalCallbackParameter(k.n(R6.a.a("h3g9o3xLHsCqaTOnag==\n"), R6.a.a("9R1ayg8/e7I=\n")), B0.h());
                Adjust.addGlobalCallbackParameter(k.n(R6.a.a("NFN/VCnTH3k=\n"), R6.a.a("VSMPJ128bRw=\n")), Jc.a.f3929a);
                Adjust.initSdk(adjustConfig);
                Adjust.getGoogleAdId(freereelsApp2, new Q(lVar, 13));
                Adjust.getAdid(new OnAdidReadListener() { // from class: Ve.a
                    @Override // com.adjust.sdk.OnAdidReadListener
                    public final void onAdidRead(String str5) {
                        lVar.getClass();
                    }
                });
                Adjust.getAttribution(new Ve.b());
                lVar.e();
                if (M3.l.b() == null) {
                    boolean z10 = mVar.b;
                    if (!z10 && !z10) {
                        mVar.f72133a = fVar2.f72123a.getInt(k.n(R6.a.a("mTGtVZyTTaieIa0=\n"), R6.a.a("7ELIJ8PgIt0=\n")), 0);
                        mVar.b = true;
                    }
                    if (mVar.f72133a <= 0) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Ec.a(i5), 500L);
                    }
                }
                int i12 = fVar.f72123a.getInt(k.n(R6.a.a("HGZFJ+z3DqIHbVA2/+kHjyprWCc=\n"), R6.a.a("dQg2U42bYv0=\n")), 0);
                if (i12 < 10) {
                    fVar.a(i12 + 1, k.n(R6.a.a("f0zeMQJOaodkR8sgEVBjqklBwzE=\n"), R6.a.a("FiKtRWMiBtg=\n")));
                    z zVar = new z(23);
                    try {
                        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(p.d).build();
                        installReferrerClientBuild.startConnection(new L3.d(18, installReferrerClientBuild, zVar));
                    } catch (Throwable unused4) {
                    }
                }
                zg.e eVar = zg.e.f72121c;
                if (eVar.b) {
                    dVar = null;
                } else {
                    dVar = null;
                    String string3 = f.b.f72123a.getString(k.n(R6.a.a("Nz7YuGCb8GgsL/e9YYDB\n"), R6.a.a("RVuo1xLvrwo=\n")), null);
                    if (string3 != null) {
                        try {
                            eVar.f72122a = Q3.a.c(string3);
                        } catch (Throwable unused5) {
                        }
                    }
                    eVar.b = true;
                }
                Activity activity = g.a.f42963a;
                registerActivityLifecycleCallbacks(new Dc.a(i5));
                final c.b bVar2 = c.b.f11643c;
                Ic.f fVar3 = bVar2.f11644a;
                j.c cVar = yg.b.b.f71944a;
                d dVar3 = cVar != null ? cVar.f : dVar;
                if (dVar3 != null && !TextUtils.isEmpty(dVar3.f53207a) && !TextUtils.isEmpty(dVar3.b)) {
                    Jc.d.f3934a = dVar3.f53207a;
                    Jc.d.b = dVar3.b;
                    Jc.d.f3935c = dVar3.f53208c;
                    Jc.d.d = dVar3.e;
                }
                TUSDK.init(p.d, Jc.d.f3934a, Jc.d.b);
                if (g.a.b > 0) {
                    fVar3.d();
                    fVar3.c();
                }
                bVar2.b.c();
                g.a.f42964c.add(new Consumer() { // from class: c.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i13 = i11;
                        Object obj2 = bVar2;
                        switch (i13) {
                            case 0:
                                b bVar3 = (b) obj2;
                                bVar3.getClass();
                                j.c cVar2 = yg.b.b.f71944a;
                                Ic.f fVar4 = bVar3.f11644a;
                                if (cVar2 == null || cVar2.f53204j > 0) {
                                    bVar3.b.a();
                                    fVar4.a();
                                } else {
                                    bVar3.a().a();
                                }
                                TUSplashAd tUSplashAd = fVar4.e;
                                if (tUSplashAd == null || !tUSplashAd.isAdReady()) {
                                    fVar4.c();
                                }
                                break;
                            default:
                                zg.c cVar3 = (zg.c) obj2;
                                cVar3.getClass();
                                try {
                                    cVar3.e(M9.e.d());
                                } catch (Exception unused6) {
                                    return;
                                }
                                break;
                        }
                    }
                });
                final zg.c cVar2 = zg.c.e;
                cVar2.getClass();
                FreereelsApp freereelsApp3 = p.d;
                try {
                    synchronized (X8.f.f8231k) {
                        arrayList = new ArrayList(X8.f.f8232l.values());
                    }
                    if (arrayList.isEmpty()) {
                        X8.f.f(freereelsApp3);
                    }
                } catch (Throwable th) {
                    Log.e(p.d.getPackageName(), k.n(R6.a.a("hQDtzs7SF8yCGe+Fxd0N3aoI88LW1iXZs0n62d7cFg==\n"), R6.a.a("w2mfq6yzZKk=\n")), th);
                }
                try {
                    M9.e eVarD = M9.e.d();
                    P4.g gVar = new P4.g(i10);
                    int[] iArr = N9.g.f4903k;
                    gVar.f6001c = 604800L;
                    P4.g gVar2 = new P4.g(gVar);
                    eVarD.getClass();
                    Tasks.call(eVarD.f4737c, new M9.b(i11, eVarD, gVar2));
                    cVar2.e(eVarD);
                    if ((p.d.getApplicationInfo().flags & 2) != 0) {
                        h hVar = new h(cVar2, eVarD);
                        r rVar = eVarD.f4740i;
                        synchronized (rVar) {
                            ((LinkedHashSet) rVar.f23354c).add(hVar);
                            rVar.A();
                        }
                    }
                } catch (Throwable th2) {
                    Log.e(p.d.getPackageName(), k.n(R6.a.a("w2RuUB49PFXIbHJUGzk9HuxjdUEuOSJf8WhfWhI6JlelaG5HEy4=\n"), R6.a.a("hQ0cNXxcTzA=\n")), th2);
                }
                try {
                    FirebaseAnalytics.getInstance(freereelsApp3).a().addOnCompleteListener(new m4.c(cVar2, 21));
                } catch (Throwable th3) {
                    Log.e(p.d.getPackageName(), k.n(R6.a.a("xgEjekrSenPBBjBzUcdgdfNGNnpc+mdl9Ak/fE2TbGTyByM=\n"), R6.a.a("gGhRHyizCRY=\n")), th3);
                }
                M3.l lVar2 = a.a.b.f9429a;
                zg.c.g(M3.l.b());
                Consumer consumer = new Consumer() { // from class: c.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i13 = i10;
                        Object obj2 = cVar2;
                        switch (i13) {
                            case 0:
                                b bVar3 = (b) obj2;
                                bVar3.getClass();
                                j.c cVar3 = yg.b.b.f71944a;
                                Ic.f fVar4 = bVar3.f11644a;
                                if (cVar3 == null || cVar3.f53204j > 0) {
                                    bVar3.b.a();
                                    fVar4.a();
                                } else {
                                    bVar3.a().a();
                                }
                                TUSplashAd tUSplashAd = fVar4.e;
                                if (tUSplashAd == null || !tUSplashAd.isAdReady()) {
                                    fVar4.c();
                                }
                                break;
                            default:
                                zg.c cVar4 = (zg.c) obj2;
                                cVar4.getClass();
                                try {
                                    cVar4.e(M9.e.d());
                                } catch (Exception unused6) {
                                    return;
                                }
                                break;
                        }
                    }
                };
                CopyOnWriteArrayList copyOnWriteArrayList = g.a.f42964c;
                copyOnWriteArrayList.add(consumer);
                p.e = cVar2.f72118a;
                final zg.l lVar3 = zg.l.f;
                if (!lVar3.f72131a) {
                    lVar3.f72131a = true;
                    g.a.d.add(new Consumer() { // from class: zg.j
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Activity activity2 = (Activity) obj;
                            switch (i11) {
                                case 0:
                                    l lVar4 = lVar3;
                                    lVar4.d = true;
                                    WeakReference weakReference = lVar4.b;
                                    if ((weakReference == null ? null : (Activity) weakReference.get()) != null) {
                                        Handler handler = lVar4.f72132c;
                                        handler.removeCallbacksAndMessages(null);
                                        handler.postDelayed(new k(lVar4, lVar4.b, 0), DashMediaSource.DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS);
                                    }
                                    break;
                                default:
                                    l lVar5 = lVar3;
                                    boolean z11 = lVar5.d;
                                    lVar5.d = false;
                                    lVar5.f72132c.removeCallbacksAndMessages(null);
                                    WeakReference weakReference2 = lVar5.b;
                                    Activity activity3 = weakReference2 == null ? null : (Activity) weakReference2.get();
                                    if (activity3 != null && z11 && activity2 != activity3) {
                                        c cVar3 = c.e;
                                        String strN3 = v4.k.n(R6.a.a("Qd3nAIjELHZ/wPYUuNMhR1DM9AeG1SBHUN/yCo7KGnRJ3uM=\n"), R6.a.a("IK2XbOeyRRg=\n"));
                                        String strN4 = v4.k.n(R6.a.a("usGKjOfJnxq22I7M\n"), R6.a.a("2a7nooa573Y=\n"));
                                        cVar3.getClass();
                                        String str5 = (String) c.b(String.class, strN3, strN4);
                                        if (!l4.a.d(str5)) {
                                            String[] strArrSplit = str5.split(v4.k.n(R6.a.a("vt+k\n"), R6.a.a("nfyHKdCbOeU=\n")));
                                            String name = activity3.getClass().getName();
                                            for (String str6 : strArrSplit) {
                                                if (name.startsWith(str6) && !l4.a.d(str6)) {
                                                }
                                            }
                                        }
                                        l.a(activity3);
                                        lVar5.b = null;
                                    }
                                    break;
                            }
                        }
                    });
                    copyOnWriteArrayList.add(new Consumer() { // from class: zg.j
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Activity activity2 = (Activity) obj;
                            switch (i10) {
                                case 0:
                                    l lVar4 = lVar3;
                                    lVar4.d = true;
                                    WeakReference weakReference = lVar4.b;
                                    if ((weakReference == null ? null : (Activity) weakReference.get()) != null) {
                                        Handler handler = lVar4.f72132c;
                                        handler.removeCallbacksAndMessages(null);
                                        handler.postDelayed(new k(lVar4, lVar4.b, 0), DashMediaSource.DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS);
                                    }
                                    break;
                                default:
                                    l lVar5 = lVar3;
                                    boolean z11 = lVar5.d;
                                    lVar5.d = false;
                                    lVar5.f72132c.removeCallbacksAndMessages(null);
                                    WeakReference weakReference2 = lVar5.b;
                                    Activity activity3 = weakReference2 == null ? null : (Activity) weakReference2.get();
                                    if (activity3 != null && z11 && activity2 != activity3) {
                                        c cVar3 = c.e;
                                        String strN3 = v4.k.n(R6.a.a("Qd3nAIjELHZ/wPYUuNMhR1DM9AeG1SBHUN/yCo7KGnRJ3uM=\n"), R6.a.a("IK2XbOeyRRg=\n"));
                                        String strN4 = v4.k.n(R6.a.a("usGKjOfJnxq22I7M\n"), R6.a.a("2a7nooa573Y=\n"));
                                        cVar3.getClass();
                                        String str5 = (String) c.b(String.class, strN3, strN4);
                                        if (!l4.a.d(str5)) {
                                            String[] strArrSplit = str5.split(v4.k.n(R6.a.a("vt+k\n"), R6.a.a("nfyHKdCbOeU=\n")));
                                            String name = activity3.getClass().getName();
                                            for (String str6 : strArrSplit) {
                                                if (name.startsWith(str6) && !l4.a.d(str6)) {
                                                }
                                            }
                                        }
                                        l.a(activity3);
                                        lVar5.b = null;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
            Ec.a aVar2 = new Ec.a(5);
            zg.c cVar3 = zg.c.e;
            cVar3.getClass();
            v4.b.d(new ld.c(25, cVar3, aVar2));
            NotificationChannel notificationChannel = new NotificationChannel(getString(R.string.firebase_message_channel), getString(R.string.firebase_message_channel), 4);
            notificationChannel.setDescription("firebase notification channel");
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            try {
                L3.c cVar4 = FirebaseMessaging.f23311n;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(X8.f.c());
                }
                firebaseMessaging.getClass();
                firebaseMessaging.f23318i.onSuccessTask(new Vc.e("default_topic", i5));
            } catch (Throwable th4) {
                j.h(th4);
            }
            PSSDK.Config.Builder builder = new PSSDK.Config.Builder();
            builder.appId("215000772").vodAppId("1025810").securityKey("1fcd679c27c8a823116168239d0d16a4").licenseAssertPath("vod.lic").debug(false);
            PSSDK.init(this, builder.build(), new com.freetools.freereels.thirdsdk.f());
            PSSDK.setEligibleAudience(true);
            PSSDK.setContentLanguages(p.d(w6.b.b()));
            com.freetools.freereels.data.d.a();
            f6.d.b = R.layout.layout_empty;
            f6.d.f42913a = R.layout.layout_net_error;
            Nb.h.setDefaultRefreshHeaderCreator(new Vc.f(29));
            Nb.h.setDefaultRefreshFooterCreator(new com.freetools.freereels.base.e(i11));
            if (com.freetools.freereels.data.a.WhiteTheme.d()) {
                androidx.appcompat.app.p.m(1);
            } else {
                androidx.appcompat.app.p.m(2);
            }
            int i13 = NotificationJobService.f19547c;
            com.freetools.freereels.data.b bVar3 = com.freetools.freereels.data.b.LastNotificationTime;
            if (com.freetools.freereels.data.b.a(bVar3) <= 0) {
                bVar3.b(System.currentTimeMillis());
            }
            JobInfo jobInfoBuild = new JobInfo.Builder(123, new ComponentName(this, (Class<?>) NotificationJobService.class)).setRequiredNetworkType(1).setPersisted(true).setPeriodic(3600000L).build();
            Object systemService2 = getSystemService("jobscheduler");
            l.f(systemService2, "null cannot be cast to non-null type android.app.job.JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) systemService2;
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            l.g(allPendingJobs, "getAllPendingJobs(...)");
            Iterator<JobInfo> it3 = allPendingJobs.iterator();
            while (it3.hasNext()) {
                if (it3.next().getId() == 123) {
                    NotificationChannel notificationChannel2 = new NotificationChannel(getString(R.string.local_message_channel), getString(R.string.local_message_channel), 4);
                    notificationChannel2.setDescription("Locale message channel");
                    ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel2);
                    p.o().registerActivityLifecycleCallbacks(new Dc.a(i10));
                    com.freetools.freereels.thirdsdk.e eVar2 = com.freetools.freereels.thirdsdk.e.f19564a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Q.b = true;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Q.f32181a = new S7();
                }
            }
            jobScheduler.schedule(jobInfoBuild);
            NotificationChannel notificationChannel3 = new NotificationChannel(getString(R.string.local_message_channel), getString(R.string.local_message_channel), 4);
            notificationChannel3.setDescription("Locale message channel");
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel3);
            p.o().registerActivityLifecycleCallbacks(new Dc.a(i10));
            com.freetools.freereels.thirdsdk.e eVar3 = com.freetools.freereels.thirdsdk.e.f19564a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Q.b = true;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Q.f32181a = new S7();
        }
    }
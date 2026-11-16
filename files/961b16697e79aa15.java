    @Override // ef.a
    public final Object invokeSuspend(Object obj) {
        int i5;
        int iNextInt;
        df.a aVar = df.a.b;
        V3.j.r(obj);
        Context context = this.f19550l;
        m mVarC = com.bumptech.glide.b.c(context);
        mVarC.getClass();
        com.bumptech.glide.j jVarE = new com.bumptech.glide.j(mVarC.b, mVarC, Bitmap.class, mVarC.f15732c).a(m.f15731l).E(this.f19551m);
        jVarE.getClass();
        q5.e eVar = new q5.e();
        jVarE.C(eVar, eVar, jVarE, u5.f.b);
        Bitmap bitmap = (Bitmap) eVar.get();
        if (bitmap != null) {
            f fVar = this.f19552n;
            int i10 = fVar.e == g.b ? R.string.s_play_continue : R.string.s_play;
            y yVar = new y(0);
            Intent intent = new Intent(context, (Class<?>) SplashActivity.class);
            intent.putExtra("extra_from_notification", true);
            intent.putExtra("short_play_data", fVar.f19556c);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            l.g(activity, "getActivity(...)");
            w wVar = new w(context, context.getString(R.string.local_message_channel));
            Notification notification = wVar.f2019E;
            wVar.f2023g = activity;
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout_notification_short_play_small);
            remoteViews.setImageViewBitmap(R.id.iv_cover, com.freetools.freereels.utils.d.d(bitmap));
            String str = fVar.f19555a;
            remoteViews.setTextViewText(R.id.tv_title, str);
            String str2 = fVar.b;
            remoteViews.setTextViewText(R.id.tv_content, str2);
            remoteViews.setTextViewText(R.id.btn_play, context.getString(i10));
            wVar.f2039y = remoteViews;
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.layout_notification_short_play);
            remoteViews2.setImageViewBitmap(R.id.iv_cover, com.freetools.freereels.utils.d.d(bitmap));
            remoteViews2.setTextViewText(R.id.tv_title, str);
            remoteViews2.setTextViewText(R.id.tv_content, str2);
            remoteViews2.setTextViewText(R.id.btn_play, context.getString(i10));
            wVar.f2040z = remoteViews2;
            notification.deleteIntent = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) LocalNotificationReceiver.class), 201326592);
            wVar.f2023g = activity;
            wVar.f2026j = 2;
            wVar.d(yVar);
            notification.icon = R.drawable.ic_logo_push;
            wVar.f2038x = 1;
            wVar.f2025i = 1;
            wVar.c(16, true);
            Notification notificationA = wVar.a();
            l.g(notificationA, "build(...)");
            Object systemService = context.getSystemService("notification");
            l.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            try {
                com.freetools.freereels.data.g gVar = com.freetools.freereels.data.g.d;
                int i11 = NotificationJobService.f19547c;
                i5 = 1;
                try {
                    iNextInt = new Random().nextInt(new JSONObject(gVar.a("        {\n    \"open\": true,\n    \"startHour\": 7,\n    \"endHour\": 21,\n    \"intervalSec\": 43200,\n    \"createAfterClear\": true,\n    \"createAfterClearSec\": 60,\n    \"noticationIdCnt\": 1,\n    \"lastActiveSec\": 86400,\n    \"showInForeground\": false\n}")).optInt("noticationIdCnt", 1)) + 1;
                } catch (Exception unused) {
                    iNextInt = i5;
                }
            } catch (Exception unused2) {
                i5 = 1;
            }
            notificationManager.notify(iNextInt, notificationA);
            com.freetools.freereels.data.b.LastNotificationTime.b(System.currentTimeMillis());
        }
        return C.f8295a;
    }
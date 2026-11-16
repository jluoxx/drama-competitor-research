    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zOptBoolean;
        if (context != null) {
            int iOptInt = 60;
            try {
                com.freetools.freereels.data.g gVar = com.freetools.freereels.data.g.d;
                int i5 = NotificationJobService.f19547c;
                JSONObject jSONObject = new JSONObject(gVar.a("        {\n    \"open\": true,\n    \"startHour\": 7,\n    \"endHour\": 21,\n    \"intervalSec\": 43200,\n    \"createAfterClear\": true,\n    \"createAfterClearSec\": 60,\n    \"noticationIdCnt\": 1,\n    \"lastActiveSec\": 86400,\n    \"showInForeground\": false\n}"));
                zOptBoolean = jSONObject.optBoolean("createAfterClear", true);
                try {
                    iOptInt = jSONObject.optInt("createAfterClearSec", 60);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                zOptBoolean = true;
            }
            boolean z4 = System.currentTimeMillis() - f19546a > ((long) (iOptInt * 1000));
            if (zOptBoolean && z4) {
                d.a(context);
                f19546a = System.currentTimeMillis();
            }
        }
    }
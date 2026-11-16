    public static void b(Context context) {
        int hour;
        try {
            com.freetools.freereels.data.g gVar = com.freetools.freereels.data.g.d;
            int i5 = NotificationJobService.f19547c;
            JSONObject jSONObject = new JSONObject(gVar.a("        {\n    \"open\": true,\n    \"startHour\": 7,\n    \"endHour\": 21,\n    \"intervalSec\": 43200,\n    \"createAfterClear\": true,\n    \"createAfterClearSec\": 60,\n    \"noticationIdCnt\": 1,\n    \"lastActiveSec\": 86400,\n    \"showInForeground\": false\n}"));
            int i10 = jSONObject.has("startHour") ? jSONObject.getInt("startHour") : 7;
            int i11 = jSONObject.has("endHour") ? jSONObject.getInt("endHour") : 21;
            int i12 = jSONObject.has("intervalSec") ? jSONObject.getInt("intervalSec") : 14400;
            com.freetools.freereels.data.b bVar = com.freetools.freereels.data.b.LastNotificationTime;
            long jA = com.freetools.freereels.data.b.a(bVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jA >= i12 * 1000 && (hour = LocalDateTime.now().getHour()) >= i10 && hour < i11) {
                if (jSONObject.has("open") ? jSONObject.getBoolean("open") : true) {
                    a(context);
                }
                bVar.b(jCurrentTimeMillis);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
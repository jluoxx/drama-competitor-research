/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static void a(final Context context) {
        boolean z4;
        final int i5 = 0;
        final int i10 = 1;
        long jA = com.freetools.freereels.data.b.a(com.freetools.freereels.data.b.LastActiveTime);
        long jOptLong = 0;
        try {
            com.freetools.freereels.data.g gVar = com.freetools.freereels.data.g.d;
            int i11 = NotificationJobService.f19547c;
            JSONObject jSONObject = new JSONObject(gVar.a("        {\n    \"open\": true,\n    \"startHour\": 7,\n    \"endHour\": 21,\n    \"intervalSec\": 43200,\n    \"createAfterClear\": true,\n    \"createAfterClearSec\": 60,\n    \"noticationIdCnt\": 1,\n    \"lastActiveSec\": 86400,\n    \"showInForeground\": false\n}"));
            jOptLong = jSONObject.optLong("lastActiveSec", 0L);
            z4 = jSONObject.optBoolean("showInForeground", false) || com.freetools.freereels.utils.b.f19611a <= 0;
        } catch (Exception unused) {
        }
        if (System.currentTimeMillis() - jA <= jOptLong || !z4) {
            return;
        }
        ff.b bVar = g.f;
        int iOrdinal = ((g) bVar.get(new Random().nextInt(bVar.size()))).ordinal();
        if (iOrdinal == 0) {
            L.s(new b(context, null));
        } else if (iOrdinal == 1) {
            u.g(10, new mf.g() { // from class: com.freetools.freereels.notification.a
                @Override // mf.g
                public final Object invoke(Object obj, Object obj2) {
                    int iNextInt;
                    List<T> list;
                    ShortPlay shortPlay;
                    String strOptString;
                    List<T> list2;
                    int iNextInt2;
                    List<T> list3;
                    ShortPlay shortPlay2;
                    String strOptString2;
                    List<T> list4;
                    C c7 = C.f8295a;
                    Context context2 = context;
                    int size = 0;
                    switch (i5) {
                        case 0:
                            PSSDK.FeedListLoadResult feedListLoadResult = (PSSDK.FeedListLoadResult) obj2;
                            if (((Boolean) obj).booleanValue()) {
                                if (feedListLoadResult != null && (list2 = feedListLoadResult.dataList) != 0) {
                                    size = list2.size();
                                }
                                if (size > 0 && (iNextInt = new Random().nextInt(size)) < size && feedListLoadResult != null && (list = feedListLoadResult.dataList) != 0 && (shortPlay = (ShortPlay) list.get(iNextInt)) != null) {
                                    String string = context2.getString(R.string.s_notification_popular);
                                    l.g(string, "getString(...)");
                                    String desc = shortPlay.desc;
                                    l.g(desc, "desc");
                                    String json = new Gson().toJson(shortPlay);
                                    l.g(json, "toJson(...)");
                                    try {
                                        strOptString = new JSONObject(shortPlay.coverImageExtraData).optString("thumb");
                                    } catch (Exception unused2) {
                                        strOptString = null;
                                    }
                                    if (strOptString == null) {
                                        strOptString = shortPlay.coverImage;
                                    }
                                    f fVar = new f(string, desc, json, strOptString == null ? "" : strOptString, g.f19557c);
                                    Ef.e eVar = M.f61501a;
                                    h8.e.B(Ef.d.e, new c(context2, fVar.d, fVar, null));
                                }
                            }
                            break;
                        default:
                            PSSDK.FeedListLoadResult feedListLoadResult2 = (PSSDK.FeedListLoadResult) obj2;
                            if (((Boolean) obj).booleanValue()) {
                                if (feedListLoadResult2 != null && (list4 = feedListLoadResult2.dataList) != 0) {
                                    size = list4.size();
                                }
                                if (size > 0 && (iNextInt2 = new Random().nextInt(size)) < size && feedListLoadResult2 != null && (list3 = feedListLoadResult2.dataList) != 0 && (shortPlay2 = (ShortPlay) list3.get(iNextInt2)) != null) {
                                    String string2 = context2.getString(R.string.s_notification_new);
                                    l.g(string2, "getString(...)");
                                    String desc2 = shortPlay2.desc;
                                    l.g(desc2, "desc");
                                    String json2 = new Gson().toJson(shortPlay2);
                                    l.g(json2, "toJson(...)");
                                    try {
                                        strOptString2 = new JSONObject(shortPlay2.coverImageExtraData).optString("thumb");
                                    } catch (Exception unused3) {
                                        strOptString2 = null;
                                    }
                                    if (strOptString2 == null) {
                                        strOptString2 = shortPlay2.coverImage;
                                    }
                                    f fVar2 = new f(string2, desc2, json2, strOptString2 == null ? "" : strOptString2, g.d);
                                    Ef.e eVar2 = M.f61501a;
                                    h8.e.B(Ef.d.e, new c(context2, fVar2.d, fVar2, null));
                                }
                            }
                            break;
                    }
                    return c7;
                }
            });
        } else {
            if (iOrdinal != 2) {
                throw new M2.c();
            }
            u.f(1, 10, new mf.g() { // from class: com.freetools.freereels.notification.a
                @Override // mf.g
                public final Object invoke(Object obj, Object obj2) {
                    int iNextInt;
                    List<T> list;
                    ShortPlay shortPlay;
                    String strOptString;
                    List<T> list2;
                    int iNextInt2;
                    List<T> list3;
                    ShortPlay shortPlay2;
                    String strOptString2;
                    List<T> list4;
                    C c7 = C.f8295a;
                    Context context2 = context;
                    int size = 0;
                    switch (i10) {
                        case 0:
                            PSSDK.FeedListLoadResult feedListLoadResult = (PSSDK.FeedListLoadResult) obj2;
                            if (((Boolean) obj).booleanValue()) {
                                if (feedListLoadResult != null && (list2 = feedListLoadResult.dataList) != 0) {
                                    size = list2.size();
                                }
                                if (size > 0 && (iNextInt = new Random().nextInt(size)) < size && feedListLoadResult != null && (list = feedListLoadResult.dataList) != 0 && (shortPlay = (ShortPlay) list.get(iNextInt)) != null) {
                                    String string = context2.getString(R.string.s_notification_popular);
                                    l.g(string, "getString(...)");
                                    String desc = shortPlay.desc;
                                    l.g(desc, "desc");
                                    String json = new Gson().toJson(shortPlay);
                                    l.g(json, "toJson(...)");
                                    try {
                                        strOptString = new JSONObject(shortPlay.coverImageExtraData).optString("thumb");
                                    } catch (Exception unused2) {
                                        strOptString = null;
                                    }
                                    if (strOptString == null) {
                                        strOptString = shortPlay.coverImage;
                                    }
                                    f fVar = new f(string, desc, json, strOptString == null ? "" : strOptString, g.f19557c);
                                    Ef.e eVar = M.f61501a;
                                    h8.e.B(Ef.d.e, new c(context2, fVar.d, fVar, null));
                                }
                            }
                            break;
                        default:
                            PSSDK.FeedListLoadResult feedListLoadResult2 = (PSSDK.FeedListLoadResult) obj2;
                            if (((Boolean) obj).booleanValue()) {
                                if (feedListLoadResult2 != null && (list4 = feedListLoadResult2.dataList) != 0) {
                                    size = list4.size();
                                }
                                if (size > 0 && (iNextInt2 = new Random().nextInt(size)) < size && feedListLoadResult2 != null && (list3 = feedListLoadResult2.dataList) != 0 && (shortPlay2 = (ShortPlay) list3.get(iNextInt2)) != null) {
                                    String string2 = context2.getString(R.string.s_notification_new);
                                    l.g(string2, "getString(...)");
                                    String desc2 = shortPlay2.desc;
                                    l.g(desc2, "desc");
                                    String json2 = new Gson().toJson(shortPlay2);
                                    l.g(json2, "toJson(...)");
                                    try {
                                        strOptString2 = new JSONObject(shortPlay2.coverImageExtraData).optString("thumb");
                                    } catch (Exception unused3) {
                                        strOptString2 = null;
                                    }
                                    if (strOptString2 == null) {
                                        strOptString2 = shortPlay2.coverImage;
                                    }
                                    f fVar2 = new f(string2, desc2, json2, strOptString2 == null ? "" : strOptString2, g.d);
                                    Ef.e eVar2 = M.f61501a;
                                    h8.e.B(Ef.d.e, new c(context2, fVar2.d, fVar2, null));
                                }
                            }
                            break;
                    }
                    return c7;
                }
            });
        }
    }
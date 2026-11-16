    public final void e(M9.e eVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f72119c;
        if (j10 == 0 || jElapsedRealtime - j10 > DashMediaSource.DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS) {
            this.f72119c = jElapsedRealtime;
            N9.g gVar = eVar.f;
            N9.l lVar = gVar.f4907h;
            long j11 = lVar.f4928a.getLong("minimum_fetch_interval_in_seconds", N9.g.f4902j);
            HashMap map = new HashMap(gVar.f4908i);
            map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
            gVar.f.b().continueWithTask(gVar.f4905c, new H2(gVar, j11, map, 1)).onSuccessTask(f9.h.b, new M9.d(0)).onSuccessTask(eVar.f4737c, new M9.c(eVar)).addOnCompleteListener(new r(12, this, eVar));
        }
    }
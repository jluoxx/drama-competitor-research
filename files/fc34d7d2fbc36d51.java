    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        Object obj = f.f19467c;
        f fVarL = com.bumptech.glide.c.l();
        String strName = name();
        if (!fVarL.f19468a.contains(strName)) {
            return str;
        }
        boolean zEquals = String.class.equals(Integer.class);
        SharedPreferences sharedPreferences = fVarL.f19468a;
        if (zEquals) {
            return (String) Integer.valueOf(sharedPreferences.getInt(strName, ((Integer) str).intValue()));
        }
        if (String.class.equals(Float.class)) {
            return (String) com.thinkup.core.basead.d.a.h((Float) str, sharedPreferences, strName);
        }
        if (String.class.equals(Long.class)) {
            return (String) Long.valueOf(sharedPreferences.getLong(strName, ((Long) str).longValue()));
        }
        if (!String.class.equals(String.class)) {
            return String.class.equals(Boolean.class) ? (String) com.thinkup.core.basead.d.a.g((Boolean) str, sharedPreferences, strName) : str;
        }
        String string = sharedPreferences.getString(strName, str);
        if (string != null) {
            return string;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
    private Bundle dd(Context context, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat, boolean z) {
        AdSize adSizeD0;
        Context context2;
        Context context3;
        Bundle bundle = new Bundle();
        try {
            if (map.containsKey("gdpr_consent")) {
                if (((Boolean) map.get("gdpr_consent")).booleanValue()) {
                    bundle.putString("npa", "0");
                } else {
                    bundle.putString("npa", "1");
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.dd) {
                bundle.putString("rdp", "1");
                if (this.mq != 1 && (context3 = this.dq) != null) {
                    PreferenceManager.getDefaultSharedPreferences(context3).edit().putInt("gad_rdp", 1).apply();
                    this.mq = 1;
                }
            } else if (this.mq == 1 && (context2 = this.dq) != null) {
                PreferenceManager.getDefaultSharedPreferences(context2).edit().remove("gad_rdp").apply();
                this.mq = 0;
            }
        } catch (Throwable unused2) {
        }
        if (z) {
            bundle.putString("query_info_type", "requester_type_2");
            if (adFormat == AdFormat.BANNER && (adSizeD0 = AdmobTUConst.d0(context, map2, map)) != null) {
                bundle.putInt("adaptive_banner_w", adSizeD0.getWidth());
                bundle.putInt("adaptive_banner_h", adSizeD0.getHeight());
            }
        }
        int intFromMap = TUInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
        if (adFormat == AdFormat.BANNER) {
            if (intFromMap == 2) {
                bundle.putString("collapsible", "bottom");
            } else if (intFromMap == 3) {
                bundle.putString("collapsible", "top");
            }
        }
        if (map.containsKey("admob_hybrid_status")) {
            bundle.putBoolean("is_hybrid_setup", TUInitMediation.getBooleanFromMap(map, "admob_hybrid_status", false));
        }
        String stringFromMap = TUInitMediation.getStringFromMap(map, "mediation_request_id", "");
        if (!TextUtils.isEmpty(stringFromMap)) {
            bundle.putString("placement_req_id", stringFromMap);
        }
        return bundle;
    }
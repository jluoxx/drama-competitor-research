    @Override // com.thinkup.core.common.dm.dm0
    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.thinkup.core.common.d0.d0.d.m, this.n);
            jSONObject.put("requestid", this.o);
            jSONObject.put("unitid", this.q);
            jSONObject.put(com.thinkup.core.common.o.d0.n, this.d0);
            jSONObject.put("sessionid", this.dd);
            jSONObject.put("groupid", this.dm);
            jSONObject.put("unitgroupid", this.dn);
            jSONObject.put("timestamp", this.f185do);
            jSONObject.put(com.thinkup.core.common.md.d0.nmm, this.f185do);
            jSONObject.put("asid", this.dq);
            jSONObject.put(ToolBar.REFRESH, this.m0);
            int i = this.md;
            if (i != -1) {
                jSONObject.put("refresh_v2", i);
            }
            int i2 = this.mm;
            if (i2 != -1) {
                jSONObject.put("load_mode", i2);
            }
            int i3 = this.dmq;
            if (i3 != -1) {
                jSONObject.put(com.thinkup.core.common.md.d0.n0o, i3);
            }
            jSONObject.put("traffic_group_id", this.mn);
            jSONObject.put("msg", this.mo);
            jSONObject.put("msg1", this.mq);
            jSONObject.put("msg2", this.n0);
            jSONObject.put("msg3", this.nd);
            jSONObject.put("msg4", this.nm);
            jSONObject.put("msg5", this.nn);
            jSONObject.put("msg6", this.no);
            jSONObject.put("msg7", this.nq);
            jSONObject.put("msg8", this.o0);
            jSONObject.put("msg9", this.od);
            jSONObject.put("msg10", this.om);
            jSONObject.put("msg11", this.on);
            jSONObject.put("msg12", this.oo);
            jSONObject.put("msg13", this.oq);
            jSONObject.put("msg14", this.q0);
            jSONObject.put("msg15", this.qd);
            jSONObject.put("msg16", this.qm);
            jSONObject.put("msg17", this.qn);
            jSONObject.put("msg18", this.qo);
            jSONObject.put("msg19", this.qq);
            jSONObject.put("msg20", this.d00);
            jSONObject.put("msg21", this.d0d);
            jSONObject.put("msg22", this.d0m);
            jSONObject.put("msg23", this.d0n);
            jSONObject.put("msg24", this.d0o);
            jSONObject.put("msg25", this.d0q);
            jSONObject.put("msg26", this.dd0);
            jSONObject.put("msg27", this.ddd);
            jSONObject.put("msg28", this.ddm);
            jSONObject.put(com.thinkup.core.q.md.d.ddo, this.ddq);
            jSONObject.put(com.thinkup.core.common.md.d0.dom, this.dm0);
            JSONObject jSONObject2 = this.dmd;
            if (jSONObject2 != null) {
                jSONObject.put(com.thinkup.core.q.md.d.dmq, jSONObject2);
            }
            jSONObject.put("real_p", this.dmm);
            int i4 = this.dmn;
            if (i4 != -1) {
                jSONObject.put("real_g", i4);
            }
            int i5 = this.dmo;
            if (i5 != -1) {
                jSONObject.put("real_t", i5);
            }
            JSONObject jSONObject3 = this.dn0;
            if (jSONObject3 != null) {
                jSONObject.put("adap_c", jSONObject3);
            }
            if (!TextUtils.isEmpty(this.dnd)) {
                jSONObject.put("x_c", new JSONArray(this.dnd));
            }
            if (!TextUtils.isEmpty(this.dnm)) {
                jSONObject.put("o_r", this.dnm);
            }
            jSONObject.put(com.thinkup.core.common.md.d0.no0, this.dnn);
            TUAdRequest tUAdRequest = this.dnq;
            MgPreLoadAdRequest preLoadInfo = (tUAdRequest == null || tUAdRequest.getPreLoadInfo() == null) ? null : this.dnq.getPreLoadInfo();
            if (preLoadInfo != null) {
                String placementId = preLoadInfo.getPlacementId();
                String psId = preLoadInfo.getPsId();
                String requestId = preLoadInfo.getRequestId();
                if (!TextUtils.isEmpty(placementId)) {
                    jSONObject.put("mmed_pl_id", placementId);
                }
                if (!TextUtils.isEmpty(psId)) {
                    jSONObject.put("mmed_psid", psId);
                }
                if (!TextUtils.isEmpty(requestId)) {
                    jSONObject.put("mmed_req_id", requestId);
                }
                jSONObject.put("mmed_wait_price_sw", preLoadInfo.getCpEcpmSwitch());
                jSONObject.put("mmed_wait_price_t", preLoadInfo.getCpEcpmTimeout());
                MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo.getPreLoadCallbackRegister();
                MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
                double uSDEcpm = mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d) {
                    jSONObject.put("mmed_price", String.valueOf(uSDEcpm));
                }
            }
            int i6 = this.dno;
            if (i6 > 0) {
                jSONObject.put("smp_rate", i6);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
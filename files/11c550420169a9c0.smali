0000: new-instance v0, Ljava/lang/StringBuilder;
0002: const-string v1, "https://"
0004: invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
0007: invoke-static {}, Lcom/thinkup/core/api/TUSDK;->isCnSDK()Z
000a: move-result v1
000b: if-eqz v1, :0010
000d: const-string v1, "api.robin-flow.com"
000f: goto :0017
0010: invoke-static {}, Lcom/thinkup/core/common/dd/n;->d()Lcom/thinkup/core/common/dd/n;
0013: invoke-static {}, Lcom/thinkup/core/common/dd/n;->q()Ljava/lang/String;
0016: move-result-object v1
0017: const-string v2, "/v2/open/eu"
0019: invoke-static {v1, v2, v0}, Lcom/thinkup/core/basead/d/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
001c: move-result-object v0
001d: sput-object v0, Lcom/thinkup/core/common/dd/d;->mm:Ljava/lang/String;
001f: const-string v0, "https://adx.robin-flow.com/bid"
0021: sput-object v0, Lcom/thinkup/core/common/dd/d;->mn:Ljava/lang/String;
0023: const-string v0, "https://adx.robin-flow.com/request"
0025: sput-object v0, Lcom/thinkup/core/common/dd/d;->mo:Ljava/lang/String;
0027: const-string v0, "https://adxtk.robin-flow.com/v1"
0029: sput-object v0, Lcom/thinkup/core/common/dd/d;->mq:Ljava/lang/String;
002b: const-string v0, "https://adx.robin-flow.com/openapi/req"
002d: sput-object v0, Lcom/thinkup/core/common/dd/d;->n0:Ljava/lang/String;
002f: const-string v0, "https://tk.robin-flow.com/ss/rrd"
0031: sput-object v0, Lcom/thinkup/core/common/dd/d;->nm:Ljava/lang/String;
0033: const-string v0, "https://api.robin-flow.com/v2/open/area"
0035: sput-object v0, Lcom/thinkup/core/common/dd/d;->nn:Ljava/lang/String;
0037: const-string v0, "https://api.robin-flow.com/v2/open/m_adapter"
0039: sput-object v0, Lcom/thinkup/core/common/dd/d;->no:Ljava/lang/String;
003b: const-string v0, "https://api.robin-flow.com/v2/open/dna"
003d: sput-object v0, Lcom/thinkup/core/common/dd/d;->nq:Ljava/lang/String;
003f: return-void
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
0017: invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
001a: const-string v1, "/v2/open/eu"
001c: invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
001f: invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
0022: move-result-object v0
0023: sput-object v0, Lcom/thinkup/core/common/dd/d;->mm:Ljava/lang/String;
0025: const-string v0, "https://adx.robin-flow.com/bid"
0027: sput-object v0, Lcom/thinkup/core/common/dd/d;->mn:Ljava/lang/String;
0029: const-string v0, "https://adx.robin-flow.com/request"
002b: sput-object v0, Lcom/thinkup/core/common/dd/d;->mo:Ljava/lang/String;
002d: const-string v0, "https://adxtk.robin-flow.com/v1"
002f: sput-object v0, Lcom/thinkup/core/common/dd/d;->mq:Ljava/lang/String;
0031: const-string v0, "https://adx.robin-flow.com/openapi/req"
0033: sput-object v0, Lcom/thinkup/core/common/dd/d;->n0:Ljava/lang/String;
0035: const-string v0, "https://tk.robin-flow.com/ss/rrd"
0037: sput-object v0, Lcom/thinkup/core/common/dd/d;->nm:Ljava/lang/String;
0039: const-string v0, "https://api.robin-flow.com/v2/open/area"
003b: sput-object v0, Lcom/thinkup/core/common/dd/d;->nn:Ljava/lang/String;
003d: const-string v0, "https://api.robin-flow.com/v2/open/m_adapter"
003f: sput-object v0, Lcom/thinkup/core/common/dd/d;->no:Ljava/lang/String;
0041: const-string v0, "https://api.robin-flow.com/v2/open/dna"
0043: sput-object v0, Lcom/thinkup/core/common/dd/d;->nq:Ljava/lang/String;
0045: return-void
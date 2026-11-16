0000: invoke-static {}, Lcom/thinkup/core/common/nn/d/d;->d()Lcom/thinkup/core/common/nn/d/d;
0003: move-result-object v0
0004: invoke-virtual {v0}, Lcom/thinkup/core/common/nn/d/d;->n()Z
0007: move-result v0
0008: if-eqz v0, :000b
000a: return-void
000b: new-instance v0, Lcom/thinkup/core/common/nn/d/m/d/d/d;
000d: invoke-direct {v0}, Lcom/thinkup/core/common/nn/d/m/d/d/d;-><init>()V
0010: invoke-virtual {v2}, Lcom/thinkup/core/common/dm/nd;->d()Lorg/json/JSONObject;
0013: move-result-object v2
0014: invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
0017: move-result-object v2
0018: iput-object v2, v0, Lcom/thinkup/core/common/nn/d/m/d/d/m;->q:Ljava/lang/String;
001a: invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
001d: move-result v2
001e: if-eqz v2, :0021
0020: return-void
0021: iget-object v2, v1, Lcom/thinkup/core/common/nn/d/m/d/m;->m:Landroid/content/Context;
0023: invoke-static {v2}, Lcom/thinkup/core/common/d0/n0;->d(Landroid/content/Context;)Lcom/thinkup/core/common/d0/n0;
0026: move-result-object v2
0027: invoke-static {v2}, Lcom/thinkup/core/common/nn/d/d/d;->d(Lcom/thinkup/core/common/d0/o;)Lcom/thinkup/core/common/nn/d/d/d;
002a: move-result-object v2
002b: invoke-virtual {v2, v0}, Lcom/thinkup/core/common/nn/d/d/d;->d(Lcom/thinkup/core/common/nn/d/m/d/d/d;)J
002e: return-void
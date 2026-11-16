0000: invoke-static {}, Lcom/thinkup/core/common/nn/d/d;->d()Lcom/thinkup/core/common/nn/d/d;
0003: move-result-object v0
0004: invoke-virtual {v0}, Lcom/thinkup/core/common/nn/d/d;->n()Z
0007: move-result v0
0008: if-eqz v0, :000b
000a: goto :002e
000b: invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
000e: move-result-wide v0
000f: invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
0012: move-result-object v0
0013: iput-object v0, v3, Lcom/thinkup/core/common/dm/nd;->do:Ljava/lang/String;
0015: invoke-static {}, Lcom/thinkup/core/q/o;->d()Lcom/thinkup/core/q/m;
0018: move-result-object v0
0019: invoke-static {v0, v3}, Lcom/thinkup/core/common/nn/n/d;->d(Lcom/thinkup/core/q/m;Lcom/thinkup/core/common/dm/nd;)Z
001c: move-result v0
001d: if-nez v0, :002e
001f: invoke-direct {v2, v3}, Lcom/thinkup/core/common/nn/d/m/d/d;->m(Lcom/thinkup/core/common/dm/nd;)V
0022: invoke-static {v3}, Lcom/thinkup/core/common/nn/d/m/d/d;->n(Lcom/thinkup/core/common/dm/nd;)Z
0025: move-result v3
0026: if-eqz v3, :002e
0028: const/4 v3, 1
0029: iput-boolean v3, v2, Lcom/thinkup/core/common/nn/d/m/d/d;->n:Z
002b: invoke-virtual {v2}, Lcom/thinkup/core/common/nn/d/m/d/d;->d()V
002e: return-void
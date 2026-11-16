0000: invoke-static {}, Lcom/thinkup/core/common/nn/d/d;->d()Lcom/thinkup/core/common/nn/d/d;
0003: move-result-object v0
0004: invoke-virtual {v0}, Lcom/thinkup/core/common/nn/d/d;->n()Z
0007: move-result v0
0008: if-eqz v0, :000b
000a: return-void
000b: new-instance v0, Lcom/thinkup/core/common/nn/d/m/d/m/m;
000d: invoke-direct {v0}, Lcom/thinkup/core/common/nn/d/m/d/m/m;-><init>()V
0010: iget-boolean v1, v2, Lcom/thinkup/core/common/nn/d/m/d/d;->n:Z
0012: invoke-virtual {v0, v1}, Lcom/thinkup/core/common/nn/d/m/d/m/m;->d(Z)V
0015: return-void
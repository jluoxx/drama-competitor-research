0000: invoke-static {}, Lcom/thinkup/core/common/o/nd;->m()Lcom/thinkup/core/common/o/nd;
0003: move-result-object v0
0004: invoke-virtual {v0}, Lcom/thinkup/core/common/o/nd;->d()Z
0007: move-result v0
0008: if-nez v0, :000c
000a: goto/16 :0099
000c: iget-object v0, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->n:Landroid/content/Context;
000e: invoke-static {v0}, Lcom/thinkup/core/common/d0/n0;->d(Landroid/content/Context;)Lcom/thinkup/core/common/d0/n0;
0011: move-result-object v0
0012: invoke-static {v0}, Lcom/thinkup/core/common/nn/d/d/d;->d(Lcom/thinkup/core/common/d0/o;)Lcom/thinkup/core/common/nn/d/d/d;
0015: move-result-object v0
0016: invoke-static {}, Lcom/thinkup/core/common/nn/d/d;->d()Lcom/thinkup/core/common/nn/d/d;
0019: invoke-static {}, Lcom/thinkup/core/common/nn/d/d;->dd()Lcom/thinkup/core/common/nn/d/d$d;
001c: move-result-object v1
001d: invoke-virtual {v1}, Lcom/thinkup/core/common/nn/d/d$d;->m()J
0020: move-result-wide v1
0021: invoke-virtual {v0, v1, v2, v5}, Lcom/thinkup/core/common/nn/d/d/d;->d(JZ)Ljava/util/List;
0024: move-result-object v5
0025: iput-object v5, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->d:Ljava/util/List;
0027: if-eqz v5, :0099
0029: invoke-interface {v5}, Ljava/util/List;->isEmpty()Z
002c: move-result v5
002d: if-eqz v5, :0030
002f: goto :0099
0030: new-instance v5, Ljava/util/ArrayList;
0032: invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
0035: iget-object v0, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->d:Ljava/util/List;
0037: invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
003a: move-result-object v0
003b: invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
003e: move-result v1
003f: if-eqz v1, :004d
0041: invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
0044: move-result-object v1
0045: check-cast v1, Lcom/thinkup/core/common/nn/d/m/d/d/d;
0047: iget-object v1, v1, Lcom/thinkup/core/common/nn/d/m/d/d/m;->q:Ljava/lang/String;
0049: invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
004c: goto :003b
004d: iget-object v0, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->n:Landroid/content/Context;
004f: invoke-static {v0}, Lcom/thinkup/core/q/o;->d(Landroid/content/Context;)Lcom/thinkup/core/q/o;
0052: move-result-object v0
0053: invoke-static {v0}, Lcom/thinkup/core/basead/d/a;->e(Lcom/thinkup/core/q/o;)Lcom/thinkup/core/q/m;
0056: move-result-object v0
0057: const/4 v1, 0
0058: if-eqz v0, :008a
005a: invoke-virtual {v0}, Lcom/thinkup/core/q/m;->od()I
005d: move-result v2
005e: const/4 v3, 1
005f: if-eq v2, v3, :0075
0061: new-instance v2, Lcom/thinkup/core/common/md/q;
0063: iget-object v3, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->n:Landroid/content/Context;
0065: invoke-virtual {v0}, Lcom/thinkup/core/q/m;->od()I
0068: move-result v0
0069: invoke-direct {v2, v3, v0, v5}, Lcom/thinkup/core/common/md/q;-><init>(Landroid/content/Context;ILjava/util/List;)V
006c: invoke-virtual {v2}, Lcom/thinkup/core/common/md/q;->nm()V
006f: iget-object v5, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->q:Lcom/thinkup/core/common/md/nd;
0071: invoke-virtual {v2, v1, v5}, Lcom/thinkup/core/common/md/q;->d(ILcom/thinkup/core/common/md/nd;)V
0074: return-void
0075: new-instance v1, Lcom/thinkup/core/common/md/o/m;
0077: invoke-direct {v1, v5}, Lcom/thinkup/core/common/md/o/m;-><init>(Ljava/util/List;)V
007a: invoke-virtual {v0}, Lcom/thinkup/core/q/m;->o0()Ljava/lang/String;
007d: move-result-object v5
007e: invoke-virtual {v1, v3, v5}, Lcom/thinkup/core/common/md/o/d0;->d(ILjava/lang/String;)V
0081: invoke-virtual {v1}, Lcom/thinkup/core/common/md/o/m;->dd()V
0084: iget-object v5, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->o:Lcom/thinkup/core/common/md/o/d0$d;
0086: invoke-virtual {v1, v5}, Lcom/thinkup/core/common/md/o/d0;->d(Lcom/thinkup/core/common/md/o/d0$d;)V
0089: return-void
008a: new-instance v0, Lcom/thinkup/core/common/md/q;
008c: iget-object v2, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->n:Landroid/content/Context;
008e: invoke-direct {v0, v2, v1, v5}, Lcom/thinkup/core/common/md/q;-><init>(Landroid/content/Context;ILjava/util/List;)V
0091: invoke-virtual {v0}, Lcom/thinkup/core/common/md/q;->nm()V
0094: iget-object v5, v4, Lcom/thinkup/core/common/nn/d/m/d/m/m;->q:Lcom/thinkup/core/common/md/nd;
0096: invoke-virtual {v0, v1, v5}, Lcom/thinkup/core/common/md/q;->d(ILcom/thinkup/core/common/md/nd;)V
0099: return-void
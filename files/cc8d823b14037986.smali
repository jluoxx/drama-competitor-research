0000: invoke-static {}, Lcom/thinkup/core/common/o/nd;->m()Lcom/thinkup/core/common/o/nd;
0003: move-result-object v0
0004: invoke-virtual {v0}, Lcom/thinkup/core/common/o/nd;->om()Z
0007: move-result v0
0008: const/4 v1, 1
0009: if-eqz v0, :000c
000b: return v1
000c: invoke-virtual {v4}, Lcom/thinkup/core/q/m;->dq0()Ljava/util/Map;
000f: move-result-object v4
0010: const/4 v0, 0
0011: if-eqz v4, :0033
0013: iget-object v2, v5, Lcom/thinkup/core/common/dm/nd;->n:Ljava/lang/String;
0015: invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
0018: move-result-object v4
0019: check-cast v4, Ljava/util/Map;
001b: if-eqz v4, :0033
001d: iget-object v2, v5, Lcom/thinkup/core/common/dm/nd;->ddn:Ljava/lang/String;
001f: invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
0022: move-result v3
0023: if-eqz v3, :002a
0025: invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
0028: move-result-object v4
0029: goto :0034
002a: invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
002d: move-result-object v4
002e: check-cast v4, Ljava/lang/Integer;
0030: if-eqz v4, :0033
0032: goto :0034
0033: const/4 v4, 0
0034: if-eqz v4, :0044
0036: invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
0039: move-result v2
003a: if-lez v2, :0043
003c: invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
003f: move-result v4
0040: iput v4, v5, Lcom/thinkup/core/common/dm/nd;->dno:I
0042: goto :0044
0043: return v1
0044: return v0
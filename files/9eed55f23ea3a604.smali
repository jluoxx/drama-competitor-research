0000: invoke-static {}, Lcom/thinkup/core/common/o/nd;->m()Lcom/thinkup/core/common/o/nd;
0003: move-result-object v0
0004: invoke-virtual {v0}, Lcom/thinkup/core/common/o/nd;->dd()Landroid/content/Context;
0007: move-result-object v0
0008: invoke-static {v0}, Lcom/thinkup/core/q/o;->d(Landroid/content/Context;)Lcom/thinkup/core/q/o;
000b: move-result-object v0
000c: invoke-static {}, Lcom/thinkup/core/common/o/nd;->m()Lcom/thinkup/core/common/o/nd;
000f: move-result-object v1
0010: invoke-virtual {v1}, Lcom/thinkup/core/common/o/nd;->mo()Ljava/lang/String;
0013: move-result-object v1
0014: invoke-virtual {v0, v1}, Lcom/thinkup/core/q/o;->m(Ljava/lang/String;)Lcom/thinkup/core/q/m;
0017: move-result-object v0
0018: invoke-static {}, Lcom/thinkup/core/common/dn;->dm()Z
001b: move-result v1
001c: if-eqz v1, :0021
001e: sget-object v1, Lcom/thinkup/core/common/o/dn$q;->qn:Ljava/lang/String;
0020: goto :0023
0021: sget-object v1, Lcom/thinkup/core/common/o/dn$q;->dq:Ljava/lang/String;
0023: invoke-static {}, Lcom/thinkup/core/common/dd/n;->d()Lcom/thinkup/core/common/dd/n;
0026: move-result-object v2
0027: const-string v3, "agent"
0029: invoke-virtual {v2, v1, v3}, Lcom/thinkup/core/common/dd/n;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
002c: move-result-object v1
002d: if-eqz v0, :0037
002f: invoke-virtual {v0}, Lcom/thinkup/core/q/m;->do0()Ljava/lang/String;
0032: move-result-object v0
0033: invoke-static {v0, v1}, Lcom/thinkup/core/common/dn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
0036: move-result-object v1
0037: return-object v1
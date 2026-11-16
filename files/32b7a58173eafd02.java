.method public final a()LIc/h;
    .registers 20

    move-object/from16 v0, p0

    sget-object v2, Lyg/b;->b:Lyg/b;

    iget-object v2, v2, Lyg/b;->a:Lj/c;

    if-eqz v2, :cond_b

    iget v2, v2, Lj/c;->l:I

    goto :goto_c

    :cond_b
    const/4 v2, 0x0

    :goto_c
    iget-object v4, v0, Lc/b;->b:LIc/g;

    iget-object v5, v0, Lc/b;->a:LIc/f;

    const/4 v6, 0x0

    const/4 v7, -0x1

    if-lez v2, :cond_f0

    if-gtz v2, :cond_18

    goto/16 :goto_f0

    :cond_18
    invoke-virtual {v5}, LIc/f;->a()Z

    move-result v8

    invoke-virtual {v4}, LIc/g;->a()Z

    move-result v9

    if-eqz v8, :cond_f0

    if-nez v9, :cond_26

    goto/16 :goto_f0

    :cond_26
    sget-object v8, Lv4/c;->a:Lcom/applovin/mediation/MaxAd;

    if-eqz v8, :cond_35

    invoke-interface {v8}, Lcom/applovin/mediation/MaxAd;->getRevenue()D

    move-result-wide v8

    const-wide v10, 0x408f400000000000L    # 1000.0

    mul-double/2addr v8, v10

    goto :goto_37

    :cond_35
    const-wide/16 v8, 0x0

    :goto_37
    const-wide v10, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v10, v8, v10

    if-gez v10, :cond_42

    goto/16 :goto_f0

    :cond_42
    :try_start_42
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Lcom/thinkup/core/api/TUCustomContentInfo;

    sget-object v12, LJc/d;->c:Ljava/lang/String;

    const-string v13, "D6NLpCIgz5QQ\n"

    const-string v14, "e8w7y0x/vPA=\n"

    invoke-static {v13}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v13

    invoke-static {v14}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v14

    invoke-static {v13, v14}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Lcom/thinkup/core/api/TUCustomContentInfo;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v12, Lcom/thinkup/core/api/TUCustomContentInfo;

    const-string v13, "a2PNXbnObipVftxJictjLw==\n"

    const-string v14, "ChO9Mda4B0Q=\n"

    invoke-static {v13}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v13

    invoke-static {v14}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v14

    invoke-static {v13, v14}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v8, v9, v13}, Lcom/thinkup/core/api/TUCustomContentInfo;-><init>(DLjava/lang/Object;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lcom/thinkup/core/api/TUSDKGlobalSetting;->customContentReviewResult(Ljava/util/List;)Lcom/thinkup/core/api/TUCustomContentInfo;

    move-result-object v8

    if-nez v8, :cond_80

    goto :goto_d2

    :cond_80
    invoke-virtual {v8}, Lcom/thinkup/core/api/TUCustomContentInfo;->getCustomContentObject()Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Nkd1T34QlSAIWmRbThWYJQ==\n"

    const-string v10, "VzcFIxFm/E4=\n"

    invoke-static {v9}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v9

    invoke-static {v10}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v10

    invoke-static {v9, v10}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_ab

    const-string v8, "5fnSDZ8lgd7b5MMZryCM2w==\n"

    const-string v9, "hImiYfBT6LA=\n"

    invoke-static {v8}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v8

    invoke-static {v9}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v9

    invoke-static {v8, v9}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v8

    goto :goto_d3

    :cond_ab
    const-string v9, "O3zMqSqHivEk\n"

    const-string v10, "TxO8xkTY+ZU=\n"

    invoke-static {v9}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v9

    invoke-static {v10}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v10

    invoke-static {v9, v10}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d2

    const-string v8, "e5Uv1MgQCsRk\n"

    const-string v9, "D/pfu6ZPeaA=\n"

    invoke-static {v8}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v8

    invoke-static {v9}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v9

    invoke-static {v8, v9}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v8
    :try_end_d1
    .catchall {:try_start_42 .. :try_end_d1} :catchall_d2

    goto :goto_d3

    :catchall_d2
    :cond_d2
    :goto_d2
    move-object v8, v6

    :goto_d3
    if-nez v8, :cond_d6

    goto :goto_f0

    :cond_d6
    invoke-static {}, Lg/b;->a()LQ3/e;

    move-result-object v9

    invoke-virtual {v9, v8}, LQ3/e;->n(Ljava/lang/String;)LQ3/e;

    move-result-object v9

    if-eqz v9, :cond_e7

    sget-object v10, Lg/b;->b:Ljava/lang/String;

    invoke-virtual {v9, v10}, LQ3/e;->l(Ljava/lang/String;)I

    move-result v9

    goto :goto_e8

    :cond_e7
    const/4 v9, 0x0

    :goto_e8
    if-lt v9, v2, :cond_eb

    goto :goto_f0

    :cond_eb
    invoke-static {v8}, Lrg/a;->a(Ljava/lang/String;)I

    move-result v2

    goto :goto_f1

    :cond_f0
    :goto_f0
    move v2, v7

    :goto_f1
    if-gez v2, :cond_1b7

    sget-object v8, Lyg/b;->b:Lyg/b;

    iget-object v8, v8, Lyg/b;->a:Lj/c;

    if-eqz v8, :cond_fc

    iget v8, v8, Lj/c;->k:I

    goto :goto_fd

    :cond_fc
    const/4 v8, 0x3

    :goto_fd
    if-lez v8, :cond_1b7

    sget-object v2, Lrg/a;->c:Ljava/util/List;

    sget-object v9, Lg/b;->a:Ljava/lang/String;

    if-eqz v2, :cond_10b

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_113

    :cond_10b
    :goto_10b
    move-object/from16 v18, v4

    const/16 v16, 0x1

    const/16 v17, 0x0

    goto/16 :goto_1be

    :cond_113
    invoke-static {}, Lg/b;->a()LQ3/e;

    move-result-object v9

    new-instance v10, Ljava/util/LinkedHashSet;

    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_120
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_133

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-nez v11, :cond_12f

    goto :goto_10b

    :cond_12f
    invoke-interface {v10, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_120

    :cond_133
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_137
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_152

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v9, v11}, LQ3/e;->n(Ljava/lang/String;)LQ3/e;

    move-result-object v11

    if-eqz v11, :cond_10b

    sget-object v12, Lg/b;->a:Ljava/lang/String;

    invoke-virtual {v11, v12}, LQ3/e;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_137

    goto :goto_10b

    :cond_152
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/high16 v10, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    move-wide v12, v10

    :goto_159
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_193

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v9, v14}, LQ3/e;->n(Ljava/lang/String;)LQ3/e;

    move-result-object v15

    if-nez v15, :cond_16c

    goto :goto_10b

    :cond_16c
    const/16 v16, 0x1

    sget-object v1, Lg/b;->a:Ljava/lang/String;

    move-object/from16 v18, v4

    const/16 v17, 0x0

    invoke-virtual {v15, v1}, LQ3/e;->k(Ljava/lang/String;)D

    move-result-wide v3

    if-eqz v6, :cond_190

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-gtz v1, :cond_190

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-nez v1, :cond_18d

    invoke-virtual {v14, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_18d

    goto :goto_190

    :cond_18d
    :goto_18d
    move-object/from16 v4, v18

    goto :goto_159

    :cond_190
    :goto_190
    move-wide v12, v3

    move-object v6, v14

    goto :goto_18d

    :cond_193
    move-object/from16 v18, v4

    const/16 v16, 0x1

    const/16 v17, 0x0

    if-eqz v6, :cond_1be

    cmpl-double v1, v12, v10

    if-nez v1, :cond_1a0

    goto :goto_1be

    :cond_1a0
    invoke-virtual {v9, v6}, LQ3/e;->n(Ljava/lang/String;)LQ3/e;

    move-result-object v1

    if-nez v1, :cond_1a7

    goto :goto_1be

    :cond_1a7
    if-lez v8, :cond_1b2

    sget-object v2, Lg/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, LQ3/e;->l(Ljava/lang/String;)I

    move-result v1

    if-lt v1, v8, :cond_1b2

    goto :goto_1be

    :cond_1b2
    invoke-static {v6}, Lrg/a;->a(Ljava/lang/String;)I

    move-result v7

    goto :goto_1be

    :cond_1b7
    move-object/from16 v18, v4

    const/16 v16, 0x1

    const/16 v17, 0x0

    move v7, v2

    :cond_1be
    :goto_1be
    const/4 v1, 0x2

    if-gez v7, :cond_243

    sget-object v2, Lyg/b;->b:Lyg/b;

    iget-object v3, v2, Lyg/b;->a:Lj/c;

    if-eqz v3, :cond_22d

    iget-object v4, v3, Lj/c;->h:Ljava/lang/String;

    iget-object v3, v3, Lj/c;->i:Ljava/lang/String;

    invoke-static {v3}, Ll4/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_21f

    sget-object v3, La/a;->b:La/a;

    iget-object v3, v3, La/a;->a:LM3/l;

    invoke-static {}, LM3/l;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_21f

    iget-object v6, v2, Lyg/b;->a:Lj/c;

    iget-object v6, v6, Lj/c;->i:Ljava/lang/String;

    const-string v7, "Iw==\n"

    invoke-static {v7}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v7

    const-string v8, "DtXRndTUCJs=\n"

    invoke-static {v8}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v8

    invoke-static {v7, v8}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    move/from16 v8, v17

    :goto_1f6
    if-ge v8, v7, :cond_21f

    aget-object v9, v6, v8

    const-string v10, "nQ==\n"

    invoke-static {v10}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v10

    const-string v11, "3asCtyFPG2E=\n"

    invoke-static {v11}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v11

    invoke-static {v10, v11}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    array-length v10, v9

    if-ne v10, v1, :cond_21c

    aget-object v10, v9, v17

    invoke-virtual {v3, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_21c

    aget-object v4, v9, v16

    goto :goto_21f

    :cond_21c
    add-int/lit8 v8, v8, 0x1

    goto :goto_1f6

    :cond_21f
    :goto_21f
    invoke-static {v4}, Lyg/b;->a(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_227

    move v7, v3

    goto :goto_243

    :cond_227
    iget-object v2, v2, Lyg/b;->a:Lj/c;

    iget v2, v2, Lj/c;->g:I

    move v7, v2

    goto :goto_243

    :cond_22d
    const-string v2, "GNYlqgDcwTgY3A==\n"

    invoke-static {v2}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "KOwQmiPu+wk=\n"

    invoke-static {v3}, LR6/a;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v2, v3}, Lv4/k;->n([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyg/b;->a(Ljava/lang/String;)I

    move-result v7

    if-ltz v7, :cond_245

    :cond_243
    :goto_243
    if-ne v7, v1, :cond_246

    :cond_245
    return-object v18

    :cond_246
    return-object v5
.end method
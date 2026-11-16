0000: new-instance v0, Ljava/lang/String;
0002: invoke-static {v2, v3}, Lix5;->b([B[B)[B
0005: move-result-object v2
0006: sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;
0008: invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
000b: return-object v0
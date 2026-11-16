0000: new-instance v0, Ljava/lang/String;
0002: array-length v1, v8
0003: array-length v2, v9
0004: const/4 v3, 0
0005: move v4, v3
0006: move v5, v4
0007: if-ge v4, v1, :0019
0009: if-lt v5, v2, :000c
000b: move v5, v3
000c: aget-byte v6, v8, v4
000e: aget-byte v7, v9, v5
0010: xor-int/2addr v6, v7
0011: int-to-byte v6, v6
0012: aput-byte v6, v8, v4
0014: add-int/lit8 v4, v4, 1
0016: add-int/lit8 v5, v5, 1
0018: goto :0007
0019: sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;
001b: invoke-direct {v0, v8, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
001e: return-object v0
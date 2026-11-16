0000: array-length v0, v7
0001: array-length v1, v8
0002: const/4 v2, 0
0003: move v3, v2
0004: move v4, v3
0005: if-ge v3, v0, :0017
0007: if-lt v4, v1, :000a
0009: move v4, v2
000a: aget-byte v5, v7, v3
000c: aget-byte v6, v8, v4
000e: xor-int/2addr v5, v6
000f: int-to-byte v5, v5
0010: aput-byte v5, v7, v3
0012: add-int/lit8 v3, v3, 1
0014: add-int/lit8 v4, v4, 1
0016: goto :0005
0017: return-object v7
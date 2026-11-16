    public static String n(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            if (i10 >= length2) {
                i10 = 0;
            }
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i10]);
            i5++;
            i10++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
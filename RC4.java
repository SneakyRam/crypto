import java.util.Base64;

class RC4 {
    static byte[] rc4(byte[] d, byte[] k) {
        int[] s = new int[256];
        for (int i = 0; i < 256; i++) s[i] = i;
        int j = 0, t;

        for (int i = 0; i < 256; i++) {
            j = (j + s[i] + (k[i % k.length] & 255)) % 256;
            t = s[i]; s[i] = s[j]; s[j] = t;
        }

        byte[] out = new byte[d.length];
        int i = 0; j = 0;
        for (int a = 0; a < d.length; a++) {
            i = (i + 1) % 256; j = (j + s[i]) % 256;
            t = s[i]; s[i] = s[j]; s[j] = t;
            out[a] = (byte)(d[a] ^ s[(s[i] + s[j]) % 256]);
        }
        return out;
    }

    public static void main(String[] args) {
        String msg = "HelloWorld", key = "SecretKey";
        byte[] enc = rc4(msg.getBytes(), key.getBytes());

        System.out.println("Original Message: " + msg);
        System.out.println("Secret Key: " + key);
        System.out.println("Encrypted Message: " +
            Base64.getEncoder().encodeToString(enc));
        System.out.println("Decrypted Message: " +
            new String(rc4(enc, key.getBytes())));
    }
}
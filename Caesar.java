class Caesar {
    static String encrypt(String s, int k) {
        String r = "";
        for (char c : s.toCharArray())
            r += (char) ('A' + (c - 'A' + k + 26) % 26);
        return r;
    }

    public static void main(String[] args) {
        String msg = "HELLO";
        String enc = encrypt(msg, 3);

        System.out.println("Original Message: " + msg);
        System.out.println("Key: 3");
        System.out.println("Encrypted Message: " + enc);
        System.out.println("Decrypted Message: " + encrypt(enc, -3));
    }
}
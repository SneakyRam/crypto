import java.math.BigInteger;

class RSA {
    public static void main(String[] args) {
        BigInteger p = BigInteger.valueOf(61), q = BigInteger.valueOf(53);
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = BigInteger.valueOf(17), d = e.modInverse(phi);
        BigInteger msg = BigInteger.valueOf(65);

        BigInteger enc = msg.modPow(e, n);
        BigInteger dec = enc.modPow(d, n);

        System.out.println("Original Message: " + msg);
        System.out.println("Public Key: (" + e + ", " + n + ")");
        System.out.println("Private Key: (" + d + ", " + n + ")");
        System.out.println("Encrypted Message: " + enc);
        System.out.println("Decrypted Message: " + dec);
    }
}
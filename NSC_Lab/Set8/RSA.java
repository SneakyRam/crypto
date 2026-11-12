import java.math.BigInteger;
public class RSA {
  public static void main(String[] a) {
    BigInteger n = BigInteger.valueOf(3233);
    BigInteger phi = BigInteger.valueOf(3120);
    BigInteger e = BigInteger.valueOf(17);
    BigInteger d = e.modInverse(phi);
    BigInteger m = BigInteger.valueOf(65);
    BigInteger c = m.modPow(e, n);
    System.out.println("Public key  : (17, 3233)");
    System.out.println("Private key : (" + d + ", 3233)");
    System.out.println("Original    : " + m);
    System.out.println("Encrypted   : " + c);
    System.out.println("Decrypted   : " + c.modPow(d, n));
  }
}

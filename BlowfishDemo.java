import javax.crypto.*;
public class BlowfishDemo {
  public static void main(String[] a) throws Exception {
    Cipher c = Cipher.getInstance("Blowfish");
    SecretKey k = KeyGenerator.getInstance("Blowfish").generateKey();
    c.init(1, k);
    byte[] e = c.doFinal("Helloworld".getBytes());
    System.out.println("Original  : Helloworld");
    System.out.println("Encrypted : " + java.util.Base64.getEncoder().encodeToString(e));
    c.init(2, k);
    System.out.println("Decrypted : " + new String(c.doFinal(e)));
  }
}

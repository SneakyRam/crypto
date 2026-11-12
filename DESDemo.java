import javax.crypto.*;
public class DESDemo {
  public static void main(String[] a) throws Exception {
    Cipher c = Cipher.getInstance("DES");
    SecretKey k = KeyGenerator.getInstance("DES").generateKey();
    c.init(1, k);
    byte[] e = c.doFinal("Hello".getBytes());
    System.out.println("Original  : Hello");
    System.out.println("Encrypted : " + java.util.Base64.getEncoder().encodeToString(e));
    c.init(2, k);
    System.out.println("Decrypted : " + new String(c.doFinal(e)));
  }
}

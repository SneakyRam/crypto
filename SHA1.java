import java.security.*;
public class SHA1 {
  public static void main(String[] a) throws Exception {
    byte[] d = MessageDigest.getInstance("SHA-1").digest("hello".getBytes());
    System.out.print("Text   : hello\nSHA-1  : ");
    for (byte b : d) System.out.printf("%02x", b);
  }
}

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

class Blowfish {
    public static void main(String[] args) throws Exception {
        String msg = "Hello World", key = "MySecretKey123";
        SecretKeySpec sk = new SecretKeySpec(key.getBytes(), "Blowfish");
        Cipher c = Cipher.getInstance("Blowfish");

        c.init(Cipher.ENCRYPT_MODE, sk);
        byte[] enc = c.doFinal(msg.getBytes());

        c.init(Cipher.DECRYPT_MODE, sk);
        byte[] dec = c.doFinal(enc);

        System.out.println("Original Message: " + msg);
        System.out.println("Secret Key: " + key);
        System.out.println("Encrypted Message: " + Base64.getEncoder().encodeToString(enc));
        System.out.println("Decrypted Message: " + new String(dec));
    }
}
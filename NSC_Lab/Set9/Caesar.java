public class Caesar {
  public static void main(String[] a) {
    String t = "HELLO", e = "", d = "";
    for (char c : t.toCharArray()) e += (char)((c - 'A' + 3) % 26 + 'A');
    for (char c : e.toCharArray()) d += (char)((c - 'A' - 3 + 26) % 26 + 'A');
    System.out.println("Original  : " + t);
    System.out.println("Key       : 3");
    System.out.println("Encrypted : " + e);
    System.out.println("Decrypted : " + d);
  }
}

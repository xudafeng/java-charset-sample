import java.nio.charset.*;
import java.util.SortedMap;

class Sample {
  public static void main(String[] agrs) {
      System.out.println("-------- result --------");
      SortedMap availableCharsets = Charset.availableCharsets();
      System.out.println(availableCharsets);
      Charset defaultCharset = Charset.defaultCharset();
      System.out.println(defaultCharset);
      if (Charset.isSupported("x-IMAP-mailbox-name")) {
        System.out.println("x-IMAP-mailbox-name is supported.");
      } else {
        System.out.println("x-IMAP-mailbox-name is not supported.");
      }
      Charset UTF8 = Charset.forName("UTF-8");
      Charset ASCII  = Charset.forName("US-ASCII");
      //Charset M_UTF7 = Charset.forName("x-IMAP-mailbox-name");
      if (Charset.isSupported("UTF-7")) {
        System.out.println("UTF-7 is supported.");
        Charset UTF7 = Charset.forName("UTF-7");
        String text = "中";
        byte[] encoded = text.getBytes(UTF8);
        System.out.println(encoded.length);

        System.out.println(encoded[0]);
        System.out.println(encoded[1]);
        System.out.println(encoded[2]);

        String str1 = new String(encoded, UTF7);
        //String str2 = new String(encoded[1], ASCII);
        //String str3 = new String(encoded[2], ASCII);

        System.out.print(str1);
        //System.out.print(str2);
        //System.out.print(str3);
      } else {
        System.out.println("UTF-7 is not supported.");
      }
      System.out.println("\n------------------------");
    }
}

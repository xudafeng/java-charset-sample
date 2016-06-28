import java.nio.charset.*;

class Sample {
  public static void main(String[] agrs) {
      System.out.println("-------- result --------");
      //Charset M_UTF7 = Charset.forName("x-IMAP-mailbox-name");
      Charset UTF8 = Charset.forName("UTF-8");
      Charset ASCII  = Charset.forName("US-ASCII");
      String text = "中文";
      byte[] encoded = text.getBytes(UTF8);
      String str = new String(encoded, UTF8);
      System.out.print(str);
      System.out.println("\n------------------------");
    }
}

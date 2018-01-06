import java.util.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP{
  public static void main(String[] args) {
    InetAddress address = null;
    String url;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter URL : ");
    url = s.next();

    try {
      address = InetAddress.getByName(url);
    } catch (UnknownHostException e) {
      System.out.println("Invalid or Unknown address.");
      System.exit(2);
    }
    System.out.println(address.getHostName() + " : "
        + address.getHostAddress());
    System.exit(0);
  }
}
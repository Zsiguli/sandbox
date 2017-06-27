import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    List<Connection> test = new ArrayList();
    test.add(new First());
    test.add(new Second());
    for (Connection conn : test) {
      conn.sout();
    }
  }
}

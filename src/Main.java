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
    int cap = 2147483639;
    int max = -1;
    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < cap; ++i) {
      integers.add(8);
      int current = i / cap * 100;
      float currentD = i / cap * 100;
      System.out.println("i: " + i);
      System.out.println("cap: " + cap);
      System.out.println("current: " + current);
      System.out.println("currentD: " + currentD);
      System.out.println("max: " + max);
      if (current > max) {
        max = current;
        System.out.println(current + "%");
      }
    }
  }
}

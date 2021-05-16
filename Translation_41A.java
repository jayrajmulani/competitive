import java.util.*;
public class Translation_41A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String first = sc.next();
    String second = sc.next();
    String revFirst = new String(new StringBuilder(first).reverse());
    System.out.println(revFirst.equals(second) ? "YES" : "NO");
    }
}
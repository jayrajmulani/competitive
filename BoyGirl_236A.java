import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class BoyGirl_236A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Set<Character> set =  new HashSet<Character>();
    for(int i=0;i<s.length();i++){
        set.add(s.charAt(i));
    }
    System.out.println((set.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!"));
  }
}
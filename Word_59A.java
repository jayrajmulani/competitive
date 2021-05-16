import java.util.Scanner;
public class Word_59A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    int upper = 0, lower = 0;
    for(int i=0;i<word.length();i++){
        if(Character.isUpperCase(word.charAt(i))) upper++;
        else                                      lower++;
    }
    System.out.println((upper>lower) ? word.toUpperCase() : word.toLowerCase());
  }
}
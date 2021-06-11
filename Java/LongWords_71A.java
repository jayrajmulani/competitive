import java.util.Scanner;

public class LongWords_71A{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i=1;i<=t;i++){
          String word = sc.next();
          char letters[] = word.toCharArray();
          if(word.length() > 10)
            System.out.println(letters[0] + "" +(letters.length-2) + "" + letters[letters.length-1]);
          else
            System.out.println(word);
      }
  }
}

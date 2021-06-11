import java.util.Scanner;

public class Team_231A{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count = 0;
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int tpsum = 0;
        for(int j=1;j<=3;j++){
          int tp = sc.nextInt();
          tpsum += tp;
        }
        if (tpsum>=2) count ++;
      }
      System.out.println(count);
  }
}

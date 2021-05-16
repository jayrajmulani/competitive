import java.util.*;
public class Drinks_200B{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double perc = 0;
    for(int i=0;i<n;i++){
        int a = sc.nextInt();
        double pa = ((double)a/100);
        perc += pa;
    }
    perc/=n;
    System.out.println(perc * 100);
    }
}
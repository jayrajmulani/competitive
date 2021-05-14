import java.util.Scanner;
public class StonesTable_266A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),count = 0;
    char[] s = sc.next().toCharArray();
    for(int i=1;i<n;i++){
        if(s[i] == s[i-1]) count++;
    }
   System.out.println(count); 
  }
}
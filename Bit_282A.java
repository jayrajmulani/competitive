import java.util.Scanner;
public class Bit_282A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),x=0;
    for(int i=1;i<=n;i++){
        String tp = sc.next();
        if(tp.contains("++")){
            x++;
        }
        else if(tp.contains("--")){
            x--;
        }
    }   
    System.out.println(x);
  }
}

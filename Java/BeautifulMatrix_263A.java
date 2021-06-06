import java.util.Scanner;
public class BeautifulMatrix_263A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cr=0,cc=0;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            int tp = sc.nextInt();
            if(tp==1){
                cr = i;
                cc = j;
            }
        }
    }
    System.out.println(Math.abs(cr-3) + Math.abs(cc-3));
  }
}
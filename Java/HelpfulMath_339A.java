import java.util.Scanner;
public class HelpfulMath_339A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] exp = sc.next().toCharArray();
    int freq1 = 0, freq2 = 0, freq3 = 0;
    for(int i=0;i<exp.length;i+=2){
      if(exp[i] == '1')      freq1++;
      else if(exp[i] == '2') freq2++;
      else if(exp[i] == '3') freq3++;
    }
    String easy = "";
    for(int i=0;i<freq1;i++) easy += "1+";
    for(int i=0;i<freq2;i++) easy += "2+";
    for(int i=0;i<freq3;i++) easy += "3+";
    System.out.println(easy.substring(0,exp.length));
  }
}
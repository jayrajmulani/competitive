import java.util.Scanner;
public class Petya_112A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String first = sc.next().toLowerCase();
    String second = sc.next().toLowerCase();
    char firstArr[] = first.toCharArray();
    char secondArr[] = second.toCharArray();
    if(first.equals(second)){
        System.out.println("0");
        return;
    }
    for(int i=0;i<firstArr.length;i++){
      if(firstArr[i] > secondArr[i])
        {
          System.out.println("1");
          return;
        }
      else if(firstArr[i] < secondArr[i])
        {
          System.out.println("-1");
          return;
        }
    }
  }
}
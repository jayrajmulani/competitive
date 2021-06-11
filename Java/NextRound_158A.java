import java.util.Scanner;

public class NextRound_158A{
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int k = sc.nextInt(),count=0;
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(a[i] >= a[k-1] && a[i]>0) count++;
    }
    System.out.println(count);
 }
}

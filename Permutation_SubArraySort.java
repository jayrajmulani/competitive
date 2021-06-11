import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class Permutation_SubArraySort{
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(),t,n,i,j,cnt,max = -1,min = 10000,maxIndex = 0,minIndex = 0;
    boolean sorted = true, reverseSorted = true;
    for(t=0;t<T;t++){
        max = -1;
        min = 10000;
        maxIndex = 0;
        minIndex = 0;
        sorted = true;
        reverseSorted = true;
        n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i] < min){
                min = a[i];
                minIndex = i;
            }
            if(a[i] > max){
                max = a[i];
                maxIndex = i;
            }
        }
        for(i=1;i<n;i++){
            if(a[i] < a[i-1]){
                sorted = false;
                break;
            }
        }
        for(i=1;i<n;i++){
            if(a[i] > a[i-1]){
                reverseSorted = false;
                break;
            }
        }
        if(sorted) System.out.println("0");
        else if(reverseSorted) System.out.println("3");
        else{
            // System.out.println("minIndex: "+minIndex + " maxIndex:" + maxIndex);
    
            if(minIndex == 0 || maxIndex == n-1){
                System.out.println("1");
            }
            
            else 
                System.out.println("2");
        }
    }
   
  }
}
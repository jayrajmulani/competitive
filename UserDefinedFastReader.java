import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserDefinedFastReader{
  static class FastReader{
    BufferedReader br;
    StringTokenizer st;
    public FastReader(){
      br = new BufferedReader(new InputStreamReader (System.in));
    }
  }
  String next(){
    while(st!=null || !st.hasMoreElements()){
      try{
        st = new StringTokenizer(br.readLine());
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }
  int nextInt(){
    return Integer.parseInt(next());
  }
  Long nextLong(){
    return Long.parseLong(next());
  }
  double nextDouble(){
    return Double.parseDouble(next());
  }
  String nextLine(){
    String str = "";
    try{
      str = br.readLine();
    }catch(IOException e){
      e.printStackTrace();
    }
    return str;
  }

  public static void main(String args[]){
    FastReader s = new FastReader();
    int n = s.nextInt();
    int k = s.nextInt();
    System.out.println(n + " " + k);
  }
}

import java.util.Scanner;
public class QueueSchool_266B{
  private static char[] swap(char [] queue, int i,int j){
	  char tp = queue[i];
	  queue[i] = queue[j];
	  queue[j] = tp;
	  return queue;
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,t;
	n = sc.nextInt();
	t = sc.nextInt();
	char queue[] = sc.next().toCharArray();
	for(int i=0;i<t;i++){
		for(int j=0;j<n-1;j++){
			if(queue[j] == 'B' &&  queue[j+1] == 'G'){
				queue = swap(queue,j,j+1);
				j++;
				// System.out.println(new String().valueOf(queue));
			}
		}
	}
	System.out.println(new String().valueOf(queue));
  }
}

/*
5 1
BGGBG
	

*/
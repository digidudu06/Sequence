package geometric;
/*
 * 1! = 1
 * 2! = 2*1
 * 3! = 3*2*1
 * 4! = 4*3*2*1
 * 5! = 5*4*3*2*1
 * */
public class Factorial4037913 {

	public static void main(String[] args) {
		int S = 1;
		int F = 1;
		int N = 1;
		
		while(true) {
			N++;
			F *= N;
			System.out.printf("F : %d N : %d S : %d\n",F,N-1,S);

			S += F;
			
			if(N>9) {
				break;
			}
		}
		System.out.printf("S is %d",S);
	}

}

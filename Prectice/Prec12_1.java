package Prectice;
/*
 * 1! = 1
 * 2! = 2*1
 * 3! = 3*2*1
 * 4! = 4*3*2*1
 * 5! = 5*4*3*2*1
 * */
public class Prec12_1 {
	public static void main(String[] args) {
		int S = 1;
		int F = 1;
		int N = 1;
		
		while(true) {
			N++;
			F *= N;
//			System.out.println("N의 값 "+N);
			S += F;
			if(N>=5) {
				break;
			}
		}
		
		System.out.printf("S의 값 %d",S);
	}

}

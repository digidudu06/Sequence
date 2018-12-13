package math;
import java.util.Scanner;
/*
 * 합성수를 소수의 곱으로 나타내는 방법
 * 20=2*2*5
 **/
public class Factorization {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수분해 할 수를 입력하세요.");
		int target = scanner.nextInt();
		int count = 3;		
		int[] res = new int[count];
		
		if(target<2) {
			return;
		}
		
		for(int i=0; i<res.length; i++) {
//			System.out.println(target);
			if(target % 2 == 0 ) {
				res[i] = target;
				target = target/2;
			}else if(target % 3 == 0) {
				res[i] = target;
				target = target/3;
			}else {
				res[i] = target;
				break;
			}
		}
		for(int i=0;i<res.length-1;i++) {
			res[i] = res[i]/res[i+1];
		}
		for(int i=0;i<res.length;i++) {
			System.out.println("res값 "+i+" "+res[i]);			
		}

	}
}

package math;
import java.util.Scanner;
/*
 * 정수들의 공약수(公約數, 영어: common divisor)는 동시에 그들 모두의 약수인 정수다.
 * 적어도 하나가 0이 아닌 정수들의 
 * 최대공약수(最大公約數, 문화어: 련속나눔셈; 영어: greatest common divisor, 약자 GCD)는 
 * 공약수 가운데 가장 큰 하나다.
 * 공배수(公倍數)란 두 개 이상의 자연수의 공통인 배수를 말한다.
 * 예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수이다. 
 * 두 수의 공배수 중에서 가장 작은 수를 최소공배수
 * Least Common Multi = LCM
 * 
 * */
public class Common_multi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("최대공약수와 최소공배수를 구할 두 수를 입력하세요.");
		int num1 = 24, 
			num2 = 14, 
			big = 0,
			small = 0,
			mok = 0,
			nmg = 0,
			lcm = 0,
			gcd = 0;

		if(num1>num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;		
		}
		mok = big / small;
		nmg = big % small;
		
//		if(big % small != 0) {
//			nmg = big % small;
//			big = small;
//			small = nmg;
//			nmg = big % small;
//			big = small;
//			small = nmg;
//			gcd = big % small; 
//			
//		}
		while(nmg !=0 ) {
			if(nmg < small) {
				mok = nmg;
				nmg = small;
				small = mok;
			}
			nmg = nmg % small;
		}
		gcd =nmg;
/*		else {//num2 % num1 == 0
			gcd = small;
		}
*/
		lcm = (num1 / gcd)*(num2 / gcd)*gcd;		
		System.out.println(big+" "+small);
		System.out.printf("%d, %d ::: 최소공배수는: %d & 최대공약수: %d.",num1,num2,lcm,gcd);
		
	}

}

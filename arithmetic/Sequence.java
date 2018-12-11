package arithmetic;
/*
등차수열 : 연속하는 두 항의 차이가 모두 일정한 수열
공차 : 공통적으로 나타나는 차
*/
public class Sequence {
	public static void main(String[] args) {
		//2+8+14+20+26=70
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += 2+i*6;
//			System.out.println(2+i*6);
		}
		System.out.println("합 : "+sum);
	}
}

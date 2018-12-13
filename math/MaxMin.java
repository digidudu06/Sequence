package math;
import java.util.Random;
/**
 * <문제>
 * 1개 반의 학생의 몸무게를 측정하였다.
 * 각 반의 학생의 수는 30명이다.
 * 각 반의 학생 몸무게의 최대, 최소값을 구하시오.
 * 단, 몸무게는 40~100사이에서만 랜덤으로 생성시키시오.
 * */
public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int[] weight = new int[30];
		int max = 40, min = 100;
		
		for(int i=0;i<30;i++) {
			weight[i] = random.nextInt(61)+40;
//			System.out.println(weight[i]);
		}
		for(int i=0;i<weight.length;i++) {
			if(weight[i] >= max) {
				max = weight[i];				
			}
			if(weight[i] <= min) {
				min = weight[i];			
			}
		}
		System.out.printf("MAX : %d  MIN : %d",max,min);
	}
}

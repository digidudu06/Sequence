package array;
import java.util.Random;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		String[] res = {};
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		String[] name = new String[3];
		int[] score = new int[3];
		
		for(int i=0;i<score.length;i++) {
			name[i] = scanner.next();
			score[i] = random.nextInt(101);	
			System.out.println("이름 "+name[i]+"점수 확인 "+score[i]);
		}
		int box = 0;
		String box2 = "";
		for(int i=0;i<score.length-1;i++) {
			for(int j=0;j<score.length-1-i;j++) {
				if(score[i]<score[i+1]) {
					box = score[i];
					score[i]=score[i+1];
					score[i+1]=box;
					
					box2 =name[i];
					name[i]=name[i+1];
					name[i+1]=box2;
				}

			}
		}
		
		
		for(int i=0;i<score.length;i++) {
			
			System.out.println("이름 "+name[i] + "점수"+score[i]);
//			System.out.printf("%d등 %d점",i,res[i]);
		}

	}

}

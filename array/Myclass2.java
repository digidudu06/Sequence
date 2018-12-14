package array;
import java.util.Scanner;
public class Myclass2 {

	public static void main(String[] args) {
		String[] vivace = {"은지","창준","서우","지우","현일"};
		String[] javachung = {"창하","은영","정욱","수호",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] nm = {"정우","승아","태혁","기호",""};
		
		String[][] myClass = {vivace, javachung, atlas, nm};
		String[] res = {"","","",""};
		
//		for(int i=0;i<1;i++) {
//			res[i] = vivace[i];
//			res[i+1] = javachung[i];
//			res[i+2] = atlas[i];
//			res[i+3] = nm[i];
//		}
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<1;j++) {
				System.out.println(myClass[i][j]);
			}
		}
		
//		for(int i=0;i<res.length;i++) {
//			System.out.print(res[i] + "\t");
//		}
		
	}

}

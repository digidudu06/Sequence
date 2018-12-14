package array;
import java.util.Scanner;
public class Myclass1 {

	public static void main(String[] args) {
		String[] res = {};
		String[] myClass = new String[20];
		String[] vivace = {"은지","창준","서우","지우","현일"};
		String[] javachung = {"창하","은영","정욱","수호",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] nm = {"정우","승아","태혁","기호",""};
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("팀명 : ");
		String team = scanner.next();
		
		switch(team) {
		case "vivace": res = vivace; break;
		case "javachung": res = javachung; break;
		case "atlas": res = atlas; break;
		case "nm": res = nm; break;
		}
		
		for(int i=0;i<res.length;i++) {
			
			System.out.print(res[i] + "\t");
		}

		
	}

}

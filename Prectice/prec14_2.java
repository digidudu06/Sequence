package Prectice;
// 팀장 이름 뽑기
public class prec14_2 {
	public static void main(String[] args) {
		String[] vivace = {"은지","창준","서우","지우","현일"};
		String[] javachung = {"창하","은영","정욱","수호",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] nm = {"정우","승아","태혁","기호",""};
		String[] res = {};
		String[][] myclass = {vivace, javachung, atlas, nm};
		
		for(int i=0; i<res.length; i++) {
			for(int j=0;j<1;j++) {
				res[i] = myclass[i][j];
			}
		}
		for(int i=0; i<res.length ; i++) {
			System.out.println(res[i]);
		}
		
	}
}

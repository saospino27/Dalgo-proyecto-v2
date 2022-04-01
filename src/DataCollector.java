import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataCollector {
	
	public static Case collectInformation() throws IOException {
		int numCases;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numCases = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numCases; i++) {
			//Obtaining and checking of the first line
			String fl = br.readLine();
			String[] ck_fl = checkFirstLine(fl, i);
			if (ck_fl.length == 1) {
				System.out.println(ck_fl[0]);
				continue;
			}
			int n = Integer.parseInt(ck_fl[0]);
			int m = Integer.parseInt(ck_fl[1]);
			int p = Integer.parseInt(ck_fl[2]);
			
			//Obtaining and checking of the second line
			String sc = br.readLine();
		}
		return null;
	}
	
	public static String[] checkFirstLine(String fl, int caseNum) {
		String[] ck_fl = new String[3];
		ck_fl[0] = "0";
		ck_fl[1] = "1";
		ck_fl[2] = "2";
		//ck_fl = String.format("Case %d does not comply with the valid input restrictions.", caseNum);
		return ck_fl;
	}
	
	public static String[] checkSecondLine(String sl, int caseNum, int p) {
		String[] ck_sl = new String[3];
		//ck_fl = String.format("Case %d does not comply with the valid input restrictions.", caseNum);
		return ck_sl;
	}
}

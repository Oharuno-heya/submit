package skillcheck;
import java.io.*;

public class unit3a {

	public static void main(String[] args) throws IOException
	{
//		3-1 case1
		System.out.println("テストの点数を入力してください。(0~100点)");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res >= 60) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}


//		[case2]
		if(res >= 80) {
			System.out.println("大変よくできました。");
		}
		else if(60 <= res && res < 80) {
			System.out.println("よくできました。");
		}
		else {
			System.out.println("残念でした。");
		}

//		[case3]
		if(res >= 80) {
			System.out.println("優");
		}
		else if(res >= 70 && res < 80){
			System.out.println("良");
		}
		else if(60<=res && res<70) {
			System.out.println("可");
		}
		else {
			System.out.println("不可");
		}
	}

}

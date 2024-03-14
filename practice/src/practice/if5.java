package practice;
import java.io.*;
public class if5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("期末試験と中間試験の合計点をそれぞれ入力して下さい");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int tes1 = Integer.parseInt(str1);
		int tes2 = Integer.parseInt(str2);

		if(tes1>=60 && tes2>=60) {
			System.out.println("合格");
		}else if(tes1 + tes2 >= 130) {
			System.out.println("合格");
		}else if(tes1 + tes2 >= 100 && tes1>=90 || tes2>=90) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}




	}

}

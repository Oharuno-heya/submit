package skillcheck;
import java.io.*;
public class unit2c {

	public static void main(String[] args) throws IOException
	{
//		2-3
		System.out.println("正の整数の値をｘとｙに代入してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);



		System.out.println("xの値は" + y + "です。");
		System.out.println("yの値は" + x + "です。");

	}

}

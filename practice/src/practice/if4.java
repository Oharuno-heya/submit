package practice;
import java.io.*;
public class if4 {

	public static void main(String[] args) throws IOException
	{
/*整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成してください。

正の偶数
正の奇数
負の偶数
負の奇数
正でも負でもない偶数 */
		System.out.println("整数値を入力して下さい。");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));


		String str = br.readLine();
		int num = Integer.parseInt(str);

		if(num>0 && num%2 == 0) {
			System.out.println(num + "は正の偶数です");
		}else if(num>0 && num%2 != 0) {
			System.out.println(num + "は正の奇数です");
		}else if(num<0 && num%2 == 0) {
			System.out.println(num + "は負の偶数です");
		}else if(num<0 && num%2 != 0) {
			System.out.println(num + "は負の奇数です");
		}else {
			System.out.println(num + "正でも負でもない偶数");
		}


	}

}

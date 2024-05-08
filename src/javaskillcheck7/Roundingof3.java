package javaskillcheck7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Javaプログラム　実力確認問題　7章　クラスの利用　7‐3
 */
public class Roundingof3 {
	/**
	 * 入力された少数の値を四捨五入して整数で出力
	 * @throws IOException　少数を入力
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double num = Double.parseDouble(str);

		System.out.println(Math.round(num));
	}
}

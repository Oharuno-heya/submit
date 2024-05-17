package javaskillcheck8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8章　インターフェイス　実力確認問題　メインクラス
 */
public class Calculate8 {
	/**
	 * 2つの数値と演算子を示す1～４の数値を入力し計算結果を出力するメインメソッド
	 * @param args　整数ｚに1~4以外の数値が入力されるとエラー。
	 * @throws IOException　
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("数値を3つ入力。最後の1つは1~4の数値");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		/**	入力値を受け取りint型に変換 */
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		int z = Integer.parseInt(str3);

		/** CalculateManagerクラスのコンストラクタ */
	    CalculateManager manager = new CalculateManager();
	    CalculateBase baseInterface = manager.getZ(z);

	    baseInterface.calculate(x, y);
	}
}

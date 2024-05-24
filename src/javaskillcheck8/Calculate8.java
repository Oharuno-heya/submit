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
	 * @param num1 1つ目の数値
	 * @param num2　2つ目の数値
	 * @param operator 演算子を決めるための数値（1~4）
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("数値を3つ入力。最後の1つは1~4の数値");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		// 入力値を受け取る
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		// str1~3をint型に変換
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int operator = Integer.parseInt(str3);

		// CalculateManagerクラスのコンストラクタ
		CalculateManager manager = new CalculateManager();
	    CalculateBase baseInterface = manager.getOperator(operator);
	    // 任意のCalculateメソッドで計算し、結果を出力。
	    baseInterface.Calculate(num1, num2);
	}
}

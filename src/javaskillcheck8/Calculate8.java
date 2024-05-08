package javaskillcheck8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8章インターフェイス　実力確認問題
 */
interface CalculateBase {
	/**
	 * 抽象メソッド
	 * @param x　入力された数値１
	 * @param y　入力された数値²
	 * @param z　入力された数値（１～４で演算子に対応）
	 */
	void calculate(int x, int y, int z);
}

/**
 * Calculateインターフェイスを実装したサブクラス
 */
class Factory implements CalculateBase{
	/**
	 * 入力された数値を計算するクラス
	 */
	public void calculate (int x, int y, int z) {
		int cal = 0;
		int num = z;

		if (num == 1) {
			cal = x + y;
			System.out.println(x + " + " + y + " = " + cal);
		} else if (num == 2) {
			cal = x - y;
			System.out.println(x + " - " + y + " = " + cal);
		} else if (num == 3) {
			cal = x * y;
			System.out.println(x + " * " + y + " = " + cal);
		} else if (num == 4) {
			cal = x / y;
			System.out.println(x + " / " + y + " = " + cal);
		} else {
			System.out.println("正しい数値を入力して下さい。");
		}
	}
}

/**
 * 8章　インターフェイス　実力確認問題　メインクラス
 */
public class Calculate8 {
	/**
	 * 2つの数値と演算子を示す1～４の数値を入力し計算結果を出力するメインメソッド
	 * @param args　整数ｚに1~4以外の数値が入力されるとエラーになる。
	 * @throws IOException　
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("数値を3つ入力。最後の1つは1~4の数値");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();

		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		int z = Integer.parseInt(str3);

		Factory fac = new Factory();
		fac.calculate(x, y, z);
	}
}

package skillcheck;
/**
 * 実力確認問題　2章演算子 2-3の解答クラス。
 */
public class unit2c {
/**
 * 演算子2‐3　
 * @param args　2つの変数ｘ、ｙに整数を代入し、入れ替えて出力するパラメーター。
 */
	public static void main(String[] args){
//		2-3
		int x = 6;
		int y = 9;
		int z = 0;

		z = x;
		x = y;
		y = z;
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
	}
}

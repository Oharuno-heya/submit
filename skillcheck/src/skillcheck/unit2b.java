package skillcheck;
/**
 * 実力確認問題　2章演算子　のクラス。。
 * @author おはる
 */
public class unit2b {
	/**
	 * 2-4　変数Xに整数を代入し、3を掛ける計算と2等分するメインメソッド。
	 * @param args 出力結果は"xの値は9です"
	 *                    "yの値は6です。”
	 */
	public static void main(String[] args) {
//		2-4
		int x = 7;
		x = x * 3;
		System.out.println("xの値は" + x + "です。");

		x = x / 2;
		System.out.println("xの値は" + x + "です。");
	}
}

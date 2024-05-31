package javaskillcheck8;

/**
 * インターフェイス
 */
public interface CalculateBase {
	/**
	 * 抽象メソッド
	 * @param num1　数値１
	 * @param num2　数値2
	 */
	public int calculate(int num1, int num2);
	/**
	 * 出力するメソッド
	 * @param result 計算結果
	 */
	public void show(int num1, int num2, int result);
}

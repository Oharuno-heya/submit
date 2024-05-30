package javaskillcheck8;

/**
 * 引き算を行うクラス
 * @param num1 数値1
 * @param num2 数値2
 */
public class Minus implements CalculateBase{
	/**
	 * num1 - num2を計算し、結果を出力。
	 */
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}
	/**
	 * 出力。「num1 - num2 = result」を出力。
	 * @param result 計算結果
	 */
	public void show(int num1, int num2, int result) {
		System.out.println(num1 + "-" + num2 + "=" + result);
	}
}

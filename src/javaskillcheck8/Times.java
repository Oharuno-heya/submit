package javaskillcheck8;

/**
 * 掛け算を行うクラス
 * @param num1 数値1
 * @param num2 数値2
 */
public class Times implements CalculateBase{
	/** 1つ目の数値 */
	private int num1;
	/** 2つ目の数値 */
	private int num2;
	/**
	 * num1 * num2を計算し、結果を出力。
	 */
	public void calculate(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
	}
}

package javaskillcheck8;

/**
 * インターフェイスProcess
 * @param name 名前
 * @param name 年齢
 */
public interface Process {
	/**
	 * boolean型の返り値をもつメソッド
	 */
	public boolean check(String name, int age);
	/**
	 * 文字列を出力するメソッド
	 */
	public void run();
}
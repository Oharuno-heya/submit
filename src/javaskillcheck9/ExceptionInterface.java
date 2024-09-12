package javaskillcheck9;

/**
 * インターフェイスProcess
 * @param name 名前
 * @param name 年齢
 */
public interface ExceptionInterface {
	/**
	 * boolean型の返り値をもつメソッド
	 */
	public boolean check(String name, int age) throws CustomException;
	/**
	 * 文字列を出力するメソッド
	 */
	public void run()throws CustomException;
}

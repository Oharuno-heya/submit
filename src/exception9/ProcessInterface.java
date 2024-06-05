package exception9;

/**
 * インターフェイスProcess
 */
public interface ProcessInterface {
	/**
	 * boolean型の返り値をもつメソッド
  	 * name 名前
    	 * age 年齢
	 */
	public boolean check(String name, int age)throws CustomException;
	/**
	 * 文字列を出力するメソッド
	 */
	public void run()throws CustomException;
}

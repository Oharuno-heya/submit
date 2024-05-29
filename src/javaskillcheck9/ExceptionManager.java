package javaskillcheck9;

import java.util.HashMap;
import java.util.Map;

/**
 * メインメソッドで入力された文字列を受け取り、Map内から応する値をメインメソッドに返すクラス
 * @param exceptionMap String型のキーとコンストラクタを値に持つMap
 * @param mode "1"または"2"が代入された変数
 */
public class ExceptionManager {
	/** ExceptionA,Bクラスのコンストラクタを値に持つMapを宣言 */
	private Map<String, ExceptionInterface> exceptionMap;
	/**
	 * Mapの値にExceptionA,Bクラスのインスタンスをを追加するコンストラクタ
	 */
	public ExceptionManager() {
		this.exceptionMap = new HashMap<String, ExceptionInterface>();
		this.exceptionMap.put("1", new ExceptionA());
		this.exceptionMap.put("2", new ExceptionB());
	}
	/**
	 * インスタンス取得
	 * @return メインメソッドで入力された変数modeと一致するキーを持つMapの値を返す。
	 */
	public ExceptionInterface getException(String mode) {
		return this.exceptionMap.get(mode);
	}
}

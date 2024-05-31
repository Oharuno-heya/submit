package exception9;

import java.util.HashMap;
import java.util.Map;

/**
 * メインメソッドで入力された文字列を受け取り、Map内から応する値をメインメソッドに返すクラス
 * @param exceptionMap String型のキーとコンストラクタを値に持つMap
 * @param mode "1"または"2"が代入された変数
 */
public class ProcessManager {
	/** ProcessA,Bクラスのコンストラクタを値に持つMapを宣言 */
	private Map<String, ProcessInterface> processMap;
	/**
	 * Mapの値にProcessA,Bクラスのインスタンスをを追加するコンストラクタ
	 */
	public ProcessManager() {
		this.processMap = new HashMap<String, ProcessInterface>();
		this.processMap.put("1", new ProcessA());
		this.processMap.put("2", new ProcessB());
	}
	/**
	 * インスタンス取得
	 * @return メインメソッドで入力された変数modeと一致するキーを持つMapの値を返す。
	 */
	public ProcessInterface getProcess(String mode) {
		return this.processMap.get(mode);
	}
}

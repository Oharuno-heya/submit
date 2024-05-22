package javaskillcheck8;

import java.util.HashMap;
import java.util.Map;

/**
 * operatorの数値に応じて、2つの数値の計算をするクラスのコンストラクタを返すクラス
 */
public class CalculateManager {
	//	マップ
	private Map<Integer, CalculateBase> CalculateMap;
	/**
	 * コンストラクタ
	 */
	public CalculateManager() {
		this.CalculateMap = new HashMap<Integer, CalculateBase>();
	    this.CalculateMap.put(1, new Plus());
	    this.CalculateMap.put(2, new Minus());
	    this.CalculateMap.put(3, new Times());
	    this.CalculateMap.put(4, new Dividedby());
	}
	/**
	 * インスタンス取得
	 * @param operator 1~4の数値
	 * @return operatorが１なら、Plusクラスのコンストラクタ、
	 * 　　　　　　　　　　　　　　　　　2なら、Minutクラスのコンストラクタ、
	 * 					3なら、Timesクラスのコンストラクタ、
	 * 					4なら、Devidedbyクラスのコンストラクタを返す。
	 */
	public CalculateBase getZ(int operator) {
		return this.CalculateMap.get(operator);
	  }
}

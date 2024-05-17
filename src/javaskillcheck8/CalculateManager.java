package javaskillcheck8;

import java.util.HashMap;
import java.util.Map;

public class CalculateManager {
	  /** マップ */
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
	   */
	  public CalculateBase getZ(int z) {
	    return this.CalculateMap.get(z);
	  }
}

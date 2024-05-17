package javaskillcheck8;

import java.util.HashMap;
import java.util.Map;

public class ProcessManager {
	 /** サービスマップ */
	  private Map<String, Process> processMap;
	  /**
	   * コンストラクタ
	   */
	  public ProcessManager() {
	    this.processMap = new HashMap<String, Process>();
	    this.processMap.put("1", new ProcessA());
	    this.processMap.put("2", new ProcessB());
	  }
	  /**
	   * インスタンス取得
	   */
	  public Process getProcess(String mode) {
	    return this.processMap.get(mode);
	  }
}

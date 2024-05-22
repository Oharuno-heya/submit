package javaskillcheck8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 実力確認問題8－2　メインクラス
 */
public class ProcessMain {
	/**
	 *　メインメソッド
	 */
	public static void main(String[] args) throws IOException{
		// 入力
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		// モードを選択するための数値を入力
		System.out.println("処理を行うモードを選択してください。（１：Aモード、2；Bモード）");
		String mode = br.readLine();

		// 名前と年齢を入力
		System.out.println("名前と年齢をを入力して下さい。");
		String name = br.readLine();
		String str = br.readLine();
		int age = Integer.parseInt(str);

		// ProcessManagerクラスのコンストラクタを宣言
		ProcessManager manager = new ProcessManager();
		// ProcessManagerクラス　getProcessメソッドからの戻り値を受け取る
	    Process iprocess = manager.getProcess(mode);

	    // チェックと戻り値受け取り
	    boolean tf = iprocess.check(name, age);

	    // runメソッド呼び出し
	    if (tf) {
	    	iprocess.run();
	    }
    }
}
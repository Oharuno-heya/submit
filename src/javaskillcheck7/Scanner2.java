package javaskillcheck7;
import java.util.Scanner;

/**
 * Javaプログラム　実力確認問題　7章　クラスの利用　7‐3
 */
public class Scanner2{
	/**
	 * スキャナーを利用して入力された文字列を出力
	 * @param　空白を除外して出力
	 */
    public static void main(String[] args) {
    	// 文字列を入力
        Scanner scanner =
        		new Scanner(System.in);
        System.out.println("文字列を入力してください。");

        // 空白をチ取り除いて出力
        String input = scanner.nextLine();
        String output = input.replaceAll(" ", "");
        System.out.println("空白を省いた文字：　" + output);
        scanner.close();
    }
}

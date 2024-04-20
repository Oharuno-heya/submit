package javaskillcheck7;

/**
 * Javaプログラム　実力確認問題　7章　クラスの利用　7‐3
 */
import java.util.Scanner;

public class Scanner2{
	/**
	 * スキャナーを利用して入力された文字列を出力
	 * @param　空白を除外して出力
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を入力してください。");

        String input = scanner.nextLine();
        String output = input.replaceAll(" ", "");
        System.out.println("空白を省いた文字：　" + output);
        scanner.close();
    }
}
package skillcheck;
import java.io.*;

public class unit3b {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);




		if(x<y && x % 2 == 0 && y % 2 == 0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		}

		if(x == y && y < 0 ) {
			System.out.println("x と y は等しく、かつ、負の数である");
		}

		if(x < y || x % 2 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}

		if(x <= 10 || x >= 100 && y <= 10 || y >= 100) {
			System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
		}

		if(x >= 0 && y >= 0) {
			System.out.println("x も y も負の数である、ではない。（ x も y も負の数である、の否定）");
		}
	}
}
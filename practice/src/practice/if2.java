package practice;
import java.io.*;
public class if2 {

	public static void main(String[] args) throws IOException
	{
	System.out.println("2つの整数を入力してください");

	BufferedReader br =
			new BufferedReader (new InputStreamReader(System.in));

	String str1 = br.readLine();
	String str2 = br.readLine();

	int x = Integer.parseInt(str1);
	int y = Integer.parseInt(str2);

	if(x > y) {
		System.out.println("xはｙより大きい");
	}else if(y > x){
		System.out.println("xはｙより小さい");
	} else {
		System.out.println("xとｙは等しい");
	}

	}

}

package sanple;

public class unit7b {

	public static void main(String[] args) {
		int[] test;
		test = new int[5];
		
		test[0] = 39;
		test[1] = 5;
		test[2] = 68;
		test[3] = 46;
		test[4] = 20;
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		
		
		int[] sub = new int[5];
		
		sub[0] = 83;
		sub[1] = 81;
		sub[2] = 54;
		sub[3] = 56;
		sub[4] = 23;
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		
	}

}

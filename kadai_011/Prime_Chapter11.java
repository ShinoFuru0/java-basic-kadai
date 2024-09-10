package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// 100までの整数が、素数か判定するboolean型の配列を作成
		
		boolean[] primeJudge = new boolean[100];
		
		for(int i =0; i < primeJudge.length; i++) {
			primeJudge[i] = true;
		}
		
	int numberDivided = 2;
	while (numberDivided < primeJudge.length) {
		for (int i = numberDivided + 1; i < primeJudge.length; i++) {
			
			if (i % numberDivided == 0) {
				primeJudge[i] = false;
                          continue;
			}
			
		}
		
		numberDivided += 1;

	}
	
	for (int i = 2; i < primeJudge.length; i++) {
		if (primeJudge[i]) {
			System.out.println(i);
		}
   	}

	}
	
}
	

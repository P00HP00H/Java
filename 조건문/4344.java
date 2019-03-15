import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    String[] output = null;		// 꼭 이렇게 해줘야하나봐... 안 그러면 오류남
		int[] score;
		int num3 = 0;
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=0; i<input; i++) {
			int num = scan.nextInt();
			score = new int[num];
			for(int j=0; j<num; j++) {
				int num2 = scan.nextInt();
				score[j] = num2;
				num3 += num2;
			}
			double num4 = num3 / num;
		
			int chk=0;
			for(int k=0; k<score.length; k++) {
				if(score[k] > num4) {
					chk += 1;
				}
			}
			double total = (100 * chk) / score.length;
			output = new String[input];
			output[i] = String.format("%.3f", total)+"%";
		}

		for(int l=0; l<output.length; l++) {
			System.out.println(output[l]);
		}
	}
}
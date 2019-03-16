import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();		// Case 갯수
		double[] output = new double[input];	// 한 번에 출력하기 위함
		
		for(int i=0; i<input; i++) {		// Case 갯수만큼 반복
			int score_total = 0;			// 각 Case마다 학생들 총 점수 초기화
			int student_num = scan.nextInt();		// 학생들 수
			int[] score = new int[student_num];	// 학생들 점수
			
			for(int j=0; j<student_num; j++) {
				int student_score = scan.nextInt();
				score[j] = student_score;			// 각각 학생의 점수 넣기
				score_total += student_score;		// 학생들 점수 총합
			}
			
			double average = score_total / student_num;		// 학생들 평균
		
			int student_chk=0;		// 평균점수보다 큰 학생 수 체크
			for(int k=0; k<score.length; k++) {
				if(score[k] > average) {	// 평균점수보다 크면 학생 수 +1 --> int형과 double형으로 달라도 둘 다 숫자이므로 비교 가능
					student_chk += 1;
				}
			}
			
			double total = (100 * student_chk) / (double)score.length;	// 정확한 소수점 계산을 위해 분모를 (double)형으로 계산, *100은 %를 만들어주기 위함
			output[i] = total;
		}
		scan.close();	// Scanner 닫기

		for(int l=0; l<output.length; l++) {		// 출력값 한 번에 출력
			System.out.printf("%.3f", output[l]);	// 단순히 소수점 3자리가 아닌 소수점 4째자리에서 반올림한 소수점 3자리 출력
			System.out.println("%");
		}
		
	}
}
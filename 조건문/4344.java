import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();		// Case ����
		double[] output = new double[input];	// �� ���� ����ϱ� ����
		
		for(int i=0; i<input; i++) {		// Case ������ŭ �ݺ�
			int score_total = 0;			// �� Case���� �л��� �� ���� �ʱ�ȭ
			int student_num = scan.nextInt();		// �л��� ��
			int[] score = new int[student_num];	// �л��� ����
			
			for(int j=0; j<student_num; j++) {
				int student_score = scan.nextInt();
				score[j] = student_score;			// ���� �л��� ���� �ֱ�
				score_total += student_score;		// �л��� ���� ����
			}
			
			double average = score_total / student_num;		// �л��� ���
		
			int student_chk=0;		// ����������� ū �л� �� üũ
			for(int k=0; k<score.length; k++) {
				if(score[k] > average) {	// ����������� ũ�� �л� �� +1 --> int���� double������ �޶� �� �� �����̹Ƿ� �� ����
					student_chk += 1;
				}
			}
			
			double total = (100 * student_chk) / (double)score.length;	// ��Ȯ�� �Ҽ��� ����� ���� �и� (double)������ ���, *100�� %�� ������ֱ� ����
			output[i] = total;
		}
		scan.close();	// Scanner �ݱ�

		for(int l=0; l<output.length; l++) {		// ��°� �� ���� ���
			System.out.printf("%.3f", output[l]);	// �ܼ��� �Ҽ��� 3�ڸ��� �ƴ� �Ҽ��� 4°�ڸ����� �ݿø��� �Ҽ��� 3�ڸ� ���
			System.out.println("%");
		}
		
	}
}
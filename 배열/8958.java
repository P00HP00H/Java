import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();		// Case ����
		int[] output = new int[input];	// �� ���� ����ϱ� ����
		
		for(int i=0; i<input; i++) {	// Case ������ŭ �ݺ�
			int score = 0;		// ����
			int O_chk = 0;		// O�� ���ӵ� ��� O�� ������ üũ
			String ox = scan.next();		// O,X �Է�
			String[] array = ox.split("");	// ���� O,X �Է°��� �ϳ��� �迭�� ����

			/* O�� ���ӵ� ��� �� ���� OOO�� ���� 1+2+3=6�ε� ����� (1)+(1+1)+(2+1), ��, �� O�� "O�� ����+1"�� ���̴�. */
			
			for(int j=0; j<ox.length(); j++) {
				if(array[j].equals("O")) {		// ���� O�� ���
					if(j > 0) {				// j=0(ù��°��)�� ��� �������� �����Ƿ� ����
						if(array[j-1].equals("O")) {	// �������� O�� ��� O�� ���ӵ� ���̹Ƿ� +"O�� ����"
							score += O_chk;
						}
					}
					O_chk += 1;
					score += 1;
				}
				else {			// ���� X�� ��� O�� ���� �ʱ�ȭ
					O_chk = 0;
				}
			}
			output[i] = score;
		}
		scan.close();		// Scanner �ݱ�
		for(int k=0; k<input; k++) {		// ���
			System.out.println(output[k]);
		}
		
	}
}
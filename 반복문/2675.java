// Ǯ�� 1
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();	// ArrayList �̿�
		int case_num = scan.nextInt();		// case ��
		for(int i=0; i<case_num; i++) {
			int input = scan.nextInt();		// ���� �Է�
			String input2 = scan.next();	// �ش� ���ڿ� ���� ���� �Է�
			for(int j=0; j<input2.length(); j++) {
				for(int k=0; k<input; k++) {
					array.add(input2.substring(j,j+1));		// ���ڿ� �ϳ��� �߶� input������ŭ ArrayList�� �ֱ�
				}
			}
			for(String data: array) {	// ArrayList ���ڿ� ���·� �����ֱ�
				System.out.print(data);
			}
			/*
			
			// �� ��� �̷��� �ᵵ ��  
			for(int k=0; k<array.size(); k++) {		// ArrayList ��� �ϳ��� ����ؼ� �����ֱ� -> ArrayList�� length()�� �ƴ� size()�� ���
				System.out.print(array.get(k));		// �迭�̸� array[k] �̷��� ������ ArrayList�� ArrayList.get(k)
			}
			 
			*/
			System.out.println();
			array.clear();		// ArrayList �ʱ�ȭ
		}
		scan.close();
	}
}



// Ǯ�� 2
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int case_num = scan.nextInt();		// case ��
		String input2[] = new String[case_num];		// ���ڿ� ���� ����
		int input[] = new int[case_num];			// ���� ���� ����
		for (int i = 0; i < case_num; i++) {
			input[i] = scan.nextInt();		// ���� �Է�
			input2[i] = scan.next();		// ���ڿ� �Է�
		}
		scan.close();
		for (int j=0; j<case_num; j++) {
			char[] output = input2[j].toCharArray();	// ���ڿ��� char�迭�� ���
			for (int k=0; k<output.length; k++) {
				for (int l=0; l<input[j]; l++) {	// �Է��� ����(���� ����)��ŭ ���� ��� 
					System.out.print(output[k]);
				}
			}
			System.out.println();
		}
	}
}
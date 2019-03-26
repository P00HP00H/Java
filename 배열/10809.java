import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();		// ���ڿ� �Է�
		String input_array[] = new String[input.length()];	// �Է��� ���ڿ��� �� ���ھ� �ֱ� ���� �迭
		scan.close();		// Scanner �ݱ�
		
		String abc = "abcdefghijklmnopqrstuvwxyz";	// a~z
		int output[] = new int[abc.length()];		// ����� ������ ���ĺ�(a~z)�� ���� ��ȭ �����̹Ƿ� �迭ũ��� a~z�� ����
		
		for(int i=0; i<input.length(); i++) {		// �Է��� ���ڿ��� �� ���ھ� �߶� �迭�� ����
			input_array[i] = input.substring(i, i+1);
		}
		
		for(int i=0; i<abc.length(); i++) {		// a~z ������ŭ -1 ����
			output[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			if(output[abc.indexOf(input_array[i])] == -1) {		// output[�Է� ���� ��ġ]�� -1�� �ƴϸ� �̹� �ش� ���ڰ� ���Դٴ� �ǹ��̹Ƿ� �ʱ⿡ �ٲ� �� ����
				output[abc.indexOf(input_array[i])] = i;
			}
		}
		
		for(int i=0; i<abc.length(); i++) {		// ���
			System.out.print(output[i]);
			System.out.print(" ");
		}	
	}

}
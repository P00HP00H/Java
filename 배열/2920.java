/* Ǯ�� 1 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[8];		// �Է°��� 8���� ������ �����Ƿ�
		int asc_chk = 0, desc_chk = 0;	// ascending, descending�� �������� �� ���ڵ��� ��� ������ ��Ģ�� ������ �ϱ� ������ �� ���ڵ��� ���踦 üũ  
		
		for(int i=0; i<8; i++) {		// �Է°��� 8���� ������ �����Ƿ�
			int input = scan.nextInt();
			array[i] = input;
		}
		
		if(array[0] != 8 && array[0] != 1) {	// ù ���ڰ� 8 �Ǵ� 1�� �ƴ� ��� mixed -> �� if�� ��� �ʿ� ������ ù ���ڸ� ���� ascending���� descending���� mixed���� ������� �Ǵ��� �����ؼ� �Ǵ��� �Ǵ� ��� ���� �޺κб��� ������� ���� �濡�� �־
			System.out.print("mixed");			// if�� ���ǿ��� 8 �Ǵ� 1�� �ƴ� ��츦 array[0] != 8 || array[0] != 1 �̷��� ������ �� ������ �� ������ � ���� �͵�(1�� 8�� �͵�) ������ ���̴�.
		}										// ���� ��� array[0] = 8�̶�� �� �� if���� false || true --> true �̷��� �ȴ�.
		
		else {
			
			/* ������Ͱ� �ٽ��ڵ� --> ���� if~ else�� ���� �ʾƵ� �� */
			for(int j=0; j<7; j++) {	// (1,2), (2,3), ..., (7,8) �̷��� 7�� ��
				if(array[j+1] == array[j] + 1) {	// ���������� ���
					if(asc_chk != j) {		// �������� üũ���� �ݺ����� ���� ���ƾ߸� ascending -> �׷��� ������ ��� mixed
						System.out.print("mixed");
						break;
					}
					asc_chk += 1;	// �ش� ������ ���谡 +1�� ������ asc_chk�� +1
				}
				else if(array[j+1] == array[j] - 1) {	// ���������� ���
					if(desc_chk != j) {		// �������� üũ���� �ݺ����� ���� ���ƾ߸� descending -> �׷��� ������ ��� mixed
						System.out.print("mixed");
						break;
					}
					desc_chk += 1;	// �ش� ������ ���谡 +1�� ������ asc_chk�� +1
				}
				else {
					System.out.print("mixed");
					break;
				}
			}
			if(asc_chk == 7) {		// �������� üũ���� �ݺ����� ���� ���ƾ߸� ascending --> �ݺ����� ��(7��)
				System.out.print("ascending");
			}
			else if(desc_chk == 7) {	// �������� üũ���� �ݺ����� ���� ���ƾ߸� descending --> �ݺ����� ��(7��)
				System.out.print("descending");
			}
			
		}
		scan.close();	// Scanner �ݱ�
	}
}



/* Ǯ�� 2 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[8];	// �Է°��� 8���� ������ �����Ƿ�
		String output = null;		// ��°����� ��� ������ ���� üũ
		
		for(int i=0; i<8; i++) {	// �Է°��� 8���� ������ �����Ƿ�
			int input = scan.nextInt();
			array[i] = input;
		}
		scan.close();

		for(int j=0; j<7; j++) {	// (1,2), (2,3), ..., (7,8) �̷��� 7�� ��
			if(array[j+1] == array[j] + 1) {	// ���������� ���
				output = "ascending";
			}
			else if(array[j+1] == array[j] - 1) {	// ���������� ���
				output = "descending";
			}
			else {
				output = "mixed";
				break;
			}
		}
		System.out.print(output);
	}

}
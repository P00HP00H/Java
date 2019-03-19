/* 풀이 1 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[8];		// 입력값이 8개로 정해져 있으므로
		int asc_chk = 0, desc_chk = 0;	// ascending, descending이 나오려면 각 숫자들이 모두 일정한 규칙을 가져야 하기 때문에 각 숫자들의 관계를 체크  
		
		for(int i=0; i<8; i++) {		// 입력값이 8개로 정해져 있으므로
			int input = scan.nextInt();
			array[i] = input;
		}
		
		if(array[0] != 8 && array[0] != 1) {	// 첫 숫자가 8 또는 1이 아닌 경우 mixed -> 이 if문 사실 필요 없지만 첫 숫자만 보고 ascending인지 descending인지 mixed인지 어느정도 판단이 가능해서 판단이 되는 경우 굳이 뒷부분까지 계산하지 말란 뜻에서 넣어봄
			System.out.print("mixed");			// if문 조건에서 8 또는 1이 아닌 경우를 array[0] != 8 || array[0] != 1 이렇게 생각할 수 있지만 저 조건은 어떤 수가 와도(1과 8이 와도) 무조건 참이다.
		}										// 예를 들어 array[0] = 8이라고 할 때 if문은 false || true --> true 이렇게 된다.
		
		else {
			
			/* 여기부터가 핵심코드 --> 위에 if~ else로 하지 않아도 됨 */
			for(int j=0; j<7; j++) {	// (1,2), (2,3), ..., (7,8) 이렇게 7번 비교
				if(array[j+1] == array[j] + 1) {	// 오름차순의 경우
					if(asc_chk != j) {		// 오름차순 체크값이 반복문의 수와 같아야만 ascending -> 그렇지 않으면 모두 mixed
						System.out.print("mixed");
						break;
					}
					asc_chk += 1;	// 해당 숫자의 관계가 +1일 때마다 asc_chk를 +1
				}
				else if(array[j+1] == array[j] - 1) {	// 내림차순의 경우
					if(desc_chk != j) {		// 내림차순 체크값이 반복문의 수와 같아야만 descending -> 그렇지 않으면 모두 mixed
						System.out.print("mixed");
						break;
					}
					desc_chk += 1;	// 해당 숫자의 관계가 +1일 때마다 asc_chk를 +1
				}
				else {
					System.out.print("mixed");
					break;
				}
			}
			if(asc_chk == 7) {		// 오름차순 체크값이 반복문의 수와 같아야만 ascending --> 반복문의 수(7개)
				System.out.print("ascending");
			}
			else if(desc_chk == 7) {	// 내림차순 체크값이 반복문의 수와 같아야만 descending --> 반복문의 수(7개)
				System.out.print("descending");
			}
			
		}
		scan.close();	// Scanner 닫기
	}
}



/* 풀이 2 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[8];	// 입력값이 8개로 정해져 있으므로
		String output = null;		// 출력값으로 계속 값들의 관계 체크
		
		for(int i=0; i<8; i++) {	// 입력값이 8개로 정해져 있으므로
			int input = scan.nextInt();
			array[i] = input;
		}
		scan.close();

		for(int j=0; j<7; j++) {	// (1,2), (2,3), ..., (7,8) 이렇게 7번 비교
			if(array[j+1] == array[j] + 1) {	// 오름차순의 경우
				output = "ascending";
			}
			else if(array[j+1] == array[j] - 1) {	// 내림차순의 경우
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
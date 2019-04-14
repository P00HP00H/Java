// 풀이 1
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();	// ArrayList 이용
		int case_num = scan.nextInt();		// case 수
		for(int i=0; i<case_num; i++) {
			int input = scan.nextInt();		// 숫자 입력
			String input2 = scan.next();	// 해당 숫자에 맞춰 문자 입력
			for(int j=0; j<input2.length(); j++) {
				for(int k=0; k<input; k++) {
					array.add(input2.substring(j,j+1));		// 문자열 하나씩 잘라서 input갯수만큼 ArrayList에 넣기
				}
			}
			for(String data: array) {	// ArrayList 문자열 형태로 보여주기
				System.out.print(data);
			}
			/*
			
			// 위 대신 이렇게 써도 됨  
			for(int k=0; k<array.size(); k++) {		// ArrayList 요소 하나씩 출력해서 보여주기 -> ArrayList는 length()가 아닌 size()를 사용
				System.out.print(array.get(k));		// 배열이면 array[k] 이렇게 쓰지만 ArrayList는 ArrayList.get(k)
			}
			 
			*/
			System.out.println();
			array.clear();		// ArrayList 초기화
		}
		scan.close();
	}
}



// 풀이 2
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int case_num = scan.nextInt();		// case 수
		String input2[] = new String[case_num];		// 문자열 담을 공간
		int input[] = new int[case_num];			// 숫자 담을 공간
		for (int i = 0; i < case_num; i++) {
			input[i] = scan.nextInt();		// 숫자 입력
			input2[i] = scan.next();		// 문자열 입력
		}
		scan.close();
		for (int j=0; j<case_num; j++) {
			char[] output = input2[j].toCharArray();	// 문자열을 char배열에 담기
			for (int k=0; k<output.length; k++) {
				for (int l=0; l<input[j]; l++) {	// 입력한 숫자(문자 갯수)만큼 문자 출력 
					System.out.print(output[k]);
				}
			}
			System.out.println();
		}
	}
}
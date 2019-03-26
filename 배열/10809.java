import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();		// 문자열 입력
		String input_array[] = new String[input.length()];	// 입력한 문자열을 한 문자씩 넣기 위한 배열
		scan.close();		// Scanner 닫기
		
		String abc = "abcdefghijklmnopqrstuvwxyz";	// a~z
		int output[] = new int[abc.length()];		// 출력은 각각의 알파벳(a~z)에 대한 변화 여부이므로 배열크기는 a~z의 갯수
		
		for(int i=0; i<input.length(); i++) {		// 입력한 문자열을 한 문자씩 잘라 배열에 저장
			input_array[i] = input.substring(i, i+1);
		}
		
		for(int i=0; i<abc.length(); i++) {		// a~z 갯수만큼 -1 저장
			output[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			if(output[abc.indexOf(input_array[i])] == -1) {		// output[입력 문자 위치]이 -1이 아니면 이미 해당 문자가 나왔다는 의미이므로 초기에 바뀐 값 유지
				output[abc.indexOf(input_array[i])] = i;
			}
		}
		
		for(int i=0; i<abc.length(); i++) {		// 출력
			System.out.print(output[i]);
			System.out.print(" ");
		}	
	}

}
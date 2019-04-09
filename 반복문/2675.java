import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> array = new ArrayList<String>();
		int case_num = scan.nextInt();
		for(int i=0; i<case_num; i++) {
			int input = scan.nextInt();			// 숫자 입력
			String input2 = scan.nextLine();	// 해당 숫자에 맞춰 문자 입력
			for(int j=0; j<input2.length(); j++) {
				for(int k=0; k<input; k++) {
					array.add(input2.substring(j,j+1));
				}
			}
			for(int l=0; l<input2.length(); l++) {
				array.remove(0);
			}
			for(String data: array) {
				System.out.print(data);
			}
			System.out.println();
			array.clear();
		}
		scan.close();
	}
}
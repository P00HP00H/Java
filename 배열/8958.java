import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();		// Case 갯수
		int[] output = new int[input];	// 한 번에 출력하기 위함
		
		for(int i=0; i<input; i++) {	// Case 갯수만큼 반복
			int score = 0;		// 점수
			int O_chk = 0;		// O가 연속된 경우 O의 갯수를 체크
			String ox = scan.next();		// O,X 입력
			String[] array = ox.split("");	// 들어온 O,X 입력값을 하나씩 배열에 저장

			/* O가 연속된 경우 한 예로 OOO를 보면 1+2+3=6인데 사실은 (1)+(1+1)+(2+1), 즉, 각 O는 "O의 갯수+1"인 것이다. */
			
			for(int j=0; j<ox.length(); j++) {
				if(array[j].equals("O")) {		// 값이 O인 경우
					if(j > 0) {				// j=0(첫번째값)인 경우 이전값이 없으므로 제외
						if(array[j-1].equals("O")) {	// 이전값이 O인 경우 O가 연속된 것이므로 +"O의 갯수"
							score += O_chk;
						}
					}
					O_chk += 1;
					score += 1;
				}
				else {			// 값이 X인 경우 O의 갯수 초기화
					O_chk = 0;
				}
			}
			output[i] = score;
		}
		scan.close();		// Scanner 닫기
		for(int k=0; k<input; k++) {		// 출력
			System.out.println(output[k]);
		}
		
	}
}
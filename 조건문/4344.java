import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		int num3 = 0;
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=0; i<input; i++) {
			int num = scan.nextInt();
			for(int j=0; j<num; j++) {
				int num2 = scan.nextInt();
				num3 += num2;
			}
			double num4 = num3 / num;
			System.out.println("ЦђБе: "+num4);
		}
	}
}
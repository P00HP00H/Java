import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String array[] = new String[input.length()];
		
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String abc_array[] = new String[abc.length()];
		int abc_chk[] = new int[abc.length()];
		
		
		for(int i=0; i<input.length(); i++) {
			array[i] = input.substring(i, i+1);
		}
		for(int i=0; i<abc.length(); i++) {
			abc_array[i] = abc.substring(i, i+1);
		}
		for(int i=0; i<abc.length(); i++) {
			abc_chk[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			if(i == 0) {
				abc_chk[abc.indexOf(array[i])] = i;
			}
			else if(i > 0 && !array[i].equals(array[i-1])){
					abc_chk[abc.indexOf(array[i])] = i;
			}

		}
		
		for(int i=0; i<abc.length(); i++) {
			System.out.print(abc_chk[i]);
			System.out.print(" ");
		}
	}
}
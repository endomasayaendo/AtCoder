import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strArr = str.split(" ");
		int N = Integer.parseInt(strArr[0]);
		int M = Integer.parseInt(strArr[1]);
		int half = 0;
		
		if (N % 2 == 1) {
			half = (N + 1) / 2;
		}else {
			half = N / 2;
		}							


		if (M <= half) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}
		
		
		
	}

}

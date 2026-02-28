import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='i' ||  str.charAt(i) == 'j') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}

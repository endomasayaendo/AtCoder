import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        long Q = scan.nextLong();
		long sound = 0;
		boolean stop = true;
		
		
		for (long i=0; i<Q; i++) {
			//Ai取得
			int A = scan.nextInt();

			//操作
			if (A == 1) {
				sound++;
			} else if (A == 2) {
				if (sound > 0) {
					sound--;
				} else if (sound == 0) {
				}
			} else if (A == 3) {
				if (stop == true) {
					stop = false;
				} else {
					stop = true;
				}
			}

			//判定
			if (sound >= 3 && stop == false) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
		
	}

}

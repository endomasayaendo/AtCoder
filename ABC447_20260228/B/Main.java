import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
		String[] str = input.split("");
		List<String> wrk = new ArrayList<>();
		int count = 0;
		Map<String,Integer> map = new LinkedHashMap<>();
		
		for (int i=0; i<str.length; i++) {
			//重複した
			if (wrk.contains(str[i])) {
				int tmp = map.get(str[i]);
				map.put(str[i], tmp + 1);
			} else {
				wrk.add(str[i]);
				map.put(str[i], 1);
				
			}
			
		}

		//map内評価
		int max = 0;
		List<String> removeTgt = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				removeTgt.clear();
				max = entry.getValue();
				removeTgt.add(entry.getKey());
			} else if (entry.getValue() == max) {
				removeTgt.add(entry.getKey());
			}
		}

		//削除
		String ans = input;
		for (String s : removeTgt) {
			ans =  ans.replace(s, "");
		}

		
		System.out.println(ans);
	}

}

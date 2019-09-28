import java.io.*;
import java.util.*;

public class CandidateCode {

	public static void main(String args[]) throws Exception {
		runTest(args);
	}

	public static void runTest(String args[]) {

		String result = "";
		List<String> tokens = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			tokens.add(scanner.next());
		}
		// System.out.println(tokens);
		scanner.close();
		// System.out.println("length" + tokens);
		String[] arr = new String[tokens.size()];
		// ArrayList to Array Conversion
		for (int i = 0; i < tokens.size(); i++)
			arr[i] = tokens.get(i);
		for (String x : arr) {
		}
		// System.out.print(x + " ");
		// Write code here
		if (arr.length > 0) {
			String numTestCase = arr[0];
			int counter = Integer.parseInt(numTestCase);
			int j = 0;
			// System.out.println(counter);
			for (int i = 0; i < counter; i++) {
				boolean flag = true, finalflag = true;
				String noOfPlayerPlusVilion = arr[++j];
				int num = Integer.parseInt(noOfPlayerPlusVilion);
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				for (int w = 1; w <= num; w++) {
					++j;
					list1.add(Integer.parseInt(arr[j]));
					;
				}
				for (int w = 1; w <= num; w++) {
					++j;
					list2.add(Integer.parseInt(arr[j]));
					;
				}
				Collections.sort(list1, Collections.reverseOrder());
				Collections.sort(list2, Collections.reverseOrder());
				for (int k = 0; k < list1.size(); k++) {
					if (flag) {
						int val = list1.get(k);
						Iterator<Integer> itr = list2.iterator();
						while (itr.hasNext()) {
							int val2 = itr.next();
							if (val < val2) {
								flag = true;
								itr.remove();
								break;
							} else {
								flag = false;
								break;
							}
						}
						finalflag = true;
					} else {
						finalflag = false;
					}
				}

				if (finalflag) {
					result = "WIN";
				} else {
					result = "LOSE";
				}
				System.out.println(result);

			}

		}
	}

}
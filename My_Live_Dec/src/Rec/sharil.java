package Rec;

public class sharil {
	static void stair(int n, ArrayList<Integer> ans, int no) {
		if (n == 0) {
			int sum = 0;
			for (int i = 0; i < ans.size(); i++)
				sum += ans.get(i);
			if (sum == no) {

				System.out.print(ans + ",");
				ans.clear();
				return;
			}

			else {
				ans.clear();

				return;
			}

		}
		// starts from 1
		if (n >= 1) {
			ans.add(1);
			stair(n - 1, ans, no);
		}
		// starts from 2
		if (n >= 2) {
			ans.add(2);
			stair(n - 2, ans, no);
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		stair(5, ans, 5);
	}

}

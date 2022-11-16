package programmers;

public class Quiz12919 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String[] seoul = { "Jane", "Kim" };
		// 결과 : 김서방은 1에 있다.
		System.out.println(s.solution3(seoul));
	}

	static class Solution3 {
		public String solution3(String[] seoul) {
			String answer = "";
			int cnt = 0;
			for (int i = 0; i < seoul.length; i++) {
				if (seoul[i].equals("Kim")) {
					cnt = i;
					break;
				}

			}
			answer = "김서방은 " + cnt + "에 있다";
			return answer;
		}
	}
}
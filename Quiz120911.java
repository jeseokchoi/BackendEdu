package 프로그래머스;

import java.util.Arrays;

public class Quiz120911 {
	public static void main(String[] args) {

		Solution sol = new Solution();
		

		System.out.println(sol.solution("Bcad"));// 229376

	}

}

class Solution {
	public String solution(String my_string) {
		String answer = "";

		my_string = my_string.toLowerCase();
		String[] arr = my_string.split("");
		Arrays.sort(arr);
		
		for(int i = 0 ; i <arr.length; i++) {
		
			answer += arr[i];
			
			
		}

		return answer;
	}
}

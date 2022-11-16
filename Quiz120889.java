package programmers;

import java.util.Arrays;

public class Quiz120889 {
	public static void main(String[] args) {
		
		// int[] sides = {199, 72, 22] => result 1
		
		int[] sides = {199, 72, 22};
		System.out.println(solution(sides));
	}
	
	static int solution(int[] sides) {

		Arrays.sort(sides);
		int answer = sides[2] >= sides[0] + sides[1] ? 2 : 1;
		
		return answer;
	}

}
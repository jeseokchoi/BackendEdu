package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz120833 {
	public static void main(String[] args) {
		// 배열 numbers에서 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 출력하세요.
		
		// 결과 3,8,9
		
		int[] numbers = { 1, 7, 3, 8, 9, 5 };
		int num1 = 2;
		int num2 = 4;
		
		int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
		
		for(int i : answer) {
			System.out.println(i);
		}
		
		
		// 만약 배열로 문제를 풀었다면 list로 한번 더 풀어주세요.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = num1; i <= num2; i++) {
			list.add(numbers[i]);
		}
		list.forEach(System.out::println);
	}
}
package programmers;

import java.util.Arrays;

public class Quiz120833 {
	public static void main(String[] args) {
		// 배열 numbers에서 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 출력하세요.
		// 만약 배열로 문제를 풀었다면 list로 한번 더 풀어주세요.
		int[] numbers = { 1, 7, 3, 8, 9, 5 };
		int num1 = 2;
		int num2 = 4;
		// 결과 3,8,9
	
		// 배열복사 함수 Arrays.copyOfRange()를 이용하여 배열 복사하기
		int[] arr1 = Arrays.copyOfRange(numbers, 2, 5);
		
		// 복사한 배열 출력
		System.out.println(Arrays.toString(arr1));	// [3, 8, 9] 출력
		
		
	}

}
package baekJoon;

import java.util.Scanner;

public class Quiz3052 {

	public static void main(String[] args) {

//		(문제)
//		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
//		(입력)
//		첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		
//      (예제입력 1)
//		1 2 3 4 5 6 7 8 9 10
//		예제 출력 = 10

//		(예제입력 2)
//		42 84 252 420 840 126 42 84 420 126
//		예제 출력 = 1
		
// 		(예제입력 3)
//		39 40 41 42 43 44 82 83 84 85
//		예제 출력 = 6
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {	// 10개 숫자를 입력받 42로 나눈다
			arr[i] =sc.nextInt() % 42;
		}
		for(int i = 0; i < 10; i++) {	// 10개의 중복된 값이 있는지 확인한다
			int tmp = 0;
			for(int j = i + 1; j < 10; j++) {	// i와 j(i+1)를 비교하여 같으면 tmp를 증가시킨다
				if(arr[i] == arr[j]) {
					tmp++;
				}
			}
			if(tmp == 0) {	// i와 j가 값이 같지않을 경우
				count++;	// count에 더해줘서 서로 다른 값이 몇개인지 확인한다
			}

		}
		System.out.println(count);

	}
	

}

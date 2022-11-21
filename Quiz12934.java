package programmers;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12934


// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

// 입출력 예#1
// 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

// 입출력 예#2
// 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

public class Quiz12934 {
	public static void main(String[] args) {
		int n = 121;
    //return : 144;
		Solution12 kim = new Solution12();

    System.out.println(kim.solution12(n));
  }
  static class Solution12 {
	    public long solution12(long n) {
        long answer = 0;
        return answer;
      }
  }
}

package programmers;

//	자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 
//	이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
//			
//	입출력 예 #1
//	답을 도출하는 과정은 다음과 같습니다.
//	n(10진법)	n(3진법)		앞뒤 반전(3진법)	10진법으로 표현
//	45			1200		0021			7
//
// URL : https://school.programmers.co.kr/learn/courses/30/lessons/68935

public class Quiz68935{
	public static void main(String[] args) {
		Solution s= new Solution();
		System.out.println(s.solution(45)); // 7 출력돼야 함
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }
}
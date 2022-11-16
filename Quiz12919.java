package programmers;


// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
// "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
// seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
// 해당 URL : https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Quiz12919 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String[] seoul = {"Jane", "Kim"};
    // 결과 : 김서방은 1에 있다.
		System.out.println(s.solution3(seoul));
	}
  
  static class Solution3 {
		public String solution3(String[] seoul) {
        String answer = "";
        return answer;
    }
}

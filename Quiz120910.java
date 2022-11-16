package programmers;

//어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
//처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를
//return하도록 solution 함수를 완성해주세요.

//입출력의 예시
//n	t	 result
//2	10	2048
//7	15	229,376


public class Quiz120910 {
	public static void main(String[] args) {
		
		System.out.println(solution(7, 15));	// 229376 출력 되어야 함
	}
	
	static int solution(int n, int t) {
	     int answer = n;
	     for(int i = 0; i < t; i++) {
	    	 answer *= 2;
	     }
	     return answer;
	 }
}


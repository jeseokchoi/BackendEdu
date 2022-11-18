package programmers;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12932
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
// 

public class Quiz12932 {
	public static void main(String[] args) {
		long n = 12345; //return : [5,4,3,2,1]
		Solution10 m = new Solution10();
		Solution11 d = new Solution11();
		
		for(int s : m.solution10(n)) {
			System.out.print(s);
		}
		System.out.println();
		
		for(int s : d.solution11(n)) {
			System.out.print(s);
		}
    	static class Solution10 {
	    public int[] solution10(long n) {
        int[] answer = {};
        return answer;
        
        	    }
	  }
		
	}

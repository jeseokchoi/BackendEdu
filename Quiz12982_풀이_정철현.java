package programmers;

// 예산(프로그래머스 Quiz12982)
// 		d		budget	result
// [1,3,2,5,4]	10		4

// d는 각 부서에  필요한 금액이고 10원(budget)은 가지고있는 예산입니다
// 부서에는 무조건 금액에 맞춰 예산을 지급해야 합니다
// 예산으로 최대한 많은 부서에 지급하고 지급한 부서의 개수를 반환하세요
//(keypoint - 부서 순서는 상관없이 최대한 많이 지급)

// URL : https://school.programmers.co.kr/learn/courses/30/lessons/12982

// 이클립스에서 실행할 수 있도록 main 만들어 놓았음

import java.util.Arrays;
public class Quiz12982_풀이_정철현 {
	public static void main(String[] args) {
		Solution s= new Solution();
		int[] d = { 1, 3, 2, 5, 4 };
		System.out.println(s.solution(d, 10)); // 4 출력돼야 함
	}
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 배열 정렬(최대한 많은 부서에 지급하기 위해)
        Arrays.sort(d);
        
        // 인덱스 만큼 예산 차감, answer에 완료된 부서 개수 1씩 추가
        for(int i = 0; i < d.length; i++){
            budget -= d[i];
            answer++;
            if(budget < 0){	// 만약 예산이 -가 된다면, 금방 지급 했던 부서 다시 빼고 break 
                answer--;
                break;
            }
        }
        // 완료된 부서개수 반환
        return answer;
    }
}

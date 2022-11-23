package programmers;

import java.util.Arrays;

public class Quiz42577 {
	public static void main(String[] args) {
		String[] arr = {"119", "97674223", "1195524421"};
		System.out.println(solution(arr));
	}

	public static boolean solution(String[] phone_book) {
		// 1. phone_book을 정렬한다.
        Arrays.sort(phone_book);

        // 2. Loop를 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phone_book.length - 1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        
        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
	}
}

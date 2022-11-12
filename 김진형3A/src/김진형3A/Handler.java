package 김진형3A;

import java.util.ArrayList;
import java.util.List;

public class Handler {
	private List<Member> list = new ArrayList<Member>();

	public void showList() {
		for (Member s : list) {
			s.showInfo();
		}
	}

	public boolean idCheck(String id) {
		boolean check = true;
		for (Member s : list) {
			if (s.getId().equals(id)) {
				return check;
			}
		}
		return false;
	}

	public void insert(Member mem) {
		list.add(mem);
	}

	public Member find(String id) {
		for (Member s : list) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}

	public int delete(Member mem) {
		for (Member s : list) {
			if (s == mem) {
				list.remove(s);
				return 1;
			}
		}
		return 0;
	}

}

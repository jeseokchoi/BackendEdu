package 김진형3A;

public abstract class Member {
	protected String id;
	protected String passward;
	protected String name;

	public Member(String id, String passward, String name) {
		this.id = id;
		this.passward = passward;
		this.name = name;
	}

	public abstract void showInfo();

	public abstract void showDetail();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

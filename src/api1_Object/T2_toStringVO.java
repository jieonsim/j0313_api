package api1_Object;

public class T2_toStringVO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;

	// private 필드의 값을 읽고 쓰는 건 생성자 또는 getter, setter로 가능
	// getter와 setter는 모두 public으로 되어야함

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// source > generate toString 통해 아래 내용이 자동으로 만들어진다.
	// toString 단축키 알트 + s 세번 + 엔터 두번

	public String toString() {
		return "T2_toStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
	}

//	내가 직접 타자로 친 거
//	@Override
//	public String toString() {
//
//		return "VO = [name =" + name + ", age = " + age + ", gender = " + gender + ", job = " + job + ", address = "
//				+ address + "]";
//	}

}

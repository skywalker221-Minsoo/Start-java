package shop;

// ������ �� �� ������ ���� ������ �ͺ���
// ������ �ϳ� ����
// ���� ���� ������ �����ϴ� ���� �� ȿ����/���ϴ�.
public class MemberVO { // ����ȿ� ������� ������ �����д�.
	String id;
	String pw;
	String name;
	String tel;
	
	// ���� �ְ� �� ������ ���� �ϳ��� ����� ó���Ѵ�.
	// �� �������� �ִ� ���, ������ ����� �ʿ��ϴ�.
	// ����� �޼���� ����
	// setters, getters
	// source �޴����� �ڵ� ����
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id; // this : ���������� ������ ��ȼ� �ֱ⿡ ���������� ã���� �����ش�.
					  // this : �� Ŭ���� -> MemberVO
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}

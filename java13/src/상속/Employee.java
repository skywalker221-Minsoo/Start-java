package ���;

public class Employee {
	public String name;
	String address;
	protected int salary;
	protected int rrn;
	
	private void al() {
		System.out.println("�츮ȸ�縸�� �˰���.");
	}
	@Override
	public String toString() {
		al();
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}

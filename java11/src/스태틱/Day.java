package ����ƽ;

public class Day {
	//��������� ��ü���� �� ������ �������� �޸𸮰� �Ҵ��.
	//��ü�� 3�� �����Ǿ��ٸ�, ��ü���� ���� �ٸ� �Ӽ������� ������ �Ѵ�.
	//������ �� ��ü�� �ش��ϴ� ���������� ��ü������ ����Ǵ� Ư¡
	//������ : instance(�ν��Ͻ�), dynamic�̶��� ���Ѵ�.
	//��ü������ ������ ����Ǵ� ���� : �ν��Ͻ� ����
	String hobby;
	int hour;
	String Destination;
	//Static ������ Ŭ������ �Ѱ��� ������ �ִ� ����!(������ȣ ���� ����)
	//Ŭ�����̸�.������
	//��ü�������� ����� ����.
	//static�� ��ü�������� �ʾƵ� ��� ����
	static int count; //��������, 0���� �ʱ�ȭ, ��ü������ �� ������� �ʴ� ����(������ �״�� ��������. �ʱ�ȭ�ȉ�!!)
	static int sum;
	
	//������ ����
	//����Ǵ� ������ : �⺻��(������ primitive), ������(referenced, derived)
	//����� �� �ִ� ���� : ����, ����
	//��ü������ ���� ���� : �ν��Ͻ�, ����ƽ
	
	
	
	public Day(String hobby, int hour, String destination) {
		super();
		sum = sum + hour;
		this.hobby = hobby;
		this.hour = hour;
		Destination = destination;
		count++;
	}

	@Override
	public String toString() {
		return "Day [hobby=" + hobby + ", hour=" + hour + ", Destination=" + Destination + "]";
	}
	
}

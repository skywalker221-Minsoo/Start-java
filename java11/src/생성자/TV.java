package ������;

public class TV {
	int ch;
	int vol;
	boolean onOff;
	
	//������, �Ķ���� �ִ� ������
	//��ü������ �� ����������� �־��ִ� ���
	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	
	//�ٸ� �����ڰ� �ϳ��� ������ �ڵ����� ���������.
	//���������� �⺻�����ڰ� ���ǵȴ�.
	//�Ķ���� ���� ������, �⺻������(default ������)
	//�⺻�����ڴ� �ٸ� �����ڰ� �ϳ��� ������ �ڵ����� ���������.
	//�ϴ� ��ü������ �� ����������� ���߿� �־��ִ� ���
	//�Ķ���� �ִ� ���� ���� ��츦 �Բ� ����ϰ��� �ϴ� ���
	//��������� �⺻�����ڸ� �������־�� �Ѵ�.
	public TV() {
		
	}
	
	public void on() {
		System.out.println("TV�� �Ѵ�.");
	}

	public void off() {
		System.out.println("TV�� ����.");
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
}

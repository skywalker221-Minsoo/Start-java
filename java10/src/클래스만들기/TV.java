package Ŭ���������;

public class TV {
	//�������, ��������(�۷ι�����)
	//���� : ram�� ������ �����Ǵ°�.
	//	      ������ ��ġ�� ������ ����� �� �ִ� ������ ����
	//public ���������ڸ� ��� �ٸ� ��Ű�������� ��� �����ϴ�.
	public int ch;
	public int vol;
	public boolean onOff;
	
	//����޼���
	public void on() {
		System.out.println("TV�� �Ѵ�");
	}

	public void off() {
		System.out.println("TV�� ����");	
	}
	//����� ����, �޼��� ����
	public void changeCh() {
		System.out.println("ä���� �ٲٴ�");
	}
	
	//������ �ִ� �޼��带 ����� ������, ������ �ִ� �޼��带 �Ȱ��� ���ָ� �ȴ�.
	//�������̵�(������)

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}

}
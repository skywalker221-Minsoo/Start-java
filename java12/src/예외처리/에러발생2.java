package ����ó��;

public class �����߻�2 {

	public void call() {
		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.out.println("���� �߻���." + e.getMessage());
			e.printStackTrace();
		}
	}
}

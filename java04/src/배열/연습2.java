package �迭;

public class ����2 {

	public static void main(String[] args) {
		String[] gul = new String[3];
		String total = "�ڹ�,������,JSP"; // ������ �ְ������ �Ѳ�����
		String[] result = total.split(","); // ���� split���� �ɰ�����.
		for (int i = 0; i < result.length; i++) {
			gul[i] = result[i];
			System.out.println(gul[i]);
		}
//		gul[0] = "�ڹ�";
//		gul[1] = "������";
//		gul[2] = "JSP";
//		System.out.println(gul[0] + " ���ٴ� " + gul[1]);
//		for (int j = 0; j < gul.length; j++) {
//			System.out.println(gul[j]);
//		}
	}

}

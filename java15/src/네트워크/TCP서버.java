package ��Ʈ��ũ;

import java.net.ServerSocket;
import java.io.IOException;

public class TCP���� {

	public static void main(String[] args) throws Exception {
		//Ŭ���̾�Ʈ�� ��û�� �������ֱ� ���� ����
		ServerSocket server = new ServerSocket(9000);
		//������ �� ��ǻ�Ϳ��� �ϴϱ� IP�� �Ƚ��൵ �ǰ� ��Ʈ ��ȣ�� �ᵵ �ȴ�.
		
		System.out.println("���� ���� ���۵�.");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
		while (true) {
			server.accept();
			System.out.println("������ Ŭ���̾�Ʈ�� ��û�� ������.");
		}

	}

}

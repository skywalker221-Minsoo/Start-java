package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPŬ���̾�Ʈ {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket("localhost", 9000);
		System.out.println("Ŭ���̾�Ʈ�� 9000�� ��Ʈ ������ ������ ��û��.");
		
	}

}

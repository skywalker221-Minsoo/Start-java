package Ŭ�������;

import Ŭ���������.TV;

public class TV��� {

	public static void main(String[] args) {
		//���콺�÷��� import ����(f2)
		//�ڵ��ϼ�
		//Ctrl+Shift+o
		TV myTV = new TV();
		//yourTV.on(); : �������� ���� yourTV������ ����ؼ� ����!
		myTV.ch = 7;
		myTV.vol = 9;
		myTV.onOff = true;
		System.out.println(myTV);
		
		TV yourTV = new TV();
		yourTV.ch = 9;
		yourTV.vol = 12;
		yourTV.onOff = false;
		System.out.println(yourTV);
	}

}

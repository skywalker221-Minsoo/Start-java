package Ŭ�������;

import Ŭ���������.MemberDAO;

public class DAO��� {

   public static void main(String[] args) {
      
	  MemberDAO dao = new MemberDAO();
	  
	  dao.create("apple", "apple");
      dao.create("apple", "apple", "apple");
      dao.create("apple", "apple", "apple", "011");
      dao.delete("apple");
      System.out.println(dao);
   }
}
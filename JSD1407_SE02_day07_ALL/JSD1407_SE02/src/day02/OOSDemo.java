package day02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectOutputStream
 * ��һ���߼���
 * �����Ĺ����ǿ��Խ������Ķ���ת��Ϊ�ֽ�
 * ��д��
 * ���ڶ������л�
 * @author Administrator
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException{
		List<String> list
			= new ArrayList<String>();
		list.add("��ס�ڱ���");
		list.add("����");
		list.add("������Ϣ");
		Person person 
			= new Person(
					"����",22,'��',2000,list);
		
		FileOutputStream fos
			= new FileOutputStream(
											"person.obj");
		
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object o)
		 * ObjectOutputStream�ṩ�ķ���
		 * ���Խ������Ķ���ת��Ϊһ���ֽں�
		 * д��
		 */
		oos.writeObject(person);
		
		System.out.println("���л����");
		oos.close();
	}
}





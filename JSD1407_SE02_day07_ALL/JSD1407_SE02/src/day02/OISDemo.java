package day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream
 * ��һ���߼���
 * �����������ǿ��Խ�һ���ֽ�ת��Ϊ��Ӧ��
 * ����
 * ���ڶ���ķ����л�
 * @author Administrator
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis
			= new FileInputStream(
											"person.obj");
		
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
	}
}




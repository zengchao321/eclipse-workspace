package day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream
 * 是一个高级流
 * 该留的作用是可以将一组字节转换为对应的
 * 对象
 * 用于对象的反序列化
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




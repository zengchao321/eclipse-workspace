package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
					"person.obj","rw");
		/*
		 * д�ַ�����Ӳ���У�Ҫ����������
		 * 1: ���ַ���ת����һ���ֽ�
		 * 2: ��һ���ֽ�д��Ӳ�������ñ���
		 */
		raf.write("���".getBytes());
		/*
		 * дintֵ��Ӳ���У�Ҫ����������
		 * 1: ��intת����һ���ֽ�
		 * 2: ��һ���ֽ�д��Ӳ�������ñ���
		 * 
		 * 1:��һ���ض������ݽṹת��Ϊһ���ֽ�
		 *   �Ĺ��̣���֮Ϊ���л�
		 * 2:������д��Ӳ�������ñ���Ĺ���
		 *   ��֮Ϊ:�־û�  
		 *   
		 * ���л��뷴���л�һ������:
		 * 1:����
		 * 2:����  
		 */
		raf.writeInt(123);
		raf.writeChar('��');
		raf.writeDouble(1231.123);
		
		raf.close();
		
	}

}

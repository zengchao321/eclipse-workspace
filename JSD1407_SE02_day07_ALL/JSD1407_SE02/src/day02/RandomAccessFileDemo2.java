package day02;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * int skipBytes(int n)
 * �÷����᳢������n���ֽڣ�����ֵΪʵ��
 * �������ֽ���
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf
			= new RandomAccessFile(
												"raf.dat","r");		
		//����1���ֽ�
		raf.skipBytes(1);
		int i = raf.readInt();
		System.out.println(i);
		raf.close();
		
	}
}





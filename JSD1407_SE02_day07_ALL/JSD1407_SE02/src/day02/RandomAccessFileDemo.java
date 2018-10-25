package day02;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �鿴RandomAccessFile��ָ��λ��
 * RAF���Ǹ��ݵ�ǰָ����ָ���λ�ý��ж�����
 * д�����ģ�����ÿ�ζ�д��ָ���Զ�����ƶ�
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf
			= new RandomAccessFile(
											"raf.dat","rw");
		/*
		 * long getFilePointer()
		 * ��ȡ��ǰRAF��ָ��λ��
		 */
		long p = raf.getFilePointer();
		System.out.println(p);//0
		
		raf.write(97);//дһ���ֽ�
		
		System.out.println(
						raf.getFilePointer()
						);//1
		
		raf.writeInt(1);//����д4���ֽ�
		System.out.println(
				raf.getFilePointer()
				);//5
		
		/*
		 * ������ļ���ĳ���ط���ȡ�ֽ�
		 * ��Ҫ�Ƚ�ָ���ƶ������λ��
		 * void seek(long position)
		 */
		raf.seek(0);
		//ͨ��raf��ȡһ���ֽ�
		int n = raf.read();
		System.out.println(n);
		System.out.println(
				raf.getFilePointer()
				);//1
		raf.close();
	}
}




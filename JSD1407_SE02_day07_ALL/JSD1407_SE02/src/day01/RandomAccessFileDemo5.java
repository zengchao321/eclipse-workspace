package day01;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * ��ȡһ���ֽ����������
 * @author Administrator
 *
 */
public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException{
			RandomAccessFile raf
				= new RandomAccessFile(
										"test.txt","r");
			
			/*
			 * int read(byte[] buf)
			 * һ�γ��Դ��ļ��ж�ȡbuf����length
			 * ���ֽڲ��Ӹ�����ĵ�һ��λ�ô���
			 * ���ʵ�ʶ�ȡ�����ֽڡ�
			 * ����ֵΪʵ�ʶ�ȡ�����ֽ���
			 */
			byte[] buf = new byte[50];
			int len = raf.read(buf);
			System.out.println(len);
			System.out.println(
					Arrays.toString(buf)
			);			
			/*
			 * ���ֽ�����ת��Ϊ��Ӧ���ַ���
			 * 
			 */
			String str = new String(buf,"GBK");
			System.out.println(str.trim());
			raf.close();
	}
}







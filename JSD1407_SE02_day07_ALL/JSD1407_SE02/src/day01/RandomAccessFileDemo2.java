package day01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
			RandomAccessFile raf
				= new RandomAccessFile(
										"demo.dat","r");
			/*
			 * �ӵ�ǰ�ļ��ж�ȡ��һ���ֽڡ�
			 * �����ֽڴ��뷵�ص�intֵ��
			 * intֵ"�Ͱ�λ"��Ч
			 * 
			 * ������ֵΪ-1,��˵����ȡ����
			 * �ļ���ĩβ 
			 * EOF  end of file
			 */
			int i = raf.read();
			
			System.out.println(i);
			
			//�ٶ�ȡһ���ֽ�
			i = raf.read();
			System.out.println(i);
			
			//�ٶ�ȡһ���ֽ�
			i = raf.read();
			System.out.println(i);
			raf.close();
	}
}




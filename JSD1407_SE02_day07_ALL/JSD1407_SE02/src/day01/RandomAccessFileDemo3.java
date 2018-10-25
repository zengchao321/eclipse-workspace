package day01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RandomAccessFile��ɸ��Ʋ���
 * @author Administrator
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException{		
		/*
		 * 1:����һ��RandomAccessFile���ڶ�ȡ
		 *   �����Ƶ��ļ�
		 * 2:����һ��RandomAccessFile���ڽ�
		 *   ԭ�ļ���������д����ļ�
		 * 3:ѭ����ԭ�ļ��ж�ȡÿһ���ֽڲ�
		 *   д��Ŀ���ļ���
		 * 4:�ر�����RandomAccessFile      
		 */
		long start = System.currentTimeMillis();
		//1
		RandomAccessFile src
			= new RandomAccessFile(
											"src.jpg","r");	
		//2
		RandomAccessFile des
			= new RandomAccessFile(
											"copy.jpg","rw");	
		//3
		int d = -1;
		while( (d = src.read()) != -1 ){
			des.write(d);
		}
		
		//4
		System.out.println("�������");
		src.close();
		des.close();
		long end = System.currentTimeMillis();
		System.out.println(
								"��ʱ:"+(end-start)+"ms");
	}
}










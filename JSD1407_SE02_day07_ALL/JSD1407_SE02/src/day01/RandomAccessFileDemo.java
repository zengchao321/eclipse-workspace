package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile���ڶ�д�ļ����ݵ���
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		/*
		 *	����Ŀ��Ŀ¼��һ����Ϊdemo.dat
		 *  ���ļ����ݽ��ж�д 
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
						 				"demo.dat","rw");
		
//		File file = new File("demo.dat");
//		RandomAccessFile raf2
//			= new RandomAccessFile(
//					 				file,"rw");
		/*
		 * void write(int n)
		 * д������intֵ��"��8λ"
		 * ֻд1���ֽ�
		 * 00000000 00000000 00000000 00000001
		 * 
		 * 1:��֪���Ҳ�֪��
		 * 2:֪�����Ҳ�֪��
		 * 3:֪������֪����
		 * 4:��֪����֪����
		 * 000 ...  00000000 11111111
		 */
		raf.write(1);	
		raf.write(97);	
		raf.write(-1);	
		/*
		 * ʹ��IO��һ��Ҫ�ǵùر�
		 */
		raf.close();
	}
}





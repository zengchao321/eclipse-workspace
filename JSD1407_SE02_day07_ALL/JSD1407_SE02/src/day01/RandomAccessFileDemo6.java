package day01;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ڻ�����ʽ�����ļ�
 * @author Administrator
 *
 */
public class RandomAccessFileDemo6 {
	public static void main(String[] args) throws IOException{
			RandomAccessFile src
				= new RandomAccessFile(
						"src.jpg","r"
				);		
			RandomAccessFile des
				= new RandomAccessFile(
					"copy.jpg","rw"
				);
			long start = System.currentTimeMillis();
			byte[] buf = new byte[1024*10];
			int len = -1;
			/*
			 * int read(byte[] buf)
			 * ������ֵΪ-1,��ʾû�����ݿɶ���
			 * EOF
			 */
			while((len = src.read(buf))!=-1){
				/*
				 * void write(
				 * 	byte[] b,int offset,int len
				 * )
				 * �÷����������ǽ��������ֽ�������
				 * offset����ʼ������len���ֽ�д��
				 */
					des.write(buf,0,len);
			}
			long end = System.currentTimeMillis();
			System.out.println("��ʱ:"+(end-start));
			src.close();
			des.close();
	}
}



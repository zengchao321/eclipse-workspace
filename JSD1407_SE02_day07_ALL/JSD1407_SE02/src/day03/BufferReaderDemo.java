package day03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader
 * �����ַ�������
 * ��������Ϊ��λ��ȡ�ַ���
 * @author Administrator
 *
 */
public class BufferReaderDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis
			= new FileInputStream("pw.txt");		
		InputStreamReader isr
			= new InputStreamReader(
												fis,"UTF-8");		
		BufferedReader br
			= new BufferedReader(isr);
		/*
		 * String readLine()
		 * һ�ζ�ȡһ���ַ������÷������ж�
		 * ��ȡ�����з�Ϊֹ����֮ǰ��һ��
		 * �ַ�������
		 * ���÷������ص��ַ���Ϊnull��˵��
		 * û�����ݿɶ��ˡ�
		 */
		String str = null;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}
}




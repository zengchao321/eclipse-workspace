package day03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * PrintWriter
 * �����ַ�������������Զ���ˢ��
 * ��������Ϊ��λд���ַ���
 * @author Administrator
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos
			= new FileOutputStream("pw.txt");
		
		OutputStreamWriter osw
			=	new OutputStreamWriter(
													fos,"UTF-8");
		/*
		 * ���������Զ���ˢ�µ�PrintWriter
		 * ��ÿ������ʹ��println����д��
		 * �ַ����󣬶����Զ�flush
		 * ��һ��Ҫ����������ɻ�����д������
		 *             ������д��Ч��
		 */
		PrintWriter pw
			= new PrintWriter(osw,true);
		
		pw.println("�Ұ������찲��");
		
		pw.println("��ʹ��˫�ڹ�");

		pw.close();
	}
}




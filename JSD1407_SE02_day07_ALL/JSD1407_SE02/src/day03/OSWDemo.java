package day03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter
 * �ַ�����������ַ�Ϊ��λд������
 * 
 * �ַ���ֻ���ڶ�д�ַ�����
 * @author Administrator
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * ���ļ���д���ı�����(д�ַ���)
		 * 1:���ļ���д����(FileOutputStream)
		 * 2:д�����ı�����()
		 */
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		//ʹ���ַ��������ֽ���	
		/*
		 * OutputStreamWriter���ص���
		 * ���Խ��������ַ��������ض���
		 * �ַ���ת��Ϊ�ֽں�д��
		 * ʹ�ù��췽����
		 * OutputStreamWriter(
		 * 	OutputStream out,String charsetName);
		 * 
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		
		//�����Ϳ���ֱ��д�ַ�����
		osw.write("��Һò�����ĺ�");
		
		osw.write("�Ǻ�");
		
		osw.close();
		
	}
}






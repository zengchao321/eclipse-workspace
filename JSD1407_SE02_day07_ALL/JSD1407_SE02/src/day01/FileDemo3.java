package day01;

import java.io.File;
import java.io.IOException;

/**
 * �����༶Ŀ¼�µ�һ���ļ�
 * @author Administrator
 *
 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException{		
		File file = new File(
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"e"+File.separator+
				"f"+File.separator+
				"g"+File.separator+
				"h.txt"
				);
		/*
		 * �����ļ�ʱ��Ӧ�����жϵ�ǰ�ļ����ڵ�
		 * Ŀ¼�Ƿ���ڣ���Ϊ�������ڣ����׳�
		 * �쳣�ġ�
		 */
		/*
		 * File getParentFile()
		 * ��ȡ��ǰ�ļ���Ŀ¼���ڵĸ�Ŀ¼
		 */
		File parent = file.getParentFile();
		if(!parent.exists()){
			parent.mkdirs();
		}
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��������");
		}
		
	}
}

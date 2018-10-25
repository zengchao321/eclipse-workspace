package day07;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * DOM4J��XPATH��֧��
 * @author Administrator
 *
 */
public class XMLDemo3 {
	public static void main(String[] args){
		try{
			//��ȡxml�ļ�ת��ΪDocument
			SAXReader reader
				= new SAXReader();
			
			Document doc 
					= reader.read(
							new File("myemp.xml")
						);
			String path 
				= "/list/emp[gender='Ů']" +
					"/salary[.>4000]";
			/*
			 * List selectNodes(String xpath)
			 * ���ݸ�����XPATH��ѯ��Ӧ�Ľڵ�
			 */
			List list 
				= doc.selectNodes(path);
			for(Object o : list){
				Element e = (Element)o;
				System.out.println(e.getText());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

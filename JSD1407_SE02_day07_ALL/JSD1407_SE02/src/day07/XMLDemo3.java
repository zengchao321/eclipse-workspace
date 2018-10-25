package day07;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * DOM4J对XPATH的支持
 * @author Administrator
 *
 */
public class XMLDemo3 {
	public static void main(String[] args){
		try{
			//读取xml文件转换为Document
			SAXReader reader
				= new SAXReader();
			
			Document doc 
					= reader.read(
							new File("myemp.xml")
						);
			String path 
				= "/list/emp[gender='女']" +
					"/salary[.>4000]";
			/*
			 * List selectNodes(String xpath)
			 * 根据给定的XPATH查询对应的节点
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

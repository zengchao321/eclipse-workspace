package day07;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

/**
 * ʹ��DOMд��һ��XML
 * @author Administrator
 *
 */
public class XMLDemo2 {
	public static void main(String[] args){		
		List<Emp> list
			= new ArrayList<Emp>();
		list.add(
			new Emp(1,"jack",33,"��",5000)
		);
		list.add(
				new Emp(2,"boss",55,"��",55000)
			);
		list.add(
				new Emp(3,"marry",22,"Ů",3500)
			);
		list.add(
				new Emp(4,"kate",25,"Ů",6000)
			);
		list.add(
				new Emp(5,"tom",32,"��",8500)
			);
		
		/*
		 * ����һ��xml�Ļ�������
		 * 1:�����ĵ�����Document
		 * 2:ΪDocument��Ӹ��ڵ�
		 * 3:Ϊ���ڵ��齨��״�ṹ
		 * 4:����XMLWriter
		 * 5:ΪXMLWriterָ��д��Ŀ��
		 * 6:д��xml
		 */
		//1
		//ͨ��DocumentHelper����Document����
		Document doc 
			= DocumentHelper.createDocument();
		
		//2
		/*
		 * Document�ķ���
		 * Element addElement(String name)
		 * �÷����������ĵ�����Ӹ������ֵ�
		 * ��Ԫ�أ����ص�Elementʵ���ͱ�ʾ��
		 * ��Ԫ��
		 * ��Ҫע����ǣ��÷���ֻ�ܵ���һ�Ρ�
		 * ���õڶ��λ��׳��쳣�� 
		 */
		Element root 
				= doc.addElement("list");
		/*
		 * ѭ�����ÿһ��Ա����Ϣ
		 */
		for(Emp e : list){
			/*
			 * Elementͬ��֧�ַ���:
			 * Element addElement(String name)
			 * ��ǰ��ǩ����Ӹ������ֵ��ӱ�ǩ
			 */
			//�����ǩ�����emp��ǩ
			Element emp 
				=	root.addElement("emp");
			
			//��emp��ǩ������ӱ�ǩname
			Element name
				= emp.addElement("name");
			name.addText(e.getName());
			//��emp��ǩ������ӱ�ǩage
			emp.addElement("age")
			.addText(e.getAge()+"");
			emp.addElement("gender")
			.addText(e.getGender());
			emp.addElement("salary")
			.addText(e.getSalary()+"");

			/*
			 * Ϊ��ǩ�������
			 * Element addAttribute(
			 * 		String name,String value
			 * )
			 * Ϊ��ǰ��ǩ��Ӹ��������Լ���Ӧֵ��
			 * ����
			 * ����ֵ��ȻΪ��ǰ��ǩ��
			 * ��������Ŀ���ǿ������������������
			 * �ͺ���StringBuilder��append��
			 * ����ֵЧ�������á�
			 */
			emp.addAttribute("id",e.getId()+"");
			
		}
		
		/*
		 * ���˳�ѭ������ôDocument�е�
		 * �ṹ���Ѿ���������
		 * ��Ҫ����д��Ϊxml
		 */
		try{
			XMLWriter writer
					= new XMLWriter();
			
			FileOutputStream out
				= new FileOutputStream(
											"myemp.xml");
			
			writer.setOutputStream(out);
			/*
			 * ��Document����д�����ļ���
			 * ��ʱ�ὫDocumentת��Ϊxml��ʽ
			 * д���ļ���
			 */
			writer.write(doc);
			
			writer.close();
		}catch(Exception e){
			
		}
	}
}




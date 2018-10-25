package day07;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

/**
 * 使用DOM写出一个XML
 * @author Administrator
 *
 */
public class XMLDemo2 {
	public static void main(String[] args){		
		List<Emp> list
			= new ArrayList<Emp>();
		list.add(
			new Emp(1,"jack",33,"男",5000)
		);
		list.add(
				new Emp(2,"boss",55,"男",55000)
			);
		list.add(
				new Emp(3,"marry",22,"女",3500)
			);
		list.add(
				new Emp(4,"kate",25,"女",6000)
			);
		list.add(
				new Emp(5,"tom",32,"男",8500)
			);
		
		/*
		 * 生成一个xml的基本步骤
		 * 1:创建文档对象Document
		 * 2:为Document添加根节点
		 * 3:为根节点组建树状结构
		 * 4:创建XMLWriter
		 * 5:为XMLWriter指定写出目标
		 * 6:写出xml
		 */
		//1
		//通过DocumentHelper创建Document对象
		Document doc 
			= DocumentHelper.createDocument();
		
		//2
		/*
		 * Document的方法
		 * Element addElement(String name)
		 * 该方法用于向文档中添加给定名字的
		 * 根元素，返回的Element实例就表示该
		 * 根元素
		 * 需要注意的是，该方法只能调用一次。
		 * 调用第二次会抛出异常。 
		 */
		Element root 
				= doc.addElement("list");
		/*
		 * 循环添加每一个员工信息
		 */
		for(Emp e : list){
			/*
			 * Element同样支持方法:
			 * Element addElement(String name)
			 * 向当前标签中添加给定名字的子标签
			 */
			//向根标签中添加emp标签
			Element emp 
				=	root.addElement("emp");
			
			//向emp标签中添加子标签name
			Element name
				= emp.addElement("name");
			name.addText(e.getName());
			//向emp标签中添加子标签age
			emp.addElement("age")
			.addText(e.getAge()+"");
			emp.addElement("gender")
			.addText(e.getGender());
			emp.addElement("salary")
			.addText(e.getSalary()+"");

			/*
			 * 为标签添加属性
			 * Element addAttribute(
			 * 		String name,String value
			 * )
			 * 为当前标签添加给定名字以及对应值的
			 * 属性
			 * 返回值仍然为当前标签。
			 * 这样做的目的是可以连续添加若干属性
			 * 就好像StringBuilder的append的
			 * 返回值效果和作用。
			 */
			emp.addAttribute("id",e.getId()+"");
			
		}
		
		/*
		 * 当退出循环后，那么Document中的
		 * 结构就已经构建完了
		 * 需要将其写出为xml
		 */
		try{
			XMLWriter writer
					= new XMLWriter();
			
			FileOutputStream out
				= new FileOutputStream(
											"myemp.xml");
			
			writer.setOutputStream(out);
			/*
			 * 将Document对象写出到文件中
			 * 这时会将Document转换为xml格式
			 * 写入文件。
			 */
			writer.write(doc);
			
			writer.close();
		}catch(Exception e){
			
		}
	}
}




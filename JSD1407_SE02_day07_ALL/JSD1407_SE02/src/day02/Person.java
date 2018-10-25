package day02;

import java.io.Serializable;
import java.util.List;
/**
 * һ����������ͨ��ObjectOutputStream
 * �������л�����ô�ö��������������ʵ��
 * Serializable�ӿ�
 * �ýӿ�û�ж����κγ��󷽷���ʵ�ָýӿ�
 * �������ڱ�ʶ��ǰ���ʵ�����Ա����л�
 * @author Administrator
 *
 */
public class Person 
							implements Serializable{
	/*
	 * ������������ӻ��޸��ˣ����汾�Ų���
	 * ��ô�����л�ʱ�ᾡ���ܼ������а汾
	 * ���汾�ŷ����˸ı䣬��ô�����л�ʱ��
	 * �׳��쳣��
	 */
	private static final long 
						serialVersionUID = 1L;
	private String name;
	private int age;
	private char gender;
	private double comm;
	private List<String> otherInfo;
	
	public String toString(){
		return name+","+age+","+gender+","
		       +comm+","+otherInfo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public Person(String name, int age, char gender, double comm,
			List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.comm = comm;
		this.otherInfo = otherInfo;
	}
	
}

package day02;

import java.io.Serializable;
import java.util.List;
/**
 * 一个对象若想通过ObjectOutputStream
 * 进行序列化，那么该对象所属的类必须实现
 * Serializable接口
 * 该接口没有定义任何抽象方法，实现该接口
 * 仅仅用于标识当前类的实例可以被序列化
 * @author Administrator
 *
 */
public class Person 
							implements Serializable{
	/*
	 * 当类的属性增加或修改了，若版本号不变
	 * 那么反序列化时会尽可能兼容现有版本
	 * 若版本号发生了改变，那么反序列化时会
	 * 抛出异常。
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

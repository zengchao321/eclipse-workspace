package day07;
/**
 * ������������emp.xml�ļ��б�ʾ��Ա��
 * @author Administrator
 *
 */
public class Emp {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	
	public Emp(int id, String name, int age, String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	/**
	 * �޲εĹ��췽��:
	 * ������û�ж��幹�췽��ʱ�����������Զ�
	 * ���������һ��Ĭ�ϵĹ��췽����
	 * Ĭ�Ϲ��췽��:
	 * �޲�������û���κ�ʵ�ִ��롣���¡�
	 * �����Ƕ�����κι��췽��������������Ϊ
	 * ������Ӹ�Ĭ�Ϲ��췽��������Ҫ�����ֶ�
	 * ��д
	 */
	public Emp(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return id+","+name+","+age+","+gender+","+salary;
	}
	
}



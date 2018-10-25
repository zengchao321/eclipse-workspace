package day03;

public class Person {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age)
					throws IllegalAgeException{
		if(age<=0||age>100){
				throw new IllegalAgeException(
												"不是人类的年龄");
		}
		this.age = age;
	}
	public static void main(String[] args){
		Person p = new Person();
		try {
			p.setAge(50);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
	}
}

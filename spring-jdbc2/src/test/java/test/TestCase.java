package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmpDAO;
import entity.Emp;

public class TestCase {
	@Test
	public void test1() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext();
		EmpDAO dao =
				ac.getBean("empDAO",EmpDAO.class);
		Emp emp = new Emp();
		emp.setName("king");
		emp.setAge(new Double(22));
		dao.save(emp);
	}
}

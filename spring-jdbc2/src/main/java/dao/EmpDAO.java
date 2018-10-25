package dao;


import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import entity.Emp;

@Repository("empDAO")
public class EmpDAO {
	@Resource(name="jt")
	private JdbcTemplate template;
	public void save(Emp emp) {
		String sql = "INSERT INTO emp "
				+"VALUES(emp_seq.nextval,?,?)";
		Object[] args = 
				new Object[] {
						emp.getAge(),emp.getName()
				};
		template.update(sql,args);
				
	}
}

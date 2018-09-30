package day930.dao;

import java.util.List;

import day930.entity.Employee;

/**
  *  底层增删改查
 * @author JF-001
 *
 */
public interface LeaderDao {
	
	//登录
	boolean login();
	//员工添加
	List<Employee> addEmployee(Employee employee);
	
}

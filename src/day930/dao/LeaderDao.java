package day930.dao;

import java.util.List;

import day930.entity.Employee;

/**
  *  �ײ���ɾ�Ĳ�
 * @author JF-001
 *
 */
public interface LeaderDao {
	
	//��¼
	boolean login();
	//Ա�����
	List<Employee> addEmployee(Employee employee);
	
}

package com.iris.dao;

import java.util.List;
import com.iris.models.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee e) throws Exception;

    public boolean deleteEmployee(int eid) throws Exception;


    public Employee getEmployeebyId(int eid) throws Exception;

    public boolean validateEmployee(int id,String pass) throws Exception;

    public List<Employee> getAllEmployee() throws Exception;

}

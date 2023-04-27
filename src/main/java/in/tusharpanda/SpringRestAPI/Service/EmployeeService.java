package in.tusharpanda.SpringRestAPI.Service;

import java.util.List;

import in.tusharpanda.SpringRestAPI.Model.Employee;

public interface EmployeeService {
   public List<Employee> getEmployees();
   
   Employee saveEmployee(Employee employee);
   
   Employee getSingleEmployee(Long id);
    
   void deleteEmployee(Long id);
   
   Employee updateEmployee(Employee employee);
}

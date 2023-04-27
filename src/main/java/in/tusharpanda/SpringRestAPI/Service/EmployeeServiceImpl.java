package in.tusharpanda.SpringRestAPI.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tusharpanda.SpringRestAPI.Model.Employee;
import in.tusharpanda.SpringRestAPI.Repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

//	private static List<Employee> al = new ArrayList<Employee>(); 
//	
//	static {
//		Employee e = new Employee();
//		e.setName("Tushar");
//		e.setAge(28L);
//		e.setLocation("India");
//		e.setDepartment("IT");
//		e.setEmail("trp221754@gmail.com");
//		al.add(e);
//		
//		
//		Employee e1 = new Employee();
//		e.setName("Tushar");
//		e.setAge(28L);
//		e.setLocation("India");
//		e.setDepartment("IT");
//		e.setEmail("trp221754@gmail.com");
//		al.add(e1);
//	}
	
	@Autowired
	private EmployeeRepository eRepository;
	
//	@Override
//	public List<Employee> getEmployees() {
//		// TODO Auto-generated method stub
//		return al;
//	}
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return eRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return eRepository.save(employee);
	}

	@Override
	public Employee getSingleEmployee(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = eRepository.findById(id);
		if(employee.isPresent())
		{
			return employee.get();
		}
		throw new RuntimeException("Employee is not found for the id "+ id);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		 eRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return eRepository.save(employee);
	}

}

package in.tusharpanda.SpringRestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.tusharpanda.SpringRestAPI.Model.Employee;
import in.tusharpanda.SpringRestAPI.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
//	@Value("${app.name}")  //Default Value can be set as "${app.name:Employee Tracker System}"
//	private String appName;
//	
//	@Value("${app.version}") //Default Value can be set as "${app.versiob:Version1}"
//	private String appVersion;
//	
//	@GetMapping("/version")
//	public String getAppDetails()
//	{
//		return appName+"-"+appVersion;
//	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return eService.getEmployees();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") Long id)
	{
		return eService.getSingleEmployee(id);
	}
	
	@DeleteMapping("/employees")
	public void deleteEmployee(@RequestParam("id") Long id)
	{
		eService.deleteEmployee(id);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee)
	{
		System.out.println("Details of EMployee Updated is" + id);
		return employee;
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee E)
	{
		return eService.saveEmployee(E);
	}
}

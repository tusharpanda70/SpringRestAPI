package in.tusharpanda.SpringRestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tusharpanda.SpringRestAPI.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
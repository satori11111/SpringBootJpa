package spring.springbootjpa.springbootjpa.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import spring.springbootjpa.springbootjpa.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);

}

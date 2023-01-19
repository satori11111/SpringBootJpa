package spring.springbootjpa.springbootjpa.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.springbootjpa.springbootjpa.DAO.EmployeeRepository;
import spring.springbootjpa.springbootjpa.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override

    public Employee getEmployee(int id) {
        var emp= employeeRepository.findById(id);
        if (emp.isPresent()){
            return emp.get();
        }
        else {
            return null;
        }
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }

}

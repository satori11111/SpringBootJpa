package spring.springbootjpa.springbootjpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.springbootjpa.springbootjpa.entity.Employee;
import spring.springbootjpa.springbootjpa.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> employees=service.getAllEmployees();
        return employees;

    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        service.saveEmployee(employee);
return  employee;

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        service.saveEmployee(employee);
        return  employee;

    }
    @DeleteMapping("/employees/{id}")
    public  String deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);

        return "employee with id="+id+" was deleted";

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployees(@PathVariable int id){
        Employee employee=service.getEmployee(id);

        return employee;

    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> findAllByName(@PathVariable String name){
        return service.findAllByName(name);

    }



}

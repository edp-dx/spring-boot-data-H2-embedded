package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Select, Insert, Delete, Update Operations for an Employee

    @RequestMapping(value = "/employee/{id@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}", method = RequestMethod.GET)
    Employee getEmployee(@PathVariable Integer id){
        return  employeeService.findById(id).get();
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    String addEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.save(employee);
        return "SUCCESS";
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    Employee updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.save(employee);
        return updatedEmployee;
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

    @RequestMapping(value = "/employee", method = RequestMethod.DELETE)
    Map<String, String> deleteEmployee(@RequestParam Integer id){
        Map<String, String> status = new HashMap<>();
        Optional<Employee> employee = employeeService.findById(id);
        if(employee.isPresent()) {
            employeeService.delete(employee.get());
            status.put("Status", "Employee deleted successfully");
        @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}
        else {
            status.put("Status", "Employee not exist");
        @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}
        return status;
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

    // Select, Insert, Delete for List of Employees

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    List<Employee> getAllEmployee(){
        return employeeService.findAll();
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    String addAllEmployees(@RequestBody List<Employee> employeeList){
        employeeService.saveAll(employeeList);
        return "SUCCESS";
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

    @RequestMapping(value = "/employees", method = RequestMethod.DELETE)
    String addAllEmployees(){
        employeeService.deleteAll();
        return "SUCCESS";
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}
@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee){
        Optional<Employee> existingEmployee = employeeService.findById(id);
        if(existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName()); // Update the employee name with the new value
            return employeeService.save(updatedEmployee);
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
}

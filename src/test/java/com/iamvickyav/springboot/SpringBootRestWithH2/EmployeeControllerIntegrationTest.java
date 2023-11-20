package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class EmployeeControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testEmployee()
    {
        assertTrue(
                this.restTemplate
                        .getForObject("http://localhost:" + port + "/employee/1", Employee.class)
                        .getId().equals(1));
    @Test
    public void testUpdateEmployeeById() throws Exception {
        // Create a new employee
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(5000);
        Employee createdEmployee = employeeService.save(employee);

        // Update the employee's name
        createdEmployee.setName("Jane Doe");

        // Send a PUT request to update the employee
        mockMvc.perform(put("/employee/" + createdEmployee.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createdEmployee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Jane Doe")))
                .andExpect(jsonPath("$.salary", is(5000)))
                .andReturn();
    }
}

    @Test
    public void testAllEmployee() {
        assertTrue(
                this.restTemplate
                        .getForObject("http://localhost:" + port + "/employees", List.class).size() == 2);
    @Test
    public void testUpdateEmployeeById() throws Exception {
        // Create a new employee
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(5000);
        Employee createdEmployee = employeeService.save(employee);

        // Update the employee's name
        createdEmployee.setName("Jane Doe");

        // Send a PUT request to update the employee
        mockMvc.perform(put("/employee/" + createdEmployee.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createdEmployee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Jane Doe")))
                .andExpect(jsonPath("$.salary", is(5000)))
                .andReturn();
    }
}
@Test
    public void testUpdateEmployeeById() throws Exception {
        // Create a new employee
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(5000);
        Employee createdEmployee = employeeService.save(employee);

        // Update the employee's name
        createdEmployee.setName("Jane Doe");

        // Send a PUT request to update the employee
        mockMvc.perform(put("/employee/" + createdEmployee.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createdEmployee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Jane Doe")))
                .andExpect(jsonPath("$.salary", is(5000)))
                .andReturn();
    }
}


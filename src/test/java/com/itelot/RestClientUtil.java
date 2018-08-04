package com.itelot;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.itelot.dataload.entity.Employee;


public class RestClientUtil {
    public void getEmployeeByIdDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/user/employee/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Employee> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Employee.class, 1);
        Employee employee = responseEntity.getBody();
        System.out.println("Id:"+employee.getEmployee_id()+", Title:"+employee.getName()
                 +", Category:"+employee.getDesignation());      
    }
    
    
    public static void main(String[] args) {
		RestClientUtil util = new RestClientUtil();
		util.getEmployeeByIdDemo();
	}
}

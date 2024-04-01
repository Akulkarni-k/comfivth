package com.javatpoint;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeService {

        @Autowired
            EmployeeRepository empRepository;        
}

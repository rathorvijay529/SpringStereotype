package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.EmployeeService;

@Controller
@RequestMapping("/basicURL")
public class RestController {
	@Autowired
	private EmployeeService empService;

}

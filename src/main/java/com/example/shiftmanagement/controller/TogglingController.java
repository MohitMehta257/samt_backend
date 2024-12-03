package com.example.shiftmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shiftmanagement.service.TogglingService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/toggle")
public class TogglingController {
	
	@Autowired
	private TogglingService togglingService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/toggleValue")
	public boolean toggleValue()
	{
		return togglingService.toggle();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/currentValue")
	public boolean getCurrentValue()
	{
		return togglingService.getCurrentValue();
	}
}

package com.example.shiftmanagement.service;

import org.springframework.stereotype.Service;

@Service
public class TogglingService {
	
	private boolean toggleValue=false;
	
	public boolean toggle()
	{
		toggleValue=!toggleValue;
		return toggleValue;
	}
	
	public boolean getCurrentValue()
	{
		return toggleValue;
	}

}

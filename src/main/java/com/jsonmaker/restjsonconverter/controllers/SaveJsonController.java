package com.jsonmaker.restjsonconverter.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jsonmaker.restjsonconverter.models.InputData;
import com.jsonmaker.restjsonconverter.services.JsonSaveServices;

@RestController
public class SaveJsonController {
	
	@Autowired
	JsonSaveServices jsonSaveServices;
	
	@RequestMapping(method=RequestMethod.POST, value="/addinput")
	public void addInput(@RequestBody InputData inputData){
		System.out.println(inputData.toString());
		try {
			jsonSaveServices.saveInputData(inputData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

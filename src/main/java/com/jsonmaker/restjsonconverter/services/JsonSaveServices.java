package com.jsonmaker.restjsonconverter.services;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsonmaker.restjsonconverter.models.InputData;

@Component
public class JsonSaveServices {

	public boolean saveInputData(InputData inputData) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(
				new File("input-data.json"), inputData);
		return true;
	}
}

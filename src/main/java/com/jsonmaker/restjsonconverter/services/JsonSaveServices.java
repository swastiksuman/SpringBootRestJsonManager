package com.jsonmaker.restjsonconverter.services;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsonmaker.restjsonconverter.models.InputData;

@Component
public class JsonSaveServices {
	
	public boolean saveInputData(InputData inputData) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("input-data.json"), inputData);
		return true;
		/*objectMapper = new ObjectMapper();
		  try{
		     jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
		     jsonGenerator.writeObject(inputData); 
		     objectMapper.writeValue(System.out, inputData);
		  }catch (IOException e) {
		        e.printStackTrace();
		  }
		  jsonGenerator.flush();
		  jsonGenerator.close();
		return true;*/
	}
}

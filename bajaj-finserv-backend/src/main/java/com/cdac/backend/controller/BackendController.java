package com.cdac.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.backend.RequestDTO;
import com.cdac.backend.ResponseDTO;

@RestController
public class BackendController {

	@PostMapping("bfhl")
	ResponseEntity<ResponseDTO> processArray(@RequestBody RequestDTO data) {
		List<String> alphabets = new ArrayList<>();
		List<String> numbers = new ArrayList<>();
		data.getData().forEach(i -> {
			if (i.matches("[a-zA-Z]+"))
				alphabets.add(i);
			if (i.matches("[0-9]+"))
				numbers.add(i);
		});

		ResponseDTO myDetails = new ResponseDTO(numbers, alphabets);

		return ResponseEntity.ok(myDetails);
	}

}

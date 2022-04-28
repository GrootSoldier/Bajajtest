package com.cdac.backend;

import java.util.List;

public class ResponseDTO {
	private boolean is_true;
	private String user_id;
	private String email;
	private String roll_number;
	private List<String> numbers;
	private List<String> alphabets;

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(List<String> numbers, List<String> alphabets) {
		super();
		this.is_true = true;
		this.user_id = "lokesh_harle_24081997";
		this.email = "harlelokesh@gmail.com";
		this.roll_number = "PD1217";
		this.numbers = numbers;
		this.alphabets = alphabets;
	}

	public boolean isIs_true() {
		return is_true;
	}

	@Override
	public String toString() {
		return "ResponseDTO [is_true=" + is_true + ", user_id=" + user_id + ", email=" + email + ", roll_number="
				+ roll_number + ", numbers=" + numbers + ", alphabets=" + alphabets + "]";
	}

	public void setIs_true(boolean is_true) {
		this.is_true = is_true;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	public List<String> getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(List<String> alphabets) {
		this.alphabets = alphabets;
	}

}

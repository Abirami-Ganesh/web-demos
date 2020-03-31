package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Register;

public class RegisterService {
	private List<Register> list;

	public List<Register> getList() {
		return list;
	}

	public void setList(List<Register> list) {
		this.list = list;
	}

	public Boolean registerEmployee(Register register) {
		System.out.println("Welcome to register service");
		list = new ArrayList<>();
		list.add(register);
		if (list.isEmpty())
			return false;
		return true;
	}

}

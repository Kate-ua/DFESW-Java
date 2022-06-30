package com.qa.genericex;

import java.util.List;

public class GenericEx<T extends Students> {

	private List<T> list;

	public void add(List<T> list) {
		this.list = list;
	}

	public List<T> get() {
		return list;

	}

}

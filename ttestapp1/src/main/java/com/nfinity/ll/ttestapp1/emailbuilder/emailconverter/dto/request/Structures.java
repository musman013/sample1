package com.nfinity.ll.ttestapp1.emailbuilder.emailconverter.dto.request;

public class Structures {

	private String columns = "";

	private Elements elements[][];

	private Options options = new Options();

	private String type = "";

	public Structures() {
	}

	public String getColumns() {
		return columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

	public Elements[][] getElements() {
		return elements;
	}

	public void setElements(Elements[][] elements) {
		this.elements = elements;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

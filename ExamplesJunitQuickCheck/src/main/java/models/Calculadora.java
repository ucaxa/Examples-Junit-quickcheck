package models;

public class Calculadora {

	int valueDisplayed;

	public Calculadora() {
		this.valueDisplayed = 0;
	}

	public void add(int x) {
		this.valueDisplayed += x;
	}

	public int getResult() {
		return this.valueDisplayed;
	}
}

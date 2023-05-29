package org.example;
public class Dado {

	private int cara;

	public Dado(int cara) {
		this.cara = cara;
	}
	public int getCara() {
		return this.cara;
	}

	public static int sumarDados(int num1, int num2){
		Calculadora suma = new Calculadora(num1, num2);
		return suma.Suma();
	}

}
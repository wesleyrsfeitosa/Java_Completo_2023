package exercicios04;

public class CurrencyConverter {
	
	public double quantidadeDolar;
	public double valorDolar;
	
	
	public double valorReais() {
		return valorDolar * quantidadeDolar;
	}
	public double taxa() {
		return valorReais() * 6 / 100;
	}

}

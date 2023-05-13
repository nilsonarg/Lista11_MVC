package model;

public class Model {
	public double dividir(double dividendo, double divisor) throws ArithmeticException {
		if(divisor == 0) {
			throw new ArithmeticException("Não é permitido o número 0 como divisor");
			
		}
		return dividendo / divisor;
	}
}

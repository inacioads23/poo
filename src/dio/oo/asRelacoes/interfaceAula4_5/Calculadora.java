package dio.oo.asRelacoes.interfaceAula4_5;

public class Calculadora implements OperacaoMatematica {

	@Override // Sobrescrita
	public void soma(double n1, double n2) {
		System.out.println("O valor da Soma é: " + (n1 + n2));
	}

	@Override
	public void subtracao(double n1, double n2) {		
			System.out.println("O valor da Subtração é: " + (n1 - n2));
	}

	@Override
	public void multiplicacao(double n1, double n2) {
		System.out.println("O valor da Multiplicação é: " + n1 * n2);
	}

	@Override
	public void divisao(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("Não é possível dividir por 0");
		} else {
			System.out.println("O valor da Divisão é: " + n1 / n2);
		}
	}
}

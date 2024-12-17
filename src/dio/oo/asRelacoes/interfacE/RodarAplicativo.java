package dio.oo.asRelacoes.interfacE;

import java.util.Scanner;

public class RodarAplicativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2;
		Calculadora calc = new Calculadora();
		System.out.print("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		System.out.print("Digite o primeiro valor: ");
		n2 = ler.nextDouble();

		calc.soma(n1, n2);
		calc.subtracao(n1, n2);
		calc.multiplicacao(n1, n2);
		calc.divisao(n1, n2);
	}

}

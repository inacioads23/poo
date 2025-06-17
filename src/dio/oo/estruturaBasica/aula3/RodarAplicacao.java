package dio.oo.estruturaBasica.aula3;

//AULA 03.4
public class RodarAplicacao {

	public static void main(String[] args) {
		// Objeto1
		/* Usando o construtor 1 */
		Carro carro1 = new Carro();

		// [set] vai adicionar os dados
		carro1.setCor("Azul");
		carro1.setModelo("BMW Serie 3");
		carro1.setCapacidadeTanque(59);

		// [get] vai mostrar os valores
		System.out.println("Objeto - Carro 1");
		System.out.println("Modelo do carro: " + carro1.getModelo());
		System.out.println("Cor do carro: " + carro1.getCor());
		System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque() + "lt");
		System.out.printf("Valor do tanque cheio: R$ %.2f%n", carro1.totalValorTanque(6.39)); //método para cálculo

		// Objeto2
		/* Usando o construtor 2 */
		Carro carro2 = new Carro("Cinza", "Mercedez-Benz Class C", 66);

		// [get] vai mostrar os valores
		System.out.println("\nObjeto - Carro 2");
		System.out.println("Modelo do carro: " + carro2.getModelo());
		System.out.println("Cor do carro: " + carro2.getCor());
		System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque() + "lt");
		System.out.printf("Valor do tanque cheio: R$ %.2f", carro2.totalValorTanque(6.46)); //método para cálculo

	}

}

package dio.oo.asRelacoes.heranca.PolimorfismoSobrescrita;

public class RodarAplicativo {

	public static void main(String[] args) {
		//Criei um vetor de Classes
		//vetor ClasseMae[]-> Chamado "classes"  e adcionei os objetos  "ClasseFilha1(), ClasseFilha2(), ClasseMae()"
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		// fiz um foreach
		/* Percorri o objeto e chamei o metodo1 de cada um deles */ 
		//Polimorfismo e sobrescrita
		for (ClasseMae classe: classes) {
			classe.metodo1();
		}
		
		System.out.println("");
		
		// fiz um foreach
		/* Percorri o objeto e chamei o metodo2 de cada um deles */
		//Polimorfismo e sobrescrita
		for (ClasseMae classe: classes) {
			classe.metodo2();
		}
		
		System.out.println("");
		
		//crio um novo objeto
		// Apenas Sobrescrita
		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		classeFilha2.metodo2();

	}

}

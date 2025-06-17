package dio.oo.organizacaoVisibilidadeAulas5.pack1;

public class Classe3 {
	//Criando associação com a Classe1
	Classe1 classe1;

	public void metodo() {
		// Não tem herança
		//-> VARIÁVEIS <-
		// classe1.atributo2; - Visibilidade protected [pertence ao mesmo pacote]
		// classe1.atributo3; - Visibilidade public
		
		//-> MÉTODOS <-
		classe1.metodo2(); // Visibilidade protected [pertence ao mesmo pacote]
		classe1.metodo3(); // Visibilidade public

	}
}

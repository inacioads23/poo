package dio.oo.organizacaoVisibilidadeAulas5.pack1;

//Trabalhando com herança [extends]
public class Classe2 extends Classe1 {

	// Esse método é da própria classe/ local
	public void metodo() {
		//Por extender a Classe1, tem acesso a alguns atributos dessa classe. Ver abaixo 
		
		//-> VARIÁVEIS <-
		//atributo2 - Visibilidade protected
		//atributo3 - Visibilidade public
		
		//-> MÉTODOS <-
		metodo2(); // Visibilidade protected
		metodo3(); // Visibilidade public
	}
}

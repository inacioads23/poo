package dio.oo.organizacaoVisibilidade.outroPack;

// Como está fora do pacote, foi necessário fazer importação
import dio.oo.organizacaoVisibilidade.pack1.Classe1;

public class Classe4 {
	//Criando associação com a Classe1
	Classe1 classe1;
	
	public void metodo() {
		// Não tem herança
		//-> VARIÁVEIS <-
		// classe1.atributo3; - Apenas Visibilidade public
		
		//-> MÉTODOS <-
		classe1.metodo3();// Apenas Visibilidade public
	} 
}

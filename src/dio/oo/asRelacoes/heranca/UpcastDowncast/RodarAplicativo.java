package dio.oo.asRelacoes.heranca.UpcastDowncast;

public class RodarAplicativo {

	public static void main(String[] args) {
		// Apenas criei um objeto da classe
		Funcionario funcionario = new Funcionario();
		
		// Upcast
		// A          a     = new    B
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		
		//Gerente gerente_ = new Funcionario();
		// Downcast -  GERA PROBLEMA DE RELACIONAMENTO.
		// Para ele funcionar não pode haver dados vazios em nenhuma das duas classes
		
		//Gerente gerente_ = new Funcionario();
		//  B      a       =   (B)      new      A
		Vendedor vendedor_ = (Vendedor) new Funcionario(); //é feito Cast ()

	}

}

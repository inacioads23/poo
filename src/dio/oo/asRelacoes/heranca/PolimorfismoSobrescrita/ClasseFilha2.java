package dio.oo.asRelacoes.heranca.PolimorfismoSobrescrita;

public class ClasseFilha2 extends ClasseMae {
	@Override //- Sobreescrita
	public void metodo1() {
		System.out.println("Método 1 da Classe Filha 2");
	}
	
	@Override //- Sobreescrita
	public void metodo2() {
		System.out.println("Método 2 da Classe Filha 2");
	}

}

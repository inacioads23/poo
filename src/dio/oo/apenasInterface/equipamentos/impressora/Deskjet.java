package dio.oo.apenasInterface.equipamentos.impressora;

public class Deskjet implements Impressora {
	
	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO via Deskjet");
	}

}

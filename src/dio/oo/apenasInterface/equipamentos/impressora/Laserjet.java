package dio.oo.apenasInterface.equipamentos.impressora;

public class Laserjet implements Impressora {

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO via Laserjet");
	}

}

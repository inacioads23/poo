package dio.oo.apenasInterface.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO via SCANNER");
	}

}

package dio.oo.apenasInterface.equipamentos.multifuncional;

import dio.oo.apenasInterface.equipamentos.copiadora.Copiadora;
import dio.oo.apenasInterface.equipamentos.digitalizadora.Digitalizadora;
import dio.oo.apenasInterface.equipamentos.impressora.Impressora;

// No java 'a simulação de herança multipla' acontece via interface
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void copiar() {
		System.out.println("COPIANDO via EQUIPAMENTO MULTIFUNCIONAL");		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO via EQUIPAMENTO MULTIFUNCIONAL");		
	}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO via EQUIPAMENTO MULTIFUNCIONAL");		
	}

}

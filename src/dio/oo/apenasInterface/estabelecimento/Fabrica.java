package dio.oo.apenasInterface.estabelecimento;

import dio.oo.apenasInterface.equipamentos.copiadora.Copiadora;
import dio.oo.apenasInterface.equipamentos.copiadora.Xerox;
import dio.oo.apenasInterface.equipamentos.digitalizadora.Digitalizadora;
import dio.oo.apenasInterface.equipamentos.digitalizadora.Scanner;
import dio.oo.apenasInterface.equipamentos.impressora.Deskjet;
import dio.oo.apenasInterface.equipamentos.impressora.Impressora;
import dio.oo.apenasInterface.equipamentos.impressora.Laserjet;
import dio.oo.apenasInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	
	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = new Deskjet();
		impressora.imprimir();
		
		impressora = new Laserjet() ;
		impressora.imprimir();
		
		Copiadora copiadora = new Xerox();
		copiadora.copiar();
		
		Digitalizadora digitalizadora = new Scanner();
		digitalizadora.digitalizar();
		
		// Via Class EquipamentoMultifuncional
		System.out.println("\nVia Class EquipamentoMultifuncional");
		impressora = new EquipamentoMultifuncional();
		impressora.imprimir();
		
		copiadora = new EquipamentoMultifuncional();
		copiadora.copiar();
		
		digitalizadora = new EquipamentoMultifuncional();
		digitalizadora.digitalizar();
		
		// EquipamentoMultifuncional representando os 3 papéis dentro da minha estrutura de objetos
		Impressora impressora1 = em;		
		Digitalizadora digitalizadora1 = em;
		Copiadora copiadora1 = em;
		
		System.out.println("\nEquipamentoMultifuncional representando papéis diversos");
		impressora1.imprimir();		
		digitalizadora1.digitalizar();
		copiadora1.copiar();
		
		
	}

}

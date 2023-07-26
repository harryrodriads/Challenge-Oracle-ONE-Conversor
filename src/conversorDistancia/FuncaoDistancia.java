package conversorDistancia;

import javax.swing.*;

public class FuncaoDistancia {
	ConverteDistancia distancia = new ConverteDistancia();
	
	public void converterDistancia(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha o formato  para a qual você deseja transferir sua distancia: ", "Distancia", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Centimetro a Metros", "De Metros a Centimetros", "De Kilometros a Metros", "De Metros a Kilometros"}, "Escolha: ")).toString();

        switch (opcao) {
        case "De Centimetro a Metros":
            distancia.converterCentimetrosParaMetros(valorRecebido);
            break;
        case "De Metros a Centimetros":
        	distancia.converterMetrosParaCentimetros(valorRecebido);
            break;
        case "De Kilometros a Metros":
        	distancia.converterKmParaMetros(valorRecebido);
            break;
        case "De Metros a Kilometros":
        	distancia.converterMetrosParaKm(valorRecebido);
            break;
        }
	}
}

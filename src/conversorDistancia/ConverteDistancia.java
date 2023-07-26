package conversorDistancia;

import javax.swing.*;


public class ConverteDistancia {
	
	public void converterCentimetrosParaMetros(double valorRecebido){
        double centimetro = valorRecebido / 100;
        centimetro = (double) Math.round(centimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Centimetros são " + centimetro + " Metros.");
    }

	public void converterMetrosParaCentimetros(double valorRecebido){
        double metroCentimetro = valorRecebido * 100;
        metroCentimetro = (double) Math.round(metroCentimetro * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Metros são " + metroCentimetro + " Centimetros.");
    }
	
	public void converterKmParaMetros(double valorRecebido){
        double kms = valorRecebido * 1000;
        kms = (double) Math.round(kms * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Kilometros são " + kms + " Metros.");
    }
	
	public void converterMetrosParaKm(double valorRecebido){
        double metroKm = valorRecebido / 1000;
        metroKm = (double) Math.round(metroKm * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Metros são " + metroKm + " Kilometros.");
    }
}

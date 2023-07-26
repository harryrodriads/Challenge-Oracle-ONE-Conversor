package principal;

import conversorMoedas.Funcao;
import conversorTemperatura.FuncaoTemperatura;
import conversorDistancia.FuncaoDistancia;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Funcao moedas = new Funcao();
        FuncaoTemperatura temperatura = new FuncaoTemperatura();
        FuncaoDistancia distancia = new FuncaoDistancia();

        while (true) {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "MENU", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura", "Conversor de Distancia"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    String input = JOptionPane.showInputDialog("Qual o valor que desejas converter? ");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        moedas.converterMoeda(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (JOptionPane.OK_OPTION == resposta) {
                            System.out.println("Escolha opção Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                    break;
                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Qual o valor de temperatura que desejas converter?");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        temperatura.converterTemperatura(valorRecebido);

                        int resposta = 0;
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if ((resposta == 0) && (checar(input))) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                    break;
                case "Conversor de Distancia":
                    input = JOptionPane.showInputDialog("Qual o valor de distancia que desejas converter?");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        distancia.converterDistancia(valorRecebido);

                        int resposta = 0;
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if ((resposta == 0) && (checar(input))) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                    break;
            }
        }
    }

    public static boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
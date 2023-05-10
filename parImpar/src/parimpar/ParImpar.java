package parimpar;

import javax.swing.JOptionPane;

public class ParImpar {

    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
       JOptionPane.showMessageDialog(null, (numero%2 == 0)?"Este número é par.":"Este número é ímpar");
        }
    }


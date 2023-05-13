package calculoimc;

import javax.swing.JOptionPane;

public class CalculoIMC {

    public static void main(String[] args) {
        float imc, peso, altura;
        
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso"));
                
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite sua altura"));
        
        imc = peso/ (altura*altura);
              
        System.out.println(imc);
    }
    
}

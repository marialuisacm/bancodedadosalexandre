
package verificatexto;

import javax.swing.JOptionPane;

public class VerificaTexto {

    public static void main(String[] args) {
        int valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor."));
        
        if (valor <= 9) {
            JOptionPane.showMessageDialog(null,"O valor está na faixa permitida.");
        } else{
            JOptionPane.showMessageDialog(null,"O valor está fora da faixa permitida.");
        }
        
        
    }
    
}

package jogoadivinhacao;

import java.util.Random;
import javax.swing.JOptionPane;
public class Jogoadivinhacao {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int numero, x;
        
        do{
        numero  = Integer.parseInt( JOptionPane.showInputDialog("Escolha um número de 1 a 10."));
        x = nextInt(11);
        
        if (numero > x){
            JOptionPane.showMessageDialog(null, "Número sorteado é menor." + x);
        }else{
            JOptionPane.showMessageDialog(null, "Número sorteado é maior." + x);
        }
         } while(numero ! = x);
        
    }
    
}

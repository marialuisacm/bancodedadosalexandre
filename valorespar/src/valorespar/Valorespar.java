
package valorespar;

import javax.swing.JOptionPane;

public class Valorespar {

    public static void main(String[] args) {
       int v1, v2, v3, v4;
       
       v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
       v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
       v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
       v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
      
       
    if(v1%2 == 0){
       JOptionPane.showMessageDialog(null, v1+ "é divisível por 2");
    }
    
    if(v2%2 == 0){
       JOptionPane.showMessageDialog(null, v2+ "é divisível por 2");
    }
    
     if(v3%2 == 0){
       JOptionPane.showMessageDialog(null, v3+ "é divisível por 2");
    }
     
     if(v4%2 == 0){
       JOptionPane.showMessageDialog(null, v4+ "é divisível por 2");
    }
    }
}

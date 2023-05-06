package maiorvalor;

import javax.swing.JOptionPane;

public class Maiorvalor {

   public static void main(String[] args) {
         int a, b, c;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Digte o valor de A."));
       b = Integer.parseInt(JOptionPane.showInputDialog("Digte o valor de B."));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digte o valor de C."));
        
        if(a > b && a > c){
            JOptionPane.showMessageDialog(null, "A é o maior valor");
        } else{
            if (b > a && b > c)
            JOptionPane.showMessageDialog(null, "B é o maior valor");
         }else {
              JOptionPane.showMessageDialog(null, "C é o maior valor");
        }
    }
}

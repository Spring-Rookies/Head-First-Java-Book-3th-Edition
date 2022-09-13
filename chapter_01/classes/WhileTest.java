package headfirstjava.chapter_01.classes;

import javax.swing.JOptionPane;

public class WhileTest {
    public static void main(String[] args) {
        // Esse valor vai ser recebido pelo usuario
        int valor = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero para ver a tabuada:" ));
        int x = 1;
        
        // Vai ser gerado uma tabuada ate 10.
        while (x <= 10) {
            // Essa e a logica para o calculo da tabuada.          
            System.out.printf("%d x %d = %d", valor, x, valor * x);

            System.out.println();

           // Para encrementar a variavel x.
            x = x + 1;
            
        }

    }
}

import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ver a tabuada:"));
        int x = 1;

        // Vai ser gerado uma tabuada ate 10.
        while (x <= 10) {
            // Essa e a logica para o calculo da tabuada.
            System.out.printf("%d x %d = %d", valor, x, valor * x);

            System.out.println();
            x = x + 1;
            // Para encrementar a variavel x.

        }

        JOptionPane.showMessageDialog(null, "Obrigado por usar nossa calculadora inteligente, Tanks!!! ");

    }

}

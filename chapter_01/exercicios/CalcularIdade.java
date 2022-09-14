import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class CalcularIdade {
    public static void main(String[] args) {
        // JOPTIONS significa imprimir uma msg na tela.
        JOptionPane.showMessageDialog(null, "Digite sua data de nascimento ");
        // parseInt ele transforma string em inteiro.
        int ano = Integer.parseInt(JOptionPane.showInputDialog("ano?"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("mes?"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("dia?"));
        // localDate e um tipo de data do Java.
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        long totalDias = ChronoUnit.DAYS.between(nascimento, hoje);

        JOptionPane.showMessageDialog(null, "Voce tem " + totalDias + " dias de idade. ");
        JOptionPane.showMessageDialog(null, "FALA BILL, Obrigado por usar nosso app");

    }

}

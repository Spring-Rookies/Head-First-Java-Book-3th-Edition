package headfirstjava.chapter_01.exercicios;

import javax.swing.JOptionPane;

public class calculeMedia {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Seja bem vindo a nossa calculadora de medias, vamos juntos embarcar nessa viagem",
                "Calcule sua media", 1);

        double A = (7 + 8 + 9) / 3;
        double B = (4 + 5 + 6) / 3;

        double soma = A + B;

        JOptionPane.showMessageDialog(null, "A soma das  medias deu " + soma, " soma das medias", 1);
        double media = soma / 2;

        JOptionPane.showMessageDialog(null, " A media das medias e " + media, " desse resultado", 3);

    }
}

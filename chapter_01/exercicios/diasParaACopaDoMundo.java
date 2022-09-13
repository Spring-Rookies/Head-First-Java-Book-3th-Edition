package headfirstjava.chapter_01.exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class DiasParaACopaDoMundo {
    public static void main(String[] args) {
        // apresentar a msg na tela do usuario.
        JOptionPane.showMessageDialog(null, "Clique em ok para saber quantos dias faltam para a copa do mundo no Qatar",
                "CONTAGEM REGRESSIVA", 1);
        // Saber a data de hj (now).
        LocalDate hoje = LocalDate.now();
        LocalDate dataInicial = LocalDate.of(2022, 11, 20);

        // o ChromeUnit e uma biblioteca para calcular datas, podemos calcular qualquer
        // tipos de datas.
        long totalDias = ChronoUnit.DAYS.between(hoje, dataInicial);

        JOptionPane.showMessageDialog(null, "Faltam " + totalDias + " dias para a copa iniciar", "CONTAGEM REGRESSIVA",
                2);

    }

}

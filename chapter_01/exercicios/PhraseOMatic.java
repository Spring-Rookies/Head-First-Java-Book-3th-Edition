import java.util.Random;

import javax.swing.JOptionPane;

public class PhraseOMatic {

    public static void main(String[] args) {

        /*
         * Walkthrough
         * 
         * 1 - Construir 3 arrays de strings
         * 2 - Verificar o tamanho de cada array
         * 3 - Gerar um numero aleatorio de acordo com o range de cada array
         * 4 - Conforme o numero gerado para cada array, escolher uma palavra em cada
         * array pelo index
         * 5 - Montar uma frase com as palavras sorteadas
         * 
         */

        // 1 - Construir 3 arrays de strings
        String[] palavras1 = { "cerveja", "leite", "suco", "sangue", "agua de batata", "cafe", "cha", "achocolatado",
                "refrigerante", "vinho",
                "lupulo", "ice tea", "agua com gas" };

        String[] palavras2 = { "amargo", "doce", "salgado", "azedo", "gostoso", "ruim", "bom", "delicioso",
                "maravilhoso", "saboroso",
                "barato", "caro", "viciante", "saudavel", "insalubre", "desconfortavel", "confortavel", "fresco",
                "quente" };

        String[] palavras3 = { "doce", "fruta", "verdura", "carne", "peixe", "ovo", "queijo", "pao", "arroz",
                "feijao" };

        // 2 - Verificar o tamanho de cada array
        int tamanho1 = palavras1.length;
        int tamanho2 = palavras2.length;
        int tamanho3 = palavras3.length;

        // 3 - Gerar um numero aleatorio de acordo com o range de cada array
        int indexArr1 = new Random().nextInt(tamanho1);
        int indexArr2 = new Random().nextInt(tamanho2);
        int indexArr2x = new Random().nextInt(tamanho2);
        int indexArr3 = new Random().nextInt(tamanho3);

        // 4 - Conforme o numero gerado para cada array, escolher uma palavra em cada
        // array pelo index
        String palavra1 = palavras1[indexArr1];
        String palavra2 = palavras2[indexArr2];
        String palavra2x = palavras2[indexArr2x];
        String palavra3 = palavras3[indexArr3];

        // 5 - Montar uma frase com as palavras sorteadas
        String phraseOMatic = "Neste momento eu gostaria de estar bebendo um(a) " + palavra1 + " " + palavra2 + " e " +
                "comendo um(a) " + palavra3 + " " + palavra2x + ".";

        // Mostrar a frase
        JOptionPane.showMessageDialog(null, phraseOMatic, "PHRASE-O-MATIC", 2);
    }
}

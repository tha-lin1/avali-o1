/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class SistemaEscolar {

    public static void main(String[] args) {
        // Notas fornecidas (poderia ser via Scanner, mas são fixas neste exemplo)
        double[] notas = {9, 10, 10, 8, 7, 8, 10, 9};

        // Cálculo das médias bimestrais
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        // Cálculo das médias semestrais
        double[] mediasSemestrais = new double[2];
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2.0;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2.0;

        // Cálculo da média final
        double mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2.0;

        // Exibição dos resultados
        System.out.println("===== Resultados =====");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Média do %dº bimestre: %.2f%n", i + 1, mediasBimestrais[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("Média do %dº semestre: %.2f%n", i + 1, mediasSemestrais[i]);
        }
        System.out.printf("Média final do ano: %.2f%n", mediaFinal);
    }
}

package br.com.exercicios1.numerosprimos;

public class VerificarNumeroPrimo {
    protected int numeroDeDivisores;

    public void verificarPrimalidade(int num) {
        for (int i = 1; i <= num; i = i + 1) {
            double resto = num %i;
            if (resto == 0) numeroDeDivisores++;
        }
        if (numeroDeDivisores == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }

    public void listarPrimos(int num) {
        for (int i1 = 2; i1 <= num; i1++) {
            numeroDeDivisores = 0;
            for (int i = 1; i <= i1; i = i + 1) {
                double resto = i1 %i;
                if (resto == 0) numeroDeDivisores++;
            }
            if (numeroDeDivisores == 2) {
                System.out.println(i1);
            }
        }
    }
}

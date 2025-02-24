package br.com.exercicios1.numerosprimos;

public class GeradorPrimo extends VerificarNumeroPrimo {
    public void gerarProximoPrimo(int num) {
        num = num + 1;
        for (int numeroDeDivisores = 0; numeroDeDivisores != 2; num++){
            numeroDeDivisores = 0;
            for (int i = 1; i <= num; i = i + 1) {
                double resto = num % i;
                if (resto == 0) numeroDeDivisores++;
            }
        }
        int primo = num - 1;
        System.out.println("O próximo numero primo é: " + primo);
    }
}

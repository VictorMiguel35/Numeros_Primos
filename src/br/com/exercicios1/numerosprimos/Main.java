package br.com.exercicios1.numerosprimos;

public class Main {
    public static void main(String[] args) {
        VerificarNumeroPrimo verificar = new VerificarNumeroPrimo();
        verificar.verificarPrimalidade(17);
        verificar.listarPrimos(20);

        GeradorPrimo gerador = new GeradorPrimo();
        gerador.gerarProximoPrimo(20);
    }
}

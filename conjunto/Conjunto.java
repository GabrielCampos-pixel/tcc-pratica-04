package conjunto;
import java.util.Scanner;

public class Conjunto implements ConjuntoInterface {
    public int lerElementos(double [] vet) {
        String opcao;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Informe um elemento:");
            vet[cont++] = teclado.nextDouble();
            System.out.println("Deseja informar outro elemento? (sim/s)");
            opcao = teclado.next();
        } while ((opcao.equalsIgnoreCase("sim") || opcao.equalsIgnoreCase("s")) && cont < 10);

        return cont;
    }

    public void imprimirElementos(double[] vet, int cont) {
        for(int i = 0; i < cont; i++)
           System.out.print(vet[i] + "  ");
        System.out.println();  
    }

    public int uniao(double[] vet1, double[] vet2) {
        int cont = 0;
        return cont;
    }

    public int intersecao(double[] vet1, double[] vet2) {
        int cont = 0;
        return cont;
    }

    public int diferenca(double[] vet1, double[] vet2) {
        int cont = 0;
        return cont;
    }

    public int produtoCartesiano(double[] vet1, double[] vet2) {
        int cont = 0;
        return cont;
    }

    public int conjuntoDasPartes(double[] vet) {
        int cont = 0;
        return cont;
    }
}
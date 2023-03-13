
import java.util.Scanner;

import entities.Caneta;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Caneta caneta = new Caneta();

        System.out.print("");
        System.out.print("Digite a marca da caneta:");
        caneta.marca = sc.nextLine();
        System.out.print("Digite a cor da caneta:");
        caneta.cor = sc.nextLine();

        // 1 fechar 2 abrir 3 verifica tampa 4 verifica tinta 5 escrever 0 sair
        int x = 0;
        do {
            System.out.println("DIGITE 1-FECHAR TAMPA 2-ABRIR TAMPA 3-VERIFICAR TAMPA 4-VERIFICAR TINTA 5-ESCREVERA 0-SAIR");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    caneta.fecharTampa();
                    break;
                case 2:
                    caneta.abrirTampa();
                    break;
                case 3:
                    caneta.verificarTampa();
                    break;
                case 4:
                    caneta.verificarCarga();
                    break;
                case 5:
                    caneta.escrever();
                    break;
                    case 6:
                    System.out.println(caneta);
                    break;
                default:
                    System.out.println("Valor invalido");
            }

        } while (x != 0);
        {

        }

        sc.close();

    }
}
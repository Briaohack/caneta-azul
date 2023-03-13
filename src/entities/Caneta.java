package entities;

public class Caneta {

    public String marca;
    public String cor;
    public int carga = 100;
    public boolean tampa;

    // false = sem tampa
    // true = com tampa

    public void fecharTampa() {
        if (tampa != true) {
            tampa = true;
            System.out.println("Tampa fechada");
        } else {
            System.out.println("A tampa já está fechada");
        }

    }

    public void abrirTampa() {
        if (tampa != false) {
            tampa = false;
            System.out.println("A tampa esta aberta");
        } else {
            System.out.println("A tampa ja esta aberta");
        }

    }

    public void verificarTampa() {
        if (tampa != true) {
            System.out.println("A tampa esta aberta");
        } else {
            System.out.println("A tampa esta fechada.");
        }

    }

    public void verificarCarga() {
        System.out.println(this.carga);

    }

    public void escrever() {
        if (tampa != true) {
            System.out.println("VOCE ESTA ESCREVENDO");
            this.carga =- 10;
        } else {
            System.out.println("TIRA A TAMPA RAPAX");
        }
    
    }


    public String toString() {
        return "Marca: "
                + marca
                + " Cor: "
                + cor
                + " Carga: "
                + carga;
    }
}

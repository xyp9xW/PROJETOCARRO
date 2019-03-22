package ProjetoCarro;

public class Carro {
        String modelo, cor, chassi, propietario;
        int ano, nrportas, nrmarchas, volcomb,marchaAtual;
        double vAtual, vMaxima;
        boolean tetoSolar, cambAutomatico;
        Propietario propietário;

        void acelera(){
        vAtual = vAtual + 1;
        }
        void freia(){
            vAtual = 0;
        }
        void trocaMarcha(int marchDesejada) {

            marchaAtual = marchDesejada;
        }
        void reduzMarcha(){
            marchaAtual = marchaAtual - 1;
        }











}

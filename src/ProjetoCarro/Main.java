package ProjetoCarro;

public class Main {
    public static void main(String args[]) {
        Propietario propietario = new Propietario();
        propietario.nome = "William";
        propietario.bairro = "Pedreira";
        propietario.cep = 66080280;
        propietario.cidade = "Belém";
        propietario.cpf = 0160242;
        propietario.dataNasc = 31999;
        propietario.estado = "Pará";
        propietario.rg = 8041499;
        propietario.complemento = "Marquês";

        Carro carro = new Carro();
        carro.nrportas = 5;
        carro.nrmarchas = 6;
        carro.propietario = " William";
        System.out.println(carro.vAtual);
        carro.acelera();
        carro.freia();
        System.out.println(carro.vAtual);

        System.out.println(carro.marchaAtual);



    }
}

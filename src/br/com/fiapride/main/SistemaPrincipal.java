package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Carregador;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Carregador carregador0 = new Carregador();
        carregador0.potencia = 65;
        carregador0.quantidadePortas = 1;

        // Criando o segundo passageiro (Objeto 2)
        Carregador carregador1 = new Carregador();
        carregador1.potencia = 125;
        carregador1.quantidadePortas = 3;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Carregador0: " + carregador0.potencia +"W" + " | Quantidade de Portas: " + carregador0.quantidadePortas);
        System.out.println("Carregador1: " + carregador1.potencia +"W" + " | Quantidade de Portas: " + carregador1.quantidadePortas);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}
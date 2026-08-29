package br.com.fiapride.main;

import br.com.fiapride.model.Carregador;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Carregador carregador0 = new Carregador();
        Carregador carregador1 = new Carregador();

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Carregador0: " + carregador0.getPotencia() +"W" + " | Quantidade de Portas: " + carregador0.getQuantidadePortas());
        System.out.println("Carregador1: " + carregador1.getPotencia() +"W" + " | Quantidade de Portas: " + carregador1.getQuantidadePortas());
        
        System.out.println("\n--- Atualizando Carregadores via Métodos ---");
        
        carregador0.configurarPorCelular(25, "USB Power Delivery");
        System.out.println("Carregador 0 reconfigurado | Nova Potência: " + carregador0.getPotencia() + "W | Protocolo: " + carregador0.getProtocoloCarregamento());

        carregador1.validarParaUso(2, true);
        System.out.println("Carregador 1 validado | Novas Portas: " + carregador1.getQuantidadePortas() + " | Certificado: " + carregador1.getCertificadoSeguranca());
        System.out.println("-------------------------------------------\n");

        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Recarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);
        
    }
}
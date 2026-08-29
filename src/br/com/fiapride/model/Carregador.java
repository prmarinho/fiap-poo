package br.com.fiapride.model;

public class Carregador {
    // Atributos privados (Encapsulamento - representado pelo '-' no UML)
    private int potencia;
    private String protocoloCarregamento;
    private String tipoPorta;
    private int quantidadePortas;
    private String certificadoSeguranca;

    // Construtor Padrão (Valores Iniciais)
    public Carregador() {
        this.potencia = 10;
        this.protocoloCarregamento = "Padrão USB";
        this.tipoPorta = "USB-A";
        this.quantidadePortas = 1;
        this.certificadoSeguranca = "Anatel";
    }

    // Método 1: Configura atributos com base na necessidade do celular
    public void configurarPorCelular(int potenciaMaxima, String protocolo) {
        this.potencia = potenciaMaxima;
        this.protocoloCarregamento = protocolo;
        if (potenciaMaxima > 20) {
            this.tipoPorta = "USB-C";
        }
    }

    // Método 2: Altera quantidade de portas e certificação conforme o perfil de uso
    public boolean validarParaUso(int qtdDispositivos, boolean precisaPortabilidade) {
        this.quantidadePortas = qtdDispositivos;
        if (precisaPortabilidade) {
            this.certificadoSeguranca = "Anatel (Selo GaN Compacto)";
        }
        return this.quantidadePortas >= qtdDispositivos;
    }

    // Métodos Getters (para leitura dos atributos privados)
    public int getPotencia() { 
        return potencia; 
    }

    public String getProtocoloCarregamento() { 
        return protocoloCarregamento; 
    }

    public String getTipoPorta() { 
        return tipoPorta; 
    }

    public int getQuantidadePortas() { 
        return quantidadePortas; 
    }

    public String getCertificadoSeguranca() { 
        return certificadoSeguranca; 
    }
}
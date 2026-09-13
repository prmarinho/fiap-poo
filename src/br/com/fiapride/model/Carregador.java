package br.com.fiapride.model;

public class Carregador {
    private int potencia;
    private String protocoloCarregamento;
    private String tipoPorta;
    private int quantidadePortas;
    private String certificadoSeguranca;

    public Carregador() {
        this.setPotencia(10);
        this.setProtocoloCarregamento("Padrão USB");
        this.setTipoPorta("USB-A");
        this.setQuantidadePortas(1);
        this.setCertificadoSeguranca("Anatel");
    }

    public void configurarPorCelular(int potenciaMaxima, String protocolo) {
        this.setPotencia(potenciaMaxima);
        this.setProtocoloCarregamento(protocolo);
        if (potenciaMaxima > 20) {
            this.setTipoPorta("USB-C");
        }
    }

    public boolean validarParaUso(int qtdDispositivos, boolean precisaPortabilidade) {
        this.setQuantidadePortas(qtdDispositivos);
        if (precisaPortabilidade) {
            this.setCertificadoSeguranca("Anatel (Selo GaN Compacto)");
        }
        return this.quantidadePortas >= qtdDispositivos;
    }

    public int getPotencia() {
        return this.potencia;
    }

    private void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        } else {
            System.out.println("Erro: Potência inválida. O valor deve ser maior que zero.");
        }
    }

    public String getProtocoloCarregamento() {
        return this.protocoloCarregamento;
    }

    private void setProtocoloCarregamento(String protocoloCarregamento) {
        this.protocoloCarregamento = protocoloCarregamento;
    }

    public String getTipoPorta() {
        return this.tipoPorta;
    }

    private void setTipoPorta(String tipoPorta) {
        this.tipoPorta = tipoPorta;
    }

    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }

    private void setQuantidadePortas(int quantidadePortas) {
        if (quantidadePortas > 0) {
            this.quantidadePortas = quantidadePortas;
        } else {
            System.out.println("Erro: Quantidade de portas inválida. O valor deve ser maior que zero.");
        }
    }

    public String getCertificadoSeguranca() {
        return this.certificadoSeguranca;
    }

    private void setCertificadoSeguranca(String certificadoSeguranca) {
        this.certificadoSeguranca = certificadoSeguranca;
    }
}

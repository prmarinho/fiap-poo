# 🚀 Projeto FiapRide — Módulo Carregador

Este repositório contém a implementação do modelo da classe `Carregador`, desenvolvida no contexto da disciplina de **Programação Orientada a Objetos** para o ecossistema **FiapRide**.

---

## 📌 1. Representação no Mundo Real

Na vida real, um **Carregador de Celular/Dispositivos** é um dispositivo físico responsável por fornecer energia elétrica e gerenciar a velocidade e segurança da carga enviada a um equipamento (como um smartphone).

No software, a classe `Carregador` abstrai essa entidade e mapeia suas principais características físicas e técnicas (potência, tipo de porta, protocolos suportados, quantidade de saídas e certificações de segurança).

---

## 🛠️ 2. Atributos da Classe (`Carregador.java`)

Os atributos foram encapsulados (`private`) para garantir a segurança dos dados e o alinhamento com as diretrizes de modelagem UML:

* `potencia` (*int*): Potência de saída medida em Watts (ex: `25W`, `65W`).
* `protocoloCarregamento` (*String*): Protocolo de comunicação para carga rápida (ex: `"USB Power Delivery"`, `"Quick Charge"`).
* `tipoPorta` (*String*): Conector de saída do carregador (ex: `"USB-A"`, `"USB-C"`).
* `quantidadePortas` (*int*): Quantidade de saídas para carregamento simultâneo.
* `certificadoSeguranca` (*String*): Órgão regulador ou selo de construção (ex: `"Anatel"`, `"Anatel (Selo GaN Compacto)"`).

---

## ⚙️ 3. Métodos Criados e Como Usá-los

Além dos métodos **Getters** de leitura, a classe conta com dois métodos principais para manipular e reconfigurar os atributos da instância:

### 🔹 `configurarPorCelular(int potenciaMaxima, String protocolo)`
Ajusta as configurações de potência e protocolo de acordo com as especificações exigidas por um smartphone. Se a potência fornecida for superior a 20W, o tipo da porta é atualizado automaticamente para `"USB-C"`.

**Como usar no código:**
```java
Carregador meuCarregador = new Carregador();

// Reconfigura o carregador para suportar 65W e Power Delivery
meuCarregador.configurarPorCelular(65, "USB Power Delivery");
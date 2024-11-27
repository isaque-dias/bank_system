# Sistema Bancário Simples

Este é um projeto iniciante de um sistema bancário simples desenvolvido em Java. O objetivo do projeto é simular as operações básicas de um banco, como depósitos, saques, consulta de saldo e visualização das informações do cliente. O código pode ser melhorado e expandido com o tempo, conforme novas funcionalidades forem adicionadas.

## Funcionalidades

Atualmente, o sistema possui as seguintes funcionalidades:

- **Login**: O sistema requer um login e senha para acesso ao menu (com usuário padrão: `admin` e senha `admin`).
- **Depósito**: Permite ao usuário depositar um valor na conta.
- **Saque**: Permite ao usuário realizar um saque, desde que haja saldo suficiente.
- **Consulta de Saldo**: Exibe o saldo atual da conta.
- **Exibição de Informações**: Exibe informações do cliente, como nome, CPF, endereço, entre outros.
- **Menu de opções**: Apresenta as opções para o usuário escolher a operação desejada.

## Estrutura do Código

O sistema está organizado em três pacotes principais:

- **`application`**: Contém a classe principal (`Program`) que executa o código e apresenta o menu.
- **`model.entities`**: Contém as classes `Person` e `Client`. A classe `Person` armazena informações pessoais do cliente, enquanto a classe `Client` herda de `Person` e adiciona as funcionalidades de depósito, saque e consulta de saldo.

## Como Executar o Projeto

### Pré-requisitos

- Java 8 ou superior instalado.
- IDE ou editor de texto para editar e compilar o código (como IntelliJ IDEA, Eclipse, ou Visual Studio Code).

### Observações
- Este projeto sofrerá atualizações com o passar do tempo.

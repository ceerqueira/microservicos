# Microserviços em Java

Este é um repositório que contém um sistema de microserviços desenvolvido em Java, com quatro componentes principais: Gateway, Server, Pagamentos e Pedidos. Este sistema foi criado para demonstrar um exemplo simples de arquitetura de microserviços em Java.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- `gateway/`: O módulo Gateway é responsável por receber todas as solicitações dos clientes e encaminhá-las para os microserviços apropriados.
- `server/`: O módulo Server é o núcleo do nosso sistema, contendo lógica de negócios compartilhada e funcionalidades gerais.
- `pagamentos/`: O módulo Pagamentos cuida do processamento de pagamentos e integrações com serviços de pagamento externos.
- `pedidos/`: O módulo Pedidos trata da criação, gestão e processamento de pedidos de clientes.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas e tecnologias instaladas em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) 8 ou superior
- Apache Maven para gerenciamento de dependências e construção do projeto

## Executando o Sistema

Siga estas etapas para executar o sistema de microserviços:

1. Clone o repositório para o seu ambiente de desenvolvimento:

   ```bash
   git clone https://github.com/seu-usuario/microservicos-java.git
   ```

2. Navegue para o diretório do projeto:

   ```bash
   cd microservicos-java
   ```

3. Compile o projeto usando o Maven:

   ```bash
   mvn clean install
   ```

4. Inicie cada um dos microserviços em terminais separados:

   ```bash
   java -jar gateway/target/gateway.jar
   java -jar server/target/server.jar
   java -jar pagamentos/target/pagamentos.jar
   java -jar pedidos/target/pedidos.jar
   ```

5. O sistema de microserviços estará em execução e pronto para receber solicitações. Você pode acessar os serviços através das seguintes URLs:

   - Gateway: `http://localhost:8081`
   - Server: `http://localhost:8081`
   - Pagamentos: `http://localhost:8081`
   - Pedidos: `http://localhost:8081`

Certifique-se de que todas as portas estejam disponíveis e não estejam sendo usadas por outros serviços em sua máquina.



# DIO - Trilha Java Básico
[www.dio.me](https://www.dio.me)

## Autores
- Gleyson Sampaio

## Sintaxe - Desafio

Neste desafio, vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe, codificando o seguinte cenário.

### Desafio: ContaBanco

Crie o projeto **ContaBanco** que receberá dados via terminal contendo as características de conta bancária conforme os atributos abaixo:

**Atributos do projeto**:
- **Número**: Inteiro (Exemplo: 1021)
- **Agência**: Texto (Exemplo: 067-8)
- **Nome Cliente**: Texto (Exemplo: MARIO ANDRADE)
- **Saldo**: Decimal (Exemplo: 237.48)

### Passos do projeto:

1. **Criação da classe ContaTerminal.java**: Dentro do projeto, crie a classe **ContaTerminal.java** para realizar toda a codificação do programa.

2. **Revisão sobre regras de declaração de variáveis**: Certifique-se de declarar as variáveis corretamente, de acordo com o tipo de dado adequado.

3. **Uso da classe Scanner**: Utilize a classe **Scanner** para permitir que os dados sejam inseridos via terminal. O usuário deverá receber a mensagem de qual informação será solicitada. Por exemplo:
   - **Programa**: "Por favor, digite o número da Agência!"
   - **Usuário**: 1021 (e depois apertar ENTER para o próximo campo)

4. **Concorrência e classe String**: Utilize concatenação de strings para exibir as informações de maneira legível e clara para o usuário.

### Exibição final

Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem com as informações fornecidas pelo usuário:

"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."

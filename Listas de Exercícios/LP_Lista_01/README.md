![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   flowchart TD
           start(( Início )) --> input[\ Digite sua Nota \]
           input --> verification{ Nota >= 50? }
           verification --> |Sim| A[/ Aprovado /]
           verification --> |Não| B[/ Reprovado /]
           A --> finish([ Fim ])
           B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? } 
        verification --> |Sim| A[/ Pré Aprovado /] --> input1
        verification--> |Não| B[/ Reprovado /] 
        input1[\ Digite sua Frequencia \] 
        input1 --> verification1{ Frequencia >= 75%? }
        verification1 --> |Sim| C[/ Aprovado /]
        verification1 --> |Não| D[/ Reprovado /]
        B--> finish
        C--> finish([ Fim ])
        D --> finish
   ```
   OU
   ```mermaid
   
   ```

   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
     A((Inicio)) --> B[\Digite n1\]
   B --> C[\Digite n2\]
   C --> D[Resultado = N1 + N2]
   D --> E[/Resultado/]
   E --> F([Final])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> input[\Digite um Número\]
   input --> entrada{O numero é maior \nOU \nigual a zero}
   entrada -->|Sim| 1[/Número Positivo/]
   entrada --> |Nao| 2[/Número Negativo/]
   1 --> fim([Fim])
   2 --> fim
   
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> input[\Digite sua Idade\]
   input --> entrada{Tem 16 anos \nOU \n Mais que dezeseis}
   entrada -->|Sim| 1{Tem titulo de Eleitor}
   entrada --> |Nao| 2[/Não pode votar/]
   1 --> |Sim| 3[/Pode Votar/]
   1 --> |Não| 4[/Não Pode Votar/]
   2 --> fim
   3 --> fim
   4 --> fim
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> input[\Digite dois Numeros\]
   input --> entrada{A é \nMaior OU igual \nque B}
   entrada -->|Sim| 1{A é maior que B}
   1 --> |sim| 2[/O primeiro é maior/]
   1 --> |Não| 3[/Os números são iguais/]
   entrada --> |Nao| 4[/O segundo número é maior/]
   2 --> fim
   3 --> fim
   4 --> fim
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
   A[Início] --> B[Digite tres números]
    B --> C{1 maior 2 \nE \n1 maior 3}
    C -->|Sim| D[O maior número é o primeiro]
    C -->|Não| E{2 > 3?}
    E -->|Sim| F[O maior número é o segundo]
    E -->|Não| G[O terceiro número é maior]
    D --> H[Fim]
    F --> H
    G --> H
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
    A[Início] --> B[Digite um Número]
    B --> C{N == 0 ou N == 1?}
    C -- Sim --> D[ Fatorial = 1] --> finish[Fim]
    C -- Não --> F[Definir Fatorial = 1]
    F --> G[i = 2 até N]
    G --> H[Fatorial = N * i]
    H --> G
    G --> I[Resultado Fatorial]
    I --> finish
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      A[Início] --> B[Leia N]
    B --> C{N é igual a 0?}
    C -- Sim --> D[O número é Zero]
    C -- Não --> E{N % 2 == 0?}
    E -- Sim --> F[O número é Par]
    E -- Não --> G[O número é Ímpar]
    D --> H[Fim]
    F --> H
    G --> H
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
    A[Início] --> B[Leia N]
    B --> C{N <= 1?}
    C -- Sim --> D[Não é primo] --> finish[Fim]
    C -- Não --> E[Divisão de 2 até N-1]
    E --> F{É divisível?}
    F -- Sim --> D
    F -- Não --> H[É Primo] --> finish
   ```
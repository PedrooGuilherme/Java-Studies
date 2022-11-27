# 👩🏿‍💻 Java

Java é uma linguagem orientada a objetos que possui métodos.


## 📁 Compilação:
 - 1° Etapa : Criação do *código-fonte* em arquivo com a terminação .java ;
 - 2° Etapa : O compilador Java converte o código-fonte em *bytecodes* que representam tarefas a serem executadas na fase de execução ;
 - 3° Etapa : O arquivo em ByteCode é convertido/traduzido em uma linguagem de computador (Assembly por exemplo)
 - 4° Etapa : O arquivo em JAva é executado.

## Sintaxes da Linguagem:
### Entrada de Dados:
    
    1. Primeiro precisamos importar a biblioteca java.util.Scanner.que possui as definições da classe Scanner necessárias para a leitura.

    "As importações devem vir sempre logo abaixo da declaração do nome do pacote."

    2. Em seguida, declaramos uma variável (objeto) do tipo (classe) Scanner. Essa classe é responsável por ler os dados de alguma fonte passada por parâmetro, no caso, o parâmetro deve ser System.in, que aponta a entrada padrão do sistema, o teclado.

        Scanner NomeQualquer = new Scanner(System.in)

    3. Para fazer a leitura dentro de uma variável, utilizamos: 
        variavel = teclado.nextInt();    <--- Para ler um valor inteiro
        variavel = teclado.nextFloat(); ou variavel = teclado.nextDouble();  <--- Para um valor real
        variavel = teclado.next();       <--- Para ler uma string

    Ex: 
        
        ![preview](./Entrada.png)


### Saída de Dados :
    *System.out.println("Argumentos");*   <-- Nunca se esqueça do ponto e vírgula. 
    ln = nova linha,ou seja,ao final do argumento é saltado uma linha

    O  jeito mais derápido digitar essa função é digitando " sysout " e logo após clicar em Crtl+Espaço.

    *System.out.printf("Argumentos");*    
    f = uma exibição com argumentos formatados.

    *System.out,print("Argumentos");*
     - Exibição sem saltar linha e formatação. 

    Ex:

        Arrays -->  System.out.printf("Arrays %d, %d, %d", Contagem[0],Contagem[1],Contagem[2]);	

        Função e Variável -->  System.out.printf("Média desses %d produtos : %.1f",Produtos,MediaTotal(soma,Produtos));

        Concatenado -->  System.out.println("Maior Número: "+ MaiorNumero);

#### Concatenação:
    Ex: 
        *System.out.println("Argumento" + Variável);*
        


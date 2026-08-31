// public class EstruturaDeRepeticaoEStrings {
    
// }

// laço FOR
/* Três Divisões:
    1- Declara a variável de controle (inicialização)
    2- Condição de continuação do laço (condição)
    3- Incremento ou decremento da variável de controle (atualização). 
       Quando o nosso código deve sair do laço, ou seja, quando a condição for falsa.
*/
/*Estrutura do FOR:
    for (<inicialização>; <condição>; <incremento/decremento>) {
        // Bloco de código a ser repetido
    } 
 Exemplo:
    for (int i = 1; i <= 5; i++) {
        System.out.println("Contador: " + i);
    }

*/

// import java.util.Scanner;
// public class EstruturaDeRepeticaoEStrings {
//     public static void main(String[] args) {
//         Scanner leitor = new Scanner(System.in);

//         System.out.print("Digite a quantidade de alunos: ");
//         int quantidadeAlunos = leitor.nextInt();

//         double somaNotas = 0;

//         for (int i = 0; i < quantidadeAlunos; i++) {
//             System.out.print("Digite a nota do " + (i + 1) + "o aluno:");
//             float nota = leitor.nextFloat();

//             if (nota < 0 || nota > 10) {
//                 System.out.println("Nota inválida.");
//                 i--; // Decrementa o contador para repetir a entrada da nota
//             } else {
//                 somaNotas += nota;
//             }
//         }
//         double media = somaNotas / quantidadeAlunos;

//         System.out.println("Média da turma: " + media);
//     }
// }



// laço WHILE
/* Estrutura do WHILE:
    int i = 0; (A variável de controle deve ser inicializada antes do laço, mostrando o valor inicial do contador)
    while (<condição>) {
        // Bloco de código a ser repetido
    }

Neste exemplo, o laço while continuará executando enquanto a condição (contador <= 5) 
for verdadeira. A cada iteração, o valor do contador é incrementado em 1, 
e o loop será encerrado quando o contador ultrapassar 5. contador = i (variável de controle).

 Exemplo:
    int contador = 1;
    while (contador <= 5) {
        System.out.println("Contador: " + contador);
        contador++;
    }

*/ 

// import java.util.Scanner;
// public class EstruturaDeRepeticaoEStrings {
//      public static void main(String[] args) {
//         int i = 0;
//         while (i < 200) {
//             System.out.println("Contador: " + i);
//             i++;
//         }
        
//     }
// }

// laço DO WHILE
/* Estrutura do DO WHILE:
    int i = 0; 
    do {
        // Bloco de código a ser repetido
    } while (<condição>);

Exemplo

    int i = 1;
    do {
        System.out.println(i);
        i++;
    } while (i <= 5);

*/

// import java.util.Scanner;
// public class EstruturaDeRepeticaoEStrings {
//       public static void main(String[] args) {
//          int i = 0;
    
//         do {
//             System.out.println("Contador: " + i);
//             i++;
//         } while (i <= 200);
//     }
// }


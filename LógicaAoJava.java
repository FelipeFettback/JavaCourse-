// Operadores de comparação
// Comparacao sempre Boolean (true ou false)
// == Igual - x == y
// != Diferente - x != y
// > Maior - x > y
// < Menor - x < y
// >= Maior ou igual - x >= y
// <= Menor ou igual - x <= y
// Exemplo:
// public class LogicaAoJava      
//     public static void main(String[] args) {
//         int x = 10;
//         int y = 20;
// E -> &&
        // var media = 7
        // var presenca = 80
        // boolean passouAno = media >= 6 && presenca >= 75;
        // System.out.println("Passou de ano: " + passouAno); // false

// OU -> ||
//         var idade = 70;
//         boolean gratuito = idade < 5 || idade > 65;
//         System.out.println(gratuito); // true

// Negação -> !
//         boolean podeDirigir = !(idade < 18);
//         System.out.println("Pode dirigir: " + podeDirigir); // true

// Comparação de igualdade
//         boolean isEqual = (x == y);
//         System.out.println("x == y: " + isEqual); // false

// Comparação de diferença
//         boolean isNotEqual = (x != y);
//         System.out.println("x != y: " + isNotEqual); // true

// Comparação de maior
//         boolean isGreater = (x > y);
//         System.out.println("x > y: " + isGreater); // false

// Comparação de menor
//         boolean isLess = (x < y);
//         System.out.println("x < y: " + isLess); // true

// Comparação de maior ou igual
//         boolean isGreaterOrEqual = (x >= y);
//         System.out.println("x >= y: " + isGreaterOrEqual); // false

// Comparação de menor ou igual
//         boolean isLessOrEqual = (x <= y);
//         System.out.println("x <= y: " + isLessOrEqual); // true
//     }
// }


// Fluxo de Controle
// public class LogicaAoJava {
//     public static void main(String[] args){ {
        // int idade = 20;

// Estrutura condicional if

        // if (idade >= 18) {
        //     System.out.println("Você é maior de idade.");
        // } else {
        //     System.out.println("Você é menor de idade.");
        // }

// Estrutura condicional if-else if-else
         //int nota = 70;
         //if (nota >= 90) {
         //   System.out.println("Excelente!");
         //} else if (nota >= 75) {
         //    System.out.println("Bom trabalho!");
         //} else {
         //    System.out.println("Precisa melhorar.");
         //}

// Estrutura de repetição for
         // for (int i = 1; i <= 5; i++) {
         //     System.out.println("Contagem: " + i);
         // }

// Estrutura de repetição while
         // int contador = 1;
         // while (contador <= 5) {
         //     System.out.println("Contador: " + contador);
         //     contador++;
         //     } 
         //}
     //}
 //}



// Entrada de Dados

// import java.util.Scanner;

// public class LogicaAoJava {
//          public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite seu nome: ");
        // String nome = scanner.nextLine();
        // System.out.println("Olá, " + nome + "!");
        // System.out.print("Digite sua idade: ");
        // int idade = scanner.nextInt();
        // System.out.println("Você tem " + idade + " anos.");
        // scanner.close();

    //             float ps = 2, tcc = 5, av1 = 6, av2 = 6;
    //             float media = (ps + tcc + av1 + av2) / 4;
    //             System.out.println("Média: " + media);
    //      Para substituir a entrada manual de dados no código, usamos o Scanner, que permite ao usuário digitar
    //      os próprios dados. Estamos importando a classe Scanner.

    //                 Scanner entrada = new Scanner(System.in);
    //                 System.out.print("Digite a nota da PS: ");
    //                 float ps = entrada.nextFloat();
    //                 System.out.print("Digite a nota da TCC: ");
    //                 float tcc = entrada.nextFloat();
    //                 System.out.print("Digite a nota da AV1: ");
    //                 float av1 = entrada.nextFloat();
    //                 System.out.print("Digite a nota da AV2: ");
    //                 float av2 = entrada.nextFloat();
    //                 float media = (ps + tcc + av1 + av2) / 4; 
    //                 System.out.println("Média: " + media);


    //              if (media >= 6) {
    //                  System.out.println("Aprovado");
    //              } else if (media >= 4) {
    //                  System.out.println("Recuperação");
    //              } else {
    //                  System.out.println("Reprovado");
    //              }
                
    //      }
    //  }

// import java.util.Scanner;

// public class LogicaAoJava {
//     public static void main(String[] args) {
        
//         Scanner entrada = new Scanner(System.in);

//         System.out.print("Quantas laranjas deseja comprar? ");
//         int quantidade = entrada.nextInt();
        
//         double precoLaranja;

//         if (quantidade >= 10) {
//             precoLaranja = 2.00;
//         } else {
//             precoLaranja = 2.50;
//         }
        
        
//         double precoTotal = quantidade * precoLaranja;

//         System.out.print("Deseja pagar por PIX? Digite 1 para sim ou 0 para não: ");
//         boolean pagamentoPix = entrada.nextInt() == 1;

//         if (pagamentoPix) {
//             System.out.println("Pagamento realizado por PIX. Valor total: R$ " + precoTotal);
//         } else {
//             System.out.println("Pagamento realizado em dinheiro. Com taxa de 20%. Valor total: R$ " + (precoTotal * 1.2));
//         }
//     }
// }



// Switch Case
// import java.util.Scanner;

// public class LogicaAoJava {
//     public static void main(String[] args) {
//         Scanner entrada = new Scanner(System.in);

//         System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
//         int dia = entrada.nextInt();

//         switch (dia) {
//             case 1:
//                 System.out.println("Domingo");
//                 break;
//             case 2:
//                 System.out.println("Segunda-feira");
//                 break;
//             case 3:
//                 System.out.println("Terça-feira");
//                 break;
//             case 4:
//                 System.out.println("Quarta-feira");
//                 break;
//             case 5:
//                 System.out.println("Quinta-feira");
//                 break;
//             case 6:
//                 System.out.println("Sexta-feira");
//                 break;
//             case 7:
//                 System.out.println("Sábado");
//                 break;
//             default:
//                 System.out.println("Número inválido. Digite um número de 1 a 7.");
//         }
//     }
// }




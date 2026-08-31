// Strings

// Palavras dentro de uma variável do tipo String podem ser manipuladas de diversas maneiras. 
// Abaixo estão alguns exemplos de operações comuns com Strings em Java:

// String primeiroNome = "Felipe";
// String segundoNome = "Fettback";

// public class OrientaçãoAObjetos {
//     public static void main(String[] args) {
//         // Criando um objeto da classe Pessoa
//         String primeiroNome = new String ("Felipe");
//         String segundoNome = new String("Fettback");

//         System.out.println("Primeiro Nome: " + primeiroNome);
//         System.out.println("Segundo Nome: " + segundoNome);
//         System.out.println("Nome completo: " + primeiroNome + " " + segundoNome);
//     }
// }

// Pool de Strings

// String escola1 = "Fiap";
// String escola2 = "Fiap";
// var isEqual = escola1 == escola2; 
// Retorna true, pois ambas as variáveis apontam para o mesmo objeto no pool de strings

// String escola1 = "Fiap";
// String escola2 = new String("Fiap");
// var isEqual = escola1 == escola2;
// Retorna false, pois as variáveis apontam para objetos diferentes no heap
// Para comparar o conteúdo das strings, deve-se usar o método equals():
// var isEqual = escola1.equals(escola2);
// Retorna true, pois o conteúdo das strings é igual


// FEATURE JAVA 15: O comando """ permite criar uma string multilinha, preservando quebras de linha e
// espaços em branco.
// 
// public class OrientaçãoAObjetos {
//     public static void main(String[] args) {
//         String multilineString = """
//                 Olá! Meu nome é Felipe.
//                 Sou estudante de Engenharia de Computação e estou aprendendo Java.
//                 Estou animado para explorar mais sobre programação orientada a objetos e
//                 desenvolvimento de software.
//                 """;

//         System.out.println(multilineString);
//     }

// }

// LocalDate - API de Data e Hora do próprio Java.

// import java.time.LocalDate;

// public class OrientaçãoAObjetos {
//     public static void main(String[] args) {
//         LocalDate dataAtual = LocalDate.now();
//         System.out.println("Data atual: " + dataAtual);
//         System.out.println("Ano: " + dataAtual.getYear());
//         System.out.println("Mês: " + dataAtual.getMonthValue());
//         System.out.println("Dia: " + dataAtual.getDayOfMonth());
//         System.out.println("Dia da semana: " + dataAtual.getDayOfWeek());
//         System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
//         System.out.println("É ano bissexto? " + dataAtual.isLeapYear());
//         System.out.println("Data formatada: " + dataAtual.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//     }
// }


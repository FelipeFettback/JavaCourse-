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

// Realizando comparações entre datas.
// LocalDate nascimento = LocalDate.of(1995, 5, 15);
// LocalDate hoje = LocalDate.now();

// Saber se é igual, antes ou depois.
// System.out.println("Igual:" + nascimento.isEqual(hoje));
// System.out.println("Antes:" + nascimento.isBefore(hoje));
// System.out.println("Depois:" + nascimento.isAfter(hoje));

// E o período decorrido?
// Period periodo = Period.between(nascimento, hoje);

// System.out.println("Período decorrido: " + periodo.getYears() + " anos, " 
//     + periodo.getMonths() + " meses e " 
//     + periodo.getDays() + " dias.");

//Receber em meses
// System.out.println("Período decorrido em meses: " + periodo.toTotalMonths());


//--------------------------------------------------------------------------------//

// Classes

// public class Computador{

//     String modelo;
//     String marca;
//     double preco;
//     int memoriaRam;
//     int espacamentoDisco;
//     String processador;
//     boolean placaDeVideoDedicada;
// }

// Abstração: é o processo de identificar os atributos e comportamentos essenciais de um objeto,
// ignorando detalhes irrelevantes.

// UML é uma linguagem de modelagem visual que permite representar graficamente os
// elementos de um sistema orientado a objetos, como classes, atributos, métodos e 
// relacionamentos entre eles. A UML é amplamente utilizada na engenharia de software 
// para facilitar a comunicação entre desenvolvedores, analistas e outros stakeholders, 
// além de auxiliar na documentação e no planejamento do desenvolvimento de sistemas complexos.

// Instanciação: é o processo de criar um objeto a partir de uma classe, alocando memória para ele
// e inicializando seus atributos. A instância é uma ocorrência específica de uma classe, com valores 
// próprios para seus atributos.

// Relacionamento entre classes: é a forma como as classes interagem entre si, podendo ser de
// diferentes tipos, como associação, agregação, composição e herança.

// Pasta org.example
// ->App
// ->Computador
// ->Fabricante
// ->Main


// Dentro do App.java, vemos o relacionamento entre as classes Computador e Fabricante, 
// onde a classe Computador possui um atributo do tipo Fabricante, 
// representando a relação de associação entre elas.
// ../App.java

// package org.example;

// public class App {
//     public static void main(String[] args) {
//         // Criando um objeto da classe Computador
//         Computador pc = new Computador();
//         pc.modelo = "Inspiron 15";
//         pc.marca = "Dell";
//         pc.preco = 3500.00;
//         pc.memoriaRam = 8;
//         pc.espacamentoDisco = 512;
//         pc.placaDeVideoDedicada = false;
//         pc.processador = "Intel Core;

//         Fabricante dell = new Fabricante();
//         dell.nome = "Dell Inc.";
//         dell.endereco = "Estados Unidos";

//         pc.fabricante = dell;


// Dentro do Computador.java, podemos acessar os atributos da Classe Computador, 
// que é o fabricante do computador.

// ../Computador.java
// package org.example;

// public class Computador {]

//     String modelo;

//     String marca;

//     double preco;

//     int memoriaRam;

//     int espacamentoDisco;

//     String processador;

//     boolean placaDeVideoDedicada;

//     Fabricante fabricante; 

//     }

// Dentro do Fabricante.java, podemos acessar os atributos da Classe Fabricante.

// ../Fabricante.java

// package org.example;

// public class Fabricante {

//     String nome;

//     String endereco;

// }

// As classes foram criadas separadamente, computador e fabricante, e dentro do App.java,
// podemos instanciar objetos dessas classes e estabelecer o relacionamento entre elas.
// No App.java, criamos um objeto da classe Computador, sendo ele o pc, e um objeto da classe Fabricante,
// sendo ele o dell.


// Métodos: são blocos de código que definem comportamentos ou ações que um objeto pode realizar.

// ../App.java

// package org.example;

// public class App {
//     public static void main(String[] args) {
//         // Criando um objeto da classe Computador
//         Computador pc = new Computador();
//         pc.modelo = "Inspiron 15";
//         pc.marca = "Dell";
//         pc.preco = 3500.00;
//         pc.memoriaRam = 8;
//         pc.espacamentoDisco = 512;
//         pc.placaDeVideoDedicada = false;
//         pc.processador = "Intel Core;

//         Fabricante dell = new Fabricante();
//         dell.nome = "Dell Inc.";
//         dell.endereco = "Estados Unidos";

//         pc.fabricante = dell;

//         double valorComDesconto = pc.calcularPrecoComDesconto(10); // Chamando o método calcularPrecoComDesconto com 10% de desconto (poderia utilizar 0.1 também)
//         System.out.println("Preço com desconto: " + valorComDesconto);

//         boolean sucesso = pc.adicionarMemoriaRam(4); // Chamando o método adicionarMemoriaRam com 4GB de memória adicional
//         if (sucesso) {
//           System.out.println("Memória RAM adicionada com sucesso. Nova quantidade: " + pc.memoriaRam + "GB");
//           System.out.println("Novo preço: " + pc.preco);
//         } else {
//           System.out.println("Não foi possível adicionar memória RAM. Limite máximo atingido.");

// Para isto funcionar, é necessário criar os métodos dentro da classe Computador.java, 
// que são o calcularPrecoComDesconto e o adicionarMemoriaRam. E assim ficaria o código: 

// ../Computador.java
// package org.example;

// public class Computador {

//     String modelo;

//     String marca;

//     double preco;

//     int memoriaRam;

//     int espacamentoDisco;

//     String processador;

//     boolean placaDeVideoDedicada;

//     Fabricante fabricante;

//     public double calcularPrecoComDesconto(double percentualDesconto) {
//         double desconto = preco * (percentualDesconto / 100);
//         return preco - desconto;
//     }

        // boolean adicionarMemoriaRam(int quantidadeAdicional) {
        //     if (quantidade % 2 == 1) return false; // Verifica se a quantidade adicional é ímpar
        //     memoriaRam += quantidade;
        //     preco += quantidade * 150; // Supondo que cada GB adicional custa R$150
        //     return true;
        // }

//     }



// Métodos estáticos: são métodos que pertencem à classe em si, e não a uma instância específica da classe.
// Eles podem ser chamados diretamente usando o nome da classe, sem a necessidade de criar um objeto da classe.

// Exemplo:

// package org.example;

// public class Main {

//     public static void main(String[] args) {

//         // Chamando o método estático da classe Computador
//         double quadrado = Math.pow(2.00, 10);

//         System.out.println("Preço com desconto: " + quadrado);
//     }
// }


// Atributos estáticos: são atributos que pertencem à classe em si, e não a uma instância específica da classe.
// Eles são compartilhados por todas as instâncias da classe e podem ser acessados diretamente usando o nome 
// da classe, sem a necessidade de criar um objeto da classe.

// Exemplo:

// ../App.java

// package org.example;

// import javax.swing.*;

// public class App {

//         public static void main(String[] args) {

//                 Casa c1 = Casa("Gabriela");
//                 Casa c2 = Casa("Felipe");
//                 Casa c3 = Casa("Renato");

//                 Casa.cor = JOptionPane.showInputDialog("Digite a cor das casas: ");

//                 System.out.println(c1.dono + "-" + c1.cor);
//                 System.out.println(c2.dono + "-" + c2.cor);
//                 System.out.println(c3.dono + "-" + c3.cor);
//         }
// }

// class Casa {

//         String dono;

//         static String cor = "Branca";

//         public Casa(String dono) {
//                 this.dono = dono;
//         }

// }

// Escolhendo Tons de Cores com JColorChooser


// ../App.java

// package org.example;

// import javax.swing.*;

// public class App {

//         public static void main(String[] args) {

//                 Casa c1 = Casa("Gabriela");
//                 Casa c2 = Casa("Felipe");
//                 Casa c3 = Casa("Renato");

//                 Casa.cor = JColorChooser.showDialog(null, "Escolha a cor das casas", null).toString();

//                 System.out.println(c1.dono + "-" + c1.cor);
//                 System.out.println(c2.dono + "-" + c2.cor);
//                 System.out.println(c3.dono + "-" + c3.cor);
//         }
// }

// class Casa {

//         String dono;

//         static Color cor = Color.WHITE;

//         public Casa(String dono) {
//                 this.dono = dono;
//         }

// }


// Método Construtor: é um método especial que é chamado automaticamente quando um objeto é criado a
// partir de uma classe.
// Ele tem o mesmo nome da classe e não possui um tipo de retorno, nem mesmo void

// public class Pessoa {
//     // Atributos da classe
//     String nome;
//     int idade;

//     // Este é o Método Construtor
//     public Pessoa(String nomeInicial, int idadeInicial) {
//         this.nome = nomeInicial;
//         this.idade = idadeInicial;
//     }

//     public void apresentar() {
//         System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
//     }

//     public static void main(String[] args) {
//         // O construtor é acionado aqui pela palavra 'new'
//         Pessoa pessoa1 = new Pessoa("Felipe", 22);
        
//         // Agora o objeto já tem os dados e pode executar seus métodos
//         pessoa1.apresentar();
//     }
// }


// Encapsulamento: é um princípio da programação orientada a objetos que consiste em proteger os dados
// de um objeto, restringindo o acesso direto aos seus atributos e fornecendo métodos públicos 
// (getters e setters) para acessar e modificar esses atributos de forma controlada.

// Feito com: private string nome;

// Interface: é um contrato que define um conjunto de métodos que uma classe deve implementar.
// Ela permite que diferentes classes compartilhem um comportamento comum, mesmo que não estejam relacionadas
// por herança. Uma interface pode conter apenas a assinatura dos métodos, sem implementação,
// e as classes que a implementam devem fornecer a implementação desses métodos.
// public interface Veiculo {
//     void acelerar();
//     void frear();
//     void virar(String direcao);
// }

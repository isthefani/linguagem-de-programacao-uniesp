import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class jogo {
    public static void main(String [] args) {
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolhaComputador;
        int escolhaUsuario;

        show.println("Olá! Qual é o seu nome?");
        String nome = scan.nextLine();
        show.println("\nPrazer em te conhecer, " + nome + "!");
        show.println(nome + ", você quer jogar comigo?");
        show.println("\nInforme o número da sua opção.\n1 = Sim\n2 = Não");
        opcao = scan.nextInt();

        if (opcao == 2) {
            show.println("Que pena! Mas tudo bem, fica para a próxima.");
        } else if (opcao == 1) {
            show.println("\nOk! O jogo é assim...");
            show.println("Escolherei um número entre 0 e 10 e você dirá qual número escolhi.");
            show.println("Se você conseguir adivinhar, você me venceu!");

            escolhaComputador = gerador.nextInt(11);

            show.println("\n...");
            show.println("\nOk, " + nome + ". Escolhi o número.");
            show.println("Agora tente adivinhar!");

            do {
                escolhaUsuario = scan.nextInt();
                if (escolhaUsuario != escolhaComputador) {
                    show.println("Resposta errada!");
                } else {
                    show.println("Parabéns! Você acertou!");
                    show.println("Muito obrigado por jogar comigo! :)");
                }
            } while (escolhaComputador != escolhaUsuario);
        }
    } 
}
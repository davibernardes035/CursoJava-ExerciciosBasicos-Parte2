import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, duracao;
        Scanner sc = new Scanner(System.in);

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial >= horaFinal){
            duracao = horaFinal + 24 - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
        }
    }
}
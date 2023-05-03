import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codItem, qtd;
        double precoItem1,precoItem2,precoItem3,precoItem4,precoItem5, total = 0;
        precoItem1 = 4.00;
        precoItem2 = 4.50;
        precoItem3 = 5.00;
        precoItem4 = 2.00;
        precoItem5 = 1.50;

        codItem = sc.nextInt();
        qtd = sc.nextInt();

        if(codItem == 1){
            total = precoItem1 * qtd;
        } else if (codItem == 2) {
            total = precoItem2 * qtd;

        } else if (codItem == 3) {
            total = precoItem3 * qtd;

        } else if (codItem == 4) {
            total = precoItem4 * qtd;

        } else if (codItem == 5) {
            total = precoItem5 * qtd;

        }else {
            System.out.println("CODIGO INEXISTENTE");
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
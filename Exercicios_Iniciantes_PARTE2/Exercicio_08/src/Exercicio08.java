import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, iRF = 0.0, aux = 0.0, aux2 = 0.0;
        salario = sc.nextDouble();

        if(salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            iRF = (salario - 2000) * 0.08;

            System.out.printf("R$ %.2f", iRF);
        } else if (salario <= 4500.00) {
            aux = salario - 3000.00;
            iRF =  (salario - 3000.00) * 0.18 + (salario - 2000.00 - aux) * 0.08;

            System.out.printf("R$ %.2f", iRF);
        }else{
            aux = salario - 3000.00;
            aux2 = salario - 4500.00;
            iRF =  (salario - 4500.00) * 0.28 + (salario - 3000.00 - aux2) * 0.18 + (salario - 2000.00 - aux) * 0.08;

            System.out.printf("R$ %.2f", iRF);
        }
        sc.close();
    }
}
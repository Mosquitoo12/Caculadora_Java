import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        boolean e = false;
        Scanner input = new Scanner(System.in);
        while (e == false){
            Ler p = new Ler();
        
            System.out.print("Conta: ");
            String conta = input.nextLine();

            if (conta.contains("s")){
                break;
            }
            input.close();
            p.Mudar(conta);

            float num1 = p.getNum1();
            float num2 = p.getNum2();
            String op = p.getOperador();

            Calculadora calculadora = new Calculadora();

            String resultado = calculadora.calculator(num1, op, num2);
            System.out.println(resultado);

        }
    }
}
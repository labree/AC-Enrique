//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Exercicio 1:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um outro inteiro: ");
        int num2 = scan.nextInt();
        int sum = num1+num2;
        int minus = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;
        System.out.println("Soma: " + sum + ", Subtracao: " + minus + ", multiplicacao: " + mult + ", Divisao: " + div);

        System.out.println("Exercicio 2: ");
        float num10 = (float) num1;
        float num20 = (float) num2;
        System.out.println("Versao float de num1: " + num10);
        System.out.println("Versao float de num2: " + num20);

        System.out.println("Exercico 3: ");
        System.out.println("Digite um salario: ");
        float sal = scan.nextFloat();
        System.out.println("Digite um percentual de aumento: ");
        float per = scan.nextFloat();
        float novo = (float) (sal * ( per * 0.01 + 1.0));
        System.out.println("Novo salario: " + novo);

        System.out.println("Exercicio 4:");
        System.out.println("Digite um rai de um circulo: ");
        float rad = scan.nextFloat();
        System.out.println("Perimetro: " + (rad * 2 * Math.PI) + ", Area: " + (rad*rad*Math.PI));

        System.out.println("Execicio 5: ");
        System.out.println("Digite um tempo em segundos: ");
        int se = scan.nextInt();
        int hours = se % 3600;
        se = se - (hours*3600);
        int mins = se % 60;
        se = se - (mins*60);
        System.out.println(hours + ":" + mins + ":" + se);

        System.out.println("Exercicio 6: ");
        System.out.println("Digite distancia: ");
        float per = scan.nextFloat();
    }
}
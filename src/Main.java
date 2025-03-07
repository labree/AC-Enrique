//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um outro inteiro: ");
        int num2 = scan.nextInt();
        int sum = num1+num2;
        int minus = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;
        System.out.println("Soma: " + sum + ", Subtração: " + minus + ", multiplicação: " + mult + ", Divisão: " + div);

        System.out.println("Exercício 2: ");
        float num10 = (float) num1;
        float num20 = (float) num2;
        System.out.println("Versão float de num1: " + num10);
        System.out.println("Versão float de num2: " + num20);

        System.out.println("Exercício 3: ");
        System.out.println("Digite um salário: ");
        float sal = scan.nextFloat();
        System.out.println("Digite um percentual de aumento: ");
        float per = scan.nextFloat();
        float novo = (float) (sal * ( per * 0.01 + 1.0));
        System.out.println("Novo salário: " + novo);

        System.out.println("Exercício 4:");
        System.out.println("Digite um raio de um círculo: ");
        float rad = scan.nextFloat();
        System.out.println("Perímetro: " + (rad * 2 * Math.PI) + ", Área: " + (rad*rad*Math.PI));

        System.out.println("Exercício 5: ");
        System.out.println("Digite um tempo em segundos: ");
        int se = scan.nextInt();
        int hours = se / 3600;
        se = se - (hours*3600);
        int mins = se / 60;
        se = se - (mins*60);
        System.out.println(hours + ":" + mins + ":" + se);

        System.out.println("Exercício 6: ");
        System.out.println("Digite distância em kilômetros como um float:  ");
        float dist = scan.nextFloat();
        System.out.println("Digite o tempo gasto em horas como um float: ");
        float time = scan.nextFloat();
        System.out.println("Digite a quantidade de gasolina gasto em litros como um float: ");
        float gas = scan.nextFloat();
        float kmh = dist/time;
        float kml = dist/gas;
        System.out.println("Na sua viagem tinha uma velocidade média de " + kmh + " KM/h e viajou usando " + kml + " KM/l");

        System.out.println("Exercício 7: ");
        System.out.println("Digite um inteiro: ");
        int n = scan.nextInt();
        boolean n1 = n%2 == 0;
        if(n1) {
            System.out.println("O número " + n + " é par");
        }
        else {
            System.out.println("O número " + n + " é ímpar");
        }

        System.out.println("Exercício 8: ");
        System.out.println("Digite a quantidade de kilowatts consumidas: ");
        float cons = scan.nextFloat();
        System.out.println("Digite o valor do kilowatt: ");
        float price = scan.nextFloat();
        double pay;
        if(cons < 150) {
            pay = (cons * price) * 0.9;
        }
        else {
            pay = cons * price;
        }
        System.out.println("Precisa pagar: $" + pay);

        System.out.println("Exercício 9: ");
        System.out.println("Digite um número com decimal: ");
        double num = scan.nextDouble();
        if(Math.ceil(num) - num < num - Math.floor(num)) {
            System.out.println("Número arredondado: " + Math.ceil(num));
        }
        else {
            System.out.println("Número arredondado: " + Math.floor(num));
        }

        System.out.println("Exercício 10: ");
        System.out.println("Digite um inteiro: ");
        int num5 = scan.nextInt();
        System.out.println("Digite um número inferior para definir um intervalo: ");
        int inter1 = scan.nextInt();
        System.out.println("Digite um número superior para definir um intervalo: ");
        int inter2 = scan.nextInt();
        if (num5 < inter1) {
            System.out.println("O número está antes do intervalo");
        }
        else if (num5 > inter2) {
            System.out.println("O número está depois do intervalo");
        }
        else {
            System.out.println("O número está dentro do intervalo");
        }

        System.out.println("Exercício 11: ");
        System.out.println("Qual operação matemática você queria fazer? Digite +, -, *, ou / ");
        String op = scan.next();
        System.out.println("Digite dois números para a operação: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c;
        String exp = "";
        switch (op) {
            case "+":
                c = a + b;
                exp = a + " " + op + " " + b + " = " + c;
                break;
            case "-":
                c = a - b;
                exp = a + " " + op + " " + b + " = " + c;
                break;
            case "*":
                c = a * b;
                exp = a + " " + op + " " + b + " = " + c;
                break;
            case "/":
                c = a / b;
                exp = a + " " + op + " " + b + " = " + c;
                break;
            default:
                System.out.println("Operador inválido");
        }
        System.out.println(exp);

        System.out.println("Exercício 12: ");
        System.out.println("Digite dois inteiros: ");
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        if (a1 > b1) {
            for (int i = b1; i < a1; i++) {
                if (i%2==0) {
                    System.out.println(i);
                }
            }
        }
        else {
            for (int i = a1; i < b1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("Exercício 13: ");
        System.out.println("Digite o número de alunos: ");
        int al = scan.nextInt();
        double tot = 0;
        for(int i = 0; i < al; i++) {
            System.out.println("Digite a nota do aluno " + (i+1) + ": ");
            tot += scan.nextDouble();
        }
        System.out.println("A média da turma é: " + (tot/al));

        System.out.println("Exercício 14: ");
        int alu = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double to = 0;
        double nota;
        System.out.println("Para sair desse processo, digite -1");
        while(true) {
            System.out.println("Digite a nota de aluno " + (alu+1) + ": ");
            nota = scan.nextDouble();
            if (nota == -1){
                break;
            }
            if (nota > max) {
                max = nota;
            }
            if (nota < min) {
                min = nota;
            }
            to += nota;
            alu++;
        }
        if (alu>0) {
            System.out.println("Quantidade de alunos: " + alu);
            System.out.println("Média da turma: " + (to / alu));
            System.out.println("A maior nota: " + max);
            System.out.println("A menor nota: " + min);
        }
        else {
            System.out.println("Nenhum aluno foi registrado");
        }

        System.out.println("Exercício 15: ");
        System.out.println("Para sair desse processo, digite .");
        String ch = "";
        String nums = "1234567890";
        int numsq = 0;
        String vowels = "aeiou";
        int vowelsq = 0;
        int othersq = 0;
        while (!ch.equals(".")) {
            System.out.println("Digite um caracter: ");
            ch = scan.next();
            if (nums.contains(ch)) {
                numsq++;
            }
            else if (vowels.contains(ch)) {
                vowelsq++;
            }
            else {
                othersq++;
            }
        }
        System.out.println("Total de números: " + numsq);
        System.out.println("Total de vogais: " + vowelsq);
        System.out.println("Total de demais: " + (othersq - 1));
    }
}
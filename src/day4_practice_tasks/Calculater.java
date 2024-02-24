package day4_practice_tasks;

public class Calculater {
    public static void main(String[] args) {

        int n1 =10;
        int n2 =20;

        char mathOperator = '+';

        switch (mathOperator) {

            case '+':
                System.out.println(n1+n2); break;
            case '-':
                System.out.println(n1-n2); break;
            case '*':
            System.out.println(n1*n2); break;
            case '/' :
            System.out.println(n1/n2);break;
            default:
                System.out.println("invalid operator");
        }
    }
}

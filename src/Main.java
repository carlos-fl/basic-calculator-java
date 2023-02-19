
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usr = new Scanner(System.in);
        System.out.println("escriba la expresion aritmetica a realizar");
        String expresion = usr.nextLine();

        try {
            double resultado;
            int operador = 0;
            int suma = expresion.indexOf('+');
            int resta = expresion.indexOf('-');
            int mult = expresion.indexOf('*');
            int div = expresion.indexOf('/');

            if(suma != -1) {operador = suma;}
            else if(resta != -1) {operador = resta;}
            else if(mult != -1) {operador = mult;}
            else if(div != -1) {operador = div;}

            String primerOperando = expresion.substring(0, operador);
            String segundoOperando = expresion.substring(operador + 1);

            double $primerOperando = Double.parseDouble(primerOperando);
            double $segundoOperando = Double.parseDouble(segundoOperando);

            resultado = $primerOperando + $segundoOperando;
            System.out.println("el resultado es: " + resultado);

        } catch(Exception e) {
            System.out.println("operacion no valida");
        }
    }
}
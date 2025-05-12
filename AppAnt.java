import java.util.Scanner;

public class AppAnt {

    static Scanner scanner = new Scanner(System.in);
    static int escolha;
    static int num1;
    static int num2;
    static boolean terminar = false;

    public static void main(String[] args) throws Exception {

        if(!terminar) {
            menu();

            escolha  = scanner.nextInt();
        
            switch (escolha) {
                case 0:
                    terminar = true;
                    break;
                    
                case 1:
                    somar();
                    break;

                case 2:
                    subtrair();
                    break;

                case 3:
                    multiplicar();
                    break;

                case 4:
                    dividir();
                    break;
            
                default:
                    menu();
                    break;
            }
        }
        
    }

    /** metodo para mostrar ao utilizador as opcoes */
    static public void menu() {

        System.out.println("---< CALCULADORA >---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Fechar");
        System.out.println("Ir para: ");
        
    }

    static public void somar() {
        System.out.println("---< SOMAR >---");
        num1 = numero();
        num2 = numero();
        System.out.println(Funcoes.soma(num1, num2));
        menu();
    }

    static public void subtrair() {
        System.out.println("---< SUBTRAIR >---");
        num1 = numero();
        num2 = numero();
        System.out.println(Funcoes.subtrai(num1, num2));
        menu();
    }

    static public void multiplicar() {
        System.out.println("---< MULTIPLICAR >---");
        num1 = numero();
        num2 = numero();
        System.out.println(Funcoes.multiplica(num1, num2));
        menu();
    }

    static public void dividir() {
        System.out.println("---< DIVIDIR >---");
        num1 = numero();
        num2 = numero();
        System.out.println(Funcoes.divide(num1, num2));
        menu();
    }

    static public int numero() {
        System.out.println("Escreva um numero:");
        int num = scanner.nextInt();
        return num;
    }
}


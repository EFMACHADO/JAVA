import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {

    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerfake = new Scanner(System.in);

    /** metodo para somar 2 numeros, o 1º e o 2º */
    static public int soma(int num1, int num2) {
        return (num1+num2);
    }

    /** metodo para subtrair 2 numeros, o 1º e o 2º */
    static public int subtrai(int num1, int num2) {
        return (num1-num2);
    }

    /** metodo para multiplicar 2 numeros, o 1º e o 2º */
    static public int multiplica(int num1, int num2) {
        return (num1*num2);
    }

    /** metodo para dividir 2 numeros, o 1º e o 2º */
    static public double divide(int num1, int num2) {
        if (num2 == 0){
            return 0;
        }
        return (num1/num2);
    }

    static public void verJogadoresExistentes(ArrayList<Jogador> jog){

        System.out.println("\n---< JOGADORES EXISTENTES >---");

        System.out.println("\n -> A equipa tem " + jog.size() + " jogadores");
        
        for (int i = 0; i < jog.size(); i++) {
            System.out.println("\n #" + (i + 1) + " : ");
            System.out.println(jog.get(i)); 
        }
    }

    static public Jogador adicionarJogador(ArrayList<Jogador> jogadores, Jogador newJog){


        System.out.println("\n---< ADICIONAR JOGADOR >---");

        System.out.println("\n Nome (String): ");
        newJog.setNome(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Apelido (String): ");
        newJog.setApelido(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Data Nascimento (LocalData): ");
        //newJog.setDataNascimento(scanner.??());
        //scannerfake.nextLine();

        System.out.println("\n Nacionalidade (String): ");
        newJog.setNacionalidade(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Altura (int): ");
        newJog.setAltura(scanner.nextInt());
        //scannerfake.nextLine();

        System.out.println("\n Peso (int): ");
        newJog.setPeso(scanner.nextInt());
        //scannerfake.nextLine();

        System.out.println("\n Posicao (String): ");
        newJog.setPosicao(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Escalao (String): ");
        newJog.setEscalao(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Numero Camisola (int): ");
        newJog.setNumeroCamisola(scanner.nextInt());
        //scannerfake.nextLine();

        System.out.println("\n ValorMercado (String): ");
        newJog.setValorMercado(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Clausula Rescisao (String): ");
        newJog.setClausulaRescisao(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Fim Contrato (LocalData): ");
        //newJog.setFimContrato(scanner.??());
        //scannerfake.nextLine();

        System.out.println("\n Jogador Adicionado!");

        return newJog;
    }

    static public int removerJogador(int remove){

        System.out.println("\n---< ADICIONAR JOGADOR >---");

        System.out.println("\n Remover Jogador Numero #: ");
        remove = scanner.nextInt();

        System.out.println("\n Jogador #" + (remove-1) + " Removido!");

        return (remove-1);
    }

    static public void verEquipaTecnicaExistente(ArrayList<EquipaTecnica> equipaTec){

        System.out.println("\n---< EQUIPA TECNICA EXISTENTE >---");

        System.out.println("\n -> A equipa tem " + equipaTec.size() + " tecnicos");

        for (int i = 0; i < equipaTec.size(); i++) {
            System.out.println("\n #" + (i + 1) + " : ");
            System.out.println(equipaTec.get(i)); 
        }
    }

    static public EquipaTecnica adicionarTecnico(ArrayList<EquipaTecnica> equipaTec, EquipaTecnica newTec){

        System.out.println("\n---< ADICIONAR TECNICO >---");

        System.out.println("\n Nome (String): ");
        newTec.setNome(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Data Nascimento (LocalData): ");
        //newTec.setDataNascimento(scanner.??());
        //scannerfake.nextLine();

        System.out.println("\n Apelido (String): ");
        newTec.setCargo(scanner.nextLine());
        //scannerfake.nextLine();

        System.out.println("\n Tecnico Adicionado!");

        return newTec;
    }

    static public int removerTecnico(int remove){

        System.out.println("\n---< ADICIONAR JOGADOR >---");

        System.out.println("\n Remover Jogador Numero #: ");
        remove = scanner.nextInt();

        System.out.println("\n Jogador #" + (remove-1) + " Removido!");

        return (remove-1);
    }
}

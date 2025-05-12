import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // ------------< CRIACAO DE LISTAS DE ARRAYS.
    static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    static ArrayList<EquipaTecnica> equipaTecnica = new ArrayList<EquipaTecnica>();

    static Jogador novoJogador = new Jogador();
    static EquipaTecnica novoTecnico = new EquipaTecnica();
    
    static Scanner scanner = new Scanner(System.in);
    static int escolha;
    static int remover;
    static boolean terminar = false;
    static boolean voltar = false;

    static public void menu() {

        do {
            System.out.println("\n---< MENU >---");
            System.out.println(" 1 - Gerir Jogadores");
            System.out.println(" 2 - Gerir Equipa Tecninca");
            System.out.println(" 0 - Fechar");
            System.out.println(" Ir para: ");

            escolha  = scanner.nextInt();
        
            switch (escolha) {
                case 0:
                    terminar = true;
                    break;
                    
                case 1:

                    do {

                        System.out.println("\n---< GERIR JOGADORES >---");
                        System.out.println(" 1 - Ver Jogadores Existentes");
                        System.out.println(" 2 - Adicionar Jogador");
                        System.out.println(" 3 - Remover Jogador");
                        System.out.println(" 0 - Voltar");
                        System.out.println(" Ir para: ");
                        
                        escolha  = scanner.nextInt();

                        switch (escolha) {
                            case 0:
                                voltar = true;
                                break;
                                
                            case 1:
                                Funcoes.verJogadoresExistentes(jogadores);
                                break;
            
                            case 2:
                                jogadores.add(Funcoes.adicionarJogador(jogadores, novoJogador));
                                break;

                            case 3:
                                jogadores.remove(Funcoes.removerJogador(remover));
                                break;
                        
                            default:
                                break;
                        }

                    } while (!voltar);

                    break;

                case 2:

                    do {

                        System.out.println("\n---< GERIR EQUIPA TECNICA >---");
                        System.out.println(" 1 - Ver Equipa Tecnica Existente");
                        System.out.println(" 2 - Adicionar Tecnico");
                        System.out.println(" 3 - Remover Tecnico");
                        System.out.println(" 0 - Voltar");
                        System.out.println(" Ir para: ");

                        escolha  = scanner.nextInt();

                        switch (escolha) {
                            case 0:
                                voltar = true;
                                break;
                                
                            case 1:
                                Funcoes.verEquipaTecnicaExistente(equipaTecnica);
                                break;
            
                            case 2:
                                Funcoes.adicionarTecnico(equipaTecnica, novoTecnico);
                                break;

                            case 3:
                                equipaTecnica.remove(Funcoes.removerTecnico(remover));
                                break;
                        
                            default:
                                break;
                        }

                    } while (!voltar);

                    break;
            
                default:
                    break;
            }
            
        } while (!terminar);
    }  

    public static void main(String[] args) throws Exception {

        //-----------------< CRIAR E ADICIONAR EQUIPA TECNICA E JOGADORES AOS RESPECTIVOS ARRAYS>-----------------

        // ------------< CRIACAO DA EQUIPA TECNICA
        equipaTecnica.add(new EquipaTecnica(
            "Luis Santos",
            LocalDate.of(1988, 10, 7),
            "Treinador"
        ));

        equipaTecnica.add(new EquipaTecnica(
            "Alberto Valores",
            LocalDate.of(1991, 12, 26),
            "Treinador Adjunto"
        ));

        // ------------< CRIACAO DE JOGADORES
        jogadores.add(new Jogador(
            "Mateus Arante",
            "Tz", 
            LocalDate.of(2000, 5, 8), 
            "Portugal",
            172,
            68,
            "Avancado",
            "SUB17",
            34,
            "30M€",
            "#",
            LocalDate.of(2026, 7, 1)
        ));

        jogadores.add(new Jogador(
            "Eduardo Machadinho",
            "Machado", 
            LocalDate.of(2003, 1, 28), 
            "Portugal",
            178,
            70,
            "Defesa Central",
            "SUB17",
            2,
            "40M€",
            "60M€",
            LocalDate.of(2025, 12, 1)
        ));
        
        jogadores.add(new Jogador(
            "Fred Rico",
            "Comilao", 
            LocalDate.of(2010, 2, 11), 
            "Jamaica",
            167,
            74,
            "Guarda Redes",
            "SUB17",
            5,
            "140M€",
            "200M€",
            LocalDate.of(2027, 1, 1)
        ));

        jogadores.add(new Jogador(
            "Tiago Rafa",
            "Vizela", 
            LocalDate.of(2005, 6, 20), 
            "Espanha",
            128,
            50,
            "Extremo Esquerdo",
            "SUB17",
            72,
            "5M€",
            "#",
            LocalDate.of(2027, 3, 1)
        ));

            //Jogador jog4 = new Jogador();
            //jog4.setNome("Tomas Granja");
            //jog4.setEscalao("SUB17");

            //jogadores.add(jog2);
            //jogadores.add(jog3);
            //jogadores.add(jog4);

            //jogadores.remove(3);

        // ------------< DIZ QUANTOS JOGADORES TEM NO ARRAY


            //System.out.println(jog1.toString());
            //System.out.println(jog2.toString());
            //System.out.println(jog3.toString());
            //System.out.println(jog4.toString());


        menu();

        scanner.close();

    }
}


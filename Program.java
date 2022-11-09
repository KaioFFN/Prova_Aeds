import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int op ;
        String email , nome , url , desc;
        Scanner input = new Scanner(System.in);
        InstaPet insta;
        insta = new InstaPet();
        System.out.println("\tBem vindo ao InstaPet digite a opção desejada");
            do {
         
        System.out.println("\t\t01 Cadastrar novo usuario");
        System.out.println("\t\t02 Cadastrar foto usuario");
        System.out.println("\t\t03 Imprimir usuarios ja cadastrados");
        System.out.println("\t\t04 Imprimir fotos de um usuario");
        System.out.println("\t\t05 Imprimir quantidade de um usuario");
        System.out.println("\t\t06 Imprimir quantidade de fotos de um usuario");
        System.out.println("\t\t07 Alterar descrição de uma foto");
        System.out.println("\t\t00 Sair arquivo");
        System.out.print("\t\tDigite: ");
        op = input.nextInt();
        System.out.println();
        switch (op) {
            case 1: 
                System.out.println();
                System.out.print("\t\tDigite o nome: ");
                nome = input.next();
                System.out.print("\t\tDigite o email: ");
                email = input.next();
                insta.cadastra_usuario(nome, email);
                System.out.println();
                break;
            case 2:
                System.out.println();
                input.nextLine();
                System.out.println("\t\tDigite o email do usuario");
                email = input.next();
                System.out.println("\t\tDigite a url");
                url = input.next();
                System.out.println("\t\tDigite a descrição da foto");
                input.nextLine();
                desc = input.nextLine();
                insta.cadastra_foto(email, url, desc);
                System.out.println();
                break;
            case 3:
                insta.listar_usuarios();
                break;
            case 4:
                System.out.println("\t\tDigite o email desejado");
                email = input.next();
                insta.listarFotos(email);
                break;
            case 5: 
                System.out.println("\t\t" + "Possui " + insta.qnt_usuarios() + " usuarios");
                System.out.println();
              break;
            case 6:
                System.out.println("\t\tDigite o Email");
                email = input.next();
                insta.qnt_pets(email);
                break;
            case 7:
                int numFotoMudarDescricao;
                System.out.println("\t\tDigite o email do usuario");
                email = input.next();
                System.out.println("\t\tDigite a descrição");
                input.nextLine();
                desc = input.nextLine();
                System.out.println("\t\tNumero da foto");
                numFotoMudarDescricao = input.nextInt();
                insta.altera_descricao(email, numFotoMudarDescricao, desc);
                break;
            default:
                break;
            
        }
    } while (op != 0);
    } 
}
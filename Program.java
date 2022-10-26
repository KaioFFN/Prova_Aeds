import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int op ;
        String email , nome;
        Scanner input = new Scanner(System.in);
        InstaPet insta;
        insta = new InstaPet();
       do {
         
        System.out.println("\tBem vindo ao InstaPet digite a opção desejada");
        System.out.println("\t\t01 Cadastrar novo usuario");
        System.out.println("\t\t02 Imprimir usuarios ja cadastrados");
        System.out.println("\t\t03 Imprimir fotos de um usuario");
        System.out.println("\t\t04 Imprimir quantidade de um usuario");
        System.out.println("\t\t05 Imprimir quantidade de fotos de um usuario");
        System.out.println("\t\t06 Alterar descrição de uma foto");
        System.out.print("\t\tDigite: ");
        op = input.nextInt();
        switch (op) {
            case 1:
            System.out.println("\t\tDigite o nome: ");
            nome = input.next();
            System.out.println("\t\tDigite o email: ");
            email = input.next();
            insta.cadastra_usuario(nome , email);
            break;
            case 2:
            insta.listar_usuarios();
            break;
            case 4: 
            System.out.println(insta.qnt_usuarios());
            break;
            default:
                break;
        }
    } while (op != 0);
    } 
}
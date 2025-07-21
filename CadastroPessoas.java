import java.util.Scanner;

public class CadastroPessoas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você quer cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nPessoa número:" + i);

            System.out.println("Digite o nome:");
            String nome = String.valueOf(scanner.nextLine());

            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade > 18) {
                System.out.println(nome + " é maior de idade");
            } else
                System.out.println(nome + " é menor de idade");
        }

        scanner.close();
    }
}

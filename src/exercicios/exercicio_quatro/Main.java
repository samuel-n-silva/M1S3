package exercicios.exercicio_quatro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opc = 0;
        boolean imprimir = false;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

       do {

           System.out.print("[1] Adicionar Pessoa, [2] Listar Pessoas, [5]Sair : ");
           imprimir = true;
           opc = ler.nextInt();

           switch (opc){
               case 1:
                   ler.nextLine();
                   System.out.println("Nova Pessoa [1]Pessoa Fisica, [2]Pessoa Juridica");
                   opc = ler.nextInt();

                   switch (opc){
                       case 1:
                           ler.nextLine();
                           System.out.print("Nome da Pessoa: ");
                           String nome = ler.nextLine();
                           System.out.print("Informe o cpf: ");
                           String cpf = ler.nextLine();
                           //Adicionar Pessoa
                           Pessoa novaPessoa = new PessoaFisica(nome,cpf);
                           pessoas.add(novaPessoa);
                           imprimir = false;
                           System.out.println("Pessoa adicionada, pressione enter para continuar...");
                           ler.nextLine();
                           break;
                       case 2:
                           ler.nextLine();
                           System.out.print("Nome da Pessoa: ");
                           String nome2 = ler.nextLine();
                           System.out.print("Informe o cnpj: ");
                           String cnpj = ler.nextLine();
                           //Adicionar Pessoa
                           Pessoa novaPessoa2 = new PessoaJuridica(nome2,cnpj);
                           pessoas.add(novaPessoa2);
                           imprimir = false;
                           System.out.println("Pessoa adicionada, pressione enter para continuar...");
                           ler.nextLine();
                           break;
                       default:
                           System.out.println("Opção invalida!");
                           break;
                   }
               case 2:
                   if (imprimir){
                       for(Pessoa pessoa:pessoas)
                           if (pessoa instanceof PessoaJuridica){
                               PessoaJuridica pessoaJuridica = (PessoaJuridica)pessoa;
                               System.out.println("Pessoas Juridicas");
                               System.out.println("Nome/Razão : "+pessoaJuridica.getNome()+" Cnpf: "+pessoaJuridica.getCnpj());
                           }
                       for(Pessoa pessoa:pessoas)
                           if (pessoa instanceof PessoaFisica){
                               PessoaFisica pessoaFisica = (PessoaFisica)pessoa;
                               System.out.println("Pessoas Fisicas");
                               System.out.println("Nome : "+pessoaFisica.getNome()+" Cpf: "+pessoaFisica.getCpf());
                           }
                   }
                   break;
               default:
                   break;
           }

       }while (opc !=5);
    }
}

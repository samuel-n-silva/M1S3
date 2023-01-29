package exercicios.exercicio_cinco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc = 0;
        ArrayList<Carro> carros = new ArrayList<Carro>();

        try{
            do {
                System.out.println("[1]Cadastrar novo carro, [2]Listar carros, [3]Sair");
                opc = ler.nextInt();
                ler.nextLine();

                switch (opc){
                    case 1:

                            System.out.print("Informe a marca do carro: ");
                            String carro = ler.nextLine();

                            System.out.print("Informe o Modelo do carro: ");
                            String tipo = ler.nextLine();

                            System.out.print("Informe o tipo de combustivel: ");
                            String combustivel = ler.nextLine();

                            System.out.print("Informe categoria do carro: ");
                            String categoria = ler.nextLine();

                            System.out.print("Informe o ano do carro: ");
                            int ano = ler.nextInt();
                            ler.nextLine();

                            Carro car = new Carro(carro, tipo, combustivel, categoria, ano);
                            carros.add(car);

                            System.out.println("Carro adicionado com Sucesso pessione enter para continuar ...");
                            ler.nextLine();
                        break;
                    case 2:
                        for (int i = 0; i < carros.size(); i++) {
                            Carro car2 = carros.get(i);
                            System.out.print("Nome: " + car2.getMarca()+car2);
                            System.out.print(" Modelo: " + car2.getTipo());
                            System.out.print(" Combustível: " + car2.getCombustivel());
                            System.out.print(" Categoria: " + car2.getCategoria());
                            System.out.println(" Ano: "+ car2.ano());
                            System.out.println("--------------");
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opção informada invalida!");
                }
            }while (opc != 3);

        }catch (Exception erro){
            System.out.println("erro dados incorretos !!");
        }
    }
}

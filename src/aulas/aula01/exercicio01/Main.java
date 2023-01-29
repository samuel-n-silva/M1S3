package aulas.aula01;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Funcionario funcionario01 = new Funcionario("Samuel Nunes","83123012.91",25,1400,"Desenvolvedor Jr");
        NumberFormat moedaBRL = NumberFormat.getCurrencyInstance();
        System.out.println(funcionario01.nomeCompleto+" "+funcionario01.cargo+" "+moedaBRL.format(funcionario01.salario)+" "+funcionario01.cpf);
    }
}

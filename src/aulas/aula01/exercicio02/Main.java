package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Animal;

public class Main{
    public static void main(String[] args) {
        Sapo novoSapo = new Sapo("Jorginho", 3, "vermelha","não");
        Pato novoPato = new Pato("Cadu",3,"Ganço","não");
        Crocodilo novoCrocodilo = new Crocodilo("Zé",3,"Sim","Zoo");
        Tubarao novoTubarao = new Tubarao("Camila",5,"Tubarão Martelo","Sim");
        Cachorro novoCachorro = new Cachorro("Juninho",2,"não","sim");
        Gato novoGato = new Gato("Béne",2,"sim","Não");
        Morcego novoMorcego = new Morcego("riquinho",2,"Não","Zoo");

        System.out.println(novoSapo.nome+" Cor da pele:"+novoSapo.pele+" Status:");
        System.out.println(novoPato.nome+" Especie:"+novoPato.especie);
        System.out.println(novoCrocodilo.nome+" Local:"+novoCrocodilo.local);
        System.out.println(novoTubarao.nome+" Especie:"+novoTubarao.especie+" Alimentado:"+novoTubarao.alimentado);
        System.out.print(novoCachorro.nome+" Treinado:"+novoCachorro.treinado+" Idade:"+novoCachorro.idade);
        novoCachorro.andar();
        System.out.println(novoGato.nome+" idade:"+novoGato.idade);
        System.out.print(novoMorcego.nome+" Idade:"+novoMorcego.idade+" Local: "+novoMorcego.local);
        novoMorcego.andar();
        novoMorcego.comer();
    }
}

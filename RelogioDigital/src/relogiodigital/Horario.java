package relogiodigital;

/**
 *
 * @author Matheus Fidelis - 11211100176 / Renato Kishi Cardoso - 11221401522
 */
public class Horario {

    public static void main(String[] args) {
        Relogio r = new Relogio();
        System.out.println("Utilizando construtor vazio");
        System.out.println("Horário: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("\n\n");

        r.setHora(115);
        r.setMinuto(70);
        r.setSegundo(98);

        System.out.println("Utilizando construtor que requer hora, minuto e segundo");
        System.out.println("OBS: Não terá hora, pois todos os dados inseridos são rejeitados");
        System.out.println("Horário: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("\n\n");

        r.setHora(20);

        System.out.println("Utilizando construtor que requer somente hora");
        System.out.println("Horário: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("\n\n");

        r.setHora(10);
        r.setMinuto(30);

        System.out.println("Utilizando construtor que requer hora e minuto");
        System.out.println("Horário: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("\n\n");

        r.setHora(13);
        r.setMinuto(40);
        r.setSegundo(10);

        System.out.println("Utilizando construtor vazio, mas atribuindo valores através dos metodos de acesso");
        System.out.println("Horário: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("\n\n");

    }
}

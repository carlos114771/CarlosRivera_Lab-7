/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg7;

/**
 *
 * @author Usuario Dell
 */
public class Minotauro extends Guerreros {

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, Double poder_ataque,
            Double poder_defensas, Double salud, Double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensas, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString() + "Minotauro{" + '}';
    }

    @Override
    public void Ataque(Guerreros g) {
        double vida1, vida2, porciento, suma, ataque1, ataque2;
        porciento = g.getPoder_defensas() * .50;
        suma = g.getPoder_defensas() * porciento;
        vida1 = (this.getPoder_ataque() * 2) - suma;
        vida2 = g.getSalud() - vida1;
        g.setSalud(vida2);
        ataque1 = g.getPoder_ataque() * .10;
        ataque2 = g.getPoder_ataque() * ataque1;
        g.setPoder_ataque(ataque2);
    }

}

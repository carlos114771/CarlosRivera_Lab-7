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
public class Dragón extends Guerreros {

    public Dragón() {
        super();
    }

    public Dragón(String nombre, String nickname, Double poder_ataque, Double poder_defensas, Double salud, Double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensas, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString() + "Drag\u00f3n{" + '}';
    }

    @Override
    public void Ataque(Guerreros g) {
        double salud_rival;
        double pode_ataque, defensa_rival1, defensa_rival2, resta_salud;
        pode_ataque = g.getPoder_ataque() * 0.35;
        salud_rival = (g.getPoder_ataque() + pode_ataque) - g.getPoder_defensas();
        defensa_rival1 = g.getPoder_defensas() * .15;
        defensa_rival2 = g.getPoder_defensas() - defensa_rival1;
        g.setPoder_defensas(defensa_rival2);
        resta_salud = g.getSalud() - salud_rival;
        g.setSalud(resta_salud);

    }

}

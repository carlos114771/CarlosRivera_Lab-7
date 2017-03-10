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
public class Fénix extends Guerreros {

    public Fénix() {
        super();
    }

    public Fénix(String nombre, String nickname, Double poder_ataque, Double poder_defensas, Double salud, Double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensas, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString() + "F\u00e9nix{" + '}';
    }

    @Override
    public void Ataque(Guerreros g) {
        double salud_rival;
        double poder_ataque, ataque_rival1, ataque_rival2, resto_salud;
        poder_ataque = g.getPoder_ataque() * .75;
        salud_rival = (g.getPoder_ataque() + poder_ataque) - g.getPoder_defensas();
        resto_salud = g.getSalud() * salud_rival;
        g.setSalud(resto_salud);
        ataque_rival1 = g.getPoder_ataque() * .05;
        ataque_rival2 = g.getPoder_ataque() - ataque_rival1;
        g.setPoder_ataque(ataque_rival2);
    }

}

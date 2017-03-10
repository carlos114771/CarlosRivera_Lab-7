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
public abstract class Bestia extends Guerreros {

    public abstract void Ataque();

    public Bestia() {
        super();
    }

    public Bestia(String nombre, String nickname, Double poder_ataque, 
            Double poder_defensas, Double salud, Double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensas, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString() + "Bestia{" + '}';
    }

}

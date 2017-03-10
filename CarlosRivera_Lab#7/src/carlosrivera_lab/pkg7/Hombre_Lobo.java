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
public class Hombre_Lobo extends Bestia {

    public Hombre_Lobo() {
        super();
    }

    public Hombre_Lobo(String nombre, String nickname, Double poder_ataque, Double poder_defensas, Double salud, Double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensas, salud, puntos);
    }

    @Override
    public String toString() {
        return super.toString() + "Hombre_Lobo{" + '}';
    }

    @Override
    public void Ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

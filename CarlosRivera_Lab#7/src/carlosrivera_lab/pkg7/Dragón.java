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
public class Dragón extends Guerreros{

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
    public void Ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

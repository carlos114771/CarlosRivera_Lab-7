/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg7;

import java.io.Serializable;

/**
 *
 * @author Usuario Dell
 */
public abstract class Guerreros implements Serializable {

    String nombre;
    String nickname;
    Double poder_ataque;
    Double poder_defensas;
    Double salud;
    Double puntos;

    private static final long SerialVersionUID = 777L;

    public abstract void Ataque(Guerreros g);

    public Guerreros() {
    }

    public Guerreros(String nombre, String nickname, Double poder_ataque,
            Double poder_defensas, Double salud, Double puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.poder_ataque = poder_ataque;
        this.poder_defensas = poder_defensas;
        this.salud = salud;
        this.puntos = puntos;
        setSalud(salud);
        setPoder_ataque(poder_ataque);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(Double poder_ataque) {
        if (poder_ataque > 200 && poder_ataque < 300) {
            this.poder_ataque = poder_ataque;
        }

    }

    public Double getPoder_defensas() {
        return poder_defensas;
    }

    public void setPoder_defensas(Double poder_defensas) {
        if (this.poder_defensas > 25 && this.poder_defensas < 75) {

            this.poder_defensas = poder_defensas;
        }
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        if (salud > 800) {

            this.salud = salud;
        }
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}

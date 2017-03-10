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
public class Alumno extends Guerreros {

    int numero_cuenta;
    String carrera;
    int edad;

    public Alumno() {
        super();
    }

    public Alumno(int numero_cuenta, String carrera, int edad, String nombre,
            String nickname, Double poder_ataque, Double poder_defensas,
            Double salud, Double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensas, salud, puntos);
        this.numero_cuenta = numero_cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numero_cuenta=" + numero_cuenta
                + ", carrera=" + carrera + ", edad=" + edad + '}';
    }

    @Override
    public void Ataque(Guerreros g) {
        double vida_rival, resta, vida_alumno, porcentaje;
        resta = this.getPoder_ataque() - g.getPoder_defensas();
        vida_rival=g.getSalud()-resta;
        g.setSalud(vida_rival);
        porcentaje=this.getSalud()*0.25;
        vida_alumno=this.getSalud()+porcentaje;
        this.setSalud(vida_alumno);
        

    }

}

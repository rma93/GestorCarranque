/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservas;

import Instalaciones.Instalaciones;
import Personas.Personas;

/**
 *
 * @author RubenMA
 */
public class Reservas {
    int codigo;
    Instalaciones tipoInst = new Instalaciones ();
    Personas tipoPers = new Personas();

    public Reservas(int codigo) {
        this.codigo = codigo;
    }
    
    
}

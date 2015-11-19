/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

import Personas.Personas;

/**
 *
 * @author RubenMA
 */
public class Actividades {
    private String lugar;
    private String fechaIni;
    private String fechaFin;
    private String horarioIni;
    private String horarioFin;
    private String[] material;

    public Actividades(String lugar, String fechaIni, String fechaFin, String horarioIni, String horarioFin, String[] material, double mensualidad, boolean seguroPerdidas) {
        this.lugar = lugar;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.horarioIni = horarioIni;
        this.horarioFin = horarioFin;
        this.material = material;
        this.mensualidad = mensualidad;
        this.seguroPerdidas = seguroPerdidas;
    }
    Personas monitor = new Personas();
    private double mensualidad;
    public boolean seguroPerdidas;
}

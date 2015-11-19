/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instalaciones;

/**
 *
 * @author RubenMA
 */
public class Instalaciones {
    private String horarioA;
    private String horarioC;
    private String fechaIni;
    private String fechaFin;
    private int codigoInstalacion;
    private int numTipoInst;

    public Instalaciones(){
        
    }
    public Instalaciones(String horarioA, String horarioC, String fechaIni, String fechaFin, int codigoInstalacion, int numTipoInst) {
        this.horarioA = horarioA;
        this.horarioC = horarioC;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.codigoInstalacion = codigoInstalacion;
        this.numTipoInst = numTipoInst;
    }

    public String getHorarioA() {
        return horarioA;
    }

    public String getHorarioC() {
        return horarioC;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getCodigoInstalacion() {
        return codigoInstalacion;
    }

    public int getNumTipoInst() {
        return numTipoInst;
    }

    public void setHorarioA(String horarioA) {
        this.horarioA = horarioA;
    }

    public void setHorarioC(String horarioC) {
        this.horarioC = horarioC;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCodigoInstalacion(int codigoInstalacion) {
        this.codigoInstalacion = codigoInstalacion;
    }

    public void setNumTipoInst(int numTipoInst) {
        this.numTipoInst = numTipoInst;
    }
        
}

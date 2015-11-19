/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author RubenMA
 */
public class Personas {
    private int codigo;
    private String pass;
    private String nombre;
    private String dni;
    private String apellido;
    private String direccion;
    private String tel;
    private char sexo;
    private String email;

    
    public Personas(){
        
    }
       
    public Personas(int codigo, String pass, String nombre, String dni, String apellido, String direccion, String tel, char sexo, String email) {
        this.codigo = codigo;
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tel = tel;
        this.sexo = sexo;
        this.email = email;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal4;

/**
 *
 * @author aluno
 */
public abstract class Militar implements Carreira {
  private int matricula;
  private String patente;

  public Militar(int matricula, String patente) {
    this.matricula = matricula;
    this.patente = patente;
  }

  public int getMatricula() {
    return matricula;
  }

  public String getPatente() {
    return patente;
  }
}



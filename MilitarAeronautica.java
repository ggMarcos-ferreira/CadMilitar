/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal4;
/**
 *
 * @author aluno
 */
public class MilitarAeronautica extends Militar {
  private int horasDeVoo;
  private int tempoNaPatente;

  public MilitarAeronautica(int matricula, String patente, int horasDeVoo, int tempoNaPatente) {
    super(matricula, patente);
    this.horasDeVoo = horasDeVoo;
    this.tempoNaPatente = tempoNaPatente;
  }

  @Override
  public boolean podeProguedir() {
    return tempoNaPatente > 2 && horasDeVoo > 100;
  }

}
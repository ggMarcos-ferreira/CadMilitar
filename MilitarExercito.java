/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal4;

/**
 *
 * @author aluno
 */
public class MilitarExercito extends Militar {
  private boolean participouDeGuerra;
  private boolean paisGanhouGuerra;

  public MilitarExercito(int matricula, String patente, boolean participouDeGuerra, boolean paisGanhouGuerra) {
    super(matricula, patente);
    this.participouDeGuerra = participouDeGuerra;
    this.paisGanhouGuerra = paisGanhouGuerra;
  }
  
  @Override
    public boolean podeProguedir(){
        return participouDeGuerra && paisGanhouGuerra;
  }
}

   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal4;

/**
 *
 * @author aluno
 */
public class MilitarMarinha extends Militar {
  private boolean consertoAviaoAltoMar;

  public MilitarMarinha(int matricula, String patente, boolean consertoAviaoAltoMar) {
    super(matricula, patente);
    this.consertoAviaoAltoMar = consertoAviaoAltoMar;
  }

  @Override
  public boolean podeProguedir(){
    return consertoAviaoAltoMar;
  }
}

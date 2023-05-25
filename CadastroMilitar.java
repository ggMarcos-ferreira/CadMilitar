/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */

class CadastroMilitar {
  private List<Militar> militares;

  public CadastroMilitar() {
    militares = new ArrayList<>();
  }

  public void adicionarMilitar(Militar militar) {
    militares.add(militar);
  }

  public List<Militar> militaresQuePodemProgredir() {
    List<Militar> militaresProgrediveis = new ArrayList<>();
    for (Militar militar : militares) {
      if (militar instanceof Carreira) {
        Carreira carreira = (Carreira) militar;
        if (carreira.podeProguedir()) {
          militaresProgrediveis.add(militar);
        }
      }
    }
    return militaresProgrediveis;
  }

  public void realizarProgressao() {
    List<Militar> militaresProgrediveis = militaresQuePodemProgredir();
    for (Militar militar : militaresProgrediveis) {
      // Realizar a progressão aqui
      System.out.println("Militar " + militar.getMatricula() + " progrediu na carreira.");
    }
  }
}
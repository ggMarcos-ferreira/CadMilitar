/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */
public class Principal4 {
  public static void main(String[] args) {
    CadastroMilitar cadastro = new CadastroMilitar();

    // Criando militares de diferentes divisões
    MilitarAeronautica militarAeronautica = new MilitarAeronautica(01, "Tenente", 150, 3);
    MilitarExercito militarExercito = new MilitarExercito(02, "Soldado", true, true);
    MilitarMarinha militarMarinha = new MilitarMarinha(03, "Cabo", true);

    // Adicionando os militares ao cadastro
    cadastro.adicionarMilitar(militarAeronautica);
    cadastro.adicionarMilitar(militarExercito);
    cadastro.adicionarMilitar(militarMarinha);

    // Apresentando os dados dos militares que podem progredir de patente
    List<Militar> militaresProgrediveis = cadastro.militaresQuePodemProgredir();
    System.out.println("Militares que podem progredir de patente:");
    for (Militar militar : militaresProgrediveis) {
      System.out.println("Matrícula: " + militar.getMatricula());
      System.out.println("Patente: " + militar.getPatente());
      System.out.println();
    }

    // Realizando a progressão dos militares aptos a progredir
    cadastro.realizarProgressao();
  }
}


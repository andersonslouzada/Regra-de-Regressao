package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * The type Works.
 */
public class Works {

  /**
   * Create works.
   */
  public void createWorks() {
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    Scanner scanner = new Scanner(System.in);

    String quantitatyWorks = scanner.nextLine();
    int quantitaty = Integer.parseInt(quantitatyWorks);

    String[] worksName = new String[quantitaty];
    int[] worksWeight = new int[quantitaty];
    int[] worksNote = new int[quantitaty];

    int work = 0;
    while (work < quantitaty) {

      System.out.println("Digite o nome da atividade " + (work + 1) + ": ");
      worksName[work] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (work + 1) + ": ");
      worksWeight[work] = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + worksName[work] + ": ");
      worksNote[work] = Integer.parseInt(scanner.nextLine());
      work += 1;
    }

    scanner.close();

    verifyWeight(worksWeight);

    calculateNote(worksWeight, worksNote);
  }

  /**
   * Verify weight.
   *
   * @param weights the weights
   */
  public void verifyWeight(int[] weights) {
    int quantitaty = 0;
    int sum = 0;

    while (quantitaty < weights.length) {
      sum += weights[quantitaty];
      quantitaty++;
    }

    if (sum != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }

  /**
   * Calculate note.
   */
  public void calculateNote(int[] weights, int[] notes) {
    float sum = 0.0f;
    for (int i = 0; i < weights.length; i++) {
      sum += weights[i] * notes[i];
    }

    float result = sum / 100f;

    if (result >= 85) {
      System.out.println("Parabéns! Você alcançou " + result
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else if (result < 85) {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + result
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}

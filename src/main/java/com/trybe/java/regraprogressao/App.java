package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    Scanner scanner = new Scanner(System.in);

    String quantitatyWorks = scanner.nextLine();
    int quantitaty = Integer.parseInt(quantitatyWorks);

    String[] worksName = new String[quantitaty];
    int[] worksWeigth = new int[quantitaty];
    int[] worksNote = new int[quantitaty];

    int work = 0;
    while (work < quantitaty) {
      System.out.println("Digite o nome da atividade " + (work + 1) + ": ");
      worksName[work] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (work + 1) + ": ");
      worksWeigth[work] = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + worksName[work] + ": ");
      worksNote[work] = Integer.parseInt(scanner.nextLine());
      work += 1;


    }
    scanner.close();
  }
}
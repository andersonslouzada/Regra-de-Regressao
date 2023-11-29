package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class Works {

  public void createWorks() {
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    Scanner scanner = new Scanner(System.in);

    String quantitatyWorks = scanner.nextLine();
    int quantitaty = Integer.parseInt(quantitatyWorks);

    String[] worksName = new String[quantitaty];
    int[] worksWeigth = new int[quantitaty];

    int work = 0;
    while (work < quantitaty) {
      System.out.println("Digite o nome da atividade " + (work + 1) + ":");
      String name = scanner.nextLine();
      worksName[work] = name;

      System.out.println("Digite o peso da atividade " + worksName[work] + ":");
      String weight = scanner.nextLine();
      worksWeigth[work] = Integer.parseInt(weight);
      work += 1;
    }
    scanner.close();
  }
}

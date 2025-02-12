package com.sampson.menu;

import java.util.Scanner;

public class Menu {

    public void showMenu(){
        var scanner = new Scanner(System.in);
        var option = 0;

        do{
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Consultar saldo: ");
            System.out.println("2 - Consultar cheque especial: ");
            System.out.println("3 - Depositar dinheiro: ");
            System.out.println("4 - Sacar dinheiro: ");
            System.out.println("5 - Pagar um boleto: ");
            System.out.println("6 - Verificar se a conta está usando o cheque especial: ");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
        } while (option != 0);
    }
}

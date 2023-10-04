package com.house;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.joda.time.DateTime;
import org.json.simple.parser.ParseException;
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException, ParseException
    {
        

        try (Scanner sc = new Scanner(System.in)) { //sc.String deletado e try adicionado para remover recourse leak
        DateTime.now();
        DateTime dt = new DateTime();
        HouseQuarto quar = new HouseQuarto();
        Quarto objQuarto;
        
        int menu = 0;
        String nome, comodo;
        boolean test;

        quar.setDefault();

            do {
                exibirMenu();
                menu = sc.nextInt();

                switch (menu) {
                    case 1: // Adicionar contato
                        System.out.println("Cadastre um Aparelho");
                        System.out.println("Digite qual aparelho você deseja gerenciar:");
                        nome = sc.next();

                        System.out.println("Digite se o aparelho está ligado ou desligado (true/false):");
                        test = sc.nextBoolean();

                        System.out.println("Digite o cômodo que ele está: ");
                        comodo = sc.next();

                        objQuarto = new Quarto(nome,test, comodo);

                        quar.adicionarAparelho(objQuarto);
                        
                        break;
                    case 2:
                    System.out.println(quar.quarto());
                    System.out.println(dt);
                }
            } while (menu != 5);
        }

        
    }
    static void exibirMenu(){
        System.out.println("######## CASA INTELIGENTE ########");
        System.out.println("1: Cadastre");
        System.out.println("2: lista");
        
    }
}

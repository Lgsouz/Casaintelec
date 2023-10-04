package com.house;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HouseQuarto extends House {

    JSONObject jsonObject;
    
    JSONParser parser = new JSONParser();
    
    Quarto QuarAs = new Quarto("",true,"");
    Quarto QuarGe = new Quarto("",true,true,0);
    Quarto QuarFe = new Quarto("",true,"",true,true);
    Quarto QuarLa = new Quarto("",true,"",0);
    Quarto QuarAr = new Quarto("",true,0,"",0);


    public HouseQuarto() {
        super();
    }

    public void setDefault() throws FileNotFoundException, IOException, ParseException {

        JSONArray Aparelhos = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("Quarto.json"), "UTF-8"));
        for (Object i : Aparelhos) {
            JSONObject Apa = (JSONObject) i;

            String nome = Apa.get("nome").toString();
            boolean ativo = (boolean) Apa.get("ativo".toString());
            String comodo = Apa.get("comodo").toString();

            Quarto aspirador = new Quarto(nome, ativo, comodo);
            adicionarAparelho(aspirador);
            
        }

    }

    public String quarto() {
        String saida = "";
        for (Quarto cont : Quarto) {
            saida += cont.Imprimir();
        }
        return saida;
    }
}
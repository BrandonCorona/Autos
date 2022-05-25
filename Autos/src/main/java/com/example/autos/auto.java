package com.example.autos;

public class auto {
    private String Marca;
    private String Modelo;
    private int Anio;

public auto (String MarcaCR, String ModeloCR,int AnioCR){
    Marca = MarcaCR;
    Modelo = ModeloCR;
    Anio = AnioCR;
}

    public auto (){
        Marca = "BMW";
        Modelo = "GrandCoup";
        Anio = 1992;
    }
    @Override
    public String toString(){
        String cadena = "\nMarca: "+ this.BMW + "\nModelo: "+ this.GrandoCoup;
        return cadena;
    }

    public static void main(String[] args) {

        auto[] regis = new auto[0];
        regis[0] = new auto(MarcaCR "", ModeloCR "", AnioCR "");
    }
};

package com.example.solucion2;

public class calcular {
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;
    double nota4 = 0;

    public calcular(double nt1, double nt2, double nt3, double nt4){
        this.nota1 = nt1;
        this.nota2 = nt2;
        this.nota3 = nt3;
        this.nota4 = nt4;
    }

    public double promedio(){
        return ((nota1 * 0.04) + (nota2 * 0.12) + (nota3 * 0.24) + (nota4 * 0.60));
    }
}

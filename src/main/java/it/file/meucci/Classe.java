package it.file.meucci;

import java.util.ArrayList;

public class Classe 
{
    private int numero;
    private String sezione;
    private String aula;
    ArrayList <Alunno> lista;
    
    public Classe() 
    {
    }

    public Classe(int numero, String sezione, String aula, ArrayList<Alunno> lista) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.lista = lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alunno> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Classe [numero=" + numero + ", sezione=" + sezione + ", aula=" + aula + ", lista=" + lista + "]";
    }
}

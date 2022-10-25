package it.file.meucci;

import java.util.Date;

public class Alunno 
{
    private String Nome;
    private String Cognome;
    private Date dataNascita;
    
    
    public Alunno(String nome, String cognome, Date dataNascita) {
        Nome = nome;
        Cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public Alunno() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita (Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Alunno [Nome=" + Nome + ", Cognome=" + Cognome + ", dataNascita=" + dataNascita + "]";
    }
}

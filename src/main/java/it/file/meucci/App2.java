package it.file.meucci;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App2 
{
    public static void main( String[] args ) throws StreamWriteException, DatabindException, IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        Classe value = objectMapper.readValue(new File("classe.json"), Classe.class);

        System.out.println(value.toString());
    }
}

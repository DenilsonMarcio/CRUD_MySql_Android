package com.moppahtech.crud_mysql_android;

/**
 * Created by User on 10/06/2019.
 */

public class Contato {

    private final String Nome;
    private final String Contatos;
    private final String Email;
    private final String Historia;

    public Contato(String Nome, String Contatos,
                 String Email, String Historia) {

        this.Nome = Nome;
        this.Contatos = Contatos;
        this.Email = Email;
        this.Historia = Historia;
    }

    public String getNome() {
        return Nome;
    }

    public String getContatos() {
        return Contatos;
    }

    public String getEmail() {
        return Email;
    }

    public String getHistoria() {
        return Historia;
    }
}

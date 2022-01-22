/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lucas Fredes Ibarra
 */
public class Usuario {

    private int id_usuario;
    private String usuario;
    private String pass;

    public Usuario() {
    }

    public Usuario(int id_usuario, String usuario, String pass) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.pass = pass;
    }

    public Usuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", usuario=" + usuario + ", pass=" + pass + '}';
    }

}

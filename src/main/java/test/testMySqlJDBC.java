package test;

import java.sql.*;

public class testMySqlJDBC {

    public static void main(String[] args) {
        //Cadena de conexion a MySql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            Connection conexion = DriverManager.getConnection(url, "root", "root");
            Statement instruccion= conexion.createStatement();
            var sql = "SELECT idPersona,nombre,apellido,email,telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                 System.out.println("IdPersona:"+resultado.getInt("idPersona")+" . Nombre: "+ resultado.getString("nombre"));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

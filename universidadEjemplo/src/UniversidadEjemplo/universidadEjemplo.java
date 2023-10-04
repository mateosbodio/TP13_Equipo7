/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UniversidadEjemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateo
 */
public class universidadEjemplo {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
      Connection con;
      con= Conexion.getConexion();
      
      //Agregar Alumno.
      String sql="INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado)"
              +"values(1234,'Lopez','Maria',2000-10-25',true)";
      PreparedStatement ps=con.prepareStatement(sql);
     
      int filas=ps.executeUpdate();
      if(filas>0){
          JOptionPane.showMessageDialog(null, "alumno agregado");
      }
              
      
    }
    
}


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
      

      String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //alumno 1
            int dni = 30200666;
            String apellido = "Torrez";
            String nombre = "Gabriel";
            String fechaNac = "2000-01-15";
            boolean estado = true;

            ps.setInt(1, dni);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setString(4, fechaNac);
            ps.setBoolean(5, estado);
            ps.executeUpdate();

            System.out.println("Se cargo el alumno correctamenet");
        } catch (SQLException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }

       String sql1 = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql1)) {
            //  materia
            ps.setString(1, "Laboratorio"); 
            ps.setInt(2, 2023); 
            ps.setBoolean(3, true); 
            ps.executeUpdate();

            System.out.println("Se cargo la materia.");
        } catch (SQLException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());

        }
      

    }
    
}

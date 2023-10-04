
package UniversidadEjemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
<<<<<<< HEAD

=======
import javax.swing.JOptionPane;
>>>>>>> 53c0548e3a2d107963c087ed9af55e5f64a896bb
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
      
<<<<<<< HEAD
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
      
=======
      //Agregar Alumno.
      String sql="INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado)"
              +"values(1234,'Lopez','Maria',2000-10-25',true)";
      PreparedStatement ps=con.prepareStatement(sql);
     
      int filas=ps.executeUpdate();
      if(filas>0){
          JOptionPane.showMessageDialog(null, "alumno agregado");
      }
              
>>>>>>> 53c0548e3a2d107963c087ed9af55e5f64a896bb
      
    }
    
}

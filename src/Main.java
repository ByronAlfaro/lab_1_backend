import Acceso_datos.Servicio;

import java.sql.SQLException;

public class Main {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Acceso_datos.Servicio servicio = new Servicio();
        servicio.conectar();
    }
}

package documents;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import java.util.ArrayList;
@Getter
@Setter
public class Usuario {
    private ObjectId idUsuario;
    private String nombre;
    private String apellido;
    private String password;
    private ArrayList<Producto> productos;
    private ArrayList<Direccion> direcciones;
}

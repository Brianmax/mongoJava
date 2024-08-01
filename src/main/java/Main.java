import com.mongodb.client.MongoCollection;
import config.MongoDBConnector;
import documents.Direccion;
import documents.Producto;
import documents.Usuario;
import service.UsuarioService;
import service.impl.UsuarioServiceImpl;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        MongoDBConnector.connect("mongodb+srv://maxigeorge154:passwordmjk@codigocluster.hmbxhso.mongodb.net/", "dbSchema");
        System.out.println(MongoDBConnector.database.getName());
        MongoCollection collection = MongoDBConnector.database.getCollection("usuarios");
        UsuarioService usuarioService = new UsuarioServiceImpl(collection);


        ArrayList<Direccion> direccions = new ArrayList<>();
        Direccion direccion = new Direccion();
        direccion.setCalle("Av Aviacion");
        direccion.setDistrito("Yanahuara");
        direccion.setDepartamento("Arequipa");
        direccion.setCiudad("Arequipa");
        direccions.add(direccion);

        ArrayList<Producto> productos = new ArrayList<>();
        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setPrecio(2000);
        producto.setDescripcion("Laptop HP");

        Usuario usuario = new Usuario();
        usuario.setNombre("Pedro");
        usuario.setApellido("Martinez");
        usuario.setPassword("1234");
        usuario.setProductos(new ArrayList<>());
        usuario.setDirecciones(direccions);
        usuario.setProductos(productos);
        usuarioService.agregarUsuario(usuario);
    }
}

package utils;

import documents.Direccion;
import documents.Producto;
import documents.Usuario;
import org.bson.Document;

import javax.print.Doc;
import java.util.ArrayList;


public class UsuarioUtils {
    public static Document usurioToDocument(Usuario usuario)
    {
        Document document = new Document();
        document.append("nombre", usuario.getNombre());
        document.append("apellido", usuario.getApellido());
        document.append("password", usuario.getPassword());
        document.append("productos", usuario.getProductos());
        document.append("direcciones", usuario.getDirecciones());
        return document;
    }
    public static Usuario fromDocument(Document document)
    {
        Usuario usuario = new Usuario();
        usuario.setNombre(document.getString("nombre"));
        usuario.setApellido(document.getString("apellido"));
        usuario.setPassword(document.getString("password"));
        usuario.setProductos((ArrayList<Producto>) document.getList("productos", Producto.class));
        usuario.setDirecciones((ArrayList<Direccion>) document.getList("direcciones", Direccion.class));
        return usuario;
    }
}

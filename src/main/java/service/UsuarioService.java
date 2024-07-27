package service;

import documents.Usuario;
import org.bson.types.ObjectId;

public interface UsuarioService {
    // agregar un usuario
    // buscar un usuario por su id
    // eliminar un usuario por su id
    // actualizar un usuario

    Usuario agregarUsuario(Usuario usuario);
    Usuario busarPorId(ObjectId idUsuario);
    void eliminarPorId(ObjectId idUsuario);
    Usuario actualizar(ObjectId idUsuario, Usuario usuario);
}

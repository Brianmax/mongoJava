package service.impl;

import com.mongodb.client.MongoCollection;
import documents.Usuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.Document;
import org.bson.types.ObjectId;
import service.UsuarioService;


@AllArgsConstructor
@NoArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    MongoCollection mongoCollection;
    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        // verificar que el nombre no se repita
        Document filter = new Document("nombre", usuario.getNombre());
        Document usuarioBd = (Document) mongoCollection.find(filter).first();

        if (usuarioBd == null)
        {
            mongoCollection.insertOne()
        }
    }

    @Override
    public Usuario busarPorId(ObjectId idUsuario) {
        return null;
    }

    @Override
    public void eliminarPorId(ObjectId idUsuario) {

    }

    @Override
    public Usuario actualizar(ObjectId idUsuario, Usuario usuario) {
        return null;
    }
}

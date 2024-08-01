package service.impl;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import documents.Usuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.Document;
import org.bson.types.ObjectId;
import service.UsuarioService;
import utils.UsuarioUtils;



@AllArgsConstructor
@NoArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private MongoCollection mongoCollection;
    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        // verificar que el nombre no se repita
        Document filter = new Document("nombre", usuario.getNombre());

        Document usuarioBd = (Document) mongoCollection.find(filter).first();

        if (usuarioBd == null)
        {
            Document usuarioDoc = UsuarioUtils.usurioToDocument(usuario);
            InsertOneResult insertOneResult = mongoCollection.insertOne(usuarioDoc);
            usuario.setIdUsuario(insertOneResult.getInsertedId().asObjectId());
            return usuario;
        }
        else {
            return null;
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

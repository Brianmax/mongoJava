package codecs;

import documents.Direccion;
import org.bson.codecs.Codec;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

public class DireccionCodec implements Codec<Direccion> {
    @Override
    public void encode(BsonWriter writer, Direccion value, EncoderContext encoderContext) {
        writer.writeStartDocument();
        writer.writeString("calle", value.getCalle());
        writer.writeString("distrito", value.getDistrito());
        writer.writeString("departamento", value.getDepartamento());
        writer.writeString("ciudad", value.getCiudad());
        writer.writeEndDocument();
    }

    @Override
    public Direccion decode(BsonReader reader, DecoderContext decoderContext) {
        reader.readStartDocument();
        String calle = reader.readString("calle");
        String distrito = reader.readString("distrito");
        String departamento = reader.readString("departamento");
        String ciudad = reader.readString("ciudad");
        reader.readEndDocument();
        return new Direccion(calle, distrito, departamento, ciudad);
    }

    @Override
    public Class<Direccion> getEncoderClass() {
        return Direccion.class;
    }
}

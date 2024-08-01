package documents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {
    private String calle;
    private String distrito;
    private String departamento;
    private String ciudad;
}

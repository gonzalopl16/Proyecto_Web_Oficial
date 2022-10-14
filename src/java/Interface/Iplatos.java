package Interface;

import Modelo.*;
import java.util.List;

public interface Iplatos {
    public List<platos> listaTotal();
    public platos consultarPlato(String codigo);
}

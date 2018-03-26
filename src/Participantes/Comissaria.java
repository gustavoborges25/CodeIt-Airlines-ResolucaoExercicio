package Participantes;

import java.util.List;

public class Comissaria extends Participante {

    @Override
    public void verificaRestricao(List<Participante> participantes) throws ComissariaNaoPodeFicaSozinhaComPiloto {
        if (participantes.size() == 2){
            for (Participante participante : participantes)
                if (participante instanceof Piloto)
                    throw new ComissariaNaoPodeFicaSozinhaComPiloto();
        }
    }


}

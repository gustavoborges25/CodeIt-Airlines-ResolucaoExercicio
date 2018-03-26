package Participantes;

import java.util.List;

public class Oficial extends Participante{

    @Override
    public void verificaRestricao(List<Participante> participantes) throws OficialNaoPodeFicaSozinhoComChefeDeServico {
        if (participantes.size() == 2){
            for (Participante participante : participantes)
                if (participante instanceof ChefeDeServico)
                    throw new OficialNaoPodeFicaSozinhoComChefeDeServico();
        }
    }


}

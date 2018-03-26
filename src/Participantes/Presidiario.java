package Participantes;

import java.util.List;

public class Presidiario extends Participante{

    @Override
    public void verificaRestricao(List<Participante> participantes) throws PresidiarioNaoPodeFicaSemPolicial {

        boolean policialEstaPerto = false;

        for (Participante participante : participantes)
            if (participante instanceof Policial)
                policialEstaPerto = true;

        if (!policialEstaPerto)
            throw new PresidiarioNaoPodeFicaSemPolicial();

    }
}

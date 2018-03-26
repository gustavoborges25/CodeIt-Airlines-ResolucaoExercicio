package Terminal;

import Participantes.Participante;

import java.util.ArrayList;
import java.util.List;

public class Terminal {

    private List<Participante> participantes;

    public Terminal(){
        this.participantes = new ArrayList<Participante>();
    }

    public void adicionaParticipante(Participante participante) {
        if (participante != null)
            this.participantes.add(participante);
    }

    public void retiraParticipantes(Participante participante) {
        this.participantes.remove(participante);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}

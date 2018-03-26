package Veiculos;


import Participantes.ChefeDeServico;
import Participantes.Participante;
import Participantes.Piloto;
import Participantes.Policial;

public class Carro {

    private Participante motorista;
    private Participante carona;

    public void setMotorista(Participante motorista) throws MotoristaNaoTemHabilitacao {
        if (motorista instanceof Piloto || motorista instanceof ChefeDeServico || motorista instanceof Policial){
            this.motorista = motorista;
        } else
            throw new MotoristaNaoTemHabilitacao();
    }

    public void setCarona(Participante carona){
        this.carona = carona;
    }
}

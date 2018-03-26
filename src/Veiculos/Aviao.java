package Veiculos;

import Participantes.Participante;

import java.util.ArrayList;
import java.util.List;

public class Aviao{

        private List<Participante> passageiros;

        public Aviao(){
            this.passageiros = new ArrayList<Participante>();
        }

        public void adicionaPassageiro(Participante passageiro) {
            if (passageiro != null)
                this.passageiros.add(passageiro);
        }

        public void retiraPassageiro(Participante passageiro) {
            this.passageiros.remove(passageiro);
        }

        public List<Participante> getPassageiros() {
            return passageiros;
        }

        public void setPassageiros(List<Participante> passageiros) {
            this.passageiros = passageiros;
        }

}

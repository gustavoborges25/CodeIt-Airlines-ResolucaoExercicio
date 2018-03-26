package Participantes;

public class ComissariaNaoPodeFicaSozinhaComPiloto extends Exception {

    public ComissariaNaoPodeFicaSozinhaComPiloto(){
        super( "Comissária não pode ficar sozinha com Piloto!" );
    }
}

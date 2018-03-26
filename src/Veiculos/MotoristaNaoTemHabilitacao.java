package Veiculos;

public class MotoristaNaoTemHabilitacao extends Exception {

    public MotoristaNaoTemHabilitacao(){
        super( "Esse motorista não possui autorização para dirigir o Carro!" );
    }
}

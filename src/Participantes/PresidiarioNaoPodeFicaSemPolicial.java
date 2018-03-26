package Participantes;

public class PresidiarioNaoPodeFicaSemPolicial extends Exception {

    public PresidiarioNaoPodeFicaSemPolicial(){
        super( "Presidiario não pode ficar sem acompanhamento do Policial!" );
    }
}

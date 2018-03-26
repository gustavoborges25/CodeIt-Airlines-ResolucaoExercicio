package Participantes;

public class OficialNaoPodeFicaSozinhoComChefeDeServico extends Exception {

    public OficialNaoPodeFicaSozinhoComChefeDeServico(){
        super( "Oficial não pode ficar sozinho com Chefe de Serviço" );
    }
}

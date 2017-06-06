package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Integrante;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T22:03:55")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, Integrante> fKintegrante;
    public static volatile SingularAttribute<Avaliacao, String> data;
    public static volatile SingularAttribute<Avaliacao, Integer> frequencia;
    public static volatile SingularAttribute<Avaliacao, String> comparecimento;
    public static volatile SingularAttribute<Avaliacao, Integer> idAvaliacao;

}
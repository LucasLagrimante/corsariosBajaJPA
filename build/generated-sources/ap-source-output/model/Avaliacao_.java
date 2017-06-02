package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Integrante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-02T07:44:13")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, Integrante> fKintegrante;
    public static volatile SingularAttribute<Avaliacao, String> data;
    public static volatile SingularAttribute<Avaliacao, Integer> frequencia;
    public static volatile SingularAttribute<Avaliacao, String> comparecimento;
    public static volatile SingularAttribute<Avaliacao, Integer> idAvaliacao;

}
package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pessoa;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T20:53:15")
@StaticMetamodel(Integrante.class)
public class Integrante_ { 

    public static volatile SingularAttribute<Integrante, Pessoa> fKpessoa;
    public static volatile SingularAttribute<Integrante, Integer> matricula;
    public static volatile SingularAttribute<Integrante, String> cargaHorariaDisponivel;

}
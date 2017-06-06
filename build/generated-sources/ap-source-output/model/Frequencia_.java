package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Integrante;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T21:41:09")
@StaticMetamodel(Frequencia.class)
public class Frequencia_ { 

    public static volatile SingularAttribute<Frequencia, Integrante> fKintegrante;
    public static volatile SingularAttribute<Frequencia, Integer> idFrequencia;
    public static volatile SingularAttribute<Frequencia, String> estado;
    public static volatile SingularAttribute<Frequencia, String> data;

}
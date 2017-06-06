package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Desempenhoteste;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T22:03:55")
@StaticMetamodel(Tipopista.class)
public class Tipopista_ { 

    public static volatile SingularAttribute<Tipopista, Integer> idTipopista;
    public static volatile SingularAttribute<Tipopista, String> nome;
    public static volatile CollectionAttribute<Tipopista, Desempenhoteste> desempenhotesteCollection;

}
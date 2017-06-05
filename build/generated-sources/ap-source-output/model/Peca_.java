package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Tipopeca;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T20:53:15")
@StaticMetamodel(Peca.class)
public class Peca_ { 

    public static volatile SingularAttribute<Peca, Float> precoCompra;
    public static volatile SingularAttribute<Peca, Tipopeca> fKtipopeca;
    public static volatile SingularAttribute<Peca, String> nome;
    public static volatile SingularAttribute<Peca, Integer> idPeca;
    public static volatile SingularAttribute<Peca, Integer> quantidade;
    public static volatile SingularAttribute<Peca, String> modelo;

}
package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Tipopista;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T22:03:55")
@StaticMetamodel(Competicao.class)
public class Competicao_ { 

    public static volatile SingularAttribute<Competicao, String> data;
    public static volatile SingularAttribute<Competicao, String> hora;
    public static volatile SingularAttribute<Competicao, String> nome;
    public static volatile SingularAttribute<Competicao, String> local;
    public static volatile SingularAttribute<Competicao, Tipopista> fKtipopista;
    public static volatile SingularAttribute<Competicao, Integer> idCompeticao;

}
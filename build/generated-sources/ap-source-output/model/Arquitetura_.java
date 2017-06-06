package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Automovel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T21:41:09")
@StaticMetamodel(Arquitetura.class)
public class Arquitetura_ { 

    public static volatile SingularAttribute<Arquitetura, String> caminhoImagem;
    public static volatile SingularAttribute<Arquitetura, Integer> idArquitetura;
    public static volatile SingularAttribute<Arquitetura, Automovel> fKautomovel;

}
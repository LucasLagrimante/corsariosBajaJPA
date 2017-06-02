package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Automovel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-02T00:01:27")
@StaticMetamodel(Arquitetura.class)
public class Arquitetura_ { 

    public static volatile SingularAttribute<Arquitetura, String> caminhoImagem;
    public static volatile SingularAttribute<Arquitetura, Integer> idArquitetura;
    public static volatile SingularAttribute<Arquitetura, Automovel> fKautomovel;

}
package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Automovel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T21:51:25")
@StaticMetamodel(Design.class)
public class Design_ { 

    public static volatile SingularAttribute<Design, Integer> idDesign;
    public static volatile SingularAttribute<Design, String> caminhoImagem;
    public static volatile SingularAttribute<Design, Automovel> fKautomovel;

}
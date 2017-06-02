package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Automovel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-02T00:01:27")
@StaticMetamodel(Design.class)
public class Design_ { 

    public static volatile SingularAttribute<Design, Integer> idDesign;
    public static volatile SingularAttribute<Design, String> caminhoImagem;
    public static volatile SingularAttribute<Design, Automovel> fKautomovel;

}
package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Automovel;
import model.Integrante;
import model.Tipopista;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T20:53:15")
@StaticMetamodel(Desempenho.class)
public class Desempenho_ { 

    public static volatile SingularAttribute<Desempenho, Float> frenagem;
    public static volatile SingularAttribute<Desempenho, Float> aceleracaoMedia;
    public static volatile SingularAttribute<Desempenho, String> data;
    public static volatile SingularAttribute<Desempenho, String> hora;
    public static volatile SingularAttribute<Desempenho, Integer> idDesempenho;
    public static volatile SingularAttribute<Desempenho, String> nome;
    public static volatile SingularAttribute<Desempenho, Integrante> fKmotorista;
    public static volatile SingularAttribute<Desempenho, Automovel> fKautomovel;
    public static volatile SingularAttribute<Desempenho, Float> velocidadeMedia;
    public static volatile SingularAttribute<Desempenho, Tipopista> fKtipopista;
    public static volatile SingularAttribute<Desempenho, String> tempoPista;

}
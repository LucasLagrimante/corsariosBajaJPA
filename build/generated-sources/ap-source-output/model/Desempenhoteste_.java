package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Automovel;
import model.Integrante;
import model.Tipopista;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-02T07:44:13")
@StaticMetamodel(Desempenhoteste.class)
public class Desempenhoteste_ { 

    public static volatile SingularAttribute<Desempenhoteste, Float> frenagem;
    public static volatile SingularAttribute<Desempenhoteste, Float> aceleracaoMedia;
    public static volatile SingularAttribute<Desempenhoteste, String> data;
    public static volatile SingularAttribute<Desempenhoteste, String> hora;
    public static volatile SingularAttribute<Desempenhoteste, Integer> idDesempenhoTeste;
    public static volatile SingularAttribute<Desempenhoteste, String> nome;
    public static volatile SingularAttribute<Desempenhoteste, Integrante> fKmotorista;
    public static volatile SingularAttribute<Desempenhoteste, Automovel> fKautomovel;
    public static volatile SingularAttribute<Desempenhoteste, Float> velocidadeMedia;
    public static volatile SingularAttribute<Desempenhoteste, Tipopista> fKtipopista;
    public static volatile SingularAttribute<Desempenhoteste, String> tempoPista;

}
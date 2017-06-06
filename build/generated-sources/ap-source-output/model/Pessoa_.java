package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Integrante;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-05T22:03:55")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, Integer> idPessoa;
    public static volatile SingularAttribute<Pessoa, String> uf;
    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, String> numero;
    public static volatile SingularAttribute<Pessoa, String> logradouro;
    public static volatile SingularAttribute<Pessoa, String> bairro;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile CollectionAttribute<Pessoa, Integrante> integranteCollection;
    public static volatile SingularAttribute<Pessoa, String> cep;

}
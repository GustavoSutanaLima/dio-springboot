package edu.exemplo.dio_spring_data_jpa_meu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.exemplo.dio_spring_data_jpa_meu.modelo.Usuario;
import edu.exemplo.dio_spring_data_jpa_meu.repositório.UsuarioRepositorio;


@Component 
//Essa classe ao receber a implementação CommandLineRunner nos obriga a usar o assinatura de método run();
//possibilitando a AplicaçãoSpring a executar as informações contidas dentro deste método;
//Além disso, preciso usar a anotação @Component para dizer que essa classe agora é gerenciada pelo
//framework Spring;
public class StartApp implements CommandLineRunner {
    //injetando o repositório de usuarios (dependência do Spring framework);
    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        //Usuário não é um componente da minha aplicação, e sim uma entidade, por isso, nesse caso
        //faz-se necessária inicilização de um objeto deste tipo. (Ou seja, nesse caso, o Spring não
        //gerencia a instância de objetos);
        Usuario gustavo = new Usuario(1,"Gustavo Sutana Lima", "Dekpare", "159753");
        Usuario jonn = new Usuario(2,"Jonn Antônio de Souza Lima", "Jonnesburgo", "123456");
        Usuario leo = new Usuario(3,"Leonardo Gonzaga Bigogno", "Bigonha", "456789");

        //Agora, vou salvar estes usuários no meu repositório de usuários:

        repositorio.save(gustavo);
        repositorio.save(jonn);
        repositorio.save(leo);


        //Confirmando que meus usuários estão sendo salvos:

        for (Usuario user : repositorio.findAll()) {
            System.out.println(user);
        }
        
    }
        
}

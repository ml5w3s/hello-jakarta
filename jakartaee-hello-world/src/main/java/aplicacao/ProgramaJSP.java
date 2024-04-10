package aplicacao;

import dominio.PessoaJSP;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;
 
public class ProgramaJSP {

    public static void main(String[] args) {
        
        PessoaJSP p1 = new PessoaJSP(null,"Carlos","carlos@gmail.com");
        PessoaJSP p2 = new PessoaJSP(null,"Mario","mario@gmail.com");
        PessoaJSP p3 = new PessoaJSP(null,"jose","ze@gmail.com");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        
        System.out.println("Persistencia, update, inicializada com sucesso!");
    }
    
}
 

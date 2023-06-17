package curso.projeto;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.util.List;

@Entity
public class Categoria extends PanacheEntity {

      private String nome;

      public Categoria() {
      }

      public Categoria(String nome) {
            this.nome = nome;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

}

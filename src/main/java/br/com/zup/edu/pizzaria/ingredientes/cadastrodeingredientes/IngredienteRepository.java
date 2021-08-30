package br.com.zup.edu.pizzaria.ingredientes.cadastrodeingredientes;

import br.com.zup.edu.pizzaria.ingredientes.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente,Long> {
}

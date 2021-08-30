package br.com.zup.edu.pizzaria.ingredientes.cadastropizza;

import br.com.zup.edu.pizzaria.ingredientes.Ingrediente;
import br.com.zup.edu.pizzaria.ingredientes.cadastrodeingredientes.IngredienteRepository;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;

public class NovaPizzaRequest {

    @NotBlank
    private String sabor;

    @NotNull
    @Size(min = 1)
    private List<Long> ingredientes = new ArrayList<>();


    @JsonCreator(mode = PROPERTIES)
    public NovaPizzaRequest(String sabor,
                            List<Long> ingredientes) {
        this.sabor = sabor;
        this.ingredientes = ingredientes;
    }

    public Pizza paraPizza(IngredienteRepository repository) {

        List<Ingrediente> ingredientes = repository.findAllById(this.ingredientes);

        return new Pizza(sabor, ingredientes);
    }
}

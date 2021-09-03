package br.com.zup.edu.pizzaria.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.List;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UniqueValueValidator.class)
public @interface UniqueValue {
    String message() default "O Valor já esta cadastrado";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    Class<?> domainClass();
    String domainAtribute();

}

package com.jnsdev.hexagonal.config;

import com.jnsdev.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.jnsdev.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.jnsdev.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 17:04
 */
@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}

package com.jnsdev.hexagonal.config;

import com.jnsdev.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.jnsdev.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.jnsdev.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.jnsdev.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 17:11
 */
@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase,findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}

package com.jnsdev.hexagonal.config;

import com.jnsdev.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.jnsdev.hexagonal.adapters.out.InsertCustomerAdapter;
import com.jnsdev.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.jnsdev.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 17:04
 */
@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }
}

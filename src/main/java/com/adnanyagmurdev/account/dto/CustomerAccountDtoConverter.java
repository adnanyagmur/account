package com.adnanyagmurdev.account.dto;

import com.adnanyagmurdev.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerAccountDtoConverter {

    private final TransactionDtoConverter converter;

    public CustomerAccountDtoConverter(TransactionDtoConverter converter) {
        this.converter = converter;
    }

    public CustomerAccountDto convert(Account from){
    return new CustomerAccountDto(
            from.getId(),
            from.getBalance(),
            from.getTransaction().stream().map(t -> converter.convert(t)).collect(Collectors.toSet()),
            from.getCreationDate()
            );
}
}

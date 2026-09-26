package org.example.bankaccountserivce.beans;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class , name = "p1")
public interface AccountProjection {
}

package org.example.bankaccountserivce.repository;

import org.example.bankaccountserivce.beans.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}

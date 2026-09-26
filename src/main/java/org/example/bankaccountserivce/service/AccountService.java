package org.example.bankaccountserivce.service;

import org.example.bankaccountserivce.dtos.BankAccountRequestDTO;
import org.example.bankaccountserivce.dtos.BankAccountResponseDTO;

import java.util.List;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    BankAccountResponseDTO getBankAccount(String id);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
    void deleteAccount(String id);
    List<BankAccountResponseDTO> listAccounts();
}

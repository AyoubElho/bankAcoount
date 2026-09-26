package org.example.bankaccountserivce.web;

import org.example.bankaccountserivce.dtos.BankAccountRequestDTO;
import org.example.bankaccountserivce.dtos.BankAccountResponseDTO;
import org.example.bankaccountserivce.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountRestController {

    private final AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/bankAccounts")
    public List<BankAccountResponseDTO> bankAccountList() {
        return accountService.listAccounts();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccountResponseDTO bankAccount(@PathVariable String id) {
        return accountService.getBankAccount(id);
    }

    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO addAccount(@RequestBody BankAccountRequestDTO bankAccountDTO) {
        return accountService.addAccount(bankAccountDTO);
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccountResponseDTO updateAccount(@PathVariable String id, @RequestBody BankAccountRequestDTO bankAccountDTO) {
        return accountService.updateAccount(id, bankAccountDTO);
    }

    @DeleteMapping("/bankAccounts/{id}")
    public void deleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
    }
}

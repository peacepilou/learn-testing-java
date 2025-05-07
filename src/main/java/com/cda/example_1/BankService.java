package com.cda.example_1;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private final BankAccountRepository repo;

    public BankService(BankAccountRepository repo) {
        this.repo = repo;
    }

    public void openAccount(String owner, double initialBalance) {
        repo.save(new BankAccount(owner, initialBalance));
    }

    public BankAccount findByOwner(String owner) {
        return repo.findByOwner(owner).orElseThrow();
    }
}

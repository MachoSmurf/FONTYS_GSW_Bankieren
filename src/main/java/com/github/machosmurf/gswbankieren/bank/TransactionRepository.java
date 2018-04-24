package com.github.machosmurf.gswbankieren.bank;

import com.github.machosmurf.gswbankieren.shared.Transaction;
import org.springframework.data.repository.CrudRepository;

public abstract class TransactionRepository implements CrudRepository<Transaction, Integer> {
}

package org.example;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Printer {
    private Formatter formatter;
    private Console console;
    private TransactionRepository repository;

    public Printer(TransactionRepository repository, Formatter formater, Console console){
        this.repository = repository;
        this.formatter = formater;
        this.console = console;
    }

    public void printStatement(){
        console.printLine("DATE | AMOUNT | BALANCE");
        List<Transaction> transactions = repository.all();
        AtomicInteger balance = new AtomicInteger(0);
        transactions.stream().map(t -> formatter.format(t, balance.addAndGet(t.amount()))).collect(java.util.stream.Collectors.toCollection(java.util.LinkedList::new)).descendingIterator().forEachRemaining(console::printLine);
    }
}

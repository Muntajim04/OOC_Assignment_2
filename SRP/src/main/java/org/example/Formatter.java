package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String AMOUNT_FORMAT = "#.00";

    public String format(Transaction transaction, int balance) {
        return MessageFormat.format(
                "{0} | {1} | {2}",
                formatDate(transaction.date()),
                formatNumber(transaction.amount()),
                formatNumber(balance)
        );
    }

    private String formatDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return formatter.format(date);
    }

    private String formatNumber(int amount){
        DecimalFormat decimalFormat = new DecimalFormat(AMOUNT_FORMAT, DecimalFormatSymbols.getInstance(Locale.UK));

        return decimalFormat.format(amount);
    }
}

package br.uniriotec.sal.ib.core.util;

import java.time.LocalDate;

public class DateConverter {
    public static LocalDate toLocalDate(String date){
        return LocalDate.parse(date);
    }
}

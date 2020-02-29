package com.hgits.hotc.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter FORMATTER3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");


    public static Date parse(String dateStr){
        LocalDateTime localDateTime = null;
        try {
            localDateTime = LocalDateTime.parse(dateStr, FORMATTER);
        } catch (Exception e1) {
            try {
                localDateTime = LocalDateTime.parse(dateStr, FORMATTER1);
            } catch (Exception e2) {
                try {
                    localDateTime = LocalDateTime.parse(dateStr, FORMATTER2);
                } catch (Exception e3){
                    try {
                        localDateTime = LocalDateTime.parse(dateStr, FORMATTER3);
                    } catch (Exception e4) {
                        throw new RuntimeException(e4);
                    }
                }
            }

        }

        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}

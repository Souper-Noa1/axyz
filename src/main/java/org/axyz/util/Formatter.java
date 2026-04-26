package org.axyz.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter {

    //formatTaskRow(id, title, status, priority, assignee)
    public static String formatTaskRow(String id, String title, String status, String priority, String assignee){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s", id));
        sb.append(String.format("%-20s", title));
        sb.append(String.format("%-15s", status));
        sb.append(String.format("%-10s", priority));
        sb.append(String.format("%-15s", assignee));
        return sb.toString();
    }

    //formatDate(LocalDate)
    public static String formatDate(LocalDate date){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(dtf);
    }

    //formatProgress(int done, int total)
    public static String formatProgress(int done, int total){
        int barLength = 20;
        int filled = (int) ((done / (double) total) * barLength);
        int empty = barLength - filled;
        int percentage = (int)((done / (double) total) * 100);
        String bar = "=".repeat(filled) + " ".repeat(empty);
        return "[" + bar + "]" + percentage + "%" ;

    }
}

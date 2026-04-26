package org.axyz.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputHelper {
   private static final Scanner sc = new Scanner(System.in);

   public static String readSting (String prompt) {
      System.out.print(prompt);
      String value = sc.nextLine();

      while (value.isEmpty()){
          System.out.println("Input can not be empty!");
          System.out.println(prompt);
          value = sc.nextLine();
      }
      return value;
   }
   public static int readInt (String prompt, int min, int max) {
       while (true){
           System.out.println(prompt);
           String line = sc.nextLine().trim();

           try{
               int value = Integer.parseInt(line);
               if (value < min || value > max){
                   System.out.println("Value out of range!");
               }
               return value;
           }catch (NumberFormatException e){
               System.out.println("Value out of range!");
           }
       }


   }
   public static LocalDate readDate (String prompt) {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       while (true){
           System.out.println(prompt);
           String line = sc.nextLine().trim();
           try{
               return LocalDate.parse(line, formatter);
           }catch (DateTimeParseException e){
               System.out.println("Invalid date format!");
           }
       }
   }

}

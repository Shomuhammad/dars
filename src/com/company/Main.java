package com.company;

public class Main {

    public static void main(String[] args) {
                String windovs = windovs(21, 25 );
                System.out.println(windovs);
                windovs = windovs(20,26);
                System.out.println(windovs);
                windovs = windovs(19,27);
                System.out.println(windovs);
                windovs = windovs(18,28);
                System.out.println(windovs);
                windovs = windovs(19,29);
            }
            public static String windovs(int age,int temp){
                if (age > 20 && age < 45 && temp > -20 && temp < 30){
                    return "можно гулять";
                }else {
                    return "нельзя";

                }
            }
        }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinayears;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ChinaYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input your year, later than 1984: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        
        int start = 1984;
        
        String color = "green";
        String animal = "rat";
        
        while (year > start) {
            switch (color) {
                case "green":
                    for (int i = 1; i <= 12; i++) {
                        if (year == start) {
                            break;
                        }
                        switch (animal) {
                            case "rat":
                                animal = "cow";
                                start++;
                                break;
                            case "cow":
                                animal = "tiger";
                                start++;
                                break;
                            case "tiger":
                                animal = "bunny";
                                start++;
                                break;
                            case "bunny":
                                animal = "dragon";
                                start++;
                                break;
                            case "dragon":
                                animal = "snake";
                                start++;
                                break;
                            case "snake":
                                animal = "horse";
                                start++;
                                break;
                            case "horse":
                                animal = "sheep";
                                start++;
                                break;
                            case "sheep":
                                animal = "monkey";
                                start++;
                                break;
                            case "monkey":
                                animal = "chicken";
                                start++;
                                break;
                            case "chicken":
                                animal = "dog";
                                start++;
                                break;
                            case "dog":
                                animal = "pig";
                                start++;
                                break;
                            case "pig":
                                animal = "rat";
                                start++;
                                break;
                        }
                    }
                    if (start != year) {
                        color = "red";
                    }
                    break;
                case "red":
                    for (int i = 1; i <= 12; i++) {
                        if (year == start) {
                            break;
                        }
                        switch (animal) {
                            case "rat":
                                animal = "cow";
                                start++;
                                break;
                            case "cow":
                                animal = "tiger";
                                start++;
                                break;
                            case "tiger":
                                animal = "bunny";
                                start++;
                                break;
                            case "bunny":
                                animal = "dragon";
                                start++;
                                break;
                            case "dragon":
                                animal = "snake";
                                start++;
                                break;
                            case "snake":
                                animal = "horse";
                                start++;
                                break;
                            case "horse":
                                animal = "sheep";
                                start++;
                                break;
                            case "sheep":
                                animal = "monkey";
                                start++;
                                break;
                            case "monkey":
                                animal = "chicken";
                                start++;
                                break;
                            case "chicken":
                                animal = "dog";
                                start++;
                                break;
                            case "dog":
                                animal = "pig";
                                start++;
                                break;
                            case "pig":
                                animal = "rat";
                                start++;
                                break;
                        }
                    }
                    if (start != year) {
                        color = "yellow";
                    }
                    break;
                case "yellow":
                    for (int i = 1; i <= 12; i++) {
                        if (year == start) {
                            break;
                        }
                        switch (animal) {
                            case "rat":
                                animal = "cow";
                                start++;
                                break;
                            case "cow":
                                animal = "tiger";
                                start++;
                                break;
                            case "tiger":
                                animal = "bunny";
                                start++;
                                break;
                            case "bunny":
                                animal = "dragon";
                                start++;
                                break;
                            case "dragon":
                                animal = "snake";
                                start++;
                                break;
                            case "snake":
                                animal = "horse";
                                start++;
                                break;
                            case "horse":
                                animal = "sheep";
                                start++;
                                break;
                            case "sheep":
                                animal = "monkey";
                                start++;
                                break;
                            case "monkey":
                                animal = "chicken";
                                start++;
                                break;
                            case "chicken":
                                animal = "dog";
                                start++;
                                break;
                            case "dog":
                                animal = "pig";
                                start++;
                                break;
                            case "pig":
                                animal = "rat";
                                start++;
                                break;
                        }
                    }
                    if (start != year) {
                        color = "red";
                    }
                    break;
                case "white":
                    for (int i = 1; i <= 12; i++) {
                        if (year == start) {
                            break;
                        }
                        switch (animal) {
                            case "rat":
                                animal = "cow";
                                start++;
                                break;
                            case "cow":
                                animal = "tiger";
                                start++;
                                break;
                            case "tiger":
                                animal = "bunny";
                                start++;
                                break;
                            case "bunny":
                                animal = "dragon";
                                start++;
                                break;
                            case "dragon":
                                animal = "snake";
                                start++;
                                break;
                            case "snake":
                                animal = "horse";
                                start++;
                                break;
                            case "horse":
                                animal = "sheep";
                                start++;
                                break;
                            case "sheep":
                                animal = "monkey";
                                start++;
                                break;
                            case "monkey":
                                animal = "chicken";
                                start++;
                                break;
                            case "chicken":
                                animal = "dog";
                                start++;
                                break;
                            case "dog":
                                animal = "pig";
                                start++;
                                break;
                            case "pig":
                                animal = "rat";
                                start++;
                                break;
                        }
                    }
                    if (start != year) {
                        color = "red";
                    }
                    break;
                case "black":
                    for (int i = 1; i <= 12; i++) {
                        if (year == start) {
                            break;
                        }
                        switch (animal) {
                            case "rat":
                                animal = "cow";
                                start++;
                                break;
                            case "cow":
                                animal = "tiger";
                                start++;
                                break;
                            case "tiger":
                                animal = "bunny";
                                start++;
                                break;
                            case "bunny":
                                animal = "dragon";
                                start++;
                                break;
                            case "dragon":
                                animal = "snake";
                                start++;
                                break;
                            case "snake":
                                animal = "horse";
                                start++;
                                break;
                            case "horse":
                                animal = "sheep";
                                start++;
                                break;
                            case "sheep":
                                animal = "monkey";
                                start++;
                                break;
                            case "monkey":
                                animal = "chicken";
                                start++;
                                break;
                            case "chicken":
                                animal = "dog";
                                start++;
                                break;
                            case "dog":
                                animal = "pig";
                                start++;
                                break;
                            case "pig":
                                animal = "rat";
                                start++;
                                break;
                        }
                    }
                    if (start != year) {
                        color = "red";
                    }
                    break;
            }
        }
        System.out.println("Your year: "+year+", year of "+color+" "+animal);
    }
    
}

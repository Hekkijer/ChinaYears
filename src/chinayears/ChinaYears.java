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
        System.out.println("Input your year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        
        int start = 1984;
        
        String color = "green";
        String animal = "rat";
        
        if (year >= start) {
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
                            color = "white";
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
                            color = "black";
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
                            color = "green";
                        }
                        break;
                }
            }
        }
        
        if (year < start) {
            while (year < start) {
                switch (color) {
                    case "green":
                        for (int i = 1; i <= 12; i++) {
                            if (year == start) {
                                break;
                            }
                            switch (animal) {
                                case "rat":
                                    animal = "pig";
                                    start -= 1;
                                    color = "black";
                                    break;
                                case "cow":
                                    animal = "rat";
                                    start -= 1;
                                    break;
                                case "tiger":
                                    animal = "cow";
                                    start -= 1;
                                    break;
                                case "bunny":
                                    animal = "tiger";
                                    start -= 1;
                                    break;
                                case "dragon":
                                    animal = "bunny";
                                    start -= 1;
                                    break;
                                case "snake":
                                    animal = "dragon";
                                    start -= 1;
                                    break;
                                case "horse":
                                    animal = "snake";
                                    start -= 1;
                                    break;
                                case "sheep":
                                    animal = "horse";
                                    start -= 1;
                                    break;
                                case "monkey":
                                    animal = "sheep";
                                    start -= 1;
                                    break;
                                case "chicken":
                                    animal = "monkey";
                                    start -= 1;
                                    break;
                                case "dog":
                                    animal = "chicken";
                                    start -= 1;
                                    break;
                                case "pig":
                                    animal = "dog";
                                    start -= 1;
                                    break;
                            }
                        }
                        if (start != year) {
                            color = "black";
                        }
                        break;
                    case "red":
                        for (int i = 1; i <= 12; i++) {
                            if (year == start) {
                                break;
                            }
                            switch (animal) {
                                case "rat":
                                    animal = "pig";
                                    start -= 1;
                                    color = "green";
                                    break;
                                case "cow":
                                    animal = "rat";
                                    start -= 1;
                                    break;
                                case "tiger":
                                    animal = "cow";
                                    start -= 1;
                                    break;
                                case "bunny":
                                    animal = "tiger";
                                    start -= 1;
                                    break;
                                case "dragon":
                                    animal = "bunny";
                                    start -= 1;
                                    break;
                                case "snake":
                                    animal = "dragon";
                                    start -= 1;
                                    break;
                                case "horse":
                                    animal = "snake";
                                    start -= 1;
                                    break;
                                case "sheep":
                                    animal = "horse";
                                    start -= 1;
                                    break;
                                case "monkey":
                                    animal = "sheep";
                                    start -= 1;
                                    break;
                                case "chicken":
                                    animal = "monkey";
                                    start -= 1;
                                    break;
                                case "dog":
                                    animal = "chicken";
                                    start -= 1;
                                    break;
                                case "pig":
                                    animal = "dog";
                                    start -= 1;
                                    break;
                            }
                        }
                        if (start != year) {
                            color = "green";
                        }
                        break;
                    case "yellow":
                        for (int i = 1; i <= 12; i++) {
                            if (year == start) {
                                break;
                            }
                            switch (animal) {
                                case "rat":
                                    animal = "pig";
                                    start -= 1;
                                    color = "red";
                                    break;
                                case "cow":
                                    animal = "rat";
                                    start -= 1;
                                    break;
                                case "tiger":
                                    animal = "cow";
                                    start -= 1;
                                    break;
                                case "bunny":
                                    animal = "tiger";
                                    start -= 1;
                                    break;
                                case "dragon":
                                    animal = "bunny";
                                    start -= 1;
                                    break;
                                case "snake":
                                    animal = "dragon";
                                    start -= 1;
                                    break;
                                case "horse":
                                    animal = "snake";
                                    start -= 1;
                                    break;
                                case "sheep":
                                    animal = "horse";
                                    start -= 1;
                                    break;
                                case "monkey":
                                    animal = "sheep";
                                    start -= 1;
                                    break;
                                case "chicken":
                                    animal = "monkey";
                                    start -= 1;
                                    break;
                                case "dog":
                                    animal = "chicken";
                                    start -= 1;
                                    break;
                                case "pig":
                                    animal = "dog";
                                    start -= 1;
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
                                    animal = "pig";
                                    start -= 1;
                                    color = "yellow";
                                    break;
                                case "cow":
                                    animal = "rat";
                                    start -= 1;
                                    break;
                                case "tiger":
                                    animal = "cow";
                                    start -= 1;
                                    break;
                                case "bunny":
                                    animal = "tiger";
                                    start -= 1;
                                    break;
                                case "dragon":
                                    animal = "bunny";
                                    start -= 1;
                                    break;
                                case "snake":
                                    animal = "dragon";
                                    start -= 1;
                                    break;
                                case "horse":
                                    animal = "snake";
                                    start -= 1;
                                    break;
                                case "sheep":
                                    animal = "horse";
                                    start -= 1;
                                    break;
                                case "monkey":
                                    animal = "sheep";
                                    start -= 1;
                                    break;
                                case "chicken":
                                    animal = "monkey";
                                    start -= 1;
                                    break;
                                case "dog":
                                    animal = "chicken";
                                    start -= 1;
                                    break;
                                case "pig":
                                    animal = "dog";
                                    start -= 1;
                                    break;
                            }
                        }
                        if (start != year) {
                            color = "yellow";
                        }
                        break;
                    case "black":
                        for (int i = 1; i <= 12; i++) {
                            if (year == start) {
                                break;
                            }
                            switch (animal) {
                                case "rat":
                                    animal = "pig";
                                    start -= 1;
                                    color = "white";
                                    break;
                                case "cow":
                                    animal = "rat";
                                    start -= 1;
                                    break;
                                case "tiger":
                                    animal = "cow";
                                    start -= 1;
                                    break;
                                case "bunny":
                                    animal = "tiger";
                                    start -= 1;
                                    break;
                                case "dragon":
                                    animal = "bunny";
                                    start -= 1;
                                    break;
                                case "snake":
                                    animal = "dragon";
                                    start -= 1;
                                    break;
                                case "horse":
                                    animal = "snake";
                                    start -= 1;
                                    break;
                                case "sheep":
                                    animal = "horse";
                                    start -= 1;
                                    break;
                                case "monkey":
                                    animal = "sheep";
                                    start -= 1;
                                    break;
                                case "chicken":
                                    animal = "monkey";
                                    start -= 1;
                                    break;
                                case "dog":
                                    animal = "chicken";
                                    start -= 1;
                                    break;
                                case "pig":
                                    animal = "dog";
                                    start -= 1;
                                    break;
                            }
                        }
                        if (start != year) {
                            color = "white";
                        }
                        break;
                }
            }
        }
        
        System.out.println("Your year: "+year+", year of a "+color+" "+animal+", if 1984 is a year of  a green rat");
    }
    
}

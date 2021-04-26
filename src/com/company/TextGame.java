package com.company;

import java.util.Scanner;

public class TextGame {
    private int sword;
    private int flower;
    private final String required = "\nUse only 1, 2, or 3 \n";

    public void intro() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("After a drunken night out with friends, you awaken the" + "\n"
                            + "next morning in a thick, dank forest. Head spinning and " + "\n"
                            + "fighting the urge to vomit, you stand and marvel at your new, " + "\n"
                            + "unfamiliar setting. The peace quickly fades when you hear a " + "\n"
                            + "grotesque sound emitting behind you. A slobbering orc is " + "\n"
                            + "running towards you. You will:");
        Thread.sleep(1000);
        System.out.println("1. Grab a nearby rock and throw it at thr orc"
                + "\n" + "2. Lie down and wait to be mauled"
                + "\n" + "3. Run");
        int choice = scan.nextInt();
        switch(choice) {
            case 1:
                optionRock();
                break;
            case 2:
                System.out.println("\nWelp, that was quick.\n \nYou died!");
                break;
            case 3:
                optionRun();
                break;
            default:
                System.out.println(required);
                intro();
        }
    }

    public void optionRock() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("\nThe orc is stunned, but regains control. It begins " + "\n"
                            + "running towards you again. Will you:");
        Thread.sleep(1000);
        System.out.println("1. Run" + "\n"
                            + "2.Throw another rock" + "\n"
                            + "3. Run towards a nearby cave");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                optionRun();
                break;
            case 2:
                System.out.println("\nYou decided to throw another rock, as if the first rock thrown did much damgae."
                + "\n" + "The rick flew well over the orcs head. You missed.\n \n You died!");
            case 3:
                optionCave();
                break;
            default:
                System.out.println(this.required);
                optionRock();
                break;
        }
    }

    public void optionCave() throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou were hesitant, since the cave was dark and "
                + "\n" + "ominous. Before you fully enter, you notice a shiny sword on"
                + "\n" + "the ground. Do you pick up a sword? 1 - Yes || 2 - NO");
        int choice = input.nextInt();
        if(choice == 1) {
            sword = 1;
            System.out.println("\nObtained sword\n");
        } else {
            sword = 0;
        }
        System.out.println("\nWhat do you do next?");
        Thread.sleep(1000);
        System.out.println("1. Hide in silence"
                        +"\n" + "2. Fight"
                        +"\n" + "3. Run");
        choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("\nReally? You're going to hide in the dark? I think "
                +"\n" + "orcs can see very well in the dark, right? Not sure, but "
                +"\n" + "I'm going with YES, so...\n\nYou died!");
                break;
            case 2:
                if(sword > 0) {
                    System.out.println("\n You laid in wait. The shimmering sword attracted "
                    +"\n" + "the orc, which thought you were no match. As he walked closer and closer"
                    +"\n" + "your heart beat rapidly. As the orc reached out to grab the sword, "
                    +"\n" + "you pierced the blade into its chest.\n \nYou survived!");
                    break;
                } else {
                    System.out.println("\nYou should have picked up that sword. You're defenseless.\n\nYou died!");
                    break;
                }
            case 3:
                System.out.println("As the orc enters the dark cave, you silently sneak out. "
                +"\n" + "You're several feet away, but the orc turns around and sees you running.");
                optionRun();
                break;
            default:
                System.out.println(this.required);
                optionRock();
                break;
        }
    }

    public void optionRun() throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou run as quickly as possible, but the orc's speed is too great."
        +"\n You will:");
        Thread.sleep(1000);
        System.out.println("1. Hide behind boulder"
        +"\n 2. Trapped, so you fight"
        +"\n 3. Run towards and abandoned town");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("You're easily spotted. \n\nYou died!");
                break;
            case 2:
                System.out.println("You were no match for the orc.\n\n You died!");
                break;
            case 3:
                optionTown();
                break;
            default:
                System.out.println(this.required);
                optionRun();
                break;
        }
    }

    public void optionTown() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhile frantically running, you notice a rusted sword"
                + "\n laying in the mud. You quickly reach down and grab it, but you miss."
                + "\n You try to calm your heavy breathing as you hide behind a delapitated building,"
                + "\n waiting for the orc to come charging around the corner. You notice "
                + "\n a purple flower near your foot. Do you pick it up? 1 - Yes || 0 - No");
        int choice = input.nextInt();
        if (choice == 1) {
            flower = 1;
            System.out.println("\nObtained a flower");
        } else {
            flower = 0;
        }
        System.out.println("You hear its heavy footsteps and ready yourself for the impending orc.");
        Thread.sleep(1000);
        if (flower > 0) {
            System.out.println("\nYou quickly hold out the purple flower, somehow "
                    + "\nhoping it will stop the orc. It does! The orc was looking for love. "
                    + "\n\nThis got weird, but you survived!");
        } else {
            System.out.println("\nMaybe you should have picked up the flower. \n \nYou died! ");

        }
    }
}

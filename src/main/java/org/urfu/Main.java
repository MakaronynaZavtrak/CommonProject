package org.urfu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isOn = true;
        Scanner inp = new Scanner(System.in);
    ConsoleBot bot = new ConsoleBot();
    bot.sayInfo();
    while (isOn){
        bot.write(inp.nextLine());
    }
    inp.close();
    }
}
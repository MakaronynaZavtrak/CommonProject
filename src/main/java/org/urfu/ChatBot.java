package org.urfu;

public class ChatBot {
    public void write(String inpstr){
        if (inpstr.equals("/help")){
            guide();
        } else if (inpstr.equals("/stop")){
            System.out.println("Что ж! Приятно было пообщаться!");
            System.exit(0);
        } else {
            System.out.println(inpstr);
        }
    }

    public void sayInfo(){
        System.out.println("Привет! Меня зовут Бот-Фёдор!\n" +
                "Я ещё мало что умею делать, но со временем стану более функциональным.\n" +
                "А пока я просто умею выводить твои сообщения на экран.\n" +
                "Чтобы начать пользоваться мною, начни писать мне сообщения!\n" +
                "Если у тебя возникли вопросы, напиши команду \"/help\", и я расскажу тебе, что я умею!   ");
    }

    public void guide(){
        System.out.println("В своём арсенале я имею следующие функции:\n" +
                "\"/stop\" - если вы хотите завершить работу с ботом\n" +
                "\"/help\" - если вы хотите узнать, на что я споособен");
    }
}

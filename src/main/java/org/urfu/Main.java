package org.urfu;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<Long> set =  new HashSet<Long>();//Будем использовать коллекцию Set для того чтобы избежать одинаковых номеров билета
        Map<Long, String> clientsMap = new HashMap<Long, String>();//благодаря HashMap'у будем иметь быстрый доступ к информации о заказе, в хэшмапе будем хранить пары: номер билета - заказ

           Ticket John = new Ticket(set, clientsMap);//

        Ticket George = new Ticket(set, clientsMap);

        Ticket Jane = new Ticket(set, clientsMap);

        Ticket Ann = new Ticket(set, clientsMap);
        System.out.println(clientsMap);
        System.out.println("John's number: " + John.getNumber());
        System.out.println("John's order: " + clientsMap.get(John.getNumber()));
    }


    }

package org.urfu;

import java.util.Map;
import java.util.Set;

public class Ticket {
    private int state = (int) (Math.random()*3);//будем считать, что заказы в билете генерируются случайно
    private long number;
    public Ticket(Set<Long> set, Map<Long, String> hMap){//передаем в конструктор 2 коллекции: set проверяет уникальность нового номера, а hMap записывает пару: номер - заказ, чтобы в дальнейшем при номере можно было быстро получить доступ к информации о заказе
        long setValue = (long) (Math.random()*Math.pow(10,16));//номер билета будет генерироваться случайно
        while (set.contains(setValue) || setValue < Math.pow(10,15)){//условие проверки, если вдруг сгенерированный номер уже существует
            setValue = (long) (Math.random()*Math.pow(10,16));
        }
        set.add(setValue);
        this.number = setValue;
        hMap.put(this.getNumber(), this.showOrder());//записываем номер и соответствующую информацию о номере заказа
    }


    public long getNumber(){//по геттеру будем получать информацию о заказе конкретного человека
        return this.number;
    }

    public String showOrder (){//данная функция выводит
        String res;
        if (state == 0){
            res = "Нет товаров";
        } else if (state == 1){
            res ="Напитки";
        } else
            res = "Еда и напитки";
    return res;
    }
}

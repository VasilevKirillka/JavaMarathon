package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет, чувак!");
        user1.sendMessage(user2, "Как у тебя дела?");

        user2.sendMessage(user1, "Привет, бро!");
        user2.sendMessage(user1, "Рад тебя видеть");
        user2.sendMessage(user1, "Я норм. А ты?");

        user3.sendMessage(user1, "Привет, черти. Я дурак");
        user3.sendMessage(user1, "Помните меня?");
        user3.sendMessage(user1, "Мы вмести пиздили крапиву");

        user1.sendMessage(user3, "Даров. Тебя хрен забудешь");
        user1.sendMessage(user3, "Не очень рады тебя видеть");
        user1.sendMessage(user3, "Не хотел бы ты съебаться отсуда");

        user3.sendMessage(user1, "Да, конечно. Еще увидимся, педики");

        MessageDatabase.showDialog(user3, user1);
        MessageDatabase.showDialog(user2,user1);



    }
}

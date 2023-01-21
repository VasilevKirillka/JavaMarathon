package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions=new ArrayList<>(); // пустой список
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public void subscribe(User user){
        this.subscriptions.add(user); // метод добавления пользователя в текущий список
    }
    public boolean isSubscribed(User user){
        for (User currentUser : subscriptions){ // перебираем список
    if(currentUser.getUsername().equals(user.getUsername())) // сравинимает вызываемое имя с именем который в аргументе. если равны
        return true;
        }
        return false;}
    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this); // вернет тру если этот юзер подписан на другого и другой подписан на этого юзера
        }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);

    }
    public String toString(){
        return username;}
}

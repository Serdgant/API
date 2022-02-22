package ru.netology.key_principles;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Петя";
        post.passport = "7575№96058978";
        post.patronymic = "Николаевич";         //отчество
        post.phone = "+7 (999)-306-30-74";
        post.surname = "Сысков";
        post.subscription = true;
        post.birthday.day = 6;
        post.birthday.mondey = 7;
        post.birthday.yaer = 1987;


    }

}







public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Игорь";
        post.passport = "1234 № 567890";
        post.patronymic = "Владимирович";
        post.phone = "+7 (800)-555-35-35";
        post.surname = "Дроздов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 22;
        post.birthday.month = 2;
        post.birthday.year = 1991;

    }
}
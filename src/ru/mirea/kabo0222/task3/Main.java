package ru.mirea.kabo0222.task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин:");
        String inputLogin = scan.nextLine();
        System.out.println("Введите пароль:");
        String inputPassword = scan.nextLine();
        User user = new User(inputLogin, inputPassword);
        String validLogin = "alex123@gmail.com";
        String validPassword ="alex123";

        if (inputLogin.equals(validLogin) && inputPassword.equals(validPassword)){
            System.out.println("Аутентификация успешна");
        }
        else {
            System.out.println("Неверные логин или пароль");
            return;
        }

        String[] catalogsArray = { "Electronics", "Smartphone", "Watch", "Computers" };
        Catalog catalog = new Catalog(catalogsArray);
        catalog.displayCatalogs();

        System.out.println("Выберите каталог для просмотра по индексу:");
        int catalogIndex = scan.nextInt();
        catalog.displayProductsOfCatalog(catalogIndex);

        // Создаем корзину для выбранных товаров
        Cart cart = new Cart();

        System.out.println("Выберите товар по индексу для добавления в корзину:");
        int productIndex = scan.nextInt();
        String selectedProduct = catalog.getProductName(catalogIndex, productIndex);
        if (selectedProduct != null) {
            // Добавляем выбранный товар в корзину
            cart.addToCart(selectedProduct);
            System.out.println("Товар " + selectedProduct + " добавлен в корзину");
        } else {
            System.out.println("Товар с указанным индексом не найден");
        }

        System.out.println("Вы хотите купить товары в корзине? (Да/Нет)");
        String buyDecision = scan.next();

        if (buyDecision.equalsIgnoreCase("Да")) {
            // Покупка товаров в корзине
            cart.checkout();
        } else {
            System.out.println("Вы решили не покупать товары из корзины");
        }
    }
}

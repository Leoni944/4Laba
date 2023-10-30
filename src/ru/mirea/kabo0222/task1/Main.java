package ru.mirea.kabo0222.task1;

public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.WINTER;
        System.out.println("Любимое время года:" + favoriteSeason);
        switch (favoriteSeason) {
            case SUMMER:
                System.out.println("Любимое время года: лето");
                break;
            case SPRING:
                System.out.println("Любимое время года: весна");
                break;
            case AUTUMN:
                System.out.println("Любимое время года: осень");
                break;
            case WINTER:
                System.out.println("Любимое время года: зима");
                break;
        }
    }
}

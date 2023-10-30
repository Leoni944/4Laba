package ru.mirea.kabo0222.task3;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String[] catalogs;
    private List<String>[] products;

    public Catalog(String[] catalogs) {
        this.catalogs = catalogs;
        this.products = new ArrayList[catalogs.length];
        for (int i = 0; i < catalogs.length; i++) {
            products[i] = new ArrayList<>();
        }
    }

    public void addProductToCatalog(int catalogIndex, String productName) {
        if (catalogIndex >= 0 && catalogIndex < catalogs.length) {
            products[catalogIndex].add(productName);
        } else {
            System.out.println("Каталог не найден");
        }
    }

    public void displayCatalogs() {
        System.out.println("Доступные каталоги:");
        for (String catalog : catalogs) {
            System.out.println(catalog);
        }
    }

    public void displayProductsOfCatalog(int catalogIndex) {
        if (catalogIndex >= 0 && catalogIndex < catalogs.length) {
            String catalogName = catalogs[catalogIndex];
            List<String> productList = products[catalogIndex];
            System.out.println("Товары в каталоге " + catalogName + ":");
            if (productList.isEmpty()) {
                System.out.println("Товары отсутствуют");
            } else {
                for (String product : productList) {
                    System.out.println(product);
                }
            }
        } else {
            System.out.println("Каталог не найден");
        }
    }
    public String getProductName(int catalogIndex, int productIndex) {
        if (catalogIndex >= 0 && catalogIndex < catalogs.length) {
            List<String> productList = products[catalogIndex];
            if (productIndex >= 0 && productIndex < productList.size()) {
                return productList.get(productIndex);
            }
        }
        return null;
    }
}
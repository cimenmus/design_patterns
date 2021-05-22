package com.company.creational.singleton;

/**
 * Singleton Pattern
 * https://tugrulbayrak.medium.com/creational-patterns-singleton-prototype-beabbcabdde6
 *
 * Bu desen, yalnızca tek bir nesnenin yaratıldığından emin olurken bir nesneyi oluşturmaktan sorumlu olan tek bir sınıfı içerir.
 * Bu sınıf, sınıf nesnesinin somutlaştırılmasına gerek kalmadan doğrudan erişilebilen tek nesnesine erişmenin bir yolunu sağlar.
 */
public class ImageLoader {

    private static final ImageLoader instance = new ImageLoader();

    private ImageLoader(){}

    public static ImageLoader getInstance(){
        return instance;
    }

    public void writeInfo(){
        System.out.println("Singleton Pattern!");
    }
}

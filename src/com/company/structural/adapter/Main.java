package com.company.structural.adapter;

import com.company.structural.adapter.model.BTypePlug;
import com.company.structural.adapter.model.CTypePlug;
import com.company.structural.adapter.model.Plug;

/**
 * Structural Pattern'ler nesnelerin birbirleri arasındaki ilişkileri düzenler
 *
 * Amerika dan aldığımız laptop vs priz girişlerinin farklı olduğu dikkatinizi çekmiştir.
 * Bu prizleri Türkiye de kullanabilmek için adaptör alırız.
 * Bu gerçek yaşamdan kısacası bu örneği verebiliriz.
 *
 * Var olan bir uygulamanız var ve yeni bir kütüphanenin api sini vs kullanmak istiyorsunuz ama
 * bu yeni kütüphanenin interface leri eski kütüphanelere nazaran farklı tanımlamış.
 * Burada adapter priz örneğinde olduğu gibi firmanın yazdığı kod ile kodunuzun arasına girip,firmanın interface lerini sizin beklediğiniz interface tanımlamalarına çeviriyor.
 *
 * İki uyumsuz interface’i beraber kullanmamızı sağlar.
 * Daha önce yazılmış olan kodları düzenlemek zorunda kalmayız. Sonuçta ilgili kodun daha önce çalıştığını kabul ediyoruz.
 * Adapte edeceğimiz class üzerinde değişiklik yapmadığımız için uygulama içerisinde kullanılmış olduğu herhangi bir yerde değişiklik yapmamız gerekmez.
 *
 */
public class Main {

    public static void main(String[] args) {

        Plug cTypePlug = new CTypePlug();
        cTypePlug.turnOn();
        cTypePlug.turnOff();

        BTypePlug bTypePlug = new BTypePlug();
        Plug bTypePlugAdapter = new BTypePlugAdapter(bTypePlug);
        bTypePlugAdapter.turnOn();
        bTypePlugAdapter.turnOff();
    }
}

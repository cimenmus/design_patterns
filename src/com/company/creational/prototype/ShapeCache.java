package com.company.creational.prototype;

import java.util.Hashtable;

/**
 * Prototype Pattern
 * https://tugrulbayrak.medium.com/creational-patterns-singleton-prototype-beabbcabdde6
 *
 * Prototype Pattern, mevcut nesnenin bir klonunu oluşturmayı söyleyen bir prototip arayüzünün uygulanmasını içerir.
 * Bu desenin, doğrudan nesne oluşturmanın pahalı olduğu durumlarda kullanılması önerilir.
 * Örneğin, bir veritabanı işleminden sonra bir nesne oluşturulur ve bu nesne cachelenir(ön belleğe alınır).
 * Daha sonraki isteklerde bu nesne üstünden clone oluşturulur. Veritabanı sorgularından kaynaklı yükü azaltmış oluruz.
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String id){
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    // Her Shape için veritabanı sorgusu çalıştığını varsay ve objeleri oluştur
    // shapeMap.put(shapeKey, shape);
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}

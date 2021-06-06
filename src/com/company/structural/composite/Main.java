package com.company.structural.composite;

/**
 * https://www.buraksenyurt.com/post/Tasarc4b1m-Desenleri-Composite
 *
 * Aralarında hiyerarşik ilişki (ast-üst ilişkisi) olan yani tree(ağaç) yapısındaki nesnelerin
 * kodsal olarak modellenmesinde kullanılır. Örnek olarak askeri sistem, soy ağacı, şirket organizasyon yapısı verilebilir.
 *
 * Bir grup nesneyi tek bir instance ile ağaç hiyerarşisinde oluşturmayı sağlar.
 * Karmaşık objeleri düzenli hale getirir.
 * Bir ağaç yapısına sahip olmayı ve bu ağaç yapısında herhangi bir alt objeye ulaşmamızı sağlar.
 *
 * Composite Design Pattern'de 3 temel yapı vardır:
 *  Component:
 *      - Abstract veya interface olarak tanımlanır. Composite ve Leaf sınıfın base aldığı soyut sınıdır.
 *      - Composite ve Leaf'teki tüm operasyonları, method ve değişkenleri içerir
 *
 *  Leaf:
 *      - Alt dalı olmayan class. normal bir nesne gibi
 *      - Component class'dan extend/implemente edilir
 *
 *  Composite:
 *      - Alt dalı olan nesne
 *      - Add/remove methodları eklenir
 *      - Component class'dan extend/implemente edilir
 */
public class Main {

    /**
     *                      Burak
     *                        |
     *            ---------------------------
     *            |           |             |
     *          Mike        Tobias          Nevi
     *                                        |
     *                                   -------------
     *                                   |           |
     *                                 Zing         Mario
     *                                   |
     *                                Tomas
     * 
     */

    public static void main(String[] args) {

        // Root oluşturulur.
        CompositeSoldier generalBurak = new CompositeSoldier("Burak", Rank.GENERAL);

        // root altına Leaf tipten nesne örnekleri eklenir.
        generalBurak.addSoldier(new LeafSoldier("Mike", Rank.COLONEL));
        generalBurak.addSoldier(new LeafSoldier("Tobias", Rank.COLONEL));

        // Composite tipler oluşturulur.
        CompositeSoldier majorZing = new CompositeSoldier("Zing", Rank.MAJOR);
        majorZing.addSoldier(new LeafSoldier("Tomas", Rank.CAPTAIN));
        CompositeSoldier colonelNevi = new CompositeSoldier("Nevi", Rank.COLONEL);
        colonelNevi.addSoldier(majorZing);
        colonelNevi.addSoldier(new LeafSoldier("Mario", Rank.MAJOR));

        // Root' un altına Composite nesne örneği eklenir.
        generalBurak.addSoldier(colonelNevi);
        
        // root için ExecuteOrder operasyonu uygulanır. Buna göre root altındaki tüm nesneler için bu operasyon uygulanır
        generalBurak.executeOrder();

    }
}

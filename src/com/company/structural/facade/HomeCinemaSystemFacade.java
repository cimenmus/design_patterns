package com.company.structural.facade;

import com.company.structural.facade.model.DvdPlayer;
import com.company.structural.facade.model.Projector;
import com.company.structural.facade.model.Screen;

/**
 * Bu tasarım kalıbı bir veya birden fazla sınıftaki karmaşayı bir cephenin ardına gizler.
 * Karmaşık alt sistemleri olan bir yapıyı; tek, makul bir arayüz sağlayan Facade sınıfı oluşturarak basitleştirebiliriz.
 * Facade basit bir arayüz sağlar ve alt sistemleri bu arayüze dahil eder.
 * Yazacağımız bu arayüzde, alt sınıflar Facade sınıfımızdan bağımsız da çalışabilmeliler,
 * Facade sadece bir kullanım kolaylığı sağlayan arayüz olacak tasarımımızda.
 *
 * Erişim sırası: Client -> Facade -> Subsystem
 */
public class HomeCinemaSystemFacade {

    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public HomeCinemaSystemFacade() {
        dvdPlayer = new DvdPlayer();
        projector = new Projector();
        screen = new Screen();
    }

    public HomeCinemaSystemFacade(DvdPlayer dvdPlayer, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movieName){
        System.out.println("Home Cinema System is preparing..");
        screen.down();
        projector.on();
        dvdPlayer.start(movieName);
    }

    public void endMovie(){
        System.out.println("Home Cinema System is stopping..");
        screen.up();
        projector.off();
        dvdPlayer.stop();
    }
}

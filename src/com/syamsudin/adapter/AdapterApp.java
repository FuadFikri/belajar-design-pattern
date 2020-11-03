package com.syamsudin.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {
    public static void main(String[] args) {

//        List<Object> list = new ArrayList<>();
//
//        list.add(new Book("harry potret", "hari"));
//        list.add(new Book("pemrograman java", "joko"));
//        list.add(new Book("pemrograman PASCAL", "paijo"));
//
//
//        list.add(new Video("tutorial laravel", "iwan",10L));
//        list.add(new Video("tutorial Memasak", "lia",12L));
//        list.add(new Video("tutorial HIdroponik", "lina",15L));
//
///*
//*       Goals
//*       nampilin title by author
//* */
//        list.forEach(o -> {
//            if (o instanceof Book){
//                Book book = (Book) o;
//                System.out.println(book.getTitle() + " by " + book.getAuthor());
//            }else if(o instanceof  Video){
//                Video video = (Video) o;
//                System.out.println(video.getTitle() + " by " + video.getAuthor());
//            }
//        });

        List<CatalogAdapter> list = new ArrayList<>();

        list.add(new BookCatalogAdapter(new Book("Pemrograman Java", "Eko")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman PHP", "Kurniawan")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman Python", "Khannedy")));

        list.add(new VideoCatalogAdapter(new Video("Web Laravel", "Joko", 100L)));
        list.add(new VideoCatalogAdapter(new Video("Web Rails", "Rudi", 200L)));
        list.add(new VideoCatalogAdapter(new Video("Flask Web", "Ardi", 150L)));


        list.forEach(item -> {
            System.out.println(item.getCatalogTitle());
        });
    }
}

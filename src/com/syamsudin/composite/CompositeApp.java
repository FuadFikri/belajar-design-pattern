package com.syamsudin.composite;

import java.util.Arrays;
import java.util.List;

public class CompositeApp {
    public static void main(String[] args) {

        List<Category> categories = Arrays.asList(
                new CompositeCategory("Handphone", Arrays.asList(
                        new Category("Android"),
                        new Category("IOS")
                )),
                new CompositeCategory("Sport", Arrays.asList(
                        new CompositeCategory("outdoor", Arrays.asList(
                                new Category("sepeda"),
                                new Category("hiking")
                        )),
                        new Category("indoor")
                )),
                new Category("Fashion")
        );

        categories.forEach(category -> {
            printCategory(category);
        });

    }


    private static void printCategory(Category category) {
        System.out.println(category.getName());

        if (category instanceof CompositeCategory) {
            CompositeCategory compositeCategory = (CompositeCategory) category;
            compositeCategory.getCategories().forEach(c -> {
                printCategory(c);
            });
        }
    }


}

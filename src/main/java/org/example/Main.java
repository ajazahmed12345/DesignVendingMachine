package org.example;

public class Main {
    public static void main(String[] args) {

        // custom annotations


        Demo d = new Demo();
        Class c = d.getClass();

        CustomAnno customAnno = (CustomAnno) c.getAnnotation(CustomAnno.class);

        System.out.println(customAnno.id());
        System.out.println(customAnno.name());

        System.out.println(c.getName());


    }
}
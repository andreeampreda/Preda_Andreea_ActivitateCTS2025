package Decorator.main;

import Decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        Nota nota=new NotaDePlata(15);
        System.out.println(nota.printrare());

        NotaDecorata notaAnNou=new NotaAnNou(nota);
        NotaDecorata notaCraciun= new NotaCraciun(nota);
        NotaDecorata notaPaste=new NotaPaste(nota);

        System.out.println(notaAnNou.printrare());
        System.out.println(notaCraciun.printrare());
        System.out.println(notaPaste.printrare());
    }
}

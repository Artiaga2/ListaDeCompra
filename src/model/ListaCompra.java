package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by artiaga on 18/4/17.
 */
public class ListaCompra {

    private static ArrayList<Articulo> articleList = new ArrayList<>();

    public static  void showArticle(){

        int index = 0;

        for (Articulo article : articleList){
            System.out.println((index++) + "-" + article );
        }
    }

    public static int showmenu(){
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("*******************************");
        System.out.println("* 1 - Añadir producto         *");
        System.out.println("* 2 - Eliminar producto       *");
        System.out.println("* 3 - Mostrar lista artículos *");
        System.out.println("* 4 - Consultar importe total *");
        System.out.println("* 0 - Pagar                   *");
        System.out.println("*******************************");
        System.out.println("Opcion:");

        option = input.nextInt();

        return option;
    }

    public static void addArticle(){
        Scanner input = new Scanner(System.in);
        String nombre;
        double precio;

        do {
            System.out.println("Introduce el nombre del producto");
            nombre = input.nextLine();
            System.out.println("Introduce el precio del producto");
            precio = input.nextDouble();

        }while (nombre.length() == 0 || precio == 0);

        Articulo articulo = new Articulo();
        articulo.setNombre(nombre);
        articulo.setPrecio(precio);

        articleList.add(articulo);
    }

    public static void deleteArticle(){
        Scanner input = new Scanner(System.in);

        int index;

        showArticle();

        do {
            System.out.println("Introducir el indice: ");

            index = input.nextInt();
        }while(!correctIndex(index));

        articleList.remove(index);

    }


    public static boolean correctIndex (int index){

        if(index >=0 && index < articleList.size()){
            return true;
    }else{
        return false;
    }
    }

    public static void showImport(){
        double total = 0;

        for (Articulo article : articleList)
              {
            total += article.getPrecio();
        }


         System.out.println("El importe total es: " + total + " €");

    }




}

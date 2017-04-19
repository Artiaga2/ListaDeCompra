package com.artiaga;

import model.ListaCompra;

public class Main {

    public static void main(String[] args) {
	// write your code here



        int option;



        while((option = ListaCompra.showmenu() )!= 0){
            switch (option){
                case 1:
                    ListaCompra.addArticle();
                    break;

                case 2:
                    ListaCompra.deleteArticle();
                    break;

                case 3:
                    ListaCompra.showArticle();
                    break;

                case 4:
                    ListaCompra.showImport();
                    break;

                default:
            }
        }


    }
}

package com.br.zup;

public class Main {

    public static void main(String[] args) {

        System.out.println("Esses são os professores");
        for (Docente docente : Docente.values()){
            System.out.println("-> "+ docente);
        }
    }
}

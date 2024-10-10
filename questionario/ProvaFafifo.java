/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questionario;

/**
 *
 * @author kesia.viana
 */
public class ProvaFafifo extends ProvaUniversidade {
        public ProvaFafifo(double notaAV1, double notaAV2){
        super(notaAV1, notaAV2);
    }
     public boolean aprovado(){
        return calcularMedia() >= 6;
    }
}

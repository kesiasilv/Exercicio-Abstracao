/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questionario;

/**
 *
 * @author kesia.viana
 */
abstract class ProvaUniversidade {
   public double notaAV1;
   public double notaAV2;
   public double media;
    
    public ProvaUniversidade(double notaAV1, double notaAV2){
    this.notaAV1 = notaAV1;
    this.notaAV2 = notaAV2;
}
    public double calcularMedia(){
        return media = (notaAV1 + notaAV2)/2;
    }
  
}

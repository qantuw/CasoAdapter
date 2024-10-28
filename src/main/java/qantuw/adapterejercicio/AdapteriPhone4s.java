/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qantuw.adapterejercicio;

public class AdapteriPhone4s implements ChargerAdapter {
     private iPhone36PlusCharger charger;

    public AdapteriPhone4s(iPhone36PlusCharger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        System.out.println("El adaptador se esta usando para un iPhone4s ");
        charger.fastCharge();
        System.out.println("El iPhon4s está cargando correctamente");
    }
}
    


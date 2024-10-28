
package qantuw.adapterejercicio;


public class Duende {
    public static void main(String[] args) {
        
        iPhone36PlusCharger ogroCharger = new iPhone36PlusCharger();

        
        ChargerAdapter adapter = new AdapteriPhone4s(ogroCharger);
        adapter.charge();
    }
}


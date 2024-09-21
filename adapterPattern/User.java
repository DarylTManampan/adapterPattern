package adapterPattern;

public class User {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet laptopPO = new LaptopAdapter(laptop);

        Refrigerator  refrigerator  = new Refrigerator();
        PowerOutlet refrigeratorPO = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger  smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneChargerPO = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(laptopPO.plugIn());
        System.out.println(refrigeratorPO.plugIn());
        System.out.println(smartphoneChargerPO.plugIn());

        System.out.println();

    }
}

public class JavaAssignment2B {

    public static void main(String[] args) {
        
        BikeSystem bikeSys = new BikeSystem(20);
        
        String bike1 = "Bike|Caroline|Toddler|10|0|1";
        String bike2 = "RB|George|Thunder|29|7|1000|2";
        String bike3 = "Bike|Emily|Spinner|14|0|3";
        String bike4 = "MTB|Kirstin|Explorer|26|10|200|4";
        String bike5 = "MTB|Susan|Nomad|29|11|400|5";
        String bike6 = "RB|Alexander|Roadster|27|12|100|6";
        
        bikeSys.insertBike(bike1);
        bikeSys.insertBike(bike2);
        bikeSys.insertBike(bike3);
        bikeSys.insertBike(bike4);
        bikeSys.insertBike(bike5);
        bikeSys.insertBike(bike6);

        bikeSys.closeShop();

        bikeSys.insertBike(bike3);
        bikeSys.insertBike(bike4);
        bikeSys.insertBike(bike6);
        bikeSys.insertBike(bike1);
        bikeSys.insertBike(bike2);
        
        System.out.println(bikeSys.bikes.size());
        bikeSys.printSystem();
    }
}

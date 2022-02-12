import HouseTypes.*;

import java.util.*;

public class HouseTypeApplication {


    public static void main(String[] args) {

        Service service = new Service();
        Scanner scan = new Scanner(System.in);
        



        System.out.println("Total Price Of Homes : "+service.getTotalPriceOfHomes());
        System.out.println("Total Price Of Villas : "+service.getTotalPriceOfVillas());
        System.out.println("Total Price Of Summer Houses : "+service.getTotalPriceOfSummerHouses());
        System.out.println("Total Price Of All Houses : "+service.getTotalPriceOfHouses());
        System.out.println("Average Square Meter Of Homes : "+service.getAverageSquareMeterOfHomes());
        System.out.println("Average Square Meter Of Villas : "+service.getAverageSquareMeterOfVillas());
        System.out.println("Average Square Meter Of Summer Houses : "+service.getAverageSquareMeterOfSummerHouses());
        System.out.println("Average Square Meter Of Houses : "+service.getAverageSquareMeterOfHouses());

        System.out.print("Enter a room number to filter: ");
        int room = scan.nextInt();
        System.out.print("Enter a halls number to filter: ");
        int hall = scan.nextInt();
        System.out.println("Selected Houses :");
        List<House> selectedHouse = service.getFilterByNumberOfRoomsAndHalls(room,hall);
        if(selectedHouse != null){
            if(selectedHouse.size() == 0){
                System.out.println("No house found matching the selected criteria :(");
            }else{
                for (int i = 0; i < selectedHouse.size(); i++) {
                    System.out.println(selectedHouse.get(i).getHouseName());
                }
            }
        }





    }


}

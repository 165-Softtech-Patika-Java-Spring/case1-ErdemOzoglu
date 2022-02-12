package HouseTypes;

import java.util.ArrayList;
import java.util.List;


public class Service extends HouseCrator {

    //Returns the total prices of homes
    public int getTotalPriceOfHomes(){
        List<Home> homes = getHomes();

        int TotalPriceOfHouses=0;
        for (int i = 0; i < homes.size(); i++)
        {
            TotalPriceOfHouses +=  homes.get(i).getPrice();
        }
        return TotalPriceOfHouses;
    }

    //Returns the total prices of villas
    public int getTotalPriceOfVillas(){
        List<Villa> villas = getVillas();

        int TotalPriceOfVilla=0;
        for (int i = 0; i < villas.size(); i++)
        {
            TotalPriceOfVilla +=  villas.get(i).getPrice();
        }
        return TotalPriceOfVilla;
    }

    //Returns the total prices of summer houses
    public int getTotalPriceOfSummerHouses(){
        List<SummerHouse> summerhouses = getSummerHouses();

        int TotalPriceOfSummerHouse=0;
        for (int i = 0; i < summerhouses.size(); i++)
        {
            TotalPriceOfSummerHouse +=  summerhouses.get(i).getPrice();
        }
        return TotalPriceOfSummerHouse;
    }

    //Returns the total prices of Houses
    public int getTotalPriceOfHouses(){

        int TotalPriceOfHouses=0;
        TotalPriceOfHouses += getTotalPriceOfHomes();
        TotalPriceOfHouses += getTotalPriceOfSummerHouses();
        TotalPriceOfHouses += getTotalPriceOfVillas();

        return TotalPriceOfHouses;
    }

    //Returns the Average Square Meter Homes
    public float getAverageSquareMeterOfHomes(){
        List<Home> homes = getHomes();

        float AverageSquareMeterOfHomes=0;
        for (int i = 0; i < homes.size(); i++)
        {
            AverageSquareMeterOfHomes +=  (float) homes.get(i).getSquareMeter();
        }
        return (AverageSquareMeterOfHomes/(float) homes.size());
    }

    //Returns the Average Square Meter Villas
    public float getAverageSquareMeterOfVillas(){
        List<Villa> villas = getVillas();

        float AverageSquareMeterOfVilla=0;
        for (int i = 0; i < villas.size(); i++)
        {
            AverageSquareMeterOfVilla += (float) villas.get(i).getSquareMeter();
        }
        return (AverageSquareMeterOfVilla/(float)villas.size());
    }

    //Returns the Average Square Meter Summer Houses
    public float getAverageSquareMeterOfSummerHouses(){
        List<SummerHouse> summerhouses = getSummerHouses();

        float AverageSquareMeterOfSummerHouse=0;
        for (int i = 0; i < summerhouses.size(); i++)
        {
            AverageSquareMeterOfSummerHouse += (float) summerhouses.get(i).getSquareMeter();
        }
        return (AverageSquareMeterOfSummerHouse/(float)summerhouses.size());
    }

    //Returns the Average Square Meter Houses
    public float getAverageSquareMeterOfHouses(){

        float AverageSquareMeterOfHouses=0;
        AverageSquareMeterOfHouses += getAverageSquareMeterOfHomes();
        AverageSquareMeterOfHouses += getAverageSquareMeterOfSummerHouses();
        AverageSquareMeterOfHouses += getAverageSquareMeterOfVillas();

        return (AverageSquareMeterOfHouses/3);
    }
    //returns filtered by number of rooms and halls
    public List<House> getFilterByNumberOfRoomsAndHalls(int room, int hall){

        List<House> houses = new ArrayList<House>();
        List<SummerHouse> summerhouses = getSummerHouses();
        List<Villa> villas = getVillas();
        List<Home> homes = getHomes();

        for (int i = 0; i < homes.size(); i++)
        {
            if(homes.get(i).getNumberOfRooms() == room && homes.get(i).getNumberOfHall() == hall){
                houses.add(homes.get(i));
            }
        }

        for (int i = 0; i < villas.size(); i++)
        {
           if(villas.get(i).getNumberOfRooms() == room && villas.get(i).getNumberOfHall() == hall){
               houses.add(villas.get(i));
           }
        }

        for (int i = 0; i < summerhouses.size(); i++)
        {
            if(summerhouses.get(i).getNumberOfRooms() == room && summerhouses.get(i).getNumberOfHall() == hall){
                houses.add(summerhouses.get(i));
            }
        }

        return houses;
    }

}

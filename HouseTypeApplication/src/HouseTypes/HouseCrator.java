package HouseTypes;

import java.util.ArrayList;
import java.util.List;

public class HouseCrator {
    Home homeKadikoy = new Home(90,500000,2,1,"Home Kadikoy");
    Home homeKartal = new Home(100,450000,3,1,"Home Kartal");
    Home homeFatih = new Home(60,250000,1,1, "Home Fatih");

    SummerHouse summerHouseAyvalik = new SummerHouse(70,450000,2,1,"Summer House Ayvalık");
    SummerHouse summerHouseMarmaris = new SummerHouse(65,550000,2,1,"Summer House Marmaris");
    SummerHouse summerHouseDidim = new SummerHouse(90,750000,2,1,"Summer House Didim");

    Villa villaVakfikebir = new Villa(180,300000,4,1,"Villa Vakfıkebir");
    Villa villaDarica = new Villa(250,950000,5,1,"Villa Darıca");
    Villa villaKas = new Villa(140,1300000,5,1,"Villa Kaş");

    List<Home> Homes = new ArrayList<Home>(){{add(homeFatih);add(homeKartal);add(homeKadikoy);}};
    List<Villa> Villas = new ArrayList<Villa>(){{add(villaVakfikebir);add(villaDarica);add(villaKas);}};
    List<SummerHouse> SummerHouses = new ArrayList<SummerHouse>(){{add(summerHouseAyvalik);add(summerHouseMarmaris);add(summerHouseDidim);}};



    public List<Home> getHomes(){


        return Homes;
    }
    public List<Villa> getVillas(){


        return Villas;
    }
    public List<SummerHouse> getSummerHouses(){


        return SummerHouses;
    }

}

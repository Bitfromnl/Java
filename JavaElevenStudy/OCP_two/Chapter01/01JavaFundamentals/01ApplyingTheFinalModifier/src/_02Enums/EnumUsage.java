package _02Enums;

public class EnumUsage {

    public static void main (String [] args){
    Season s = Season.SUMMER;
    System.out.printLn(Season.SUMMER);
    System.out.printLn(s == Season.SUMMER);

    for (Season season:Season.values()){
     System.out.printLn(season.name()+ " " + season.ordinal());
    }
    }
}

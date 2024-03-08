import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws AssetException{

        AssetRegister assetRegister=new AssetRegister();

        Room kotelna = new Room("11","Hlavní budova");
        Room kancelar = new Room("22","Hlavní budova");
        Room profesorovna = new Room("99","Vila v Toledu");

        Employee kotelnik = new Employee("Josef","Uhlíř","kotelník");
        Employee urednik = new Employee("Kamil","Vosáhlo","hlavní úředník");
        Employee profesor = new Employee("Sergio","Marquina","profesor");

        Vehicle cerveneAuto = new Vehicle("ABC159","Červené auto",(int)350000, LocalDate.now().plusDays(1460));
        Vehicle zeleneAuto = new Vehicle("DEF260","Zelené auto",(int)5000, LocalDate.now().plusDays(3650));

        Computer laptop = new Computer("COMP001","První počítač",ComputerType.LAPTOP);
        Computer desktop = new Computer("COMP002","Druhý počítač",ComputerType.DESKTOP);
        Computer tablet = new Computer("COMP003","Třetí počítač",ComputerType.TABLET);

        cerveneAuto.setLocation(profesor);
        zeleneAuto.setLocation(kotelnik);

        laptop.setLocation(profesorovna);
        desktop.setLocation(urednik);
        tablet.setLocation(kotelna);

        assetRegister.addAsset(cerveneAuto);
        assetRegister.addAsset(zeleneAuto);
        assetRegister.addAsset(laptop);
        assetRegister.addAsset(desktop);
        assetRegister.addAsset(tablet);

        //Výpis souhrnné zprávy
        for(Asset asset:assetRegister.getAssetList()){
            System.out.println(asset.getReportLine());
        }
        assetRegister.saveReportToFile();



    }
}
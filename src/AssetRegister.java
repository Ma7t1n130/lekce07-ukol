import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AssetRegister {
    private List<Asset> assetList = new ArrayList<>();

    public AssetRegister() {
        //this.assetList=new ArrayList<>();
    }

    public List<Asset> getAssetList(){
        return this.assetList;
    }

    private void checkUniqueIdNumber(String idNumber) throws AssetException {
        for(Asset asset:this.assetList){
            if(asset.getIdNumber().equals(idNumber)){
                throw new AssetException("Majetek s timto kodem uz je evidovan.");
            }
        }
    }

    public void addAsset(Asset asset) throws AssetException {
        this.checkUniqueIdNumber(asset.getIdNumber());
        this.assetList.add(asset);
    }

    public void removeAsset(String idNumber){
        for(Asset asset:this.assetList){
            if(asset.getIdNumber().equals(idNumber)){
                this.assetList.remove(this.assetList.indexOf(asset));
            }
        }
    }

    public void saveReportToFile() throws AssetException {
        String fileName="report.txt";
        String delimiter="\t";
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))){
            for(Asset asset:getAssetList()){
                writer.println(asset.getReportLine());
            }
        } catch (IOException e) {
            throw new AssetException("Chyba při zápisu do souboru " + fileName + " " + e.getLocalizedMessage());
        }
    }



}

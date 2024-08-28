package baseOfJava.serializableJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class SerializableJava implements Serializable {
    private static final long serialVersionUID = 1L;

    private String[] territoriesInfo;
    private String[] resourcesInfo;
    private String[] diplomacyInfo;

    public SerializableJava(String[] territoriesInfo,String[] resourcesInfo,String[] diplomacyInfo){
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public String[] getTerritoriesInfo() {
        return territoriesInfo;
    }
    public void setTerritoriesInfo(String[] territoriesInfo){
        this.territoriesInfo = territoriesInfo;
    }
    public String[] getDiplomacyInfo(){
        return diplomacyInfo;
    }
    public void setDiplomacyInfo(String[] diplomacyInfo){
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString(){
        return "SavedGame{" +
                "terrotoriesInfo=" + Arrays.toString(territoriesInfo) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                '}';
    }
}
class Main{
    public static void main(String[] args) throws IOException {
        String[] territory = {"У испании 6 провинций","У россии 10 провинций","У франции 8 провинций"};
        String[] resources = {"У испании 100 золота","У россии 80 золота","У Франции 90 золота"};
        String[] diplomacy = {"Франция воюет с россией,нейтралитет испании"};

        SerializableJava serializableJava = new SerializableJava(territory,resources,diplomacy);

        FileOutputStream outputStream = new FileOutputStream("/Users/nurdinbakytbekov/Desktop/ser.ser");
        ObjectOutputStream objOutput = new ObjectOutputStream(outputStream);

        objOutput.writeObject(serializableJava);

        objOutput.close();
    }
}
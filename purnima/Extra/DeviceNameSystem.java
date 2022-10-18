import java.util.*;

public class DeviceNameSystem {
    public static void main(String[] args) {

        List<String> devicenames = new ArrayList<String>();
        devicenames.add("lamp");
        devicenames.add("lamp");
        devicenames.add("tv");
        devicenames.add("lamp");


        HashMap<String , Integer> map = new HashMap<>();

        for(int i=0; i<devicenames.size(); i++){
            String temp = devicenames.get(i);
            if(map.containsKey(temp)){
                int freq = map.get(temp);
                devicenames.set(i, temp+freq);
                map.replace(temp, freq+1);
            }

            else{
                map.put(temp, 1);
            }
        }


        System.out.println(devicenames);

    }
}

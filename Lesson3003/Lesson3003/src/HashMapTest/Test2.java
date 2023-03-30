package HashMapTest;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Yevhen",00001);
        empIds.put("Iryna",00002);
        empIds.put("Karyna", 00003);
        empIds.put("Zlata",00004);
        System.out.println(empIds);

        System.out.println(empIds.get("Yevhen"));
        System.out.println(empIds.get("yevhen"));
        System.out.println(empIds.containsKey("Iryna"));
        System.out.println(empIds.containsKey("iryna"));
        System.out.println(empIds.containsValue(2));
        empIds.put("Yevhen",10);
        System.out.println(empIds);
        empIds.put("White",null);
        System.out.println(empIds);
        empIds.replace("White", 6);
        System.out.println(empIds);
        empIds.replace("White",null);
        empIds.putIfAbsent("White",100);
        System.out.println(empIds);
        System.out.println(empIds.keySet());
        System.out.println(empIds.values());
        System.out.println(empIds.entrySet());

    }
}

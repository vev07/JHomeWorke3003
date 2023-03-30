package HashMapTest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Yevhen");
        names.add("Iryna");
        names.add("Karyna");
        names.add("Zlata");
        names.add("Yevhen"); //you can't repeat element
        names.remove(0);
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("iryna"));
        System.out.println(names.contains("Iryna"));
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
        names.add("Yevhen");
        names.add("Iryna");
        names.add("Karyna");
        names.add("Zlata");
        for (String name : names) {
            System.out.println(name);
            }
        System.out.println(names);
        names.forEach(System.out::println);
        Iterator<String> namesIterator = names.iterator();
         while (namesIterator.hasNext()) {
             System.out.println(namesIterator.next());
         }
        List<Integer> numberList = new ArrayList<>();
         numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        Set<Integer> numberTree  = new TreeSet<>();
        Set<Integer> numberLinkedHashSet = new LinkedHashSet<>();
        numberSet.addAll(numberList);
        numberTree.addAll(numberList);
        numberLinkedHashSet.addAll(numberList);
        System.out.println(numberSet);
        System.out.println(numberTree);
        System.out.println(numberLinkedHashSet);

    }
}

package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

import java.util.Map;

public class ClubManagement {
    public static void main(String[] args) {

        MembershipList map = new MembershipList();
        Member m1 = new Member("M02", "Heinz", "Mustermann", 16);
        Member m2 = new Member("M06", "Anette", "Koch", 15);
        Member m3 = new Member("M05", "Bart", "Simpson", 9);
        Member m4 = new Member("M03", "Lisa", "Simpson", 5);

        map.put(m1);
        map.put(m2);
        map.put(m3);
        map.put(m4);

        System.out.println("Die Länge ist: " + map.size());
        for (Map.Entry<String, Member> entry : map.entrySet()) {
            System.out.println(entry.getValue().toString());
        }

        System.out.println();
        map.remove("M02");
        for (Map.Entry<String, Member> entry : map.entrySet()) {
            System.out.println(entry.getValue().toString());

        }

        MembershipList map2 = new MembershipList();
        Member m5 = new Member("M02", "Lisa", "Simpson", 5);
        map2.putAll(map);
        map2.put(m5);
        System.out.println();

        System.out.println(map.containsKey("M02"));
        System.out.println();

        if (map2.containsKey("M02") == true) {
            System.out.println(map2.containsKey("M02"));
            for (Map.Entry<String, Member> entry : map2.entrySet()) {
                Member m = entry.getValue();
                if (m.getMitgliederID() == "M02") {
                    System.out.println("Mitglied vorhanden" + "" + m.toString());
                }
            }

        }
        System.out.println();
        for (Map.Entry<String, Member> entry : map2.entrySet()) {
            Member m = entry.getValue();
            if (m.getMitgliederID() == "M05") {
                m.setVorname("Günter");
                System.out.println(m.toString());
            }
        }

        System.out.println();
        map2.remove("M05");

        for (Map.Entry<String, Member> entry : map.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        
        System.out.println();

        for (Map.Entry<String, Member> entry : map2.entrySet()) {
            System.out.println(entry.getValue().toString());
        }

        System.out.println();
        map.clear();
        map2.clear();
        System.out.println(map.size());
        System.out.println(map2.size());

    }
}

package oaSnowflake;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class AGridland {
    public static void main(String[] args) {




        // for testing backtracking function
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("------ hNums: " + i + " vNums: " + j + " ---------");
                List<String> list = new ArrayList<>();
                StringBuilder builder = new StringBuilder();
                backtrack(list, i, j, builder);
//                for (String str : list) {
//                    System.out.println(str);
//                }
                System.out.println("Total is " + list.size());
            }
        }


    }


    public static List<String> getSafePaths(List<String> journeys) {
        List<String> list = new ArrayList<>();

        for (String str : journeys) {

        }

        StringBuilder builder = new StringBuilder();

//        while (k > 0)
        return list;
    }

    private static void backtrack(List<String> list, int hNums, int vNums, StringBuilder builder) {
        if (hNums < 0 || vNums < 0) return;

        if (hNums == 0 && vNums == 0) {
            list.add(builder.toString());
            return;
        }

        if (hNums > 0) {
            builder.append('H');
            System.out.println(builder.toString());
            backtrack(list, hNums - 1, vNums, builder);
            builder.deleteCharAt(builder.length() - 1);
        }

        if (vNums > 0) {
            builder.append('V');
            backtrack(list, hNums, vNums - 1, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}


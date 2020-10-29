package com.flipkart.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PrintableTable {
    /*
     * leftJustifiedRows - If true, it will add "-" as a flag to format string to
     * make it left justified. Otherwise right justified.
     */
    private boolean rightJustifiedRows = false;

    public String printTable(String[][] table) {

        Map<Integer, Integer> columnLengths = new HashMap<>();

        Arrays.stream(table).forEach(a -> Stream.iterate(0, (i -> i < a.length), (i -> ++i)).forEach(i -> {
            columnLengths.putIfAbsent(i, 0);
            if (columnLengths.get(i) < a[i].length()) {
                columnLengths.put(i, a[i].length());
            }
        }));

        final StringBuilder formatString = new StringBuilder();
        String flag = rightJustifiedRows ? "" : "-";
        columnLengths.forEach((key, value) -> formatString.append("| %").append(flag).append(value).append("s "));
        formatString.append("|\n");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        Stream.iterate(0, (i -> i < table.length), (i -> ++i))
                .forEach(a -> sb.append(String.format(formatString.toString(), (Object[]) table[a])));
        sb.append("\n");
        return sb.toString();
    }

    public void getRightJustifiedRows() {
        this.rightJustifiedRows = true;
    }


    public static void main(String[] args) {
        String[][] table = new String[][] { { "id", "First Name", "Last Name", "Age" },
                { "1", "John", "Johnson", "45" }, { "2", "Tom", "", "35" }, { "3", "Rose", "Johnson", "22" },
                { "4", "Jimmy", "Kimmel", "" } };
        PrintableTable st = new PrintableTable();
        System.out.println(st.printTable(table));
    }
}

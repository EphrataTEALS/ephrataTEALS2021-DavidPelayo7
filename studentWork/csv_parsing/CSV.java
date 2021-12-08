public class CSV {
    /*
     * Write a method called `parseCSV`.
     * The method should accept a single String as input.
     * The String input is assumed to be in comma separated value (CSV) format.
     * That is, any commas in the string indicate the dividing lines between different columns of input.
     * Your method should count how many columns the input contains and return that number back to the caller.
     * In addition, your method should print out each individual column of data.
     * 
     * Ex:
     *   The call `parseCSV("testing,one,two,three")` should return 4 and produce the following lines of output:
     *     Column 1: testing
     *     Column 2: one
     *     Column 3: two
     *     Column 4: three
     *
     * You may find the String methods listed on the AP Java reference sheet useful:
     * https://apstudents.collegeboard.org/ap/pdf/ap-computer-science-a-java-quick-reference_0.pdf
     */
    public static void main(String[] args) {
        String input1 = "Test,CSV,Parser";
        int columnCount1 = parseCSV(input1);
        System.out.println("Input 1 had " + columnCount1 + " columns");

        String input2 = "Second,test,with,the,CSV,Parser,method";
        int columnCount2 = parseCSV(input2);
        System.out.println("Input 2 had " + columnCount2 + " columns");
    }

    /*** write your method here ***/

}
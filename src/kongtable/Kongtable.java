
package kongtable;

public class Kongtable {

    public static void main(String[] args) {
        Conector con = new Conector();
        con.connect();
        con.close();
    }

}

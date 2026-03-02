/**
 * OOPSBannerApp
 *
 * UC5: Render OOPS as Banner using Print Statements
 *
 * @author Trinai
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] oopsBanner = {
            String.join("", "  *** ", "  *** ", " ***** ", " ***** "),
            String.join("", " ** ** ", " ** ** ", " ** **", " ** "),
            String.join("", "** **", "** **", " ** **", " ** "),
            String.join("", "** **", "** **", " ***** ", " *** "),
            String.join("", "** **", "** **", " ** ", "   ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "   ** "),
            String.join("", "  *** ", "  *** ", " ** ", " ***** ")
        };

        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }
}

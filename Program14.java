import java.awt.*;
import java.applet.*;
/* <applet code="Program14" width=400 height=200>
 * <param name="Name" value="Divyankar">
 * <param name="EntryNumber value="18BCS028">
 * </applet>
 */
public class Program14 extends Applet {
    String name;
    String entryNumber;
    public void init() {
        name = getParameter("Name");
        entryNumber = getParameter("EntryNumber");
    }
    public void paint(Graphics g) {
        g.drawString("Name: " + name, 20, 40);
        g.drawString("Entry Number: " + entryNumber, 20, 60);
    }
}
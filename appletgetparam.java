import java.applet.*;
import java.awt.*;

/* <applet code="appletgetparam.class" width=500 height=500>
 <param name=roll value=12345>
 <param name=name1 value=“VIT”>
 </applet> */

@SuppressWarnings("serial")
public class appletgetparam extends Applet
{
  String rollno, name;
  public void init()
  {
    setBackground(Color.red);
    
  }
  public void start()
  {
    rollno=getParameter("roll");
    name=getParameter("name1"); 
  }
  public void paint(Graphics g)
  {
    g.drawString(rollno,50,50);
    g.drawString(name, 100,50);
  }
}
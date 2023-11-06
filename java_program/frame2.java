import java.awt.*;
public class Testawt
{
Frame fm;
 Label lb;
  Testawt()
  {
    fm=new Frame();    
    lb = new Label("welcome to java graphics");  
    fm.add(lb);                  
    fm.setSize(300, 300);   
    fm.setVisible(true);    
  }
  public static void main(String args[])
  {
    Testawt ta = new Testawt();
  }
}
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.util.Random;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.*;
//import java.lang.;
import java.io.*;
import java.applet.Applet;
import java.util.*;
public class app3 extends Applet implements ActionListener,ItemListener,Runnable
{
int a=0,b=0,count=0,crt=0;
public static int sum=0,i=0,j=0,k=0;
Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
CheckboxGroup cbg1,cbg2;
TextField t1,t2,t3,t4;
Button b1,b2;
Label l1,l2,l3,l4,l5,l6;
Thread td;
Random r;
public void init()
{
setLayout(null);
setBackground(Color.cyan);
r=new Random();
td=new Thread(this);
cbg1=new CheckboxGroup();
cbg2=new CheckboxGroup();
c1=new Checkbox("Addition",false,cbg1);
c2=new Checkbox("Subraction",false,cbg1);
c3=new Checkbox("Multiplication",false,cbg1);
c4=new Checkbox("Division",false,cbg1);
c5=new Checkbox("Numbers from 0-5",false,cbg2);
c6=new Checkbox("Numbers from 3-9",false,cbg2);
c7=new Checkbox("Numbers from 0-20",false,cbg2);
c8=new Checkbox("Any 2 digits",false,cbg2);
l1=new Label("Choose a type");
l2=new Label("Choose a level");
l1.setFont(new Font("Verdana",Font.BOLD,15));
l2.setFont(new Font("Verdana",Font.BOLD,15));

l3=new Label("Question");
l4=new Label("Answer");
l5=new Label("Correct");
l6=new Label("Time Spent");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
b1=new Button("Start");
b2=new Button("Stop");
l1.setBounds(90,50,150,20);
c1.setBounds(100,80,150,20);
c2.setBounds(100,110,150,20);
c3.setBounds(100,140,150,20);
c4.setBounds(100,170,150,20);
l2.setBounds(260,50,150,20);
c5.setBounds(270,80,150,20);
c6.setBounds(270,110,150,20);
c7.setBounds(270,140,150,20);
c8.setBounds(270,170,150,20);
l3.setBounds(140,200,80,20);
l4.setBounds(250,200,50,20);
t1.setBounds(130,220,80,20);
t2.setBounds(240,220,80,20);
b1.setBounds(160,260,50,20);
b2.setBounds(230,260,50,20);
l5.setBounds(140,300,50,20);
l6.setBounds(240,300,80,20);
t3.setBounds(130,320,80,20);
t4.setBounds(240,320,80,20);
add(l1);
add(c1);
add(c2);
add(c3);
add(c4);
add(l2);
add(c5);
add(c6);
add(c7);
add(c8);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(l5);
add(l6);
add(t3);
add(t4);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
c7.addItemListener(this);
c8.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
t2.addActionListener(this);

}
public void itemStateChanged(ItemEvent e)
{
if(c1==cbg1.getSelectedCheckbox())
{
a=1;
}

if(c2==cbg1.getSelectedCheckbox())
{
a=2;
}
if(c3==cbg1.getSelectedCheckbox())
{
a=3;
}
if(c4==cbg1.getSelectedCheckbox())
{
a=4;
}
if(c5==cbg2.getSelectedCheckbox())
{
b=1;
}
if(c6==cbg2.getSelectedCheckbox())
{
b=2;
}
if(c7==cbg2.getSelectedCheckbox())
{
b=3;
}
if(c8==cbg2.getSelectedCheckbox())
{
b=4;
}

}
public void actionPerformed(ActionEvent ee)
{
if(b1==ee.getSource())
{
td.start();
if(a==1)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
sum=a3;
System.out.print(sum);
}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
sum=a3;
}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
sum=a3;

}
}
if(a==2)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
sum=a3;

}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
sum=a3;

}
}
if(a==3)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
sum=a3;

}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
sum=a3;

}
}
if(a==4)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
sum=a3;

}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
sum=a3;

}
}
}
if(b2==ee.getSource())
{
td.stop();
t3.setText(Integer.toString(crt));
//t4.setText(Integer.toString(i)+":"+Integer.toString(j)+":"+Integer.toString(k));
}

if(t2==ee.getSource())
{
count++;
if(a==1)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}
sum=a3;
}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}

sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}

sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"+"+Integer.toString(a2));
int a3=a1+a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}

sum=a3;

}
}
if(a==2)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}

sum=a3;

}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"-"+Integer.toString(a2));
int a3=a1-a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
}
if(a==3)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"*"+Integer.toString(a2));
int a3=a1*a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
}
if(a==4)
{
if(b==1)
{
int a1=r.nextInt(6);
int a2=r.nextInt(6);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==2)
{
int a1=r.nextInt(10);
while(a1<3)
 a1=r.nextInt(10);
int a2=r.nextInt(10);
while(a2<3)
 a2=r.nextInt(10);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==3)
{
int a1=r.nextInt(20);
int a2=r.nextInt(20);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;

}
if(b==4)
{
int a1=r.nextInt(100);
int a2=r.nextInt(100);
t1.setText(Integer.toString(a1)+"/"+Integer.toString(a2));
int a3=a1/a2;
int a4=Integer.parseInt(t2.getText());
t2.setText("");
if(a4==sum)
{
crt++;
t3.setText(Integer.toString(crt));
}


sum=a3;
}
}
}
}
public void run()
{
for(i=0;i<2;i++)
{
for(j=0;j<=59;j++)
{
for(k=0;k<=59;k++)
{
t4.setText(Integer.toString(i)+":"+Integer.toString(j)+":"+Integer.toString(k));
try
{
Thread.sleep(1000);
}
catch(Exception eee)
{
}
}
}
}
}
}









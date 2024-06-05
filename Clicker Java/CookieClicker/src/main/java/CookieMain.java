import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class CookieMain {

    JLabel counterLabel;JLabel perSecondLabel;
    JButton button1,button2,button3,button4;
    int cookieCounter,timerspeed,cursorNumber,cursorPrice,grandpaNumber,grandpaPrice,grandmaNumber,grandmaPrice,bakeryPrice,bakeryNumber;
    double perSecond;
    boolean timerOn,grandpaUnlocked,grandmaUnlocked,bakeryUnlocked;
    Font font1,font2;
    CookieHandler cHandler = new CookieHandler();
    Timer timer;
    JTextArea messageText;
    MouseHandler mHandler = new MouseHandler();


    public static void main(String[] args) {

        new CookieMain();
    }

    public CookieMain() {
        timerOn=false;
        grandpaUnlocked = false;
        grandmaUnlocked=false;
        bakeryUnlocked=false;
        perSecond=0;
        cookieCounter=0;
        cursorNumber=0;
        cursorPrice=10;
        grandpaNumber=0;
        grandpaPrice=50;
        grandmaNumber=0;
        grandmaPrice=150;
        bakeryNumber=0;
        bakeryPrice=500;
        createFont();
        createUI();
    }
    public void createFont()
    {
        font1=new Font("Comic Sans MS",Font.PLAIN,32);
        font2=new Font("Comic Sans MS", Font.PLAIN,15);
    }

public void createUI()
{
    JFrame window = new JFrame();
    window.setSize(800,600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.black);
    window.setLayout(null);

    JPanel cookiePanel=new JPanel();
    cookiePanel.setBounds(100,220,200,200);
    cookiePanel.setBackground(Color.black);
    window.add(cookiePanel);

    ImageIcon cookie=new ImageIcon(getClass().getClassLoader().getResource("CookieImg.png"));

    JButton cookieButton = new JButton();
    cookieButton.setBackground(Color.black);
    cookieButton.setFocusPainted((false));
    cookieButton.setBorder(null);
    cookieButton.setIcon(cookie);
    cookieButton.addActionListener(cHandler);
    cookieButton.setActionCommand("Cookie");
    cookieButton.setContentAreaFilled(false);
    cookiePanel.add(cookieButton);

    JPanel counterPanel= new JPanel();
    counterPanel.setBounds(100,100,200,100);
counterPanel.setBackground(Color.black);
counterPanel.setLayout(new GridLayout(2,1));
window.add(counterPanel);

counterLabel=new JLabel(cookieCounter + " Cookies");
counterLabel.setForeground(Color.white);
counterLabel.setFont(font1);
counterPanel.add(counterLabel);


perSecondLabel=new JLabel();
counterLabel.setForeground(Color.white);
    perSecondLabel.setFont(font2);
counterPanel.add(perSecondLabel);



JPanel itemPanel= new JPanel();
itemPanel.setBounds(500,170,250,250);
itemPanel.setBackground(Color.black);
itemPanel.setLayout(new GridLayout(5,1));
window.add(itemPanel);

button1=new JButton("Cursor");
button1.setFont(font1);
button1.setFocusPainted(false);
button1.addActionListener(cHandler);
button1.setActionCommand("Cursor");
button1.addMouseListener(mHandler);
itemPanel.add(button1);

    button2=new JButton("?");
    button2.setFont(font1);
    button2.setFocusPainted(false);
    button2.addActionListener(cHandler);
    button2.setActionCommand("Grandpa");
    button2.addMouseListener(mHandler);
    itemPanel.add(button2);

    button3=new JButton("?");
    button3.setFont(font1);
    button3.setFocusPainted(false);
    button3.addActionListener(cHandler);
    button3.setActionCommand("Grandma");
    button3.addMouseListener(mHandler);
    itemPanel.add(button3);

    button4=new JButton("?");
    button4.setFont(font1);
    button4.setFocusPainted(false);
    button4.addActionListener(cHandler);
    button4.setActionCommand("Bakery");
    button4.addMouseListener(mHandler);
    itemPanel.add(button4);



    JPanel messagePanel = new JPanel();
    messagePanel.setBounds(500,70,250,150);
    messagePanel.setBackground(Color.black);
    window.add(messagePanel);

    messageText = new JTextArea();
    messageText.setBounds(500,70,250,150);
    messageText.setForeground(Color.white);
    messageText.setBackground(Color.black);
    messageText.setFont(font2);
    messageText.setLineWrap(true);
    messageText.setWrapStyleWord(true);
    messageText.setEditable(false);
    messagePanel.add(messageText);


    window.setVisible(true);
}

public void setTimer()
{
    timer=new Timer(timerspeed, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cookieCounter++;
            counterLabel.setText(cookieCounter+ " cookies ");
            verifyUnlock();
        }
    });
}
public void timerUpdate()
{
    if(!timerOn)
    {
        timerOn=true;
    }
    else if(timerOn)
    {
        timer.stop();
    }
    double speed=1/perSecond * 1000;
    timerspeed=(int)Math.round(speed);

String s = String.format("%.1f",perSecond);
    perSecondLabel.setText("per second : " + s);

    setTimer();
    timer.start();

}

    public void verifyUnlock() {
        if(!grandpaUnlocked) {
            if (cookieCounter >= 50) {
                grandpaUnlocked = true;
                button2.setText("Grandpa" + "(" + grandpaNumber + ")");
            }
        }
            if(!grandmaUnlocked) {
                if(cookieCounter>=150) {
                    grandmaUnlocked=true;
                    button3.setText("Grandma" + "(" + grandmaNumber + ")");
                }
        }

             if(!bakeryUnlocked) {
                if(cookieCounter>=500) {
                    bakeryUnlocked=true;
            button4.setText("Bakery" + "(" + bakeryNumber + ")");
        }
    }
}

public class CookieHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {

        String action = event.getActionCommand();
        switch (action)
        {
            case "Cookie":
                cookieCounter++;
                counterLabel.setText(cookieCounter + " cookies ");
                verifyUnlock();
                break;
            case"Cursor":
                if(cookieCounter>=cursorPrice){
                    cookieCounter=cookieCounter - cursorPrice;
                    cursorPrice= cursorPrice +5 ;
                    counterLabel.setText(cookieCounter + " cookies");

                    cursorNumber++;
                    button1.setText("Cursor" + "("+ cursorNumber + ")");
                    messageText.setText("Cursor\n [ price " + cursorPrice + "] \nAutoclicks once every 10 seconds.");
                    perSecond = perSecond + 0.1 ;
                    timerUpdate();
                }
                else
                {
                    messageText.setText("You need more cookies!");
                }

                break;

            case "Grandpa" :

                if(cookieCounter>=grandpaPrice){
                    cookieCounter=cookieCounter - grandpaPrice;
                    grandpaPrice= grandpaPrice + 50 ;
                    counterLabel.setText(cookieCounter + " cookies");

                    grandpaNumber++;
                    button2.setText("Grandpa" + "("+ grandpaNumber + ")");
                    messageText.setText("Grandpa\n [price; " + grandpaPrice + "]\n Each grandpa produces 1 cookie per second");

                    perSecond = perSecond + 1 ;
                    timerUpdate();
                }
                else
                {
                    messageText.setText("You need more cookies!");
                }

                break;

            case"Grandma":
                if(cookieCounter>=grandmaPrice){
                    cookieCounter=cookieCounter - grandmaPrice;
                    grandmaPrice= grandmaPrice +100 ;
                    counterLabel.setText(cookieCounter + " cookies");

                    grandmaNumber++;
                    button3.setText("Grandma" + "("+ grandmaNumber + ")");
                    messageText.setText("Grandma\n [ price " + grandmaPrice + "] \nEach grandma bake 10 cookies every 1 second.");
                    perSecond = perSecond + 10 ;
                    timerUpdate();
                }
                else
                {
                    messageText.setText("You need more cookies!");
                }
            case"Bakery":
                if(cookieCounter>=bakeryPrice){
                    cookieCounter=cookieCounter - bakeryPrice;
                    bakeryPrice= bakeryPrice + 200 ;
                    counterLabel.setText(cookieCounter + " cookies");

                    bakeryNumber++;
                    button4.setText("Bakery" + "("+ bakeryNumber + ")");
                    messageText.setText("Bakery\n [ price " + bakeryPrice + "] \nEach grandma bake 10 cookies every 1 second.");
                    perSecond = perSecond + 10 ;
                    timerUpdate();
                }
                else
                {
                    messageText.setText("You need more cookies!");
                }

        }

    }

}

public class MouseHandler implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {


        JButton button = (JButton) e.getSource();
        if (button == button1) {
            messageText.setText("Cursor\n [ price " + cursorPrice + "] \nAutoclicks once every 10 seconds.");
        } else if (button == button2) {
            if (!grandpaUnlocked) {
                messageText.setText("This item is currently locked");
            } else {
                messageText.setText("Grandpa\n [price; " + grandpaPrice + "]\n Each grandpa produces 1 cookie per second");
            }

        } else if (button == button3) {
            if (!grandmaUnlocked) {
                messageText.setText("This item is currently locked");
            } else {
                messageText.setText("Grandma\n [price; " + grandmaPrice + "]\n Each grandpa produces 10 cookise per second");
            }

        } else if (button == button4) {
            if (!bakeryUnlocked) {
                messageText.setText("This item is currently locked");
            } else {
                messageText.setText("Bakery\n [price; " + bakeryPrice + "]\n Each factory produces 100 cookies per second");
            }

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton button = (JButton)e.getSource();

        if(button == button1)
        {
            messageText.setText(null);
        }
        else if(button == button2)
        {
            messageText.setText(null);
        }
        else if(button == button3)
        {
            messageText.setText(null);
        }
        else if(button == button4)
        {
            messageText.setText(null);
        }
    }
}



}




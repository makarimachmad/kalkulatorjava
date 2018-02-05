import java.awt.event.*;
import javax.swing.*;

public class main {

  public static void main(String[] args) {
      
      kalkulator objekkalkulator=new kalkulator();
  }
}

class kalkulator extends JFrame implements ActionListener{
    
    private JTextField fbilangan1,fbilangan2,fbilangan3;
    private JLabel lbilangan1,lbilangan2,error,labelgambar,hasil;
    private JButton llihat,lreset;
    private JRadioButton tambah,kurang,kali,bagi;
    
    public kalkulator(){
        
        setTitle("Kalkulator Sederhana");
        setDefaultCloseOperation(3);
        setSize(450,400);
        
        fbilangan1=new JTextField();
        fbilangan2=new JTextField();
        fbilangan3=new JTextField();
       
        lbilangan1=new JLabel("A : "); lbilangan2=new JLabel("B : "); hasil=new JLabel("Hasil Operasi");
        
        llihat=new JButton("Hasil"); lreset=new JButton("Reset");
        
        tambah=new JRadioButton("+");
        kurang=new JRadioButton("-");
        bagi=new JRadioButton("/");
        kali=new JRadioButton("x");
        
        ButtonGroup group=new ButtonGroup();
        group.add(tambah); group.add(kurang); group.add(kali); group.add(bagi);
        
        setLayout(null);
        add(fbilangan1);add(fbilangan2);add(fbilangan3); add(hasil);
        add(lbilangan1);add(lbilangan2);
        
        add(tambah);add(kurang);add(kali); add(bagi);
        
        add(llihat); add(lreset);
        
        lbilangan1.setBounds(25,105,40,40);
        fbilangan1.setBounds(45,105,40,40);
        lbilangan2.setBounds(95,105,40,40);
        fbilangan2.setBounds(120,105,40,40);
        fbilangan3.setBounds(320,105,80,40);
        
        llihat.setBounds(25,200,70,20);
        lreset.setBounds(95,200,70,20);
        hasil.setBounds(320,75,80,40);
        
        tambah.setBounds(25,170,60,20);
        kurang.setBounds(85,170,60,20);
        kali.setBounds(145,170,60,20);
        bagi.setBounds(205,170,60,20);
        
        
        llihat.addActionListener(this);
        lreset.addActionListener(this);
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        bagi.addActionListener(this);
        kali.addActionListener(this);
        
        fbilangan3.setEditable(false);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
            float nilai1=Integer.parseInt(fbilangan1.getText());
            float nilai2=Integer.parseInt(fbilangan2.getText());
            
            if(tambah.isSelected()){
            
                if(e.getSource()==llihat){
                    fbilangan3.setText(""+(nilai1+nilai2));
            }}
            if(kurang.isSelected()){
            
                if(e.getSource()==llihat){
                    fbilangan3.setText(""+(nilai1-nilai2));
            }}
            if(kali.isSelected()){
            
                if(e.getSource()==llihat){
                    fbilangan3.setText(""+(nilai1*nilai2));
            }}
            if(bagi.isSelected()){
            
                if(e.getSource()==llihat){
                    fbilangan3.setText(""+(nilai1/nilai2));
            }}
            if(e.getSource()==lreset){
                fbilangan1.setText("");
                fbilangan2.setText("");
                fbilangan3.setText("");
            }
        }
        catch(Exception nfe){
            if(e.getSource()==llihat){
                JOptionPane.showMessageDialog(this,"Silahkan reset","Notifikasi",JOptionPane.INFORMATION_MESSAGE);
                
            }
            if(e.getSource()==lreset){
                fbilangan1.setText("");
                fbilangan2.setText("");
                fbilangan3.setText("");
            }
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }
}

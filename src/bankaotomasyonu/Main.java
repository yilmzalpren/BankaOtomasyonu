/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaotomasyonu;

/**
 *
 * 
 *              1306190030    YILMAZ ALPEREN
 * @author YILMAZ
 */
class Date{                 // USER HAS A DATE / BHIRTDAY!
    String day ; 
    String month ; 
    String year;
    Date(String day, String month,String year){
        this.day = day ; 
        this.month = month ; 
        this.year  = year ; 
    }
}
abstract class User{
    private String telNo ;
    private Date date ; 
    private String tc;
    private String ad;
    private String soyad;
    private String sifre;
    private String cinsiyet;
   
    User(String ad , String soyad, String sifre, String cinsiyet,Date date ,String tc,String telNo ){
        this.ad = ad ; 
        this.soyad = soyad ; 
        this.sifre = sifre;
        this.cinsiyet = cinsiyet ; 
        this.date = date ; 
        this.tc = tc ; 
        this.telNo = telNo;
    }
    public void hesapAta(int flag){
        /* 
        * flag(1)-----> vadesizHesapAta
        * flag(2)-----> vadeliHesapAta
        *        3  YATIRIM HESABI
        *       /|\
        *     31,32,33
        * flag 31 = (Yatirim Hesabi) Altın hesabi
        * flag 32 =(Yatirim Hesabi) Dolar Hesabi
        * flag 33 = (Yatirim Hesabi) Euro Hesabi
        * flag 4 = KrediKart
        */
        int hesapNo = Musteri.hesapNoOlustur();
        boolean check = false ; 
        java.io.File tempFile = null ;
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        String keeper = null  ;
        try{
            if(flag==1){
                tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
            }
            else if(flag==2){
                tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            }
            else if(flag == 31){
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
            }
            else if(flag==32){
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");
            }
            else if(flag==33){
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");
            }
            else if(flag==4){
                tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
            }
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            if(flag==1){
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            }
            else if(flag == 2){
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadeliHesap.txt"));
            }
            else if(flag==31){
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/altinHesap.txt"));
            }
            else if(flag == 32){
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/dolarHesap.txt"));
            }
            else if(flag == 33){
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/euroHesap.txt"));
            }
            else if(flag==4){
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/krediKart.txt"));
            }
            while((keeper= readFromFile.readLine())!=null){
                if(getTc().equals(keeper)){
                    check = true ;  // yani daha oncdene bu tc'ye göre olusturulmus!
                    writeToFile.write(getTc());
                    writeToFile.newLine();
                    if(flag==1){
                    writeToFile.write("TR-"+String.valueOf(hesapNo)+"//0");
                    }
                    else if(flag==2){
                        writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0//0");
                    }
                    else if(flag==31){
                        writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0");
                    }
                    else if(flag ==32){
                        writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0");
                    }
                    else if(flag == 33){
                        writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0");
                    }
                    else if(flag==4){
                        writeToFile.write("0//"+String.valueOf(hesapNo)+"//0");
                    }
                    writeToFile.newLine();
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            if(check==false){
                // DEMEK Kİ BU TC'DEN DAHA ONCE HESAP ACILMAMIS DEMEK Kİ
                if(flag==1){
                tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
                }
                else if(flag==2){
                    tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
                }
                else if(flag==31){
                    tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
                }
                else if(flag ==32){
                    tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");
                }
                else if(flag == 33){
                    tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");
                }
                else if(flag==4){
                    tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
                }
                tempFile.delete();
                if(flag==1){
                writeToFile  = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadesizHesap.txt",true));
                }
                else if(flag==2){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadeliHesap.txt",true));
                }
                else if(flag==31){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/altinHesap.txt",true));
                }
                else if(flag == 32){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/dolarHesap.txt",true));
                }
                else if(flag == 33){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/euroHesap.txt",true));
                }
                else if(flag==4){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediKart.txt",true));
                }
                writeToFile.write(getTc());
                writeToFile.newLine();
                if(flag==1){
                writeToFile.write("TR-"+String.valueOf(hesapNo)+"//0");
                }
                else if(flag==2){
                    writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0//0");
                }
                else if(flag==31){
                    writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0");
                }
                else if(flag == 32){
                    writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0");
                }
                else if(flag == 33){
                    writeToFile.write("0//TR-"+String.valueOf(hesapNo)+"//0//0");
                }
                else if(flag==4){
                    writeToFile.write("0//"+String.valueOf(hesapNo)+"//0");
                }
                writeToFile.newLine();
                writeToFile.write("----------------");
                writeToFile.newLine();
                writeToFile.close();
                
            }
            else{
                if(flag==1){
                    tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
                }
                else if(flag == 2){
                    tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
                }
                else if(flag==31){
                    tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
                }
                else if(flag == 32){
                    tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");
                }
                else if(flag == 33){
                    tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");
                }
                else if(flag==4){
                    tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
                }
                readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
                if(flag==1){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadesizHesap.txt"));
                }
                else if(flag==2){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadeliHesap.txt"));
                }
                else if(flag==31){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/altinHesap.txt"));
                }
                else if(flag == 32){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/dolarHesap.txt"));
                }
                else if(flag == 33){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/euroHesap.txt"));
                }
                else if(flag==4){
                    writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediKart.txt"));
                }
                while((keeper=readFromFile.readLine())!=null){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                readFromFile.close();
                writeToFile.close();
                tempFile.delete();
            }
           writeToFile  = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/hesapNo.txt",true));
           if(flag==1){
           writeToFile.write(String.valueOf(hesapNo)+"//"+getTc()+"//VADESİZ");
           }
           else if(flag==2){
               writeToFile.write(String.valueOf(hesapNo)+"//"+getTc()+"//VADELİ");
           }
           else if(flag==31){
               writeToFile.write(String.valueOf(hesapNo)+"//"+getTc()+"//ALTIN");
           }
           else if(flag == 32){
               writeToFile.write(String.valueOf(hesapNo)+"//"+getTc()+"//DOLAR");
           }
           else if(flag == 33){
               writeToFile.write(String.valueOf(hesapNo)+"//"+getTc()+"//EURO");
           }
           else if(flag==4){
               writeToFile.write(String.valueOf(hesapNo)+"//"+getTc()+"//KREDİKART");
           }
           writeToFile.newLine();
           writeToFile.close();
            
            
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİ SAKLANMASI YANLIS!");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    
    }    
        public static int checkUyari(String keeper,int a ){  //  TC,TELEFON VE SİFRE UYARI MESAJ OLUSTURUCU
       int size = keeper.length();
       if(size !=a){
           for(int i = 0 ; i < size ; ++i){
               if(!((int)keeper.charAt(i)>=(int)'0'&&(int)keeper.charAt(i) <= (int)'9')) return 1 ; // a adet hane degil ve rakam degil
           }
           return 2 ;   // a adet hane degil
       }
       else{
          for(int i = 0 ; i < a ; ++i){
               if(!((int)keeper.charAt(i)>=(int)'0'&&(int)keeper.charAt(i) <= (int)'9')) return 3 ; // rakam degil
           } 
          return 4 ;  // tertemiz
       }
    }
        public static boolean yearCheck(int year){
            if(year >=1800 && year<=2021){
                return true ; 
            }
            else return false ; 
        }
        public static boolean leapYearCheck(int year){      // artık yıl kontrolu SUBAT AYI icin.
            if(year%4==0){
                if(year%100 == 0){
                    if(year%400 ==0){
                        return true;
                    }
                    else{
                        return false ; 
                    }
                }
                else{
                    return true;
                }
            }
            else{
                return false ; 
            }
        }
        public boolean isOkay(){
            
            if(ad==null) return false; 
            if(soyad==null) return false ;
            if(cinsiyet.equals("-CİNSİYET-")) return false; 
            try{
                int iYear = Integer.valueOf(date.year);
                if(!(iYear>=1800 && iYear<=2021)) return false ; 
            } catch(NumberFormatException e){
                return false ; 
            }
            if(date.month.equals("-AY SEÇ-")) return false ; 
            int keeper = User.checkUyari(tc,11);
            if(keeper!=4) return false;
            keeper = User.checkUyari(telNo,11);
            if(keeper!=4) return false ;
            for(int i = 0 ; i < ad.length();++i){
                if(ad.charAt(i)=='/') {
                     javax.swing.JOptionPane.showMessageDialog(null,"ADINIZDA / ISARETI OLAMAZ");
                    return false ; 
                   
                }
            }
            for(int i = 0 ; i < soyad.length();++i){
                if(soyad.charAt(i) == '/'){
                    javax.swing.JOptionPane.showMessageDialog(null, "ADINIZDA / ISARETI OLAMAZ");
                    return false ; 
                }
            }
            return true ; 
        }
        public static int createOnayKodu(){
            java.util.Random rand = new java.util.Random();
            int number1 = rand.nextInt(10)%10;
            int number2 = rand.nextInt(10)%10;
            int number3 = rand.nextInt(10)%10;
            int number4 = rand.nextInt(10)%10;
            if(number4==0) number4 = 1 ; 
            return (number1+(10*number2)+(100*number3)+(1000*number4));
                    
        }
        public static User userVarmi(String tc, String sifre,int flag){ // MUSTERI VAR MI
            String keeper = null ; 
            java.io.BufferedReader readFromFile = null ; 
            java.util.StringTokenizer token = null ; 
            java.util.StringTokenizer tokenForDate = null ; 
            try{
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
                while((keeper=readFromFile.readLine())!=null){
                    token = new java.util.StringTokenizer(keeper,"//");
                    if(flag==1){
                        if(!("m".equals(token.nextToken()))){
                            continue ; 
                        }
                    }
                    else if(flag==2){
                        if(!("p".equals(token.nextToken()))){
                            continue ; 
                        }
                    }
                    else{
                        if(!("y".equals(token.nextToken()))){
                            continue ; 
                        }
                    }
                    if(token.hasMoreTokens()){ // tc'yi aldik
                        if(tc.equals(token.nextToken())){
                            if(token.hasMoreTokens()){
                                if(sifre.equals(token.nextToken())){
                                    User rUser = null ; 
                                    String ad = token.nextToken();
                                    String soyad = token.nextToken();
                                    String cinsiyet = token.nextToken();
                                    tokenForDate = new java.util.StringTokenizer(token.nextToken(),".");
                                    Date date = new Date(tokenForDate.nextToken(),tokenForDate.nextToken(),tokenForDate.nextToken());
                                    String telNo = token.nextToken();
                                    if(flag==1)
                                        rUser = new Musteri(ad,soyad,sifre,cinsiyet,date,tc,telNo);
                                    else if(flag==2){
                                        rUser = new Personel(ad,soyad,sifre,cinsiyet,date,tc,telNo);
                                    }
                                    else{
                                         rUser = new Yönetici(ad,soyad,sifre,cinsiyet,date,tc,telNo);                                       
                                    }
                                    readFromFile.close();
                                    return rUser ;
                                }
                                else{
                                    javax.swing.JOptionPane.showMessageDialog(null,"SİFRE VEYA TC YANLIS");
                                    readFromFile.close();
                                    return null ; 
                                }
                            }
                        }
                        else{
                            continue ; 
                        }
                    }
                }
                javax.swing.JOptionPane.showMessageDialog(null,"BU TC İLE KAYITLI KULLANICI BULUNAMADI\nÜYE OLMAYI DUSUNUR MUSUNUZ?");
                readFromFile.close();
                return null ; 
                
            }catch(java.io.IOException e ){
                javax.swing.JOptionPane.showMessageDialog(null, "DOSYA YOLU PROBLEMİ\nIDE ILE DENER MISINIZ?");
            }catch(NullPointerException e1){
                javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMA SEKLİ YANLIS!");
            }
            catch(Exception e2){
                javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMA SEKLİ YANLIS!");              
            }
            return null ; 
        }
        public String  getTelNo(){
            return telNo;
        }
        public void setSifre(String sifre){
            this.sifre = sifre ; 
        }
        public String getTc(){
            return tc;
        }
        public String getSifre(){
            return sifre;
        }
        public String getAd(){
            return ad;
        }
        public String getSoyad(){
            return soyad;
        }
        public String getCinsiyet(){
            return cinsiyet;
        }
        public Date getDate(){
            return date;
        }
        public static User tcVarMi(String tc,int flag){
            /*
            flag 1 ----> m
            flag 2-----> p
            flag 3-----> y
            */
            java.io.BufferedReader readFromFile = null ; 
            java.util.StringTokenizer token  = null ; 
            String keeper = null ;
            java.util.StringTokenizer tokenForDate = null ; 
            try{
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
                while((keeper=readFromFile.readLine())!=null){
                    token = new java.util.StringTokenizer(keeper,"//");
                    if(flag==1){
                        if(!("m".equals(token.nextToken()))){
                            continue ; 
                        }
                    }
                    else if(flag==2){
                        if(!("p".equals(token.nextToken()))){
                            continue  ;
                        }
                    }
                    else{  //flag==3
                        if(!("y".equals(token.nextToken()))){
                            continue  ;
                        }
                    }
                    if(tc.equals(token.nextToken())){
                           String sifre = token.nextToken();
                           String ad = token.nextToken();
                           String soyad = token.nextToken();
                           String cinsiyet = token.nextToken();
                           tokenForDate = new java.util.StringTokenizer(token.nextToken(),".");
                           Date date = new Date(tokenForDate.nextToken(),tokenForDate.nextToken(),tokenForDate.nextToken());
                           String telNo = token.nextToken();
                           User rUser = new Musteri(ad,soyad,sifre,cinsiyet,date,tc,telNo);
                           readFromFile.close();
                           return rUser ; 
                    }
                    else{
                        continue ; 
                    }
                    
                }
                readFromFile.close();
                return null ;
                
            }catch(java.io.IOException e){
                javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DIZININDE HATA OLDU\nIDE ILE DENER MISINIZ");
            }catch(NullPointerException e1){
                javax.swing.JOptionPane.showMessageDialog(null,"VERİ SAKLANMASINDA HATA VAR");
            }catch(Exception e2){
                javax.swing.JOptionPane.showMessageDialog(null,"BİR SEY OLDU");
            }
            
            return null ; 
        }
        public void sifreDegis(String yeniSifre,int flag){
            java.io.File tempFile = null ; 
            java.io.BufferedReader readFromFile = null ;
            java.io.BufferedWriter writeToFile = null ; 
            java.util.StringTokenizer token = null ; 
            String keeper = null ;
            String specifier =null ; 
            try{
                tempFile = new java.io.File("src/Files/tempUser.txt");
                if(tempFile.createNewFile());
                writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
                readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
                while((keeper=readFromFile.readLine())!=null){
                    token = new java.util.StringTokenizer(keeper,"//");
                    specifier = token.nextToken();
                    if(flag==1){
                        if(!(specifier.equals("m"))){
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                            continue ; 
                        }
                    }
                    else if(flag==2){
                        if(!(specifier.equals("p"))){
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                            continue ; 
                        }
                    }
                    else{// flag==3
                        if(!(specifier.equals("y"))){
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                            continue ; 
                        }
                    }
                    if(tc.equals(token.nextToken())){
                        writeToFile.write(specifier+"//"+tc+"//"+yeniSifre+"//"+
                                ad+"//"+soyad+"//"+cinsiyet+"//"+date.day+"."+date.month+"."+date.year+"//"
                        +telNo);
                        writeToFile.newLine();
                    }
                    else{
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                }
                readFromFile.close();
                writeToFile.close();
                //------------------------------------------------------
                tempFile = new java.io.File("src/Files/tempUser.txt");
                readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
                writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/user.txt"));
                while((keeper=readFromFile.readLine())!=null){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                readFromFile.close();
                writeToFile.close();
                tempFile.delete();
                
            }catch(java.io.IOException e){
                javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU İLE İLGİLİ HATA OLDU\nIDE ILE PROGRAMI CALISTIRIR MISINIZ?");
            }catch(NullPointerException e1){
                javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI İLE İLGİLİ HATA VAR");
            }catch(Exception e2){
                javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
            }
            
            
        }
        
}
interface IstekIslemleri{
    java.util.ArrayList<String[]> hesapIstek (int flag);
    java.util.ArrayList<String[]> digerIstek(int flag);
    void hesapIstekSil(String hesapNo,int flag,int choose);
    void limitIstekSil(String kartNo,int yeniLimit ,int choose );
    void krediIstekSil(User currentUser,String tc,int para, double borc ,int choose ); 
}
interface YoneticiIslemleri{
    java.util.ArrayList<String[]> personelListele();
    void personelSil(String personelTc);
}
abstract class Admin extends User implements IstekIslemleri{
    Admin(String ad ,String soyad,String sifre,String cinsiyet,Date date,String tc ,String telNo){
            super(ad,soyad,sifre,cinsiyet,date,tc,telNo);
    }
    public java.util.ArrayList<String[]> hesapIstek (int flag){
        java.io.File file = null ; 
        String keeper = null ; 
        String tc ; 
        String hesapNo; 
        java.util.StringTokenizer token = null ; 
        java.io.BufferedReader readFromFile = null ; 
        try{
            java.util.ArrayList<String[]> rObj = null ; 
            rObj = new java.util.ArrayList<String[]>();
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/vadeliHesap.txt");
            }
            else if(flag==2){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                
            }
            else if(flag==3){
                 file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
               
            }
            else {
                // flag == 4
                file = new java.io.File("src/Files/Musteri/euroHesap.txt");
            }
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(token.countTokens()==1 && keeper.charAt(0)!='-'){
                    tc = keeper ; 
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        if("0".equals(token.nextToken())){
                            hesapNo = token.nextToken();
                            String [] temp ={tc,hesapNo};
                            rObj.add(temp);
                            
                        }
                    }
                }
            }
            readFromFile.close();
            return rObj ; 
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLUNDA HATA OLDU\nLUTFEN IDE ILE DENEYIN");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
        
        return null ; 
    }
    public java.util.ArrayList<String[]> digerIstek(int flag){
        String keeper = null ; 
        java.util.StringTokenizer token = null ; 
        java.io.File file = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.util.ArrayList<String[]>rObj = null ; 
        String tc,hesapNo,eskiLimit,yeniLimit,mesaj,kredi,borc;
        try{
            rObj = new java.util.ArrayList<String[]>();
            if(flag==5){
                file = new java.io.File("src/Files/Musteri/limitIstek.txt");
            }
            else{
                // flag==6
                file = new java.io.File("src/Files/Musteri/krediIstek.txt");
            }
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(flag==5){
                    tc = token.nextToken();
                    hesapNo = token.nextToken();
                    eskiLimit = token.nextToken();
                    yeniLimit = token.nextToken();
                    mesaj = token.nextToken();
                    String[]temp = {tc,hesapNo,eskiLimit,yeniLimit,mesaj};
                    rObj.add(temp);
                    
                }
                else{
                    tc = token.nextToken();
                    kredi = token.nextToken();
                    borc = token.nextToken();
                    String[]temp = {tc,kredi,borc};
                    rObj.add(temp);
                    
                }
            }
            readFromFile.close();
            return rObj ; 
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISIN");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        return null ; 
    }
    public void hesapIstekSil(String hesapNo,int flag,int choose){
        String keeper ; 
        java.util.StringTokenizer token = null  ;
        java.io.File file = null ; 
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        try{
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/vadeliHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            }
            else if(flag==2){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");                
            }
            else if(flag==3){
                file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");                
            }
            else{
                // flag == 4
                 file = new java.io.File("src/Files/Musteri/euroHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");               
            }
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if("0".equals(token.nextToken())){
                    if(hesapNo.equals(token.nextToken())){
                        if(flag==1){
                            if(choose==1){
                            writeToFile.write("1//"+hesapNo+"//"+"0//0//0");
                            writeToFile.newLine();
                            }
                        }
                        else{
                            if(choose==1){
                            writeToFile.write("1//"+hesapNo+"//"+"0.0//0.0");
                            writeToFile.newLine();
                            }
                        }
                    }
                    else{
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            
            readFromFile.close();
            writeToFile.close();
            //-----------------------------------
            // 2.ASAMA
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/vadeliHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            }
            else if(flag==2){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");                
            }
            else if(flag==3){
                file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");                
            }
            else{
                // flag == 4
                 file = new java.io.File("src/Files/Musteri/euroHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");               
            }
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(file));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISIN");
        }catch(NullPointerException e3){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI HATALI");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null, "BIR SEY OLDU");
        }
        
    }
    public void limitIstekSil(String kartNo,int yeniLimit,int choose){
        String keeper = null ; 
        java.util.StringTokenizer token = null  ; 
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/limitIstek.txt"));
            tempFile = new java.io.File("src/Files/Musteri/tempLimitIstek.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                token.nextToken();
                if(kartNo.equals(token.nextToken())){
                    
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //--------------- 2.asama
            tempFile = new java.io.File("src/Files/Musteri/tempLimitIstek.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/limitIstek.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
            //-----------------------3. asama
            if(choose== 1) return ; 
            tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/krediKart.txt"));
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(token.countTokens()==1){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                else{
                    token.nextToken();
                    if(kartNo.equals(token.nextToken())){
                        writeToFile.write("1//"+kartNo+"//"+String.valueOf(yeniLimit));
                        writeToFile.newLine();
                    }
                    else{
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                }
            }
            writeToFile.close();
            readFromFile.close();
            //-----------4.asama
            tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediKart.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERININ SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
    }
    public void krediIstekSil(User currentUser,String tc,int para, double borc ,int choose ){
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        String keeper ;
        java.util.StringTokenizer token = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempKrediIstek.txt");
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/krediIstek.txt"));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(tc.equals(token.nextToken())){
                    if(String.valueOf(para).equals(token.nextToken())){
                        
                    }
                    else{
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //--------------- 2 . asama
             tempFile = new java.io.File("src/Files/Musteri/tempKrediIstek.txt");
             readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
             writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediIstek.txt"));
             while((keeper=readFromFile.readLine())!=null){
                 writeToFile.write(keeper);
                 writeToFile.newLine();
             }
             readFromFile.close();
             writeToFile.close();
             tempFile.delete();
             //--------------3. asama
             if(choose == 1 )return ; 
             ((Personel)currentUser).hesapAta(1);
             tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
             if(tempFile.createNewFile());
             readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
             writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
             while((keeper=readFromFile.readLine())!=null){
                 token = new java.util.StringTokenizer(keeper,"//");
                 if(tc.equals(keeper)){
                     writeToFile.write(keeper);
                     writeToFile.newLine();
                     keeper = readFromFile.readLine();
                     token = new java.util.StringTokenizer(keeper,"//");
                     String hesapNo = token.nextToken();
                     String bakiye = String.valueOf(para);
                     writeToFile.write(hesapNo+"//"+bakiye);
                     writeToFile.newLine();
                 }
                 else{
                     writeToFile.write(keeper);
                     writeToFile.newLine();
                 }
             }
             writeToFile.close();
             readFromFile.close();
             //----------------------4.asama
              tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
              readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
              writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadesizHesap.txt"));
              while((keeper=readFromFile.readLine())!=null){
                  writeToFile.write(keeper);
                  writeToFile.newLine();
              }
              writeToFile.close();
              readFromFile.close();
              tempFile.delete();
              //----------5.asama
              writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediBorc.txt",true));
              writeToFile.write(tc+"//"+String.valueOf(borc));
              writeToFile.newLine();
              writeToFile.close();
             
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERININ SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
    }
}
class Personel extends Admin{
    Personel(String ad ,String soyad,String sifre,String cinsiyet,Date date,String tc ,String telNo){
                super(ad,soyad,sifre,cinsiyet,date,tc,telNo);
    }
}
class Yönetici extends Personel implements YoneticiIslemleri{
    Yönetici(String ad ,String soyad,String sifre,String cinsiyet,Date date,String tc ,String telNo){
        super(ad,soyad,sifre,cinsiyet,date,tc,telNo);
    }
    public java.util.ArrayList<String[]> personelListele(){
        String keeper;
        java.util.ArrayList<String[]> rObj = null ; 
        java.io.BufferedReader readFromFile =  null ;
        java.util.StringTokenizer token = null ; 
        try{
            rObj = new java.util.ArrayList<String[]>();
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if("p".equals(token.nextToken())){
                    String tc = token.nextToken();
                    token.nextToken();
                    String ad = token.nextToken();
                    String soyad = token.nextToken();
                    String[]temp = {tc,ad,soyad};
                    rObj.add(temp);
                }
                else{
                    continue ; 
                }
            }
            readFromFile.close();
            return rObj ; 
            
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERININ SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
        return null ; 
    }
    public void personelSil(String personelTc){
        java.io.File tempFile = null ; 
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null  ; 
        java.util.StringTokenizer token = null  ;
        try{
            tempFile = new java.io.File("src/Files/tempUser.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if("p".equals(token.nextToken())){
                    if(personelTc.equals(token.nextToken())){
                        
                    }
                    else{
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //------------- 2 .asama
            tempFile = new java.io.File("src/Files/tempUser.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile= new java.io.BufferedWriter(new java.io.FileWriter("src/Files/user.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            writeToFile.close();
            readFromFile.close();
            tempFile.delete();
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERININ SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
    }
}

abstract class Hesap{
    private String hesapNo ; 
    private String bakiye ; 
    Hesap(String hesapNo,String bakiye){
        this.hesapNo = hesapNo ; 
        this.bakiye = bakiye;
    }
    Hesap(){
        
    }
    public void setHesapNo(String hesapNo){
        this.hesapNo = hesapNo ; 
    }
    public void setBakiye(String bakiye){
        this.bakiye = bakiye ; 
    }
    public String getHesapNo(){
        return hesapNo ; 
    }
    public String getBakiye(){
        return bakiye ; 
    }
}
//------------------------------------------------------
class VadesizHesap extends Hesap{
    VadesizHesap(String hesapNo, String bakiye){
        super(hesapNo,bakiye);
    }
    VadesizHesap(){
        super();
    }
}

class VadeliHesap extends Hesap{
    private String kalanGün = null ;
    private String vadeSonuTutar = null ; 
    VadeliHesap(String hesapNo,String bakiye,String vadeSonuTutar,String kalanGün){
        super(hesapNo,bakiye);

        this.vadeSonuTutar = vadeSonuTutar;
        this.kalanGün = kalanGün; 
    }
    public String getKalanGün(){
        return kalanGün;
    }
    public String getVadeSonuTutar(){
        return vadeSonuTutar;
    }
    public static void vadeGünüAzalt(){
        String keeper = null ;
        String hesapNo ; 
        String bakiye ; 
        String bakiyeSonuPara ; 
        int kalanGün ; 
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadeliHesap.txt"));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(token.countTokens()==1){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                else {
                    if(token.nextToken().equals("0")){
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                    else{
                      hesapNo = token.nextToken();
                      bakiye = token.nextToken();
                      bakiyeSonuPara = token.nextToken();
                      kalanGün = Integer.valueOf(token.nextToken());
                      if(kalanGün>0){
                          kalanGün--;
                      }
                      writeToFile.write("1//"+hesapNo+"//"+bakiye+"//"+bakiyeSonuPara+"//"+String.valueOf(kalanGün));
                      writeToFile.newLine();
                    }
                }
            }
            readFromFile.close();
            writeToFile.close();
            //----------------------------------------------------------------
            //          2.ASAMA
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadeliHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DİZİNİ HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASİNDA HATA VAR!");
        }catch(Exception e3) {
            javax.swing.JOptionPane.showMessageDialog(null, "BIR SEY OLDU");
        }
    }
}

class YatirimHesabi extends Hesap{
    YatirimHesabi(String hesapNo, String bakiye){
        super(hesapNo, bakiye);
    }
    public static void borsaFiyatDegis(){
        // PROGRAM BASLAR BASLAMAZ 
        // ALTIN, EURO, DOLAR FİYATINI DEGİSTİR!
        String keeper = null ; 
        java.util.StringTokenizer token = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.io.File tempFile = null ; 
        try{
            java.util.Random random = new java.util.Random();
            double randomNumber = random.nextDouble()/6;
            
            randomNumber = (double)Math.round(randomNumber*100)/100  ;
            tempFile = new java.io.File("src/Files/Musteri/tempYatirim.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/yatirim.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                writeToFile.write(token.nextToken()+"//");
                double eskiFiyat = Double.valueOf(Double.valueOf(token.nextToken()));
                double yeniFiyat = eskiFiyat+randomNumber;
                 
                yeniFiyat = (double)Math.round(yeniFiyat*100)/100;
                writeToFile.write(String.valueOf(yeniFiyat));
                writeToFile.newLine();
                
            }
            readFromFile.close();
            writeToFile.close();
            //----------------------------------2 . asama
            tempFile = new java.io.File("src/Files/Musteri/tempYatirim.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/yatirim.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            writeToFile.close();
            readFromFile.close();
            tempFile.delete();
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DİZİNİNDE HATA VAR");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASİNDA HATA VAR");           
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");           
     
        }
        
    }
    public static void bakiyeDegis(int flag){
        // ALTIN - DOLAR- EURO  fiyatlari degisince musterilerin hesaplarındaki bakiye degismek zorunda tabii ki 
        double yeniFiyat = 0 ;
        double b_d_e = 0 ;
        String identifier, hesapNo ;
        String keeper = null ; 
        java.io.File file = null ; 
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        try{
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
                yeniFiyat = fiyatVer(1);
            }
            else if(flag==2){
                file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");    
                yeniFiyat = fiyatVer(2);
            }
            else if(flag==3){
                file = new java.io.File("src/Files/Musteri/euroHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt"); 
                yeniFiyat = fiyatVer(3);
            }
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(token.countTokens()==1){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                else{
                    identifier = token.nextToken();
                    hesapNo = token.nextToken();
                    token.nextToken();
                    b_d_e = Double.valueOf(token.nextToken());
                    double yeniBakiye = yeniFiyat * b_d_e;
                    yeniBakiye = (double)Math.round(yeniBakiye*100)/100;
                    writeToFile.write(identifier+"//"+hesapNo+"//"+String.valueOf(yeniBakiye)+"//"+String.valueOf(b_d_e));
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //------------------------------------------------------------------------------
            if(flag==1){
               file = new java.io.File("src/Files/Musteri/altinHesap.txt");
               tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
            }
            else if(flag == 2){
               file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
               tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");                
            }
            else if(flag==3){
               file = new java.io.File("src/Files/Musteri/euroHesap.txt");
               tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");                
            }
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(file));
            while((keeper = readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DIZINI BULUNAMADI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    }
    public static double fiyatVer(int flag){
        /*
        * FLAG DURUMUNA GORE ALTIN, DOLAR VEYA EURO ICIN PARA VERELIM
        */
        String keeper ; 
        double fiyat = 0   ;
        
        java.io.BufferedReader readFromFile = null ; 
        java.util.StringTokenizer token = null ; 
        try{
            
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/yatirim.txt"));
            if(flag==1){
                keeper = readFromFile.readLine();
                token = new java.util.StringTokenizer(keeper,"//");
                token.nextToken();
                fiyat = Double.valueOf(token.nextToken());
            }
            else if(flag==2){
                readFromFile.readLine();
                keeper =readFromFile.readLine();
                token = new java.util.StringTokenizer(keeper,"//");
                token.nextToken();
                fiyat = Double.valueOf(token.nextToken());

            }
            else { // flag 3
                readFromFile.readLine();
                readFromFile.readLine();
                keeper = readFromFile.readLine();
                token = new java.util.StringTokenizer(keeper,"//");
                token.nextToken();
                fiyat = Double.valueOf(token.nextToken());
            }
            readFromFile.close();
            return fiyat ; 
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"LUTFEN IDE ILE DENER MISIN");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI HATALI!");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        return fiyat ; 
    }
}
class AltinHesabi extends YatirimHesabi{
    String gramAltin ; // kaç grama sahib oldugunu yazacagız
    AltinHesabi(String hesapNo, String bakiye,String gramAltin){
        super(hesapNo,bakiye);
        this.gramAltin = gramAltin;
    }
    String getGramAltin(){
        return gramAltin;
    }
}
class DolarHesabi extends YatirimHesabi{
    String dolar;// kac dolar oldugunu yazacagız
    DolarHesabi(String hesapNo, String bakiye , String dolar){
        super(hesapNo,bakiye);
        this.dolar = dolar ; 
        
    }
    String getDolar(){
        return dolar;
    }
}
class EuroHesabi extends YatirimHesabi{
    String euro ; // kac euroya sahib oldugunu tutucak
    EuroHesabi(String hesapNo,String bakiye,String euro){
        super(hesapNo,bakiye);
        this.euro = euro ; 
    }
    String getEuro(){
        return euro ; 
    }
}
class KrediKart{
    private String hesapNo ; 
    private String limit ;
    KrediKart(String hesapNo, String limit){
        this.hesapNo = hesapNo ; 
        this.limit = limit ; 
    }
    String getHesapNo(){
        return hesapNo;
    }
    String getLimit(){
        return limit ; 
    }
}

interface HesapIslemleri{

    void hesapFieldAta(int flag);
    int sizeOfHesap(int flag);
    boolean hesapNull(int flag);
    public String[] getHesapAtIndex(int flag,int i);
    void vadeliHesapInit(String vadeliHesapNo,double bakiye,double vadeSonuPara,int kalanGün);
    void yatirimHesapSil(String yatirimHesapNo,int flag);
}
interface ParaTransferIslemleri{
    boolean baskaMusteriVarmi();
    java.util.ArrayList<String[]> adSoyadVer();
}
interface KartIslemleri{
    void yeniLimitIstek(String hesapNo,String eskiLimit,String yeniLimit,String mesaj);
    boolean istekListesindeVarMi(String hesapNo);
    void krediKartSil(String hesapNo);
}
interface KrediIslemleri{
    void krediIstek(int krediMiktari,double krediBorc);
    java.util.ArrayList<String[]> krediBorcuListele();
    void krediBorcuSil(double borc);
}

class Musteri extends User implements HesapIslemleri,ParaTransferIslemleri,KartIslemleri,KrediIslemleri{
    private java.util.ArrayList<VadesizHesap> vadesizHesap = null ; 
    private java.util.ArrayList<VadeliHesap> vadeliHesap = null ; 
    private java.util.ArrayList<AltinHesabi> altinHesap = null ; 
    private java.util.ArrayList<DolarHesabi> dolarHesap = null ; 
    private java.util.ArrayList<EuroHesabi> euroHesap = null ; 
    private java.util.ArrayList<KrediKart> krediKart = null ; 
    @Override
    public int sizeOfHesap(int flag){
        /*
        * flag(1)---> vadesizHesap
        * flag(2)---> vadeliHesap
        *               3   YATIRIM HESABI
        *              /|\
        *        Altin,DOLAR,EURO hesabi
        */        
        if(flag==1){
            return vadesizHesap.size();
        }
        else if(flag==2) {
            return vadeliHesap.size();
        }
        else if(flag==31){
            return altinHesap.size();
        }
        else if(flag==32){
            return dolarHesap.size();
        }
        else if(flag==33){
            return euroHesap.size();
        }
        else if(flag==4){
            return krediKart.size();
        }
        return 0 ; 
    }
    
    @Override
    public boolean hesapNull(int flag){
        /*
        * flag(1)---> vadesizHesap
        * flag(2)---> vadeliHesap
        *               3   YATIRIM HESABI
        *              /|\
        *        Altin,DOLAR,EURO hesabi
        */
        if(flag==1){
            if(vadesizHesap == null) return true;
            else return false ; 
        }
        else if(flag==2){
            if(vadeliHesap == null) return true;
            else return false ;            
        }
        else if(flag==31){
            if(altinHesap ==null) return true;
            else return false  ;
        }
        else if(flag==32){
            if(dolarHesap==null) return true;
            else return false ; 
        }
        else if(flag==33){
            if(euroHesap ==null) return true;
            else return false ; 
        }
        else if(flag==4){
            if(krediKart == null) return true ; 
            else return false ; 
        }
        return true ; // yani bos !
    }
    @Override
    public String[] getHesapAtIndex(int flag,int i){
        /*
        * flag(1)---> vadesizHesap
        * flag(2)---> vadeliHesap
        *               3   YATIRIM HESABI
        *              /|\
        *        Altin,DOLAR,EURO hesabi
        */        
        if(flag==1){
            String hesapNo = vadesizHesap.get(i).getHesapNo();
            String bakiye = vadesizHesap.get(i).getBakiye();
            String [] rObj = {hesapNo,bakiye};
            return rObj ; 
        }
        else if(flag==2){
            String hesapNo = vadeliHesap.get(i).getHesapNo();
            String bakiye = vadeliHesap.get(i).getBakiye();
            String vadeSonuTutar = vadeliHesap.get(i).getVadeSonuTutar();
            String kalanGün = vadeliHesap.get(i).getKalanGün();
            String [] rObj = {hesapNo,bakiye,vadeSonuTutar,kalanGün};
            return rObj ;            
        }
        else if(flag==31){
            String hesapNo = altinHesap.get(i).getHesapNo();
            String bakiye = altinHesap.get(i).getBakiye();
            String gramAltin = altinHesap.get(i).getGramAltin();
            String [] rObj = {hesapNo,bakiye,gramAltin};
            return rObj;
            
        }
        else if(flag==32){
            String hesapNo = dolarHesap.get(i).getHesapNo();
            String bakiye = dolarHesap.get(i).getBakiye();
            String dolar = dolarHesap.get(i).getDolar();
            String[]rObj = {hesapNo,bakiye,dolar};
            return rObj;
        }
        else if(flag==33){
            String hesapNo = euroHesap.get(i).getHesapNo();
            String bakiye = euroHesap.get(i).getBakiye();
            String euro = euroHesap.get(i).getEuro();
            String []rObj = {hesapNo,bakiye,euro};
            return rObj;
        }
        else if(flag==4){
            String hesapNo = krediKart.get(i).getHesapNo();
            String limit = krediKart.get(i).getLimit();
            String []rObj = {hesapNo,limit};
            return rObj ; 
        }
        return null ; 
    }
   //-------------------------------------------------------------------------- 
    
    Musteri(String ad , String soyad, String sifre, String cinsiyet,Date date,String tc ,String telNo){
        super(ad,soyad,sifre,cinsiyet,date,tc,telNo);
    }
    public static int hesapNoOlustur(){    //HESAP  NO OLUSTURUR!
        int enSonHesapNo = -1 ; //eger -1 degismez ise demekki hesapNo.txt bos demek!
        java.io.BufferedReader readFromFile = null ; 
        String keeper = null ; 
        java.util.StringTokenizer token = null  ;
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/hesapNo.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                enSonHesapNo = Integer.valueOf(token.nextToken());
            }
            
           readFromFile.close();
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU SIKINTISI\nIDE ILE DENER MISIN?");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR!");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        
        if(enSonHesapNo == -1){
            return 1000;
        }
        else{
            return ++enSonHesapNo;
        }
    }
    
    


    //--------------------------------------------------------------------------------
    public double vadesizHesapSil(String hesapNo){ // HESAPTA PARA VAR ISE 
        double kalanPara = 0 ;
        
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        String keeper = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(hesapNo.equals(token.nextToken())){
                    kalanPara = Double.valueOf(token.nextToken());
                    if(kalanPara!=0 && sizeOfHesap(1)==1){
                        writeToFile.close();
                        readFromFile.close();
                        tempFile.delete();
                        javax.swing.JOptionPane.showMessageDialog(null,"TEK HESABINIZ KALDI VE ONDANDA PARA VAR\nSİLMEK İSTİYORSANIZ PARANIZI ÇEKİNİZ!"
                                + "\nYA DA YENİ VADESİZ HESAP OLUSTURUP ORAYA AKTARIN");
                        return 0 ; 
                    }
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            writeToFile.close();
            readFromFile.close();
            //----------------------- 2. ASAMA
            tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
            
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR!");
        }
        catch(Exception e1){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        
        return kalanPara ; 
    }
    
    @Override
    public  void hesapFieldAta(int flag){
        
        /*
        *flag(1)----> vadesizHesap
        *flag(2)----> vadeliHesap
        *                   3  YATIRIM HESABI
        *                  /|\
        *                31,32,33  
        *flag(31)----->ALTIN HESABI
        *flag(32)----->DOLAR HESABI
        *flag(33)----->EURO HESABI
        *flag(4)------>KREDI KARTI ICIN
        */
        java.util.StringTokenizer token = null ; 
        java.io.File file =null  ;
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ; 
        try{
        if(flag == 1){ // demek ki vadesizHesap.txt icin islemleri yapacagız!
            vadesizHesap = null ;
            file = new java.io.File("src/Files/Musteri/vadesizHesap.txt");
        }
        else if(flag==2){
            vadeliHesap = null ; 
            file = new java.io.File("src/Files/Musteri/vadeliHesap.txt");
 
        }
        else if(flag==31){
            altinHesap = null ; 
            file = new java.io.File("src/Files/Musteri/altinHesap.txt");
        }
        else if(flag==32){
            dolarHesap = null ; 
            file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
        }
        else if(flag==33){
            euroHesap = null ; 
            file = new java.io.File("src/Files/Musteri/euroHesap.txt");
        }
        else if(flag==4){
            krediKart = null ; 
            file = new java.io.File("src/Files/Musteri/krediKart.txt");
        }
        readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
        while((keeper=readFromFile.readLine())!=null){
            if(keeper.equals(getTc())){
               if(flag==1){
                   vadesizHesap = new java.util.ArrayList<VadesizHesap>();
                   while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                       token = new java.util.StringTokenizer(keeper,"//");
                       String hesapNo = token.nextToken();
                       String bakiye = token.nextToken();
                       vadesizHesap.add(new VadesizHesap(hesapNo,bakiye));
                   }
                   readFromFile.close();
                   return ; 
               }
               else if(flag==2){
                   vadeliHesap = new java.util.ArrayList<VadeliHesap>();
                   while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                       token = new java.util.StringTokenizer(keeper,"//");
                       if("1".equals(token.nextToken())){ // yani admin tarafindan onaylanmis ise!
                           String hesapNo = token.nextToken();
                           String bakiye = token.nextToken();
                           String vadeSonuTutar = token.nextToken();
                           String kalanGün = token.nextToken();
                           vadeliHesap.add(new VadeliHesap(hesapNo,bakiye,vadeSonuTutar,kalanGün));
                       }
                       else{ // admin tarafindan onaylanmamis ise
                           continue ; 
                       }
                   }
                   readFromFile.close();
                   return ; 
               }
               else if(flag==31){
                   altinHesap = new java.util.ArrayList<AltinHesabi>();
                   while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                       token = new java.util.StringTokenizer(keeper,"//");
                       if("1".equals(token.nextToken())){
                           String hesapNo = token.nextToken();
                           String bakiye = token.nextToken();
                           String gramAltin = token.nextToken();
                           altinHesap.add(new AltinHesabi(hesapNo,bakiye,gramAltin));
                       }
                       else{// Yani daha Personel Onaylamadi demek
                           continue;
                       }
                   }
                   readFromFile.close();
                   return ; 
               }
               else if(flag==32){
                   dolarHesap = new java.util.ArrayList<DolarHesabi>();
                   while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                       token = new java.util.StringTokenizer(keeper,"//");
                       if("1".equals(token.nextToken())){
                           String hesapNo = token.nextToken();
                           String bakiye = token.nextToken();
                           String dolar = token.nextToken();
                           dolarHesap.add(new DolarHesabi(hesapNo,bakiye,dolar));
                       }
                       else{
                           continue ; 
                       }
                   }
                   readFromFile.close();
                   return ;
               }
               else if(flag==33){
                   euroHesap = new java.util.ArrayList<EuroHesabi>();
                   while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                       token = new java.util.StringTokenizer(keeper,"//");
                       if("1".equals(token.nextToken())){
                           String hesapNo = token.nextToken();
                           String bakiye = token.nextToken();
                           String euro = token.nextToken();
                           euroHesap.add(new EuroHesabi(hesapNo,bakiye,euro));
                       }
                       else{
                           continue ; 
                       }
                   }
                   readFromFile.close();
                   return ; 
               }
               else if(flag==4){
                   krediKart = new java.util.ArrayList<KrediKart>();
                   while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                       token = new java.util.StringTokenizer(keeper,"//");
                       if("1".equals(token.nextToken())){
                           String hesapNo = token.nextToken();
                           String limit = token.nextToken();
                           krediKart.add(new KrediKart(hesapNo,limit));
                       }
                       else{
                           continue ; 
                       }
                   }
                   readFromFile.close();
                   return ; 
               }
                
                readFromFile.close();
                return ;
            }
            else{
                continue ; 
            }
        }
        
        readFromFile.close(); // buraya gelmis ise size = 0 olup data olarak bir sey gözükmeyecek!
        return ; 
        
        
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DİZİNİNE ULASIRKEN HATA OLDU\nTEKRAR DENER MISINIZ?");
        }catch(Exception e1){
            e1.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        
    }
    public boolean vadesizHesapBakiye(String hesapNo,double degisecekBakiye,boolean flag){          // flag(true)--> toplama
        // flag(false)---> cikarma
        boolean rObj = true;
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        String keeper = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token =new  java.util.StringTokenizer(keeper,"//");
                if(hesapNo.equals(token.nextToken())){
                    double anaPara = Double.valueOf(token.nextToken());
                    if(flag){           // toplama islemi
                        double yeniPara = anaPara+degisecekBakiye;
                        yeniPara = (double)Math.round(yeniPara*100)/100;
                        writeToFile.write(hesapNo+"//"+String.valueOf(yeniPara));
                        writeToFile.newLine();
                    }
                    else {              // cıkarma islemi
                        if(anaPara - degisecekBakiye < 0 ){
                            writeToFile.write(hesapNo+"//"+String.valueOf(anaPara));
                            writeToFile.newLine();
                            rObj = false ; 
                        }
                        else {
                            double yeniPara = anaPara-degisecekBakiye;
                            yeniPara = (double)Math.round(yeniPara*100)/100;
                            writeToFile.write(hesapNo+"//"+String.valueOf(yeniPara));
                            writeToFile.newLine();
                        }
                               
                    }
                    
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
                readFromFile.close();
                writeToFile.close();
                tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
                readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
                writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadesizHesap.txt"));
                while((keeper=readFromFile.readLine())!=null){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                writeToFile.close();
                readFromFile.close();
                tempFile.delete();
                        
            
            
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        return rObj ; 
    }
    public static boolean dahaVadesizHesapVarMi(String hesapNo){// silme islemi sonrasi eger silinen hesapta para var ise o parayi hangi
        // hesaba atmak icin kontrol yapıyoruz!
        boolean rObj = true  ;
        java.io.BufferedReader readFromFile = null ; 
        java.util.StringTokenizer token = null ; 
        String keeper = null ; 
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(hesapNo.equals(token.nextToken())){
                    rObj = false ;
                }
            }
            readFromFile.close();
            
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLUNDA HATA VAR\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN TUTULMASINDA HATA VAR");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
        return rObj ; 
    }
    //---------------------------------------------------------------------------------------------
    public boolean vadesizHesapVarMi(){
        //BU FONKSİYONU KULLANMA SEBEBİM VADELİ HESAP İLK OLUSUMDAN SONRASI BU KONTROL İLE 
        // EGER TRUE DONERSE DEMEK Kİ VADESİZ HESAP VAR VE VADELİ HESAP İCİN HANGİ VADESİZ HESAPTAN PARA CEKMEK İSTİYORSUN DİYE
        // SORACAGIM
        boolean rObj = false ; // dongü ile eger var ise bunu true yapacagim!.
        java.io.BufferedReader readFromFile = null ; 
        String keeper = null ; 
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                if(keeper.equals(getTc())){
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        rObj = true;
                        break ; 
                    }
                    break;
                    
                }
            }
            readFromFile.close();
            
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DİZİNİNDE HATA VAR\nLUTFEN IDE ILE DENER MISINIZ?");
        }
     return rObj;   
    }
    public void vadeliHesapInit(String vadeliHesapNo,double bakiye,double vadeSonuPara,int kalanGün){
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        String keeper = null ; 
        java.util.StringTokenizer token  = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadeliHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                if(keeper.equals(getTc())){
                    writeToFile.write(getTc());
                    writeToFile.newLine();
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        token.nextToken();
                        if(vadeliHesapNo.equals(token.nextToken())){
                            writeToFile.write("1/"+vadeliHesapNo+"//"+String.valueOf(bakiye)+"//"+String.valueOf(vadeSonuPara)+"//"+String.valueOf(kalanGün));
                            writeToFile.newLine();
                        }
                        else{
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                        }
                    }
                    writeToFile.write(keeper);// bu zaten "--------" olacak
                    writeToFile.newLine();
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //---------------------------------------------------------
            // 2. asama!
            tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadeliHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
            
        }catch(java.io.IOException e){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASİ HATALI!");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    }
    public void yatirimHesapInit(String yatirimHesapNo,double bakiye,double b_d_e, int flag){
        String keeper = null ; 
        java.io.File file  = null ; 
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        try {
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
            }
            else if(flag==2){
                file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");
                
            }
            else if(flag == 3){
                file = new java.io.File("src/Files/Musteri/euroHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");
                
            }
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper = readFromFile.readLine())!=null){
                if(getTc().equals(keeper)){
                    writeToFile.write(getTc());
                    writeToFile.newLine();
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        token.nextToken();
                        if(yatirimHesapNo.equals(token.nextToken())){
                            writeToFile.write("1//"+yatirimHesapNo+"//"+String.valueOf(bakiye)+"//"+String.valueOf(b_d_e));
                            writeToFile.newLine();
                        }
                        else{
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                        }
                    }
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //-----------------------------------------------------------------------
            // 2 .asama
            if(flag==1){
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
                readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
                writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/altinHesap.txt"));
            }
            else if(flag==2){
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");
                readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
                writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/dolarHesap.txt"));               
            }
            else if(flag==3){
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");
                readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
                writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/euroHesap.txt"));                
            }
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
           readFromFile.close();
           writeToFile.close();
           tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DİZİNİNDE HATA VAR\n IDE ILE DENER MISINIZ?");
        }
        catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR!");
        }
        catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    }
    public void vadeliHesapSil(String vadeliHesapNo){
        java.io.File tempFile = null ;
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        String keeper = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadeliHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                if(keeper.equals(getTc())){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        token.nextToken();
                        if(vadeliHesapNo.equals(token.nextToken())){
                            // iste burada yazmaz isem silmis olurum!
                        }
                        else{
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                        }
                        
                    }
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //-----------------------------------------------
            //      2 .  ASAMA 
            tempFile = new java.io.File("src/Files/Musteri/tempVadeliHesap.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadeliHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
            
        }catch(java.io.IOException e ){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASNDA HATA VAR!");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    }
    @Override
    public void yatirimHesapSil(String yatirimHesapNo,int flag){
        String keeper;
        java.io.File file = null;
        java.io.File tempFile = null ; 
        java.io.BufferedReader readFromFile ; 
        java.io.BufferedWriter writeToFile ; 
        java.util.StringTokenizer token = null ; 
        try{
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");
    
            }
            else if(flag==2){
                file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");
              
            }
            else if(flag==3){
                file = new java.io.File("src/Files/Musteri/euroHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");              
            }
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(file));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                if(getTc().equals(keeper)){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        token.nextToken();
                        if(yatirimHesapNo.equals(token.nextToken())){
                            // EGER BU ISE BIR SEY YAZMA!!
                        }
                        else{
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                        }
                    }
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                else {
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //------------------------------------------------------------------
            //    2. asama
            if(flag==1){
                file = new java.io.File("src/Files/Musteri/altinHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempAltinHesap.txt");                
            }
            else if (flag==2){
                file = new java.io.File("src/Files/Musteri/dolarHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempDolarHesap.txt");                
            }
            else if(flag==3){
                file = new java.io.File("src/Files/Musteri/euroHesap.txt");
                tempFile = new java.io.File("src/Files/Musteri/tempEuroHesap.txt");                
            }
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(file));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            writeToFile.close();
            readFromFile.close();
            tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLUNDA HATA OLDU\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
    }
    @Override
    public boolean baskaMusteriVarmi(){
        String keeper ; 
        boolean check = false ; 
        java.util.StringTokenizer token = null; 
        java.io.BufferedReader readFromFile = null ; 
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(token.nextToken().equals("m")){
                    if(token.nextToken().equals(getTc())){
                        continue ; 
                    }
                    else{  // yani m hesabi var hatta baska tc 
                        check = true  ;
                        readFromFile.close();
                        return check ; 
                    }
                }
                else{
                    continue ; 
                }
            }
            readFromFile.close();
            return check ; 
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASİ HATALİ");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
        return check ; 
    }
    @Override
    public java.util.ArrayList<String[]> adSoyadVer(){
        java.util.ArrayList<String[]> rObj = null;
        String keeper  = null ; 
        String ad , soyad ; 
        java.util.StringTokenizer token = null  ;
        java.io.BufferedReader readFromFile = null ; 
        try{
            rObj = new java.util.ArrayList<String[]>();
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/user.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(token.nextToken().equals("m")){
                    String tc = token.nextToken();
                    if(!tc.equals(getTc())){
                        token.nextToken();// sifreyi gecmis oldum
                        ad = token.nextToken();
                        soyad=token.nextToken();
                        
                        String[] temp = {ad,soyad,tc};
                        rObj.add(temp);
                        
                    }
                    else{
                        continue ; 
                    }
                }
                else{
                    continue ; 
                }
            }
            readFromFile.close();
            return rObj ; 
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DİZİNİNDE HATA VAR\nIDE ILE DENER MISIN?");
        }
        catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
        return null ; 
    }
    public static boolean tcVadesizVarMi(String tc){
        boolean check = false ; 
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.util.StringTokenizer token = null ;
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                if(keeper.equals(tc)){
                    keeper = readFromFile.readLine();
                    if(keeper.charAt(0)!='-'){
                        readFromFile.close();
                        return true ;
                    }
                    else{
                        readFromFile.close();
                        return false ;
                    } 
                }
                else continue ;
            }
            readFromFile.close();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA DIZININDE HATA VAR\nIDE ILE DENER MISINIZ ? ");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
        return false ; 
    }
    public static java.util.ArrayList<String[]> vadesizHesaplariDondur(String tc){
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.util.StringTokenizer token = null ; 
        java.util.ArrayList<String[]> rObj = null ;
        try{
            rObj = new java.util.ArrayList<String[]>();
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(tc.equals(token.nextToken())){
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        String[]arr = {token.nextToken()};
                        rObj.add(arr);
                    }
                }
                else{
                    continue ; 
                }
            }
            readFromFile.close();
            return rObj;
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASINDA HATA VAR");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null, "BIR SEY OLDU");
        }
        return null ; 
    }
    public static void vadesizHesapParaEkle(String hesapNo,double eklenecekPara){
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        java.io.File tempFile = null ; 
        java.util.StringTokenizer token = null ; 
        try{
            readFromFile  = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/vadesizHesap.txt"));
            tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
            if(tempFile.createNewFile());
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(hesapNo.equals(token.nextToken())){
                    double eskiPara = Double.valueOf(token.nextToken());
                    double fiyat = eklenecekPara+eskiPara;
                    fiyat = (double)Math.round(fiyat*100)/100;
                    writeToFile.write(hesapNo+"//"+String.valueOf(fiyat));
                    writeToFile.newLine();
                    
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //-----------------------------------------------
            // 2 . ASAMA
            tempFile = new java.io.File("src/Files/Musteri/tempVadesizHesap.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/vadesizHesap.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            readFromFile.close();
            writeToFile.close();
            tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISINIZ?");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI HATALI");
        }catch(Exception e3 ){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    }
    @Override
    public void yeniLimitIstek(String hesapNo,String eskiLimit,String yeniLimit,String mesaj){
       java.io.BufferedWriter writeToFile = null ; 
       try{
           writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/limitIstek.txt",true));
           writeToFile.write(getTc()+"//"+hesapNo+"//"+eskiLimit+"//"+yeniLimit+"//"+mesaj);
           writeToFile.newLine();
           writeToFile.close();
           return ;
       }catch(java.io.IOException e1){
           javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISIN?");
       }
    }
    @Override
    public boolean istekListesindeVarMi(String hesapNo){
        boolean check = false ;
        String keeper  ;
        java.util.StringTokenizer token = null ;
        java.io.BufferedReader readFromFile = null ; 
        try{
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/limitIstek.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                token.nextToken();
                if(hesapNo.equals(token.nextToken())){
                    readFromFile.close();
                    return true;
                }
            }
            readFromFile.close();
            return false ;
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLUNDA HATA VAR\nIDE ILE DENER MISINIZ?");
        }
        return check ; 
    }
    @Override
    public void krediKartSil(String hesapNo){
        java.io.File tempFile = null ;
        java.util.StringTokenizer token = null ; 
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ; 
        java.io.BufferedWriter writeToFile = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/krediKart.txt"));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                if(getTc().equals(keeper)){
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                    while((keeper=readFromFile.readLine()).charAt(0)!='-'){
                        token = new java.util.StringTokenizer(keeper,"//");
                        token.nextToken();
                        if(hesapNo.equals(token.nextToken())){

                        }
                        else{
                            writeToFile.write(keeper);
                            writeToFile.newLine();
                        }
                    }
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                    
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
                
            }
            readFromFile.close();
            writeToFile.close();
            //---------------------------------
            //  2. ASAMA
             tempFile = new java.io.File("src/Files/Musteri/tempKrediKart.txt");
             readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
             writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediKart.txt"));
             while((keeper=readFromFile.readLine())!=null){
                 writeToFile.write(keeper);
                 writeToFile.newLine();
             }
             writeToFile.close();
             readFromFile.close();
             tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU BULUNAMADI\nIDE ILE DENER MISIN");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI HATALI!");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
    }
    @Override
    public  void krediIstek(int krediMiktari,double krediBorc){
        java.io.BufferedWriter writeToFile = null ; 
        try{
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediIstek.txt",true));
            writeToFile.write(getTc()+"//"+String.valueOf(krediMiktari)+"//"+String.valueOf(krediBorc));
            writeToFile.newLine();
            writeToFile.close();
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU HATALI\nIDE ILE DENER MISIN");
        }catch(Exception e2){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU!");
        }
    }
    @Override
    public java.util.ArrayList<String[]> krediBorcuListele(){
        String keeper = null ; 
        java.util.ArrayList<String[]> rObj = null ; 
        java.util.StringTokenizer token = null ; 
        java.io.BufferedReader readFromFile = null ; 
        try{
            rObj = new java.util.ArrayList<String[]>();
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/krediBorc.txt"));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(getTc().equals(token.nextToken())){
                    String[]temp ={token.nextToken()};
                    rObj.add(temp);
                }
            }
            readFromFile.close();
            return rObj ; 
            
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU BULUNAMADI\nIDE ILE DENER MISIN");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI HATALI!");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
        return null ; 
    }
    public void krediBorcuSil(double borc){
        String keeper = null ; 
        java.io.BufferedReader readFromFile = null ;
        java.io.BufferedWriter writeToFile = null ; 
        java.util.StringTokenizer token = null ; 
        java.io.File tempFile = null ; 
        try{
            tempFile = new java.io.File("src/Files/Musteri/tempKrediBorc.txt");
            if(tempFile.createNewFile());
            readFromFile = new java.io.BufferedReader(new java.io.FileReader("src/Files/Musteri/krediBorc.txt"));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter(tempFile));
            while((keeper=readFromFile.readLine())!=null){
                token = new java.util.StringTokenizer(keeper,"//");
                if(getTc().equals(token.nextToken())){
                    if(String.valueOf(borc).equals(token.nextToken())){
                        
                    }
                    else{
                        writeToFile.write(keeper);
                        writeToFile.newLine();
                    }
                }
                else{
                    writeToFile.write(keeper);
                    writeToFile.newLine();
                }
            }
            readFromFile.close();
            writeToFile.close();
            //-------------------------------------------
            tempFile = new java.io.File("src/Files/Musteri/tempKrediBorc.txt");
            readFromFile = new java.io.BufferedReader(new java.io.FileReader(tempFile));
            writeToFile = new java.io.BufferedWriter(new java.io.FileWriter("src/Files/Musteri/krediBorc.txt"));
            while((keeper=readFromFile.readLine())!=null){
                writeToFile.write(keeper);
                writeToFile.newLine();
            }
            writeToFile.close();
            readFromFile.close();
            tempFile.delete();
        }catch(java.io.IOException e1){
            javax.swing.JOptionPane.showMessageDialog(null,"DOSYA YOLU BULUNAMADI\nIDE ILE DENER MISIN");
        }catch(NullPointerException e2){
            javax.swing.JOptionPane.showMessageDialog(null,"VERİNİN SAKLANMASI HATALI!");
        }catch(Exception e3){
            javax.swing.JOptionPane.showMessageDialog(null,"BIR SEY OLDU");
        }
    }
}

public class Main {
    public static void main(String args[])throws InterruptedException{
        
        ProgressBar progress = new ProgressBar();
        progress.setVisible(true);
        try{
            for(int i = 0 ; i <=100 ; ++i){
                Thread.sleep(25);
                progress.jBaslamaBar.setValue(i);
            }
            progress.setVisible(false);
            progress.dispose();
            YatirimHesabi.borsaFiyatDegis();
            YatirimHesabi.bakiyeDegis(1);
            YatirimHesabi.bakiyeDegis(2);
            YatirimHesabi.bakiyeDegis(3);
            VadeliHesap.vadeGünüAzalt();
            

            Login.mainLogin();
        }catch(InterruptedException e ){
            
        }
    }


}

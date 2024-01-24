import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Chatbot
{
  private static String date, time, month, day, daymess, input;
  private static int inputno;
  private static LocalTime time720 = LocalTime.parse ("07:20");
  private static LocalTime time1135 = LocalTime.parse ("11:35");
  private static LocalTime time1600 = LocalTime.parse ("16:00");
  private static LocalTime time1920 = LocalTime.parse ("19:20");

  public static void main (String[]args)
  {

    day = day ();
    date = date ();
    time = time ();
    month = month ();

    System.out.println("Welcome message");
    System.out.println ("About which college do you want to inquire?" + date + time + month);
    input = input ();

    if (input.toLowerCase ().contains ("SISTec".toLowerCase ()))
      {
  System.out.println ("What do you want to inquire about SISTec?");
  System.out.println
    ("currently we only have data regarding mess,faculty(1st year),we will try to add more things as soon as possible");
  int i = 1;
  while (i != 0)
    {
      input = input ();

      if (input.toLowerCase ().contains ("mess"))
        {
    mess ();
        }
      else if (input.equalsIgnoreCase ("faculty"))
        {
    faculty ();
        }
      else if (input.equalsIgnoreCase ("About SISTec")
         || input.equalsIgnoreCase ("SIStec"))
        {
    System.out.println
      ("Sagar Institute of Science and Technology (SISTecB.), established in the year 2007, is one of the best engineering colleges, located in the heart of the state, the city of lakes - Bhopal. SISTec is the brand name for technical colleges under the umbrella of the Sagar Group of InstitutionsB.. Boasting state-of-the-art facilities, a diverse student body, and a talented pool of faculty, SISTec has established itself as a leader in providing quality education offering B.Tech., MBA, and M.Tech. programs. The academic programs are designed to meet the needs and interests of students from all backgrounds, making SISTec the perfect place to jumpstart your future. The brand has a strong motivation towards innovation in curriculum implementation. It further aspires to be a part of the education revolution in Technical education, impacting futuristic technologies in the Indian framework. In this process, it aims to be one of the finest providers of technical education in India.");
        }
      else if (input.equalsIgnoreCase ("About facilites")
         || input.equalsIgnoreCase ("facilites"))
        {
    System.out.println
      ("We provide many facilites in our campus and some of them are:- Library,Wifi campus,Transport,Swimming pool,Sports Ground,Mess,Hostel,Gym and Much more...");
        }
      else if (input.equalsIgnoreCase ("Stop"))
        {
    i = 0;
        }
      else
        {
    System.out.println ("Invalid inquiry about SISTec.");
        }
    }
      }
  if (input.equalsIgnoreCase ("SIPTEC")
       || input.equalsIgnoreCase ("SISTEC-E")
       || input.equalsIgnoreCase ("SISTEC-R")
       || input.equalsIgnoreCase ("SISTEC-mba"))
      {
  System.out.println ("We do not have enough data about this college.");
      }
    else
      {
  System.out.println ("Sorry, but I don't know about this college.");
      }
  
  }

  private static void mess ()
  {
    Scanner in = new Scanner (System.in);
    System.out.println
      ("ENTER 1 FOR  THE WEEKLY MEAL MENU\nENTER 2 FOR TODAYS MEAL MENU\nENTER 3 FOR THE NEXT MEAL MENU\nENTER 4 TO KNOW MEAL MENU OF CUSTOM WEEKDAY");
    inputno =  inputno ();
    if (inputno == 1)
      {
  System.out.println
    ("MONDAY\nBreakfast:- Poha, Jalebi, Dodh\nLunch:- Curry pakoda, Aloo ki sabji, Chabal, Chapatti\nEvening Snack:- Pav bhaji, Chai\nDinner:- Desi channe ki sabji, Tuar ki dal, Chabal, Papad, Achar, Chapatti\n\n*TUESDAY*\nBreakfast:- Bread jam, Dodh\nLunch:- Raajma, Loki tamatar ki sabji, Chabal, Achar, Chapatti\nEvening Snack:- Chai, Masala bun\nDinner:- Soyabadi ke sabji, Veg pulao, Dahi, Chapatti, Achar\n\n*WEDNESDAY*\nBreakfast:- Poha, Dudh\nLunch:- Tuar dal, Mixveg(Cabbage, Veins, Capsicum, Carrot, Peas), Chabal, Achar, Chapatti\nEveningSnack:- Breadrolls, Chai\nDinner:- Paneer ki sabji, Tuar ki dal, Chabal, Achar, Chapatti, Salad\n\n*THURSDAY*\nBreakfast:- Pudi, Aloo tamatar ki sabji, Dudh\nLunch:- Aloo matar ki sabji, Tuar dal, Chabal, Chapatti, Achar, Khela\nEveningSnack:- Tosh, Chai\nDinner:-  Dal (Aloo palak ki sabji) Chabal, Chapatti, Papad, Sweets\n\n*FRIDAY*\nBreakfast:- Poha, Jalebi, Dudh\nLunch:- Tuar dal, Patagobhi ki sabji, Chabal, Achar Chapatti\nEveningsnacks:-  Biscuit (good day), Chai\nDinner:- Dal, Seasonable sabji, Chabal, Aachar, Chapati\n\n*SATURDAY*\nBreakfast:- Idli Sabhar, Chutney, Dudh\nLunch:- Chola ki Sabji, Raita. Chabal, Papad, ACHAR, Pudi\nEveningsnacks:- Pasta, Chai\nDinner:- Bhindi Masala, Dal, Chabal Achar, Chapatti,Salad\n\n*SUNDAY*\nBreakfast:- Bread jam, Dudh\nLunch:- Aloo Paratha, Dahi, Tuar Dal, Chabal Achar, (2nd week) Plain Paratha, Aloo bhujiya sabji, Dal, Chabal, Aachar\nEveningsnacks:- Samosa, Chai\nDinner:- Kadu ki sabji, Chane ki dal, Chabal, Chapatti, Achar and sweets\n\n\n*Note*:- Gulab Jamun will be provided once in a month and Food Custard twice in a month which will be provided on Cable Sunday only.");
      }
    else if (inputno == 2)
      {
  if (day.equals ("Monday"))
    {
      System.out.println
        ("Breakfast:- Poha, Jalebi, Dodh\nLunch:- Curry pakoda, Aloo ki sabji, Chabal, Chapatti\nEvening Snack:- Pav bhaji, Chai\nDinner:- Desi channe ki sabji, Tuar ki dal, Chabal, Papad, Achar, Chapatti");
    }
  else if (day.equals ("Tuesday"))
    {
      System.out.println
        ("Breakfast:- Bread jam, Dodh\nLunch:- Raajma, Loki tamatar ki sabji, Chabal, Achar, Chapatti\nEvening Snack:- Chai, Masala bun\nDinner:- Soyabadi ke sabji, Veg pulao, Dahi, Chapatti, Achar");
    }
  else if (day.equals ("Wednesday"))
    {
      System.out.println
        ("Breakfast:- Poha, Dudh\nLunch:- Tuar dal, Mixveg(Cabbage, Veins, Capsicum, Carrot, Peas), Chabal, Achar, Chapatti\nEveningSnack:- Breadrolls, Chai\nDinner:- Paneer ki sabji, Tuar ki dal, Chabal, Achar, Chapatti, Salad");
    }
  else if (day.equals ("Thursday"))
    {
      System.out.println
        ("Breakfast:- Pudi, Aloo tamatar ki sabji, Dudh\nLunch:- Aloo matar ki sabji, Tuar dal, Chabal, Chapatti, Achar, Khela\nEveningSnack:- Tosh, Chai\nDinner:-  Dal (Aloo palak ki sabji) Chabal, Chapatti, Papad, Sweets");
    }
  else if (day.equals ("Friday"))
    {
      System.out.println
        ("Breakfast:- Poha, Jalebi, Dudh\nLunch:- Tuar dal, Patagobhi ki sabji, Chabal, Achar Chapatti\nEveningsnacks:-  Biscuit (good day), Chai\nDinner:- Dal, Seasonable sabji, Chabal, Aachar, Chapati");
    }
  else if (day.equals ("Saturday"))
    {
      System.out.println
        ("Breakfast:- Idli Sabhar, Chutney, Dudh\nLunch:- Chola ki Sabji, Raita. Chabal, Papad, ACHAR, Pudi\nEveningsnacks:- Pasta, Chai\nDinner:- Bhindi Masala, Dal, Chabal Achar, Chapatti,Salad");
    }
  else if (day.equals ("Sunday"))
    {
      System.out.println
        ("Breakfast:- Bread jam, Dudh\nLunch:- Aloo Paratha, Dahi, Tuar Dal, Chabal Achar, (2nd week) Plain Paratha, Aloo bhujiya sabji, Dal, Chabal, Aachar\nEveningsnacks:- Samosa, Chai\nDinner:- Kadu ki sabji, Chane ki dal, Chabal, Chapatti, Achar and sweets");
    }
  else
    {
      System.out.println
        ("Something went wrong or not able to identify the day.");
    }
      }
    else if (inputno == 3)
      {
  if (day.equals ("Monday") &&(LocalTime.now ().isBefore (time720)))
    {
      System.out.println
        ("Breakfast:- Poha, Jalebi, Dodh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Monday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Curry pakoda, Aloo ki sabji, Chabal, Chapatti\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Monday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.out.println
        ("Evening Snack:- Pav bhaji, Chai\nAT 04:00 PM To 04:30 PM");
    }
  else if (day.equals ("Monday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:- Desi channe ki sabji, Tuar ki dal, Chabal, Papad, Achar, Chapatti\nAT 07:20 PM To 07:40 PM");
    }
  else if (day.equals ("Tuesday")
     && (LocalTime.now ().isBefore (time720)))
    {
      System.out.println
        ("Breakfast:- Bread jam, Dodh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Tuesday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Raajma, Loki tamatar ki sabji, Chabal, Achar, Chapatti\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Tuesday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.out.println
        ("Evening Snack:- Chai, Masala bun\nAT 04:00 PM To 04:30 PM");
    }
  else if (day.equals ("Tuesday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:- Soyabadi ke sabji, Veg pulao, Dahi, Chapatti, Achar\nAT 07:20 PM To 07:40 PM");
    }
  else if (day.equals ("Wednesday")
     && (LocalTime.now ().isBefore (time720)))
    {
      System.
        out.println
        ("Breakfast:- Poha, Dudh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Wednesday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Tuar dal, Mixveg(Cabbage, Veins, Capsicum, Carrot, Peas), Chabal, Achar, Chapatti\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Wednesday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.out.println
        ("EveningSnack:- Breadrolls, Chai\nAT 04:00 PM To 04:30 PM" + amitjunnarkar () + nidhiojha ());
    }
  else if (day.equals ("Wednesday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:- Paneer ki sabji, Tuar ki dal, Chabal, Achar, Chapatti, Salad\nAT 07:20 PM To 07:40 PM");
    }
  else if (day.equals ("Thursday")
     && (LocalTime.now ().isBefore (time720)))
    {
      System.out.println
        ("Breakfast:- Pudi, Aloo tamatar ki sabji, Dudh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Thursday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Aloo matar ki sabji, Tuar dal, Chabal, Chapatti, Achar, Khela\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Thursday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.
        out.println
        ("EveningSnack:- Tosh, Chai\nAT 04:00 PM To 04:30 PM");
    }
  else if (day.equals ("Thursday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:-  Dal (Aloo palak ki sabji) Chabal, Chapatti, Papad, Sweets\nAT 07:20 PM To 07:40 PM");
    }
  else if (day.equals ("Friday")
     && (LocalTime.now ().isBefore (time720)))
    {
      System.out.println
        ("Breakfast:- Poha, Jalebi, Dudh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Friday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Tuar dal, Patagobhi ki sabji, Chabal, Achar Chapatti\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Friday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.out.println
        ("Eveningsnacks:-  Biscuit (good day), Chai\nAT 04:00 PM To 04:30 PM");
    }
  else if (day.equals ("Friday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:- Dal, Seasonable sabji, Chabal, Aachar, Chapati\nAT 07:20 PM To 07:40 PM");
    }
  else if (day.equals ("Saturday")
     && (LocalTime.now ().isBefore (time720)))
    {
      System.out.println
        ("Breakfast:- Idli Sabhar, Chutney, Dudh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Saturday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Chola ki Sabji, Raita. Chabal, Papad, ACHAR, Pudi\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Saturday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.out.println
        ("Eveningsnacks:- Pasta, Chai\nAT 04:00 PM To 04:30 PM");
    }
  else if (day.equals ("Saturday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:- Bhindi Masala, Dal, Chabal Achar, Chapatti,Salad\nAT 07:20 PM To 07:40 PM");
    }
  else if (day.equals ("Sunday")
     && (LocalTime.now ().isBefore (time720)))
    {
      System.out.println
        ("Breakfast:- Bread jam, Dudh\nFrom 07:20 AM To 07:40AM");
    }
  else if (day.equals ("Sunday")
     && (LocalTime.now ().isBefore (time1135)))
    {
      System.out.println
        ("Lunch:- Aloo Paratha, Dahi, Tuar Dal, Chabal Achar, (2nd week) Plain Paratha, Aloo bhujiya sabji, Dal, Chabal, Aachar\nAT 11:35 AM To 12:10 PM");
    }
  else if (day.equals ("Sunday")
     && (LocalTime.now ().isBefore (time1600)))
    {
      System.out.println
        ("Eveningsnacks:- Samosa, Chai\nAT 04:00 PM To 04:30 PM");
    }
  else if (day.equals ("Sunday")
     && (LocalTime.now ().isBefore (time1920)))
    {
      System.out.println
        ("Dinner:- Kadu ki sabji, Chane ki dal, Chabal, Chapatti, Achar and sweets\nAT 07:20 PM To 07:40 PM");
    }
      }
    else if (inputno == 4)
      {
  System.out.println ("Enter The Day!");
  input = input ();
  if (daymess.contains ("monday"))
    {
      System.out.println
        ("Breakfast:- Poha, Jalebi, Dodh\nLunch:- Curry pakoda, Aloo ki sabji, Chabal, Chapatti\nEvening Snack:- Pav bhaji, Chai\nDinner:- Desi channe ki sabji, Tuar ki dal, Chabal, Papad, Achar, Chapatti");
    }
  else if (daymess.toLowerCase ().contains ("tuesday"))
    {
      System.out.println
        ("Breakfast:- Bread jam, Dodh\nLunch:- Raajma, Loki tamatar ki sabji, Chabal, Achar, Chapatti\nEvening Snack:- Chai, Masala bun\nDinner:- Soyabadi ke sabji, Veg pulao, Dahi, Chapatti, Achar");
    }
  else if (daymess.toLowerCase ().contains ("wednesday"))
    {
      System.out.println
        ("Breakfast:- Poha, Dudh\nLunch:- Tuar dal, Mixveg(Cabbage, Veins, Capsicum, Carrot, Peas), Chabal, Achar, Chapatti\nEveningSnack:- Breadrolls, Chai\nDinner:- Paneer ki sabji, Tuar ki dal, Chabal, Achar, Chapatti, Salad");
    }
  else if (daymess.toLowerCase ().contains ("thursday"))
    {
      System.out.println
        ("Breakfast:- Pudi, Aloo tamatar ki sabji, Dudh\nLunch:- Aloo matar ki sabji, Tuar dal, Chabal, Chapatti, Achar, Khela\nEveningSnack:- Tosh, Chai\nDinner:-  Dal (Aloo palak ki sabji) Chabal, Chapatti, Papad, Sweets");
    }
  else if (daymess.toLowerCase ().contains ("friday"))
    {
      System.out.println
        ("Breakfast:- Poha, Jalebi, Dudh\nLunch:- Tuar dal, Patagobhi ki sabji, Chabal, Achar Chapatti\nEveningsnacks:-  Biscuit (good day), Chai\nDinner:- Dal, Seasonable sabji, Chabal, Aachar, Chapati");
    }
  else if (daymess.toLowerCase ().contains ("saturday"))
    {
      System.out.println
        ("Breakfast:- Idli Sabhar, Chutney, Dudh\nLunch:- Chola ki Sabji, Raita. Chabal, Papad, ACHAR, Pudi\nEveningsnacks:- Pasta, Chai\nDinner:- Bhindi Masala, Dal, Chabal Achar, Chapatti,Salad");
    }
  else if (daymess.toLowerCase ().contains ("sunday"))
    {
      System.out.println
        ("Breakfast:- Bread jam, Dudh\nLunch:- Aloo Paratha, Dahi, Tuar Dal, Chabal Achar, (2nd week) Plain Paratha, Aloo bhujiya sabji, Dal, Chabal, Aachar\nEveningsnacks:- Samosa, Chai\nDinner:- Kadu ki sabji, Chane ki dal, Chabal, Chapatti, Achar and sweets");
    }
  else
    {
      System.out.println
        ("Something went wrong or not able to identify the day.");
    }
      }
    in.close ();
  }

  private static void faculty ()
  {
    System.out.println
      ("Enter the name of teacher or the subject name or the post(HOD,SAC,etc) about whom you wanna inquire");
    input = input ();
    if ((input.toLowerCase ().contains ("rahul dubey"))
  || (input.toLowerCase ().contains ("hod")
      && input.toLowerCase ().contains ("cse")))
      {
  System.out.println (rahuldubey ());
      }

    else if ((input.toLowerCase ().contains ("vice principal"))
       || (input.toLowerCase ().contains ("swati saxena")))
      {
  System.out.println (swatisaxena ());
      }

    else if ((input.toLowerCase ().contains ("principal"))
       || (input.toLowerCase ().contains ("dinesh kumar rajoriya")
     || input.toLowerCase ().contains ("dk rajoriya")))
      {
  System.out.println (dkrajoriya ());
      }

    else if ((input.toLowerCase ().contains ("director"))
       || (input.toLowerCase ().contains ("jyoti deshmukh")))
      {
  System.out.println (jyotideshmukh ());
      }

    else if ((input.toLowerCase ().contains ("administrator"))
       || (input.toLowerCase ().contains ("kushwah")))
      {
  System.out.println (bskushwah ());
      }

    else if ((input.toLowerCase ().contains ("tutor guardian"))
       || input.toLowerCase ().contains ("tg")
       && (input.toLowerCase ().contains ("cs4")
     || input.toLowerCase ().contains ("a4")
     || input.toLowerCase ().contains ("ex")))
      {
  System.out.println (sumitdekate () + "\n" + shadmakhan ());
      }
    else if ((input.toLowerCase ().contains ("tutor guardian"))
       || input.toLowerCase ().contains ("tg")
       && (input.toLowerCase ().contains ("cs1")
     || input.toLowerCase ().contains ("a1")))
      {
  System.out.println (zebapraveen () + "\n" + mythilymahalingam ());
      }
    else if ((input.toLowerCase ().contains ("tutor guardian"))
       || input.toLowerCase ().contains ("tg")
       && (input.toLowerCase ().contains ("cs2")
     || input.toLowerCase ().contains ("a2")))
      {
  System.out.println (preetikhare () + "\n" + shivkumarsingh ());
      }
    else if ((input.toLowerCase ().contains ("tutor guardian"))
       || input.toLowerCase ().contains ("tg")
       && (input.toLowerCase ().contains ("cs3")
     || input.toLowerCase ().contains ("a3")))
      {
  System.out.println (mohitajoshi () + "\n" + shadmakhan ());
      }
    else if ((input.toLowerCase ().contains ("chemistry")))
      {
  System.out.println (zebapraveen () + "\n" + neeleshshrivastava () + "\n" + preetikhare ());
      }
    else if ((input.toLowerCase ().contains ("math")))
      {
  System.out.println (farhanbeg () + "\n" + sumitdekate () + "\n" + shivkumarsingh ());
      }
    else if ((input.toLowerCase ().contains ("english")))
      {
  System.out.println (mythilymahalingam () + "\n" + mohitajoshi ());
      }
    else if (input.toLowerCase ().contains ("electical") || input.toLowerCase ().contains ("bee") || input.toLowerCase ().contains ("electronic"))
      {
  System.out.println (shadmakhan () + "\n" + ankitchourasiya () + "\n" + viveksingh ());
      }
    else if (input.toLowerCase ().contains ("ed") || input.toLowerCase ().contains ("graphics") || input.toLowerCase ().contains ("drawing"))
      {
  System.out.println (kuldeepnamdev () + "\n");
      }
    else if ((input.toLowerCase ().contains ("workshop")))
      {
    System.out.println (kuldeepnamdev () + "\n");
      }
    else if ((input.toLowerCase ().contains ("cp")))
      {
    System.out.println (kuldeepnamdev () + "\n");
      }
    else if (input.toLowerCase ().contains ("crt") || input.toLowerCase ().contains ("common skills"))
      {
    System.out.println (anjalijain () + "\n");
      }
    else if (input.toLowerCase ().contains ("aptitude") || input.toLowerCase ().contains ("apti"))
      {
    System.out.println (neerajkatiyar ());
      }
    else if (input.toLowerCase ().contains ("zeba") || input.toLowerCase ().contains ("praveen"))
      {
    System.out.println (zebapraveen () + "\n");
      }
    else if (input.toLowerCase ().contains ("farhan beg") || input.toLowerCase ().contains ("farhan"))
      {
    System.out.println (farhanbeg () + "\n");
      }
    else if (input.toLowerCase ().contains ("mythily") || input.toLowerCase ().contains ("mythily mahalingam"))
      {
    System.out.println ( mythilymahalingam () + "\n");
      }
    else if (input.toLowerCase ().contains ("ankit") || input.toLowerCase ().contains ("ankit chourasiya"))
      {
    System.out.println (ankitchourasiya () + "\n");
      }
    else if (input.toLowerCase ().contains ("kuldeep") || input.toLowerCase ().contains ("kuldeep namdev"))
      {
    System.out.println (kuldeepnamdev () + "\n");
      }
    else if (input.toLowerCase ().contains ("aamir hussain") || input.toLowerCase ().contains ("aamir"))
      {
    System.out.println (aamirhussain () + "\n");
      }
    else if (input.toLowerCase ().contains ("anjali") || input.toLowerCase ().contains ("anjali jain"))
      {
    System.out.println (anjalijain () + "\n");
      }
    else if (input.toLowerCase ().contains ("neeraj katiyar") || input.toLowerCase ().contains ("neeraj"))
      {
    System.out.println (neerajkatiyar () + "\n");
      }
    else if (input.toLowerCase ().contains ("kalpana soni") || input.toLowerCase ().contains ("kalpana"))
      {
    System.out.println (kalpanasoni () + "\n");
      }
    else if (input.toLowerCase ().contains ("neelesh shrivastava") || input.toLowerCase ().contains ("neelesh"))
      {
    System.out.println (neeleshshrivastava ());
      }
    else if (input.toLowerCase ().contains ("sumit") || input.toLowerCase ().contains ("dekate") || input.toLowerCase ().contains ("sumit dekate"))
      {
    System.out.println (sumitdekate () + "\n");
      }
    else if (input.toLowerCase ().contains ("mohita") || input.toLowerCase ().contains ("mohita joshi"))
      {
    System.out.println (mohitajoshi () + "\n");
      }
    else if (input.toLowerCase ().contains ("shadma") || input.toLowerCase ().contains ("shadma khan"))
      {
    System.out.println (shadmakhan ());
      }
    else if (input.toLowerCase ().contains ("preeti") || input.toLowerCase ().contains ("preeti khare"))
      {
    System.out.println (preetikhare () + "\n");
      }
    else if (input.toLowerCase ().contains ("shiv kumar singh") || input.toLowerCase ().contains ("shiv kumar"))
      {
    System.out.println (shivkumarsingh () + "\n");
      }
    else if (input.toLowerCase ().contains ("vivek singh") || input.toLowerCase ().contains ("vivek"))
      {
    System.out.println (viveksingh () + "\n");
      }
  }
    //faculty data
  private static String swatisaxena ()
  {
    return
      "Dr.Swati Saxena is the Vice Principal of Sagar Institute of Science & Technology.";
  }

  private static String dkrajoriya ()
  {
    return
      "Dr.Dineshn Kumar Rajoriya is the Principal of Sagar Institute of Science & Technology.";
  }

  private static String jyotideshmukh ()
  {
    return "Dr. Jyoti Deshmukh is the Director of Sagar Institute.";
  }

  private static String bskushwah ()
  {
    return
      "Mr. B.S. Kushwah is the Administrator of Sagar Institute of Science & Technology.";
  }

  private static String amitjunnarkar ()
  {
    return
      "Mr. Amit Junnarkar  is the General Manager Admin and HR of Sagar Institute of Science & Technology.";
  }

  private static String rahuldubey ()
  {
    return
      "Dr.Rahul Dubey is the Head of Department in Computer Science Engginering";
  }

  private static String zebapraveen ()
  {
    return
      "Dr. Zeba Praveen, the tutor guardian of CS1/A1, also serves as a Engg.Chemistry professor in CS1/A1.";
  }

  private static String farhanbeg ()
  {
    return "Dr. Farhan Beg is a Engg.Mathmatics professor in CS1/A1.";
  }

  private static String mythilymahalingam ()
  {
    return
      "Ms. Mythily Mahalihgam, the tutor guardian of CS1/A1, also serves as a English for Communication professor in CS1/A1 & CS2/A2.";
  }

  private static String ankitchourasiya ()
  {
    return
      "Mr. Ankit Chourasiya is a Basic Electrical & Electronics Engg professor in CS1/A1.";
  }

  private static String kuldeepnamdev ()
  {
    return
      "Mr. Kuldeep Namdev,the tutor gaurdian of ,also serves as a Engg. Graphics professor in CS1/A1, CS2/A2 & CS4.EX/A4.";
  }

  private static String aamirhussain ()
  {
    return
      "Mr. Aamir Hussain, he also serves as a Engg. Graphics professor in CS3/A3.";
  }
  
  private static String anjalijain ()
  {
    return
      "Ms. Anjali Jain teaches  CRT Common Skills to all first year stundent.";
  }

  private static String neerajkatiyar ()
  {
    return "Mr. Neeraj Katiyar teaches Aptitude to all first year stundent.";
  }

  private static String kalpanasoni ()
  {
    return "Ms. Kalpana Soni is the Library Incharge at Sagar Group of Science & Technology.";
  }
  
  private static String neeleshshrivastava ()
  {
    return
      "Dr. Neelesh Shrivastava is a Engg.Chemistry professor in CS4.EX/A4.tg of CSE-CY.S/B4";
  }

  private static String sumitdekate ()
  {
    return
      "Dr. Sumit Dekate, the tutor guardian of CS4.EX/A4, also serves as a Engg.Mathmatics-1 professor in CS4.EX/A4 & CS3/A3.";
  }
  
  private static String mohitajoshi ()
  {
    return
      "Ms. Mohita Joshi,the tutor gaurdian of ,also serves as a English for Communication professor in CS4.EX/A4 & CS3/A3. She is the faculty cordinator of Student Activity Concil.";
  }

  private static String shadmakhan ()
  {
    return
      "Ms. Shadma Khan,the tutor gaurdian of ,also serves as a Basic Electrical & Electronics Engg professor in CS4.EX/A4 & CS3/A3.";
  }

  private static String preetikhare ()
  {
    return
      "Dr. Preeti Khare,the tutor gaurdian of CS3/A3,also serves as a Engg. Chemistry professor in CS3/A3.";
  }

  private static String shivkumarsingh ()
  {
    return
      "Dr.Shiv Kumar Singh, the tutor guardian of CS2/A2, also serves as a Engg.Mathmatics-1 professor in CS2/A2.";
  }
  
  private static String viveksingh ()
  {
    return
      "Mr.Vivek Singh is a Basic Electrical & Electronics Engg professor in CS2/A2.";
  }

  private static String nidhiojha ()
  {
    return
      "Mr. Kuldeep Namdev,the tutor gaurdian of ,also serves as a Engg. Graphics professor in CS1/A1, CS2/A2 & CS4.EX/A4.";
  }

// date time month input
  private static String input ()
  {
    Scanner in = new Scanner (System.in);
    String inp = in.nextLine ();
    in.close();
    return inp;

  }

  private static int inputno ()
  {
    Scanner in = new Scanner (System.in);
    int inp = in.nextInt ();
    in.close();
    return inp;
  }

  private static String date ()
  {
    LocalDate currentDate = LocalDate.now ();
    return currentDate.format (DateTimeFormatter.ofPattern ("dd-MM-yyyy"));
  }

  private static String day ()
  {
    LocalDate currentDate = LocalDate.now ();
    return currentDate.getDayOfWeek ().getDisplayName (TextStyle.FULL,
                   Locale.getDefault ());
  }

  private static String time ()
  {
    LocalTime currentTime = LocalTime.now ();
    return currentTime.format (DateTimeFormatter.ofPattern ("HH:mm"));
}

  private static String month ()
  {
    LocalDate currentDate = LocalDate.now ();
    return currentDate.getMonth ().getDisplayName (TextStyle.FULL,
               Locale.getDefault ());
  }
}

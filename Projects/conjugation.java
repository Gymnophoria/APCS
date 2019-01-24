import java.util.Scanner;

class conjugation {
  
  public static void main (String str[]) {
    
    System.out.println("what word do you desire to conjugate today? infinitive please. (this program does not do fancy irregular verbs because those verbs are irregular lul)");
    Scanner scanner = new Scanner(System.in);
    
    String infinitive = scanner.nextLine();
    if (infinitive.length() < 3) {
      System.out.println("that's not a real infinitive, liar");
      return;
    }
      
    String base = infinitive.substring(0, infinitive.length() - 2);
    String ending = infinitive.substring(infinitive.length() - 2, infinitive.length());
    System.out.println("base - " + base + ", ending - " + ending);
    if (!ending.equals("ar") && !ending.equals("er") && !ending.equals("ir")) {
      System.out.println("that's not a real infinitive, nerd.");
      return;
    }
    
    String yo = base + "o";
    String tu = ending.equals("ar") ? base + "as" : base + "es";
    String el = ending.equals("ar") ? base + "a" : base + "e";
    String nosotros = "failed for some reason";
    String vosotros = "failed for some reason";
    String ellos = ending.equals("ar") ? base + "an" : base + "en";
    
    if (ending.equals("ar")) {
      nosotros = base + "amos";
      vosotros = base + "a�s";
    } else if (ending.equals("er")) {
      nosotros = base + "emos";
      vosotros = base + "e�s";
    } else if (ending.equals("ir")) {
      nosotros = base + "imos";
      vosotros = base + "�s";
    }
    
    System.out.println("Here's your conjugated forms of " + infinitive + ":");
    System.out.println("\tYo " + yo + "\n\tT� " + tu + "\n\t�l/ella/usted " + el + "\n\tNosotros " + nosotros + "\n\tVosotros " + vosotros + "\n\tEllos/ellas/ustedes " + ellos);
    
  }
  
}
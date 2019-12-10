import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ConcreteComponent - Geek.
**/
class Geek {

   private String type;
   private List<String> languages;
   private int experience;

   public Geek(String type,List<String> languages, int experience) {
       this.type = type;
       this.languages = languages;
       this.experience = experience;
   }

    @Override
    public String toString() {
        return "Type : " + type + "\n" + 
               "Languages : " + languages + "\n" +
               "Experience : " + experience + " years";
    }

}

/**
 * Builder interface describe step of object creation.
**/
interface Builder {
    public void setType(String type);
    public void setLanguages(List<String> languages);
    public void setExperience(int experience);
}

/**
 * Concrete Builder build Geek component.
**/
class  GeekBuilder implements Builder {

    private String type;
    private List<String> languages;
    private int experience;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Geek getResult() {
       return new Geek(type, languages, experience);
    }
}

/**
  * Builder Director.
  */
class GeekDirector {
    public void buildAdmin(Builder builder) {
        builder.setType("Admin");
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Perl");
        languages.add("PowerShell");
        builder.setLanguages(languages);
        builder.setExperience(10);
     }
}

class Main {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final String geekName = scanner.nextLine();
        scanner.close();
        System.out.println("Geek " + geekName + " created.");
        GeekDirector director = new GeekDirector();
        GeekBuilder builder = new GeekBuilder();
        director.buildAdmin(builder);
        Geek geek = builder.getResult();
        System.out.println(geek);

    }
}
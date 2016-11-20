import java.util.Arrays;
import java.util.Date;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;

public class Example{
  public static void main (String[] args){

    Treet treet = new Treet(
    "craigDennis",
    "Lorem ipsum dolor sit amet, #consectetur adipiscing elit. @cicero",
    new Date(1421849732000L)
    );
    Treet secondTreet = new Treet(
    "journeytocode",
    "Nulla gravida suscipit #tellus id interdum. Curabitur vehicula, @libero odio.",
    new Date(1421878767000L)
    );
    System.out.printf("This is a new Treet:  %s%n", treet);
    System.out.println("The words are: ");
    for(String word: treet.getWords()){
      System.out.println(word);
    }
    Treet[] treets = {treet, secondTreet};
    Arrays.sort(treets);
    for (Treet exampleTreet : treets){
      System.out.println(exampleTreet);
    }
    Treets.save(treets);

    Treet[] reloadedTreets = Treets.load();
    for(Treet reloaded : reloadedTreets){
      System.out.println(reloaded);
    }
  }
}

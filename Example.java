import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;

public class Example{
  public static void main (String[] args){

    Treet[] treets = Treets.load();
    System.out.printf("there are %d treets. %n", treets.length);
    Set<String> allHashtags = new HashSet<String>();
    Set<String> allMentions = new TreeSet<String>();
    for(Treet treet : treets){
      allHashtags.addAll(treet.getHashTags());
      allMentions.addAll(treet.getMentions());
    }
    System.out.printf("Hashtags: %s %n", allHashtags);
    System.out.printf("Mentions: %s, %n", allMentions);

    /*
    Treet originalTreet = treets[0];
    System.out.println("Hashtags:");
    for (String hashtag : originalTreet.getHashTags()){
      System.out.println(hashtag);
    }
    */

    //Treet[] treet = Treets.load();(
    /*
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
      */
    }
}

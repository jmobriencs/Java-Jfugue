package part1;

import org.jfugue.player.Player;

/**
 * Melody is from the crab canon in Johann Sebastian Bach’s “The Musical Offering” (BWV  1079).
 * Can be performed as single line or harmony.
 */

public class CrabCanonJSBach {
    public static void main(String[] args) {
        String voice1 = "T100 V1 I[Piano] D5h E5h | A5h Bb5h | " +
                        "C#5h Rq A5q | A5q Ab5h | G5q G5q";

        String voice2 = ("T100 V2 I[Piano] D5q F5q A5q D6q | " +
                        "C#6i D6i E6i F6i G6i F6i E6i D6i | " +
                        "E6i A5i E6i G6i F6i E6i D6i C#6i | " +
                        "B5i C#6i D6i F6i E6i D6i C#6i B5i | A5i Bb5i");

        // Get a JFugue 5 Player
        Player player = new Player();

        //Play music
        player.play(voice1, voice2); // Default is C5, and quarter notes unless otherwise specified
    }
}
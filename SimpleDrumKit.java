package part1;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

/**
 * This program layers multiple sounds (see single line comments below) into a drum kit.
 * Pattern can be looped any number of times by changing the repeat parameter (i.e. 4 bars to 8 bars).
 */

public class SimpleDrumKit {
    public static void main(String[] args) {

        // create the drum loop
        Rhythm drumSet = new Rhythm()
                .addLayer("O..oO...O..oOO.O") // kick drum
                .addLayer("..S...S...S...S.") // open snare
                .addLayer("````````````````") // hi-hat cymbal (closed)
                .addLayer("...............+"); // crash cymbal

        Player player = new Player();
        player.play(drumSet.getPattern().repeat(8));
    }
}
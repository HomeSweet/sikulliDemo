package example;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.event.KeyEvent;

/**
 * Created by Admin on 25.03.2017.
 */
public class Main {
    private static final Pattern MUSIC = new Pattern("src/main/java/resources/music.png");
    private static final Pattern HOME = new Pattern("src/main/java/resources/home.PNG");
    private static final Pattern NEW_FOLDER = new Pattern("src/main/java/resources/newFolder.png");
    private static final Pattern EXIT = new Pattern("src/main/java/resources/exit.png");

    public static void main(String[] args) throws FindFailed {
        Screen s = new Screen();
        s.keyDown(KeyEvent.VK_WINDOWS);
        s.keyDown(KeyEvent.VK_E);
        s.keyUp(KeyEvent.VK_WINDOWS);
        s.keyUp(KeyEvent.VK_E);

        s.wait(MUSIC.similar((float) 0.80), 5).click();
        s.wait(HOME.similar((float) 0.80), 5).click();
        s.wait(NEW_FOLDER.similar((float) 0.80), 5).click();

        s.type("Hello my new folder!");
        s.keyDown(KeyEvent.VK_ENTER);
        s.keyUp(KeyEvent.VK_ENTER);

        s.wait(EXIT.similar((float) 0.80), 5).doubleClick();
    }
}

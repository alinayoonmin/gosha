import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CheckTest {
	MusicBox mb = new MusicBox();
	
	@Test
	public void checkBoolean() {
		assertTrue("Приложение запущено", mb.start);
	}
}

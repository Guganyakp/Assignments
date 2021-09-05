package Assignment1;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;
import org.apache.log4j.Logger;

public class LoggerEx {
	private static Logger logger=Logger.getLogger(LoggerEx.class);
public static void main(String[] args) {
	

	/*Layout layout=new SimpleLayout();
				Layout layout1=new HTMLLayout();
				Layout layout2=new XMLLayout();
				Layout layout4=new PatternLayout("%p : %d - %C %M : %m %L %n");
				Appender appender=new ConsoleAppender(layout);
				Appender appender1=new FileAppender(layout,"D:\\Day1\\Swap.java");
				logger.addAppender(appender);*/
				logger.debug("Success information");
				logger.warn("Warning message");
				logger.info("level of status");
				logger.error("Exception");
				logger.fatal("Terminated");
	}

}

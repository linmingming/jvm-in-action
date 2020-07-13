package logback.chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
 * SLF4J: Defaulting to no-operation (NOP) logger implementation
 * SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
 */
public class HelloWorld1 {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
        logger.debug("Hello world.");

    }
}

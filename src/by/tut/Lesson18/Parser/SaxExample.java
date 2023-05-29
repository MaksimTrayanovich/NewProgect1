package by.tut.Lesson18.Parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        ArticleHandler handler = new ArticleHandler();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        //parser.parse(new File("Article.xml"),handler);
        System.out.println(handler.getWebsite());
    }
}

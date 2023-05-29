package by.tut.Lesson18.Parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

public class ArticleHandler {
    private static final String ARTICLES = "articles";
    private static final String ARTICLE = "article";
    private static final String TITLE = "title";
    private static final String CONTENT = "content";

    private ArticleList website; //we will get in the end 3 articles
    //we need 5 methods. if we will not add 1 - mistake
    private StringBuilder elementValue;

    public void characters(char[] ch, int start, int length) throws SAXException { //between start and end
        //here we can use patterns, filter
        if (elementValue == null) {
            elementValue = new StringBuilder(); //if empty make
        } else {
            elementValue.append(ch, start, length); //between start and end write everything
        }
    }


    public void startDocument() throws SAXException { //default realization with exception
        website = new ArticleList();
    }


    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {
        switch (qName) { //what program should do for every element
            case ARTICLES: //find this first time
                website.setArticles(new ArrayList<>());
                break;
            case ARTICLE:
                website.getArticles().add(new Article()); //add to array upper object
                break;
            case TITLE:
                elementValue = new StringBuilder();
                break;
            case CONTENT:
                elementValue = new StringBuilder();
                break;
        }
    }


    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (TITLE.equals(qName)) {
            latestArticle().setTitle(elementValue.toString());
        } else if (CONTENT.equals(qName)) {
            latestArticle().setContent(elementValue.toString());
        }
    }

    private Article latestArticle() {
        List<Article> articleList = website.getArticles();
        int latestArticleIndex = articleList.size() - 1;
        return articleList.get(latestArticleIndex);
    }

    public ArticleList getWebsite() {
        return website;
    }
}


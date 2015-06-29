package main.runnable;


import main.handle.SadouskiParser;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        File fXmlFile = new File("/home/litvin/IdeaProjects/ANTLR/file.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(fXmlFile);

        Node node = doc.getElementsByTagName("company").item(0);

        Element element = (Element) node;
        Attr attr = element.getAttributeNode("id");
////
//        String allContext = "";
//        try {
//            String str;
//            File file = new File("Test1");
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            while ((str = bufferedReader.readLine()) != null){
//                allContext += str;
//            }
//            bufferedReader.close();
//        }
//        catch (IOException e){
//            System.out.print(e);
//        }

//        TestLexer testLexer = new TestLexer(stream);
//        TokenStream tokenStream = new CommonTokenStream(testLexer);
//        TestParser parser = new TestParser(tokenStream);
//        parser.program();
//        System.out.println("ok");
    }
}

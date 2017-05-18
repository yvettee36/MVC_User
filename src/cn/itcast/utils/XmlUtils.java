package cn.itcast.utils;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

//3
public class XmlUtils {
    private static String filePath;

    static {
        filePath = XmlUtils.class.getClassLoader().getResource("users.xml").getPath();
        filePath = filePath.replace("%20", " ");
    }

    public static Document getDocument() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File(filePath));
        return document;
    }

    public static void write2Xml(Document document) throws Exception {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileOutputStream(filePath), format);
        writer.write(document);
        writer.close();
    }

}

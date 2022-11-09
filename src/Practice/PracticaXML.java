package Practice;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class PracticaXML{
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builer = factory.newDocumentBuilder();
            DOMImplementation implementation = builer.getDOMImplementation();

            Document documento = implementation.createDocument(null, "Concesionario", null);
            documento.setXmlVersion("1.0");

            Element Practice = documento.createElement("Practice");
            Element CV = documento.createElement("Curriculum Vitae");

            Element name = documento.createElement("Name");
            Text textName = documento.createTextNode("Paulina");
            name.appendChild(textName);
            CV.appendChild(name);

            Element ppfil = documento.createElement("Professional_Profile");
            Text textPpfil = documento.createTextNode("Computer Engineer");
            ppfil.appendChild(textPpfil);
            CV.appendChild(ppfil);

            Element wexper = documento.createElement("Work_Experiencie");
            Text textWexper = documento.createTextNode("I worked at Meat house as general manager and point of sale manager in 2018");
            wexper.appendChild(textWexper);
            CV.appendChild(wexper);

            Element acafotn = documento.createElement("Academic_Formation");
            Text textAcafotn = documento.createTextNode("Computer Engineering at the CU of Atlacomulco from 2020 to the present");
            acafotn.appendChild(textAcafotn);
            CV.appendChild(acafotn);

            Element contact = documento.createElement("Contact");
            Text textContact = documento.createTextNode("Number: 7121467907" +
                    "e-mail: pauherrera10okey@gmail.com");
            contact.appendChild(textContact);
            CV.appendChild(contact);

            Element languaje = documento.createElement("Language");
            Text textLenguaje = documento.createTextNode("English 10%" +
                    "Spanish 100% ");
            languaje.appendChild(textLenguaje);
            CV.appendChild(languaje);

            Practice.appendChild(CV);

            documento.getDocumentElement().appendChild(Practice);

            Source sourse = new DOMSource(documento);
            Result result = new StreamResult(new File("concesionario.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(sourse, result);


        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
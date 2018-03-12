package uk.ac.ncl.team15.insideurban.data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Utility class for loading in the Node and RoomDesc data from xml files.
 *
 * Created stubs 14/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation 22/02/18:
 * @author Logan Turner b6024685
 * @author Jack Knott b6031125
 *
 */

public class DataParser {

    public String nodeReader( Element elem, String s ){
        // get name from <name>
        NodeList tagList = elem.getElementsByTagName( s );

        // get contents of value from <x value="" />
        Element tagElement = (Element) tagList.item( 0 );
        String tagValue = tagElement.getAttribute("value");

        return tagValue;
    }

    public List<Integer> intParser( String input ){
        // integers are comma separated
        String[] tokens = input.split(",");
        List<Integer> intValues = new ArrayList<Integer>();

        // add all integers in String array to List
        for( int i = 0; i < tokens.length; i++ ){
            intValues.add( Integer.parseInt( tokens[i] ) );
        }

        return intValues;
    }

    // Read in all of the data from the xml data file(s) and create the Node and RoomDesc objects from them
    public static void parseData(){

        DataParser dp = new DataParser();

        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse( new File("book.xml") );

            //normalise text representation
            doc.getDocumentElement().normalize();

            //-----------------------------------------------------------------------

            // go thru all nodes
            NodeList listOfNodes = doc.getElementsByTagName( "node" );

            for( int i = 0; i < listOfNodes.getLength(); i++ ){
                Node currentNode = listOfNodes.item( i );

                // if current node is an element we can use
                if( currentNode.getNodeType() == Node.ELEMENT_NODE ){
                    Element e = (Element) currentNode;

                    int nodeID = Integer.parseInt( dp.nodeReader( e, "id" ) );
                    int nodeRDID = Integer.parseInt( dp.nodeReader( e, "rdid" ) );

                    List<Integer> posList = dp.intParser( dp.nodeReader( e, "position" ) );
                    Vec2 position = new Vec2( posList.get(0), posList.get(1) );

                    List<Integer> connecting = dp.intParser( dp.nodeReader( e, "connecting" ) );

                    int level = Integer.parseInt( dp.nodeReader( e, "level" ) );

                    int access = Integer.parseInt( dp.nodeReader( e, "isAccessible" ) ); // 0 or 1
                    Boolean isAccessible = ( access == 0 ) ? false : true;

                    // UNDER THE ASSUMPTION THAT:
                    // USBNode(int id, int rdid, Vec2 position, List<Integer> connecting, int level, Boolean isAccessible)
                    USBNode uNode = new USBNode( nodeID, nodeRDID, position, connecting, level, isAccessible );
                }

            }

            //-----------------------------------------------------------------------

            // go thru all descs
            NodeList listOfDescs = doc.getElementsByTagName( "desc" );

            for( int i = 0; i < listOfDescs.getLength(); i++ ){
                Node currentDesc = listOfDescs.item( i );

                // if current node is an element we can use
                if( currentDesc.getNodeType() == Node.ELEMENT_NODE ){
                    Element e = (Element) currentDesc;

                    // grab 4 tags
                    int id = Integer.parseInt( dp.nodeReader( e, "id" ) );
                    String altName = dp.nodeReader( e, "altname" );
                    String roomName = dp.nodeReader( e, "roomname" );
                    String description = dp.nodeReader( e, "description" );

                    RoomDesc rDesc = new RoomDesc( id, altName, roomName, description );

                }

            }

        } catch( SAXParseException err ){

            System.out.println( "** Parsing error, line " +
                    err.getLineNumber() + ", uri " + err.getSystemId() );
            System.out.println( " " + err.getMessage() );

        } catch( SAXException e ){

            Exception x = e.getException();
            ( (x == null) ? e : x).printStackTrace();

        } catch( Throwable t ){

            t.printStackTrace();

        }

    }

}

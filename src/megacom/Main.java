package megacom;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        Handler handler = new Handler();
        saxParser.parse(new File("src/megacom/xmlSAX.xml"), handler);

        GeoPlugin geo = handler.geoPlugin();
        //System.out.println(geo);
        System.out.println();
        System.out.println(handler.getArrayListStr());
        ArrayList<String> myList = handler.getArrayListStr();

        for(int i=0; i<myList.size(); i++){
            switch (i){
                case 1  : {
                    geo.setGeoPluginRequest(myList.get(i));
                    //System.out.print("geoGetClass === "+geo.getGeoPluginRequest());
                } break;
                case 3 : {
                    geo.setGeoPluginStatus(myList.get(i));
                    //System.out.print("geoStatusClass === "+geo.getGeoPluginStatus());
                } break;
                case 5 : {
                    geo.setGeoPluginDelay(myList.get(i));
                    //System.out.println("geoDelay === "+geo.getGeoPluginDelay());
                } break;
                case 7 : {
                    geo.setGeoPluginCredit(myList.get(i)+" "+myList.get(8)+" "+myList.get(9));
                } break;
                case 11 : {
                    geo.setGeoPluginCity(myList.get(i));
                } break;
                case 13 : {
                    geo.setGeoPluginRegion(myList.get(i));
                } break;
                case 15 : {
                    geo.setGeoPluginRegionCode(myList.get(i));
                } break;
                case 17 : {
                    geo.setGeoPluginReigonName(myList.get(i));
                } break;
                case 18 : {
                    geo.setGeoPluginAreaCode("Null");
                } break;
                case 19 : {
                    geo.setGeoPluginDMAcode("Null");
                } break;
                case 21 : {
                    geo.setGeoPluginCountryCode(myList.get(i));
                } break;
                case 23 : {
                    geo.setGeoPluginCountryName(myList.get(i));
                } break;
                case 25 : {
                    geo.setGeoPluginInEU(myList.get(i));
                } break;
                case 26 : {
                    geo.setGeoPluginEUVAtrate("Null");
                } break;
                case 28 : {
                    geo.setGeoPluginContinentCode(myList.get(i));
                } break;
                case 30 : {
                    geo.setGeoPluginContinentName(myList.get(i));
                } break;
                case 32 : {
                    geo.setGeoPluginLatitude(myList.get(i));
                } break;
                case 34 : {
                    geo.setGeoPluginLongitude(myList.get(i));
                } break;
                case 36 : {
                    geo.setGeoPluginLocationAccuracyRadius(myList.get(i));
                } break;
                case 38 : {
                    geo.setGeoPluginTimezone(myList.get(i));
                } break;
                case 40 : {
                    geo.setGeoPluginCurrencyCode(myList.get(i));
                } break;
                case 42 : {
                    geo.setGeoPluginCurrencySymbol(myList.get(i)+","+myList.get(43));
                } break;
                case 45 : {
                    geo.setGeoPluginCurrencySymbol_UTF8(myList.get(i));
                } break;
                case 47 : {
                    geo.setGeoPluginCurrencyConverter(myList.get(i));
                } break;

                default: {}
            }
        }
        System.out.println("Class GeoPlugin");
        System.out.println(geo.toString());
        System.out.println(myList.size());

    }
}









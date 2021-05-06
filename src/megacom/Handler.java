package megacom;

import org.w3c.dom.ls.LSOutput;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class Handler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End parsing.");
    }

    private int id;
    private String element;
    GeoPlugin geo= new GeoPlugin();
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException { element = qName;
        element=qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        element="";
    }
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
//        String str = new String(ch, start, length);
        String str = "";
        for(int i=0; i<length; i++){
            str += ch[start+i];
        }
        arrayList.add(str);
        System.out.println(str);

        switch (element) {
            case "geoplugin_request"  : {
                geo.setGeoPluginRequest(str);
                //System.out.print("geoGetClass === "+geo.getGeoPluginRequest());
            } break;
            case "geoplugin_status" : {
                geo.setGeoPluginStatus(str);
                //System.out.print("geoStatusClass === "+geo.getGeoPluginStatus());
            } break;
            case "geoplugin_delay" : {
                geo.setGeoPluginDelay(str);
                //System.out.println("geoDelay === "+geo.getGeoPluginDelay());
            } break;
            case "geoplugin_credit" : {
                geo.setGeoPluginCredit(str);
            } break;
            case "geoplugin_city" : {
                geo.setGeoPluginCity(str);
            } break;
            case "geoplugin_region" : {
                geo.setGeoPluginRegion(str);
            } break;
            case "geoplugin_regionCode" : {
                geo.setGeoPluginRegionCode(str);
            } break;
            case "geoplugin_regionName" : {
                geo.setGeoPluginReigonName(str);
            } break;
            case "geoplugin_areaCode" : {
                geo.setGeoPluginAreaCode("Null");
            } break;
            case "geoplugin_dmaCode" : {
                geo.setGeoPluginDMAcode("Null");
            } break;
            case "geoplugin_countryCode" : {
                geo.setGeoPluginCountryCode(str);
            } break;
            case "geoplugin_countryName" : {
                geo.setGeoPluginCountryName(str);
            } break;
            case "geoplugin_inEU" : {
                geo.setGeoPluginInEU(str);
            } break;
            case "geoplugin_euVATrate" : {
                geo.setGeoPluginEUVAtrate("Null");
            } break;
            case "geoplugin_continentCode" : {
                geo.setGeoPluginContinentCode(str);
            } break;
            case "geoplugin_continentName" : {
                geo.setGeoPluginContinentName(str);
            } break;
            case "geoplugin_latitude" : {
                geo.setGeoPluginLatitude(str);
            } break;
            case "geoplugin_longitude" : {
                geo.setGeoPluginLongitude(str);
            } break;
            case "geoplugin_locationAccuracyRadius" : {
                geo.setGeoPluginLocationAccuracyRadius(str);
            } break;
            case "geoplugin_timezone" : {
                geo.setGeoPluginTimezone(str);
            } break;
            case "geoplugin_currencyCode" : {
                geo.setGeoPluginCurrencyCode(str);
            } break;
            case "geoplugin_currencySymbol" : {
                geo.setGeoPluginCurrencySymbol(str);
            } break;
            case "geoplugin_currencySymbol_UTF8" : {
                geo.setGeoPluginCurrencySymbol_UTF8(str);
            } break;
            case "geoplugin_currencyConverter" : {
                geo.setGeoPluginCurrencyConverter(str);
            } break;

            default: {}

        }
    }
    public GeoPlugin geoPlugin(){
        return geo;
    }

    public ArrayList<String > getArrayListStr(){
        return arrayList;
    }
}


















package client_generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client_generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetValorIva_QNAME = new QName("http://ivaejbdemo/", "getValorIva");
    private final static QName _GetValorIvaResponse_QNAME = new QName("http://ivaejbdemo/", "getValorIvaResponse");
    private final static QName _GetValorIvaTotal_QNAME = new QName("http://ivaejbdemo/", "getValorIvaTotal");
    private final static QName _GetValorIvaTotalResponse_QNAME = new QName("http://ivaejbdemo/", "getValorIvaTotalResponse");
    private final static QName _GetValorSinIva_QNAME = new QName("http://ivaejbdemo/", "getValorSinIva");
    private final static QName _GetValorSinIvaResponse_QNAME = new QName("http://ivaejbdemo/", "getValorSinIvaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client_generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetValorIva }
     * 
     */
    public GetValorIva createGetValorIva() {
        return new GetValorIva();
    }

    /**
     * Create an instance of {@link GetValorIvaResponse }
     * 
     */
    public GetValorIvaResponse createGetValorIvaResponse() {
        return new GetValorIvaResponse();
    }

    /**
     * Create an instance of {@link GetValorIvaTotal }
     * 
     */
    public GetValorIvaTotal createGetValorIvaTotal() {
        return new GetValorIvaTotal();
    }

    /**
     * Create an instance of {@link GetValorIvaTotalResponse }
     * 
     */
    public GetValorIvaTotalResponse createGetValorIvaTotalResponse() {
        return new GetValorIvaTotalResponse();
    }

    /**
     * Create an instance of {@link GetValorSinIva }
     * 
     */
    public GetValorSinIva createGetValorSinIva() {
        return new GetValorSinIva();
    }

    /**
     * Create an instance of {@link GetValorSinIvaResponse }
     * 
     */
    public GetValorSinIvaResponse createGetValorSinIvaResponse() {
        return new GetValorSinIvaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValorIva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ivaejbdemo/", name = "getValorIva")
    public JAXBElement<GetValorIva> createGetValorIva(GetValorIva value) {
        return new JAXBElement<GetValorIva>(_GetValorIva_QNAME, GetValorIva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValorIvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ivaejbdemo/", name = "getValorIvaResponse")
    public JAXBElement<GetValorIvaResponse> createGetValorIvaResponse(GetValorIvaResponse value) {
        return new JAXBElement<GetValorIvaResponse>(_GetValorIvaResponse_QNAME, GetValorIvaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValorIvaTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ivaejbdemo/", name = "getValorIvaTotal")
    public JAXBElement<GetValorIvaTotal> createGetValorIvaTotal(GetValorIvaTotal value) {
        return new JAXBElement<GetValorIvaTotal>(_GetValorIvaTotal_QNAME, GetValorIvaTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValorIvaTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ivaejbdemo/", name = "getValorIvaTotalResponse")
    public JAXBElement<GetValorIvaTotalResponse> createGetValorIvaTotalResponse(GetValorIvaTotalResponse value) {
        return new JAXBElement<GetValorIvaTotalResponse>(_GetValorIvaTotalResponse_QNAME, GetValorIvaTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValorSinIva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ivaejbdemo/", name = "getValorSinIva")
    public JAXBElement<GetValorSinIva> createGetValorSinIva(GetValorSinIva value) {
        return new JAXBElement<GetValorSinIva>(_GetValorSinIva_QNAME, GetValorSinIva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValorSinIvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ivaejbdemo/", name = "getValorSinIvaResponse")
    public JAXBElement<GetValorSinIvaResponse> createGetValorSinIvaResponse(GetValorSinIvaResponse value) {
        return new JAXBElement<GetValorSinIvaResponse>(_GetValorSinIvaResponse_QNAME, GetValorSinIvaResponse.class, null, value);
    }

}


package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para farmacia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="farmacia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_farma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="medicamentos" type="{http://SW/}medicamento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sucursales" type="{http://SW/}sucursal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmacia", propOrder = {
    "idFarma",
    "medicamentos",
    "nombre",
    "sucursales"
})
public class Farmacia {

    @XmlElement(name = "id_farma")
    protected int idFarma;
    @XmlElement(nillable = true)
    protected List<Medicamento> medicamentos;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<Sucursal> sucursales;

    /**
     * Obtiene el valor de la propiedad idFarma.
     * 
     */
    public int getIdFarma() {
        return idFarma;
    }

    /**
     * Define el valor de la propiedad idFarma.
     * 
     */
    public void setIdFarma(int value) {
        this.idFarma = value;
    }

    /**
     * Gets the value of the medicamentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicamentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicamentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medicamento }
     * 
     * 
     */
    public List<Medicamento> getMedicamentos() {
        if (medicamentos == null) {
            medicamentos = new ArrayList<Medicamento>();
        }
        return this.medicamentos;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the sucursales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sucursales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSucursales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sucursal }
     * 
     * 
     */
    public List<Sucursal> getSucursales() {
        if (sucursales == null) {
            sucursales = new ArrayList<Sucursal>();
        }
        return this.sucursales;
    }

}

/**
 * JAXB-annotated canonical model used as stable XML contract for downstream processing.
 *
 * <p>The classes in this package represent the intermediate canonical vocabulary and
 * are serialized under canonical and GraphML namespaces.</p>
 */
@XmlSchema(
        namespace = "http://flowdigger.org/canonical",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix = "", namespaceURI = "http://flowdigger.org/canonical")
        }
)
package org.flowdigger.gradle.ooxml.canonical;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;


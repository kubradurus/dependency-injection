package com.myproject.convert;

import com.myproject.UserDto;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

/**
 * @author Kübra VARICI
 */
public class XmlConverter implements IConvertible{
    @Override
    public String convert(UserDto userDto) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(UserDto.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            JAXBElement<UserDto> jaxbElement =
                    new JAXBElement<UserDto>( new QName("", "employee"),
                            UserDto.class,
                            userDto);

            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(jaxbElement, sw);
            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
       return null;
    }
}

package com.enrollment.EmassWebService;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class EmassWebServiceClient extends WebServiceGatewaySupport {
    public void callback() {
        getWebServiceTemplate()
                .marshalSendAndReceive("http://100.111.30.153:9191/connector/services/v4/EnrollmentSparse", null,
                        new SoapActionCallback(
                                "http://healthedge.com/EnrollmentType"));
    }
}

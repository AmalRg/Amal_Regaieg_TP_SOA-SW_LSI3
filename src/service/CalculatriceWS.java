package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculatriceWS {
    @WebMethod(operationName = "somme")
    // Cette méthode effectue la somme de deux nombres et renvoie le résultat.
        public double somme (@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}

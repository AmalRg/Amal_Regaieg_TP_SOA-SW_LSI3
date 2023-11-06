package serveur;

import service.CalculatriceWS;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        CalculatriceWS calculatrice = new CalculatriceWS();
        String url = "http://localhost:8084/";
        Endpoint.publish(url,calculatrice);
        System.out.println("Service web publié avec succès sur l'url : " + url);
    }
}

package rs.ac.bg.fon.ps.client.controller;

import java.util.List;
import rs.ac.bg.fon.ps.client.communication.Communication;
import rs.ac.bg.fon.ps.common.communication.Request;
import rs.ac.bg.fon.ps.common.communication.Response;
import rs.ac.bg.fon.ps.common.communication.ResponseType;
import rs.ac.bg.fon.ps.common.domain.GenericEntity;
import rs.ac.bg.fon.ps.common.domain.KategorijaKlijenta;
import rs.ac.bg.fon.ps.common.domain.Klijent;
import rs.ac.bg.fon.ps.common.domain.Kvalifikacija;
import rs.ac.bg.fon.ps.common.domain.Materijal;
import rs.ac.bg.fon.ps.common.domain.Usluga;
import rs.ac.bg.fon.ps.common.domain.Zubar;
import rs.ac.bg.fon.ps.common.domain.ZubarKvalifikacija;
import rs.ac.bg.fon.ps.common.operations.Operations;

public class ClientController {

    private static ClientController instance;

    private ClientController() {
    }

    public static ClientController getInstance() {
        if (instance == null) {
            instance = new ClientController();
        }
        return instance;
    }

    public Zubar login(String korisnickoIme, String sifra) throws Exception {
        Object[] podaci = new Object[]{korisnickoIme, sifra};

        Request request = new Request(Operations.LOGIN, podaci);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();

        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (Zubar) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void addKlijent(Klijent klijent) throws Exception {
        Request request = new Request(Operations.ADD_KLIJENT, klijent);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllKlijent() throws Exception {
        Request request = new Request(Operations.GET_ALL_KLIJENT, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void updateKlijent(Klijent klijent) throws Exception {
        Request request = new Request(Operations.UPDATE_KLIJENT, klijent);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void deleteKlijent(Klijent klijent) throws Exception {
        Request request = new Request(Operations.DELETE_KLIJENT, klijent);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> searchKlijent(String kriterijum) throws Exception {
        Request request = new Request(Operations.SEARCH_KLIJENT, kriterijum);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void addMaterijal(Materijal materijal) throws Exception {
        Request request = new Request(Operations.ADD_MATERIJAL, materijal);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllMaterijal() throws Exception {
        Request request = new Request(Operations.GET_ALL_MATERIJAL, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void updateMaterijal(Materijal materijal) throws Exception {
        Request request = new Request(Operations.UPDATE_MATERIJAL, materijal);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void deleteMaterijal(Materijal materijal) throws Exception {
        Request request = new Request(Operations.DELETE_MATERIJAL, materijal);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void addUsluga(Usluga usluga) throws Exception {
        Request request = new Request(Operations.ADD_USLUGA, usluga);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllUsluga() throws Exception {
        Request request = new Request(Operations.GET_ALL_USLUGA, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void updateUsluga(Usluga usluga) throws Exception {
        Request request = new Request(Operations.UPDATE_USLUGA, usluga);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> searchUsluga(String kriterijum) throws Exception {
        Request request = new Request(Operations.SEARCH_USLUGA, kriterijum);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public List<GenericEntity> getStavkeByUsluga(Usluga usluga) throws Exception {
        Request request = new Request(Operations.GET_STAVKE_BY_USLUGA, usluga);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void addZubar(Zubar zubar) throws Exception {
        Request request = new Request(Operations.ADD_ZUBAR, zubar);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllZubar() throws Exception {
        Request request = new Request(Operations.GET_ALL_ZUBAR, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void updateZubar(Zubar zubar) throws Exception {
        Request request = new Request(Operations.UPDATE_ZUBAR, zubar);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void deleteZubar(Zubar zubar) throws Exception {
        Request request = new Request(Operations.DELETE_ZUBAR, zubar);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllKategorijaKlijenta() throws Exception {
        Request request = new Request(Operations.GET_ALL_KATEGORIJA_KLIJENTA, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void addKategorijaKlijenta(KategorijaKlijenta kategorija) throws Exception {
        Request request = new Request(Operations.ADD_KATEGORIJA_KLIJENTA, kategorija);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void updateKategorijaKlijenta(KategorijaKlijenta kategorija) throws Exception {
        Request request = new Request(Operations.UPDATE_KATEGORIJA_KLIJENTA, kategorija);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void deleteKategorijaKlijenta(KategorijaKlijenta kategorija) throws Exception {
        Request request = new Request(Operations.DELETE_KATEGORIJA_KLIJENTA, kategorija);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllKvalifikacija() throws Exception {
        Request request = new Request(Operations.GET_ALL_KVALIFIKACIJA, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void addKvalifikacija(Kvalifikacija kvalifikacija) throws Exception {
        Request request = new Request(Operations.ADD_KVALIFIKACIJA, kvalifikacija);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void updateKvalifikacija(Kvalifikacija kvalifikacija) throws Exception {
        Request request = new Request(Operations.UPDATE_KVALIFIKACIJA, kvalifikacija);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void deleteKvalifikacija(Kvalifikacija kvalifikacija) throws Exception {
        Request request = new Request(Operations.DELETE_KVALIFIKACIJA, kvalifikacija);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public List<GenericEntity> getAllZubarKvalifikacija() throws Exception {
        Request request = new Request(Operations.GET_ALL_ZUBAR_KVALIFIKACIJA, null);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.SUCCESS) {
            return (List<GenericEntity>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    public void addZubarKvalifikacija(ZubarKvalifikacija zk) throws Exception {
        Request request = new Request(Operations.ADD_ZUBAR_KVALIFIKACIJA, zk);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }

    public void deleteZubarKvalifikacija(ZubarKvalifikacija zk) throws Exception {
        Request request = new Request(Operations.DELETE_ZUBAR_KVALIFIKACIJA, zk);
        Communication.getInstance().sendRequest(request);

        Response response = Communication.getInstance().receiveResponse();
        if (response.getResponseType() == ResponseType.ERROR) {
            throw response.getException();
        }
    }
}
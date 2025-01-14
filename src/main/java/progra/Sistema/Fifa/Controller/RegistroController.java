package progra.Sistema.Fifa.Controller;

import progra.Sistema.Fifa.Model.Registro;

import java.util.ArrayList;

public class RegistroController {

    public ArrayList<Registro> registrosPorHora(ArrayList<Registro> registroArchivo) {
        ArrayList<Registro> registros = new ArrayList<Registro>();
        ArrayList<Registro> registrosMismaFecha = new ArrayList<Registro>();
        String fechaAux = registroArchivo.get(0).getFecha();
        for (int i = 0; i < registroArchivo.size(); i++) {
            if (fechaAux.equals(registroArchivo.get(i).getFecha())) {
                registrosMismaFecha.add(registroArchivo.get(i));
                if (i == (registroArchivo.size() - 1)) {
                    registros.addAll(crearRegistro(registrosMismaFecha));
                }
            } else {
                registros.addAll(crearRegistro(registrosMismaFecha));
                fechaAux = registroArchivo.get(i).getFecha();
                registrosMismaFecha.clear();
                registrosMismaFecha.add(registroArchivo.get(i));
            }
        }
        return registros;
    }

    private ArrayList<Registro> crearRegistro(ArrayList<Registro> registrosMismaFecha) {
        ArrayList<Registro> rMismaHora = new ArrayList<Registro>();
        ArrayList<Registro> rPromediados = new ArrayList<Registro>();
        String horaAux = desgloseHora(registrosMismaFecha.get(0).getHora());
        for (int i = 0; i < registrosMismaFecha.size(); i++) {
            if (horaAux.equals(desgloseHora(registrosMismaFecha.get(i).getHora()))) {
                rMismaHora.add(registrosMismaFecha.get(i));
                if (i == (registrosMismaFecha.size() - 1)) {
                    rPromediados.add(crearRegistroPromediado(rMismaHora));
                }
            } else {
                rPromediados.add(crearRegistroPromediado(rMismaHora));
                horaAux = desgloseHora(registrosMismaFecha.get(i).getHora());
                rMismaHora.clear();
                rMismaHora.add(registrosMismaFecha.get(i));
                if (i == (registrosMismaFecha.size() - 1)) {
                    rPromediados.add(crearRegistroPromediado(rMismaHora));
                }
            }
        }
        return rPromediados;
    }

    private String desgloseHora(String hora) {
        String[] datoHorario = hora.split(":");
        return datoHorario[0];
    }

    private Registro crearRegistroPromediado(ArrayList<Registro> rMismaHora) {
        Registro r = new Registro();
        r.setSector(rMismaHora.get(0).getSector());
        r.setDispositivo(rMismaHora.get(0).getDispositivo());
        r.setFecha(rMismaHora.get(0).getFecha());
        r.setHora(desgloseHora(rMismaHora.get(0).getHora()) + ":00:00");
        r.setPm10(sacarPromedioPM10(rMismaHora));
        r.setPm25(sacarPromedioPM25(rMismaHora));
        r.setTemperatura(sacarPromedioTemp(rMismaHora));
        return r;
    }

    private double sacarPromedioPM10(ArrayList<Registro> rMismaHora) {
        double sumaPM10 = 0.0;
        for (int i = 0; i < rMismaHora.size(); i++) {
            sumaPM10 += rMismaHora.get(i).getPm10();
        }
        return sumaPM10 / rMismaHora.size();
    }

    private double sacarPromedioPM25(ArrayList<Registro> registrosMismaHora) {
        double sumaPM25 = 0.0;
        for (int i = 0; i < registrosMismaHora.size(); i++) {
            sumaPM25 += registrosMismaHora.get(i).getPm25();
        }
        return sumaPM25 / registrosMismaHora.size();
    }

    private double sacarPromedioTemp(ArrayList<Registro> registrosMismaHora) {
        double sumaTemp = 0.0;
        for (int i = 0; i < registrosMismaHora.size(); i++) {
            sumaTemp = sumaTemp + registrosMismaHora.get(i).getTemperatura();
        }
        return (sumaTemp / registrosMismaHora.size());
    }


}
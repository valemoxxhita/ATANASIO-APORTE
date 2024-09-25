package org.example.MODELOS;

public class Tribuna
{
    private Long id;
    private String nombreTribuna;
    private Integer aforo;
    private String localidad;
    private Boolean sancionadx;

    public Tribuna()
    {
    }

    public Tribuna(Long id, String nombreTribuna, Integer aforo, String localidad, Boolean sancionadx)
    {
        this.id = id;
        this.nombreTribuna = nombreTribuna;
        this.aforo = aforo;
        this.localidad = localidad;
        this.sancionadx = sancionadx;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTribuna() {
        return nombreTribuna;
    }

    public void setNombreTribuna(String nombreTribuna) {
        this.nombreTribuna = nombreTribuna;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Boolean getSancionadx() {
        return sancionadx;
    }

    public void setSancionadx(Boolean sancionadx) {
        this.sancionadx = sancionadx;
    }
}

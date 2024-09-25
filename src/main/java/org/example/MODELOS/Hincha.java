package org.example.MODELOS;

import java.time.LocalDate;

public class Hincha
{
        private Long id;
        private String nombre;
        private String apellido;
        private LocalDate fechaNacimiento;
        private String numeroDocumento;
        private String telefono;
        private String email;
        private String direccion;
        private String contactoEmergencia;
        private String ciudad;

        public Hincha()
        {
        }

        public Hincha(Long id, String nombre, String apellido, LocalDate fechaNacimiento, String numeroDocumento, String telefono, String email, String direccion, String contactoEmergencia, String ciudad)
        {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.numeroDocumento = numeroDocumento;
            this.telefono = telefono;
            this.email = email;
            this.direccion = direccion;
            this.contactoEmergencia = contactoEmergencia;
            this.ciudad = ciudad;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(String numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getContactoEmergencia() {
            return contactoEmergencia;
        }

        public void setContactoEmergencia(String contactoEmergencia) {
            this.contactoEmergencia = contactoEmergencia;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

    @Override
    public String toString() {
        return "Hincha{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contactoEmergencia='" + contactoEmergencia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}


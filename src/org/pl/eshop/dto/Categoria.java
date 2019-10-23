package org.pl.eshop.dto;
public class Categoria {
    private Integer id;
    private String nombre;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        if (id == null){
            throw new IllegalArgumentException("Error: in setId() = id can not be Null");
        }
        if (id <= 0){
            throw new IllegalArgumentException("Error: in setId() = id can not be l.e. than 0");
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null){
            throw new IllegalArgumentException("Error: in setNombre() = nombre can not be Null");
        }
        if (nombre.length() < 3){
            throw new IllegalArgumentException("Error: in setNombre() = nombre can not be under 3 chars");
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

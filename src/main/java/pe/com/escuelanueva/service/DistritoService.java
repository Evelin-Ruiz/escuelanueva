/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.DistritoEntity;

public interface DistritoService {
    //funcion para mostrar todos los datos
    List<DistritoEntity> findAll();
    //funcion para mostrar
    List<DistritoEntity> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<DistritoEntity> findById(Long id);
    //funcion para registrar
    DistritoEntity add(DistritoEntity d);
    //funcion para registrar
    DistritoEntity update(DistritoEntity d);
    //funcion para registrar
    DistritoEntity delete(DistritoEntity d);
}

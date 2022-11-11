/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.escuelanueva.entity.ApoderadoEntity;
import pe.com.escuelanueva.repository.ApoderadoRepository;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{
    @Autowired
    private ApoderadoRepository repositorioparentesco;
   
    
    @Override
    public List<ApoderadoEntity> findAll() {
        return repositorioparentesco.findAll();
    }

    @Override
    public List<ApoderadoEntity> findAllCustom() {
        return repositorioparentesco.findAllCustom();
    }

    @Override
    public Optional<ApoderadoEntity> findById(Long id) {
        return repositorioparentesco.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity a) {
        return repositorioparentesco.save(a);
    }

    @Override
    public ApoderadoEntity update(ApoderadoEntity a) {
        ApoderadoEntity objapoderado = repositorioparentesco.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objapoderado);
        return repositorioparentesco.save(objapoderado);
    }

    @Override
    public ApoderadoEntity delete(ApoderadoEntity a) {
        ApoderadoEntity objapoderado = repositorioparentesco.getById(a.getCodigo());
        objapoderado.setEstado(false);
        return repositorioparentesco.save(objapoderado);
    }
}

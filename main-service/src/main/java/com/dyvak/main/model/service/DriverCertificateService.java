package com.dyvak.main.model.service;

import com.dyvak.main.model.dao.DriverCertificateRepository;
import com.dyvak.main.model.dto.DriverCertificateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverCertificateService implements LogisticService<DriverCertificateDto>{

    @Autowired
    private DriverCertificateRepository dao;

    @Override
    public List<DriverCertificateDto> findAll(PageRequest id) {
        return null;
    }

    @Override
    public DriverCertificateDto findOne(Long id) {
        return null;
    }

    @Override
    public void create(DriverCertificateDto dto) {

    }

    @Override
    public void update(Long id, DriverCertificateDto dto) {

    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public long count() {
        return 0;
    }
}

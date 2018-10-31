package logistic.model.service;

import logistic.model.dao.TransportRepository;
import logistic.model.dto.TransportDto;
import logistic.model.entity.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class TransportService {

    @Autowired
    private TransportRepository dao;

    @Transactional(readOnly = true)
    public List<TransportDto> findAll(PageRequest pageable) {
        List<Transport> list = (List<Transport>) dao.findAll();
        return null;
    }

    @Transactional(readOnly = true)
    public TransportDto findOne(Long id) {
        String transportId = String.valueOf(id);
        dao.findById(transportId);
        return null;
    }

    @Transactional
    public void create(TransportDto dto) {
        Transport transport = new Transport();
        dao.save(transport);
    }

    @Transactional
    public void update(Long id, TransportDto dto) {
        Transport transport = new Transport();
        dao.save(transport);
    }

    @Transactional
    public void delete(Long[] ids) {
        String[] array = (String[]) Arrays.stream(ids)
                .map(s -> String.valueOf(s))
                .toArray();
        for (String id : array)
            dao.deleteById(id);
    }

    public long count() {
        return dao.count();
    }
}

package logistic.model.service;

import logistic.model.dao.UserRepository;
import logistic.model.dto.UserDto;
import logistic.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository dao;

    @Transactional(readOnly = true)
    public List<UserDto> findAll(PageRequest pageable) {
        List<User> users = (List<User>) dao.findAll();
        return null;
    }

    @Transactional(readOnly = true)
    public UserDto findOne(Long id) {
        String userId = String.valueOf(id);
        Optional<User> user = dao.findById(userId);
        return null;
    }

    @Transactional
    public void create(UserDto dto) {
        User user = new User();
        dao.save(user);
    }

    @Transactional
    public void update(Long id, UserDto dto) {
        User user = new User();
        dao.save(user);
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

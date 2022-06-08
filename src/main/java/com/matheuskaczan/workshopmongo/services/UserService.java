package com.matheuskaczan.workshopmongo.services;

import com.matheuskaczan.workshopmongo.dto.UserDTO;
import com.matheuskaczan.workshopmongo.entities.User;
import com.matheuskaczan.workshopmongo.repository.UserRepository;
import com.matheuskaczan.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return userRepository.insert(obj);
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getNome(), objDto.getEmail());
    }

    public User update(User obj) {
        Optional<User> newObj = userRepository.findById(obj.getId());
        if (newObj.isPresent()) {
            User user = newObj.get();
            updateData(user, obj);
            return userRepository.save(user);
        } else {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
    }

    private void updateData(User user, User obj) {
        user.setNome(obj.getNome());
        user.setEmail(obj.getEmail());
    }

}

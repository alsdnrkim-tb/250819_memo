package memo.model.dao;

import memo.model.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    Long create(String username, String displayName);
    Optional<UserDTO> findById(Long userId);
    Optional<UserDTO> findByUsername(Long username);
    List<UserDTO> findAll(int limit, int offset);
}

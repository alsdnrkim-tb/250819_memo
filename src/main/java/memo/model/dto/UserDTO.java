package memo.model.dto;

import java.time.LocalDateTime;

public record UserDTO(
        Long userID,
        String username,
        String displayName,
        LocalDateTime createdAt
) {

}

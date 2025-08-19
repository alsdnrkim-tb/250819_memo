package memo.model.dto;

import com.mysql.cj.log.Log;

import java.time.LocalDateTime;

public record MemoDTO(
        Long memoID,
        Long userID,
        String title,
        String content,
        LocalDateTime createdAt
) {

}

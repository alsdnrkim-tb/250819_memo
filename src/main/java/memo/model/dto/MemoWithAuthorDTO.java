package memo.model.dto;

import com.mysql.cj.log.Log;

import java.time.LocalDateTime;

public record MemoWithAuthorDTO(
        Long memoId,
        String title,
        String content,
        LocalDateTime memoCreatedAt,
        Long authorId,
        String authorUsername,
        String authorDisplayName
) {
}

package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    public CommentDTO addComment(long publicationId, CommentDTO commentDTO);

    public List<CommentDTO> getCommentsByPublicationId(long publicationId);

    public  CommentDTO getCommentById(Long publicationId, Long commentId);

    public CommentDTO updateComment(Long publicationId, Long commentId, CommentDTO commentRequest);

    public void deleteComment(Long publicationId, Long commentId);
}
